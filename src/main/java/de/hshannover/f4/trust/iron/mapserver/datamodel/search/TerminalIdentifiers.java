/*
 * #%L
 * =====================================================
 *   _____                _     ____  _   _       _   _
 *  |_   _|_ __ _   _ ___| |_  / __ \| | | | ___ | | | |
 *    | | | '__| | | / __| __|/ / _` | |_| |/ __|| |_| |
 *    | | | |  | |_| \__ \ |_| | (_| |  _  |\__ \|  _  |
 *    |_| |_|   \__,_|___/\__|\ \__,_|_| |_||___/|_| |_|
 *                             \____/
 * 
 * =====================================================
 * 
 * Hochschule Hannover
 * (University of Applied Sciences and Arts, Hannover)
 * Faculty IV, Dept. of Computer Science
 * Ricklinger Stadtweg 118, 30459 Hannover, Germany
 * 
 * Email: trust@f4-i.fh-hannover.de
 * Website: http://trust.f4.hs-hannover.de/
 * 
 * This file is part of irond, version 0.5.8, implemented by the Trust@HsH
 * research group at the Hochschule Hannover.
 * %%
 * Copyright (C) 2010 - 2016 Trust@HsH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package de.hshannover.f4.trust.iron.mapserver.datamodel.search;


import java.util.Set;
import java.util.regex.Pattern;

import de.hshannover.f4.trust.iron.mapserver.IfmapConstStrings;
import de.hshannover.f4.trust.iron.mapserver.exceptions.InvalidIdentifierException;
import de.hshannover.f4.trust.iron.mapserver.utils.CollectionHelper;

/**
 * Encapsulates the terminal-identifiers attribute into an
 * object for easy checking and validation of the given
 * string.
 *
 * Only a comma-sparated list of actual IF-MAP identifiers is
 * allowed.
 *
 * @author aw
 */
public class TerminalIdentifiers {

	@SuppressWarnings("rawtypes")
//	private final Set<Class> mIdentifierClasses;
	private final Set<String> mTerminalIdentifiers;
	private final String mRawString;

	/**
	 * @param terminalIdentStr the string of the search or subscribe update request
	 * 			can be null, in which case it was unspecified
	 */
	public TerminalIdentifiers(String terminalIdentStr) throws InvalidIdentifierException {

//		mIdentifierClasses = CollectionHelper.provideSetFor(Class.class);
		mTerminalIdentifiers = CollectionHelper.provideSetFor(String.class);

		if (terminalIdentStr == null || terminalIdentStr.length() == 0) {
			mRawString = null;
			return;
		}


		validatedFill(terminalIdentStr);

		mRawString = terminalIdentStr;
	}

//	public boolean contains(Identifier i) {
//		return mIdentifierClasses.contains(i.getClass());
//	}
	public boolean contains(String terminalIdentifier) {
		return mTerminalIdentifiers.contains(terminalIdentifier);
	}

	public String getRawString() {
		return mRawString;
	}

	@SuppressWarnings("rawtypes")
	private void validatedFill(String terminalIdentStr) throws InvalidIdentifierException {
		if (terminalIdentStr.charAt(0) == ','
			|| terminalIdentStr.charAt(terminalIdentStr.length() -1) == ',') {
			throw new InvalidIdentifierException("Bad terminal-identifiers: "
					+ terminalIdentStr);
		}

		String[] splitted = terminalIdentStr.split(",");
		if (splitted.length == 0) {
			throw new InvalidIdentifierException("Bad terminal-identifiers: "
					+ terminalIdentStr);
		}

		for (String str : splitted) {

			if (str.length() == 0) {
				throw new InvalidIdentifierException("Bad terminal-identifiers: "
						+ "<,,> specified? : "+ terminalIdentStr);
			}

			//Check identifier types as well as patterns for other and extended types (Ifmap 2.2)
			if(!IfmapConstStrings.IDENTIFIERS.contains(str)) {
				Pattern p = Pattern.compile(IfmapConstStrings.REGEX_ID_EXT);
				Pattern q = Pattern.compile(IfmapConstStrings.REGEX_ID_OTHER_NAME);
				Pattern r = Pattern.compile(IfmapConstStrings.REGEX_ID_OTHER_VENDOR);
				if(!p.matcher(str).matches()  && !q.matcher(str).matches() && !r.matcher(str).matches()) {
					throw new InvalidIdentifierException("Bad terminal-identifiers: "
							+ " unknown identifier: " + str);
				}
			}
			mTerminalIdentifiers.add(str);

		}
	}

	@Override
	public String toString() {
		return "term{"+mRawString+"}";
	}
}

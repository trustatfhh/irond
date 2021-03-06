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
package de.hshannover.f4.trust.iron.mapserver.provider;


import de.hshannover.f4.trust.iron.mapserver.communication.ClientIdentifier;

/**
 * Provides access to authorization information for MAPC.
 *
 * This is a preliminary version as it only allows the differentiation of
 * MAPC into read-only and read-write clients. If a MAPC is not read-write,
 * then it is read-only.<br/><br/>
 *
 * The specification provides an example of a more fine grained authorization
 * model (allowing a DHCP MAPC only to publish <ip-mac> metadata on ip-mac links.
 * <br/>
 * Such a model might be considered in the future.
 * <br/><br/>
 *
 *
 * <b>Note: publish notify is considered a write operation.</b>
 *
 * @author aw
 *
 */
public interface AuthorizationProvider {


	/**
	 * Check whether a MAPC is allowed change the content of the graph, I.e.
	 * publish or delete metadata, make notifications, do a purgePublisher.
	 *
	 * @param clientId
	 * @return true if the MAPC is allowed to change the graph content.
	 */
	public boolean isWriteAllowed(ClientIdentifier clientId);

}

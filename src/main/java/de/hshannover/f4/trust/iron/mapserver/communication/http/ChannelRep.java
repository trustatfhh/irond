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
package de.hshannover.f4.trust.iron.mapserver.communication.http;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import de.hshannover.f4.trust.iron.mapserver.communication.ChannelIdentifier;

/**
 * Stores objects of class {@link ChannelThread}. Uses a HashMap internally.
 */
public class ChannelRep {

	private ConcurrentMap<ChannelIdentifier,ChannelThread> mChannelThreads;

	public ChannelRep(){
		mChannelThreads =  new ConcurrentHashMap<ChannelIdentifier, ChannelThread>();
	}

	public void add(ChannelThread ct){
		mChannelThreads.put(ct.getChannelIdentifier(), ct);
	}

	public ChannelThread getByChannelId(ChannelIdentifier ci){
		return mChannelThreads.get(ci);
	}

	public void remove(ChannelThread ct) {
		mChannelThreads.remove(ct.getChannelIdentifier());
	}
}

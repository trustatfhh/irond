package de.fhhannover.inform.iron.mapserver.communication.ifmap;

/*
 * #%L
 * ====================================================
 *   _____                _     ____  _____ _   _ _   _
 *  |_   _|_ __ _   _ ___| |_  / __ \|  ___| | | | | | |
 *    | | | '__| | | / __| __|/ / _` | |_  | |_| | |_| |
 *    | | | |  | |_| \__ \ |_| | (_| |  _| |  _  |  _  |
 *    |_| |_|   \__,_|___/\__|\ \__,_|_|   |_| |_|_| |_|
 *                             \____/
 * 
 * =====================================================
 * 
 * Fachhochschule Hannover 
 * (University of Applied Sciences and Arts, Hannover)
 * Faculty IV, Dept. of Computer Science
 * Ricklinger Stadtweg 118, 30459 Hannover, Germany
 * 
 * Email: trust@f4-i.fh-hannover.de
 * Website: http://trust.inform.fh-hannover.de/
 * 
 * This file is part of irond, version 0.4.1, implemented by the Trust@FHH
 * research group at the Fachhochschule Hannover.
 * 
 * irond is an an *experimental* IF-MAP 2.0 compliant MAP server written in
 * JAVA. irond supports both basic authentication and certificate-based 
 * authentication (using X.509 certificates) of MAP clients. irond is
 * maintained by the Trust@FHH group at the Fachhochschule Hannover, initial
 * developement was carried out during the ESUKOM research project.
 * %%
 * Copyright (C) 2010 - 2014 Trust@FHH
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

import de.fhhannover.inform.iron.mapserver.communication.bus.Queue;
import de.fhhannover.inform.iron.mapserver.communication.bus.messages.Event;
import de.fhhannover.inform.iron.mapserver.provider.ServerConfigurationProvider;
import de.fhhannover.inform.iron.mapserver.utils.NullCheck;

/**
 * Very simple class used to construct {@link SessionTimer} instances.
 * 
 * 
 * @author aw
 *
 */
public class SessionTimerFactory {
	
	/**
	 * Timers have to know about the event queue, so the factory has to, too.
	 */
	private Queue<Event> mEventQueue;
	
	/**
	 * Used to read the timeout value from the configuration.
	 */
	private ServerConfigurationProvider mServerConfig;
	
	
	public SessionTimerFactory(Queue<Event> eventQueue, ServerConfigurationProvider serverConf) {
		NullCheck.check(eventQueue, "eventQueue is null");
		NullCheck.check(serverConf, "serverConf is null");
		mEventQueue = eventQueue;
		mServerConfig = serverConf;
	}
	
	/**
	 * Create a new instance of a {@link SessionTimer}.
	 * 
	 * This timer is not started yet.
	 * 
	 * @param sessionId
	 * @return
	 */
	public SessionTimer newTimer(String sessionId) {
		NullCheck.check(sessionId, "sessionId is null");
		long timeout = mServerConfig.getSessionTimeOutMilliSeconds();
		return new SessionTimer(sessionId, mEventQueue, timeout);
	}
}

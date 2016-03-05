/**
 * Copyright (C) 2015 Lufthansa Industry Solutions AS GmbH. All rights reserved. 
 * <http://www.lhind.org/>
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library. If not, see <http://www.gnu.org/licenses/>.
 */
package org.lhind.reservation_mgmt.common.model.flight.events;

import org.fuin.ddd4j.ddd.AbstractDomainEvent;
import org.fuin.ddd4j.ddd.EntityIdPath;
import org.fuin.ddd4j.ddd.EventType;
import org.lhind.reservation_mgmt.common.model.flight.FlightId;

/**
 * @author U519643
 *
 */
public class FlightCancelledEvent extends AbstractDomainEvent<FlightId> {

  /** Unique name of this event. */
  public static final EventType EVENT_TYPE = new EventType(
      "FlightCancelledEvent");

  public FlightCancelledEvent(FlightId flightId) {
    super(new EntityIdPath(flightId));
  };

  /*
   * (non-Javadoc)
   * 
   * @see org.fuin.ddd4j.ddd.Event#getEventType()
   */
  public EventType getEventType() {
    return EVENT_TYPE;
  }

}

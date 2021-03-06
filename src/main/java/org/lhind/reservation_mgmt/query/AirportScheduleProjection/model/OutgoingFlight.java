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
package org.lhind.reservation_mgmt.query.AirportScheduleProjection.model;

import java.time.LocalDateTime;

import org.lhind.reservation_mgmt.common.model.flight.FlightId;

/**
 * @author U519643
 *
 */
public class OutgoingFlight {
  private FlightId flightId;
  private LocalDateTime departureTime;
  private String destinationCode;

  public OutgoingFlight(FlightId flightId, LocalDateTime departureTime,
      String destinationCode) {
    super();
    this.flightId = flightId;
    this.departureTime = departureTime;
    this.destinationCode = destinationCode;
  }

  /**
   * @return the flightId
   */
  public FlightId getFlightId() {
    return flightId;
  }

  /**
   * @return the departureTime
   */
  public LocalDateTime getDepartureTime() {
    return departureTime;
  }

  /**
   * @param departureTime
   *          the departureTime to set
   */
  public void setDepartureTime(LocalDateTime departureTime) {
    this.departureTime = departureTime;
  }

  /**
   * @return the destinationCode
   */
  public String getDestinationCode() {
    return destinationCode;
  }

}

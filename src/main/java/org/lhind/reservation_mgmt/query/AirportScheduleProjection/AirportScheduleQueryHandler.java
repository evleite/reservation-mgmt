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
package org.lhind.reservation_mgmt.query.AirportScheduleProjection;

import java.time.LocalDate;

import org.lhind.reservation_mgmt.query.AirportScheduleProjection.dao.AirportScheduleDAO;
import org.lhind.reservation_mgmt.query.AirportScheduleProjection.model.AirportSchedule;

/**
 * @author U519643
 *
 */
public class AirportScheduleQueryHandler {

  private AirportScheduleDAO airportScheduleDAO;

  public AirportScheduleResult findAirportScheduleByAirportCodeAndDate(
      String code, LocalDate date) {
    // Verify Authorization
    // check if user has role 'airport operator'

    // Retrieve schedule
    AirportSchedule schedule = airportScheduleDAO.findByAirportCodeAndDate(
        code, date);

    AirportScheduleResult result = new AirportScheduleResult(schedule);

    return result;
  }
}

# reservation-mgmt

This application was delevoped in order to demonstrate the basic building blocks and concepts of CQRS and Event Sourcing for the author's Bachelor Thesis.

The application provides functionality to schedule, reschedule and cancel flights. The users may register passengers and make reservations on a flight. If a flight is fully booked and additional reservations are made they are put on a waitlist. They will be confirmed if a reservation is cancelled. Furthermore, the system communicates with external payment systems. No user interface is provided for the application. The functionality is demonstrated solely using unit tests.

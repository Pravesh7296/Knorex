# Knorex
Car Parking System

#Overview
This is a Java-based car parking system that can accommodate different types of vehicles and supports a configurable cost strategy. The system allows users to initialize a parking lot with a specified number of floors and car spaces per floor, add vehicle details including vehicle type, registration number, and color, remove vehicles based on registration number or parking slot number, and check the availability of vehicle spaces on a specific floor for a given vehicle type.

#Functionalities
Initialization: Initialize the parking lot with a given number of floors and car spaces per floor for each vehicle type.
Add Vehicle: Add a vehicle of the specified type with the given registration number and color to the parking lot.
Remove Vehicle: Remove the vehicle with the specified registration number from the parking lot.
Check Availability: Check the availability of vehicle spaces on the specified floor for the given vehicle type.
Implementation
The system is implemented using the following classes:

ParkingLot: Represents the parking lot and manages vehicle spaces.
Vehicle: Represents a vehicle with attributes such as vehicle type, registration number, color, and any other necessary attributes.
Floor: Represents a floor in the parking lot with attributes like floor number, capacity for each vehicle type, and vehicle spaces.
VehicleSpace: Represents a vehicle space with attributes such as space number, availability, vehicle type, and any other necessary attributes.
Usage
The main class Main.java demonstrates the usage of the parking lot and its methods. The following methods are available:

init(): Initializes the parking lot with the given number of floors and vehicle spaces per floor for each vehicle type.
addVehicle(): Adds a vehicle of the specified type with the given registration number and color to the parking lot.
removeVehicle(): Removes the vehicle with the specified registration number from the parking lot.
checkAvailability(): Checks the availability of vehicle spaces on the specified floor for the given vehicle type.
Testing
The code has been tested with multiple scenarios and edge cases to ensure its correctness and robustness.

#Additional Notes
The system follows a flat cost structure for parking fees based on the vehicle type.
The system supports different types of vehicles such as car, sports car, truck, and bus.
Adding a new type of vehicle or a new cost strategy requires minimal code changes.
Feel free to customize this README file according to your specific implementation and requirements.

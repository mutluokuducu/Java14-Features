package com.java14features.switches;

import com.java14features.enums.VehicleType;

public class Example3 {

  public static void main(String[] args) {

    for (VehicleType vehicle : VehicleType.values()) {
      int speedLimit = getSpeedLimit(vehicle);
      System.out.println("Speed limit: " + vehicle + ":" + speedLimit);
    }
  }

  private static int getSpeedLimit(VehicleType vehicleType) {
    return switch (vehicleType) {
      case BIKE, SCOOTER -> 40;
      case MOTORBIKE, AUTOMOBILE -> 140;
      case TRUCK -> 80;
    };
  }
}

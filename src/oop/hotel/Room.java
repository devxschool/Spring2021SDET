package oop.hotel;

import java.util.Map;

public class Room {

    public int roomNumber;
    public int numberOfRooms;
    public Map<String, Integer> typeOfBeds;
    public boolean isVacant;

    public Room(int roomNumber, int numberOfBedRooms, Map<String, Integer> typeOfBeds, boolean isVacant){
        System.out.println("This is constructor!");
        this.roomNumber = roomNumber;
        numberOfRooms = numberOfBedRooms;
        this.typeOfBeds = typeOfBeds;
        this.isVacant = isVacant;
    }

    public Room(int roomNumber, Map<String, Integer> typeOfBeds, boolean isVacant){
        this.roomNumber = roomNumber;
        this.typeOfBeds = typeOfBeds;
        this.isVacant = isVacant;
        numberOfRooms = 1;
    }

    public Room(int roomNumber, int numberOfRooms, boolean isVacant){

        this.roomNumber = roomNumber;
        this.numberOfRooms = numberOfRooms;
        this.isVacant = isVacant;
    }


}

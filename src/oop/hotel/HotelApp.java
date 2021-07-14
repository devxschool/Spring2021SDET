package oop.hotel;

import java.util.*;


public class HotelApp {

    public static void main(String[] args) {
        //create a method which will take an input from the user for the number of people and according to the
        //number of people we're going to suggest them the available room that we have
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("King", 1);
        map1.put("Queen", 1);
        Room room1 = new Room(100, 1, map1, false);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("King", 2);
        map2.put("Queen", 1);
        Room room2 = new Room(101, 2, map2, true);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("King", 2);
        map3.put("Queen", 0);
        Room room3 = new Room(102, 1, map3, false);

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("King", 1);
        map4.put("Queen", 0);
        Room room4 = new Room(103, 1, map4, true);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        System.out.println("The vacant room is: " + returnVacantRoom(rooms));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int input = scan.nextInt();
        offerRooms(rooms, input);
    }

    public static int returnVacantRoom(List<Room> rooms) {
        int vacantRoomNumber = 0;
        for (Room room : rooms) {
            if (room.isVacant) {
                vacantRoomNumber = room.roomNumber;
            }
        }
        return vacantRoomNumber;
    }

    public static void offerRooms(List<Room> rooms, int numberOfPeople) {
        Map<Integer, Map<String, Integer>> roomInfo = new HashMap<>();
        for (int i = 0; i < rooms.size(); i++) {
            if (numberOfPeople <= 2) {
                if (rooms.get(i).isVacant) {
                    roomInfo.put(rooms.get(i).roomNumber, rooms.get(i).typeOfBeds);
                }
            } else if (numberOfPeople > 2 && numberOfPeople <= 4) {
                if (rooms.get(i).isVacant
                        && (rooms.get(i).typeOfBeds.get("King") + rooms.get(i).typeOfBeds.get("Queen")) >= 2) {
                    roomInfo.put(rooms.get(i).roomNumber, rooms.get(i).typeOfBeds);
                }
            } else {
                System.out.println("We don't have rooms available!");
            }
        }
        for (Map.Entry<Integer, Map<String, Integer>> entry : roomInfo.entrySet()) {
            System.out.println("Room number: " + entry.getKey() + ". Type of beds: " + entry.getValue());
        }
    }
}


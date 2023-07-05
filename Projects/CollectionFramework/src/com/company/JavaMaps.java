/*
 * Map is a type of collection which works with Key-Value pair like a dictionary.
 *
 * All the key in the map must be unique. If we re-enter the value on a pre-existing key,
 * then the old value will be overwritten by the new value.
 *
 * */

package com.company;

import java.util.*;

public class JavaMaps {
    private final int location;
    private final String description;
    private final Map<String, Integer> exits;

    public JavaMaps(int location, String description) {
        this.location = location;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    public void addExit(int location, String direction) {
        this.exits.put(direction, location);
    }

    public int getLocation() {
        return this.location;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(this.exits);
    }
}

class TestMap {
    private final static Map<Integer, JavaMaps> location = new HashMap<>();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        addLocations();
//        addExits();
//        initialize();

        Map<Integer, String> map = new HashMap<>();

        for (int i = 1; i <= 1000000; ++i) {
            map.put(i, Integer.toString(i));
        }

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry);
    }

    private static Map<String, String> getCommands() {
        Map<String, String> commands = new HashMap<>();
        commands.put("QUIT", "Q");
        commands.put("NORTH", "N");
        commands.put("SOUTH", "S");
        commands.put("EAST", "E");
        commands.put("WEST", "W");

        return commands;
    }

    private static void addExits() {
        location.get(1).addExit(2, "W");
        location.get(1).addExit(3, "E");
        location.get(1).addExit(4, "S");
        location.get(1).addExit(5, "N");
        location.get(1).addExit(0, "Q");

        location.get(2).addExit(0, "Q");
        location.get(2).addExit(5, "N");

        location.get(3).addExit(0, "Q");
        location.get(3).addExit(1, "W");

        location.get(4).addExit(0, "Q");
        location.get(4).addExit(1, "N");
        location.get(4).addExit(2, "N");

        location.get(5).addExit(0, "Q");
        location.get(5).addExit(2, "W");
        location.get(5).addExit(1, "S");
    }

    private static void addLocations() {
        location.put(0, new JavaMaps(0, "Come back to where you started."));
        location.put(1, new JavaMaps(1, "Starting the journey from the road"));
        location.put(2, new JavaMaps(2, "Going to the hill."));
        location.put(3, new JavaMaps(3, "Reaching a building."));
        location.put(4, new JavaMaps(4, "Saw a beautiful valley."));
        location.put(5, new JavaMaps(5, "Entering a forest with giant trees."));
    }

    private static void initialize() {
        System.out.println("\t\t*****STARTING THE ADVENTURE GAME\"*****\n");

        int position = 1;

        while (true) {
            JavaMaps currentLocation = location.get(position);
            System.out.println("\t\t" + currentLocation.getDescription() + "\n");

            if (position == 0)
                break;

            Map<String, Integer> exits = location.get(position).getExits();
            printExits(exits);
            System.out.print("Enter direction: ");
            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                Map<String, String> commands = getCommands();

                for (String word : words) {
                    if (commands.containsKey(word)) {
                        direction = commands.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction))
                position = exits.get(direction);
            else
                System.out.println("Can't go in that direction");
        }
    }

    private static <K, V> void printExits(Map<K, V> map) {
        System.out.print("Possible exits ( ");
        for (K obj : map.keySet())
            System.out.print(obj + ", ");
        System.out.println(") ");
    }

}
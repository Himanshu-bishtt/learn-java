package com.company;

import java.util.*;

public class Main {

    private static final List<Album> albums = new ArrayList<>();
    private static final List<Song> playList = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album album = new Album("Love Songs", "Justin");

        album.addSong("Sorry", "4:10");
        album.addSong("Cold Water", "3:10");
        album.addSong("Love Yourself", "4:22");
        album.addSong("Yummy", "4:19");
        albums.add(album);

        album = new Album("Beats", "Martin Garix");
        album.addSong("Animal", "4:55");
        album.addSong("Beautiful People", "4:25");
        album.addSong("Bold", "4:15");
        album.addSong("Matrix", "3:55");
        albums.add(album);


        albums.get(0).addSongToPlaylist("Sorry", playList);
        albums.get(0).addSongToPlaylist("Love Yourself", playList);
        albums.get(0).addSongToPlaylist("Yummy", playList);

        albums.get(1).addSongToPlaylist("Animal", playList);
        albums.get(1).addSongToPlaylist("Bold", playList);
        albums.get(1).addSongToPlaylist("Matrix", playList);

        play();
    }

    private static void printPlayList() {
        System.out.println("**********************************");
        System.out.println("PlayList contains " + playList.size() + " songs");
        for (Song song : playList) {
            System.out.println("Title: " + song.getTitle() + " ---> Duration: " + song.getDuration());
        }
        System.out.println("**********************************");
    }

    private static void play() {
        ListIterator<Song> listIterator = playList.listIterator();
        boolean flag = true;
        boolean forwards = true;

        if (playList.size() == 0) {
            System.out.println("Playlist contains 0 songs");
        } else {
            System.out.println("Now Playing: " + listIterator.next().toString());
        }

        while (flag) {
            printMenu();
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Exiting...");
                    flag = false;
                    break;

                case 2:
                    if (!forwards) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }

                        forwards = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached end of the list".toUpperCase());
                        forwards = false; // because we cannot go forward
                    }
                    break;

                case 3:
                    if (forwards) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forwards = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached at the start".toUpperCase());
                        forwards = true; // because we cannot go more backwards.
                    }
                    break;
                case 4:
                    if (forwards) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying current song: " + listIterator.previous().toString());
                            forwards = false;
                        } else {
                            System.out.println("we are at the start of the list".toUpperCase());
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying current song: " + listIterator.next().toString());
                            forwards = true;
                        } else {
                            System.out.println("We are at the end of the list".toUpperCase());
                        }
                    }
                    break;
                case 5:
                    //remove a song
                    System.out.print("Enter name of the song to remove: ");
                    String title = scanner.nextLine();

                    for (Song song: playList) {
                        if (song.getTitle().equals(title)) {
                            playList.remove(song);
                            System.out.println("Song: " + title + " removed");
                            return;
                        }
                    }
                    break;
                case 6:
                    printPlayList();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("**********************");
        System.out.println("1. To Quit");
        System.out.println("2. To Play songs forward");
        System.out.println("3. To Play songs backwards");
        System.out.println("4. To Replay the current song");
        System.out.println("5. To Remove a song");
        System.out.println("6. Print PlayList");
        System.out.println("**********************");
    }
}

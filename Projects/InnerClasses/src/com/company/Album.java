package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private final String name;
    private final String artist;
    private final SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public void addSongToAlbum(String title, String duration) {
        boolean songAdded = songList.addSong(new Song(title, duration));

        if (!songAdded) {
            System.out.println("Song: " + title + " is already in the list");
        }
    }

    public void addSongToThePlayList(String title, List<Song> list) {
        Song checkedSong = this.songList.findSong(title);
        if (checkedSong == null) {
            System.out.println("Song: " + title + " is not in the album");
            return;
        }
        list.add(checkedSong);
        System.out.println("Song: " + title + " successfully added to the playlist");
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    private static class SongList {
        private final List<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (findSong(song.getTitle()) == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        public Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
    }

    /*
       PREVIOUS MAIN DATA

       private final static List<Song> playlist = new LinkedList<>();
       private final static List<Album> albums = new ArrayList<>();

      Album album = new Album("Rock", "Justin");
        album.addSongToAlbum("Love Me", "3:10");
        album.addSongToAlbum("Okay do", "4:12");
        album.addSongToAlbum("XO XO", "3:11");
        albums.add(album);

        album = new Album("Love", "Martin");
        album.addSongToAlbum("Animals", "4:22");
        album.addSongToAlbum("Stargazing", "5:11");
        album.addSongToAlbum("My boo!", "4:51");
        albums.add(album);

        albums.get(0).addSongToThePlayList("Okay do", playlist);

        printAlbum();
        printPlaylist();

      public static void printAlbum() {
        System.out.println("Album contain " + albums.size() + " albums");
        for (Album album: albums) {
            System.out.println(album);
        }
      }

      public static void printPlaylist() {
        System.out.println("Playlist contains " + playlist.size() + " songs");
        for (Song song : playlist) {
            System.out.println(song);
        }
     }
     * */
}
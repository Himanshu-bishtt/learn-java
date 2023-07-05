package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private final String name;
    private final String artist;
    private final List<Song> albumList;

    public Album() {
        this.name = "Default Album";
        this.artist = "Default Artist";
        this.albumList = new ArrayList<>();
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.albumList = new ArrayList<>();
    }

    public boolean addSong(String title, String duration) {
        /*
         * MEANS WE DID NOT HAVE THE SONG IN THE ALBUM SO WE CAN ADD
         * */
        if (findSong(title) == null) {
            albumList.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public void addSongToPlaylist(String title, List<Song> playList) {
//        Song song = findSong(title);
//
//        if (song == null) {
//            System.out.println(title + " song is not in the album");
//            return false;
//        }
//        playList.add(song);
//        return true;

        boolean foundSongInTheAlbum = false; // if song is found in album then only add it to the playlist
        Song songInTheAlbum = null;

        for (Song song : albumList) {
            if (song.getTitle().equals(title)) {
                foundSongInTheAlbum = true;
                songInTheAlbum = song;
                break;
            }
        }

        if (foundSongInTheAlbum) {
            playList.add(songInTheAlbum);
        } else {
            System.out.println("Title: " + title + " is not in the album");
        }
    }

    private Song findSong(String title) {
        for (Song song : albumList) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public void printAlbumList() {
        System.out.println("Album: " + this.name.toUpperCase() + " Artist: " + this.artist.toUpperCase()
                + " contains " + this.albumList.size() + " songs");
        for (Song song: albumList) {
            System.out.println("Title: " + song.getTitle()
                    + " ---> Duration: " + song.getDuration());
        }
    }
}

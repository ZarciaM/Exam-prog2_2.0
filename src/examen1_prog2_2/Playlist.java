package examen1_prog2_2;

import java.util.List;

public class Playlist {
    private String id;
    private String name;
    private final List<Song> songs;
    private User author;
    public int likes = 0;

    public Playlist(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public void addToPlaylist(Song songs){
        this.songs.add(songs);
    }

    public void addToPlaylist(Album album){
        this.songs.addAll(album.getSongs());
    }

    public Playlist exclude(List<Genre> bannedGenres){
        Playlist newPlaylist = new Playlist(this.name, this.songs);
        for (Song song : songs) {
            if (song.getGenres().stream().noneMatch(bannedGenres::contains)) {
                newPlaylist.addToPlaylist(song);
            }
        }
        return newPlaylist;
    }
}

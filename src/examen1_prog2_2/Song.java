package examen1_prog2_2;

import java.time.Duration;
import java.util.List;

/**
 * song
 * user
 * playlist
 * artist(solo, band)
 * album
 * */
public class Song {
    private String id;
    private String title;
    private Duration duration;
    private Artist artist;
    private List<Genre> genres;

    public Song(String id, String title, Duration duration, Artist owner, List<Genre> genres) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.artist = owner;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Artist getOwner() {
        return artist;
    }

    public void setOwner(Artist owner) {
        this.artist = owner;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}

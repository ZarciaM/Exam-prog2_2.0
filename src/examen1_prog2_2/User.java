package examen1_prog2_2;

import java.util.List;

public class User {
    private String id;
    private String name;
    private List<examen1_prog2_correction.Playlist> favoritePlaylist;
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void like(examen1_prog2_correction.Playlist playlist){

        if (!favoritePlaylist.contains(playlist)) {
            favoritePlaylist.add(playlist);
            playlist.likes++;
        }
        else{
            favoritePlaylist.remove(playlist);
            playlist.likes--;
        }
    }
    public int getToTalLike(examen1_prog2_correction.Playlist playlist){
        return playlist.likes;
    }
}


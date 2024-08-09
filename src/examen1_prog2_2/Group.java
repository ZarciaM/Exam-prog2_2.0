package examen1_prog2_2;

import java.util.List;

public class Group extends Artist {
    private List<SoloArtist> members;

    public Group(String id, String stageName, int startYear, String nationality, List<SoloArtist> members) {
        super(id, stageName, startYear, nationality);
        this.members = members;
    }

    public List<SoloArtist> getMembers() {
        return members;
    }

    public void setMembers(List<SoloArtist> members) {
        this.members = members;
    }
}

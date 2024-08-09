package examen1_prog2_2;

public class SoloArtist extends Artist {
    private String firstname;
    private String lastname;
    private String birthDate;


    public SoloArtist(String id, String stageName, int startYear, String nationality, String firstname, String lastname, String birthDate) {
        super(id, stageName, startYear, nationality);
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

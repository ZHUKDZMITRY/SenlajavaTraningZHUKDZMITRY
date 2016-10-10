public class Man {
    private Long id;
    private String name;
    private String dateold;
    private String nationality;
    private String residence;
    private Contacts contacts;
    private AboutMe aboutme;

    public Man(){
        System.out.println("Man");
    }
    public String getName() {
        return this.name;
    }
    public void setDateold(String dateold) {
        this.dateold = dateold;
    }
    public String getNationality() {
        return this.nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getResidence() {
        return this.residence;
    }
    public void setResidence(String residence) {
        this.residence = residence;
    }
    public Contacts getContacts() {
        return this.contacts;
    }
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public AboutMe getAboutme() {
        return this.aboutme;
    }
    public void setAboutme(AboutMe aboutme) {
        this.aboutme = aboutme;
    }
}
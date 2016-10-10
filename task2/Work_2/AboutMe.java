public class AboutMe {
    private Long id;
    private String character;
    private String pc;
    private String languages;

    public AboutMe(){
        System.out.println("AboutMe");
    }
    public String getCharacter() {
        return this.character;
    }
    public void setCharacter(String character) {
        this.character = character;
    }
    public String getPc() {
        return this.pc;
    }
    public void setPc(String pc) {
        this.pc = pc;
    }
    public String getLanguages() {
        return this.languages;
    }
    public void setLanguages(String languages) {
        this.languages = languages;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}


import java.util.Date;
public class Education {
    private Long id;
    private String name;
    private Date expirationDate;

    public Education(){
        System.out.println("Education");
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}

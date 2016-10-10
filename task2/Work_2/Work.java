import java.util.Date;
public class Work {
    private Long id;
    private String name;
    private String experience;
    private Date startDate;
    private Date endDate;
    private String position;

    public Work(){
        System.out.println("Work");
    }

    public String getExperience() {
        return this.experience;
    }
    public void setExperience(String experience) {
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getStartDate() {
        return this.startDate;
    }

}


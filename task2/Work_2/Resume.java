public class Resume {
    private long id;
    private String titel;
    private Man man;
    private Work work;
    private Education education;

    public Resume(){
        System.out.println("Resume");
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setTitel(String titel){
        this.titel = titel;
    }
    public String getTitel(){
        return titel;
    }
    public void setMan(Man man){
        this.man = man;
    }
    public Man getMan(){
        return man;
    }
    public void setWork(Work work){
        this.work = work;
    }
    public Work getWork(){
        return work;
    }
    public void setEducation(Education education){
        this.education = education;
    }
    public Education getEducation(){
        return education;
    }
}

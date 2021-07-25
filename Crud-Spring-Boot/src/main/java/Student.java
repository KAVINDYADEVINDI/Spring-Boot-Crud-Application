public class Student {
    private Integer id;
    private  String name;
    private String course;
    private  Integer fee;

    public Student(Integer id, String name, String course, Integer fee) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }
}

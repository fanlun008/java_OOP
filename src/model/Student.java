package model;

public class Student {

    private String name;
    private Integer old;
    private String sno;
    private String gender;

    public Student() {
    }

    public Student(String name, Integer old, String sno, String gender) {
        this.name = name;
        this.old = old;
        this.sno = sno;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getOld() {
        return old;
    }

    public Student setOld(Integer old) {
        this.old = old;
        return this;
    }

    public String getSno() {
        return sno;
    }

    public Student setSno(String sno) {
        this.sno = sno;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", sno='" + sno + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

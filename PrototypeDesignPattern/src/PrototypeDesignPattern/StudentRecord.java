package PrototypeDesignPattern;

public class StudentRecord implements Prototype{

    private int id;
    private String name;
    private double gpa;
    private String address;

    public StudentRecord(int id, String name, double gpa, String address) {
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.address=address;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public StudentRecord clone() {
        StudentRecord studentRecord=new StudentRecord(this.id,this.name,this.gpa,this.address);
        return studentRecord;
    }

    @Override
    public String toString() {
        String record="Student ID: "+this.id+" "+"Name: "+this.name+" "+"GPA: "+this.gpa+" "+"Address: "+this.address;
        return record;
    }
}

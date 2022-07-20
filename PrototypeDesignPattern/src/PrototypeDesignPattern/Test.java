package PrototypeDesignPattern;

public class Test {
    public static void main(String[] args) {

        StudentRecord studentRecord=new StudentRecord(2,"ravidi",3.2,"balangoda");

        System.out.println(studentRecord.toString());

        StudentRecord cloneObj=studentRecord.clone();
        System.out.println(cloneObj.toString());

        cloneObj.setId(7);
        System.out.println(cloneObj);

        System.out.println(studentRecord.toString());



    }

}

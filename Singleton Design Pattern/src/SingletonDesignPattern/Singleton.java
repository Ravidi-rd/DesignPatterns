package SingletonDesignPattern;

public class Singleton {

    public static void main(String [] args){


        Long start;
        Long end;

        start=System.currentTimeMillis();
        Test test1 = Test.getTest();
        end=System.currentTimeMillis();
        System.out.println(test1);
        System.out.println(end-start);

        start=System.currentTimeMillis();
        Test test2 = Test.getTest();
        end=System.currentTimeMillis();
        System.out.println(test2);
        System.out.println(end-start);

    }
}

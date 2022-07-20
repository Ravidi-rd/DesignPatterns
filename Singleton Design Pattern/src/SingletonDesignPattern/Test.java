package SingletonDesignPattern;

public class Test {

    private static volatile Test test;

    private Test() {
    }
    
    public static Test getTest() {

        if (test == null) {
            synchronized (Test.class) {
                if (test == null) {
                    test = new Test();

                }
            }
        }
    return test;

    }



}

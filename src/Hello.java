public class Hello {

    public static void main (String [] args) {

        //Classes
        AnotherClass testPrint = new AnotherClass();
        MyMathClass mathJob = new MyMathClass();

        //Variables
        int T1 = 2;
        int T2 = 4;
        String name = "Shreyas";

        //Actions
        System.out.println("test");

        testPrint.printSomething();

        System.out.println(mathJob.math(T1,T2));

        for (int i = 0; i < 5; i++){
            System.out.println("Hello " + name);
        }

        System.out.print("SPACE TEST" );

    }
}

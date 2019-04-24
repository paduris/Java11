package multithreading.interview;

public class OverriddenClassExamples {


    public static void main(String[] args) throws Exception {

        SimpleClassA a = new SimpleClassB();
        a.print();
    }


}

class SimpleClassA {
    public void print() throws Exception {
        System.out.println("Into print method");

    }
}

class SimpleClassB extends SimpleClassA {
    public void print() throws Exception{
       // System.out.println("Into SimpleClassB print method");
        super.print();
    }
}


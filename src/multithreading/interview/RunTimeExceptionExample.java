package multithreading.interview;

public class RunTimeExceptionExample {


    public static void main(String[] args) {

        ExceptionExample e = new ExceptionExample();

        e.print();
        System.out.println();

    }
}


class ExceptionExample
{
    public void print() throws RuntimeException
    {
        String e = null;

        System.out.println("Exception Example printing "+e.length());
    }




}
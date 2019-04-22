package hello;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, World from Java 11");
        System.out.println(Integer.MIN_VALUE +"" + Integer.MAX_VALUE);
        int m = 5;
        float fk = 4.5f;
        double noOfPounds = 200;
        double pounds =  noOfPounds*.4535937;
        double t = 3_000_0d;

        String printStr = "45"+m;


        System.out.println(t*5);
        System.out.println(pounds);


        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        int count = 6;
        do
        {
            System.out.println("Count value ::"+ count);
            count++;
            if(count>100)
            {
                break;
            }

        }while (count != 6);

    }
}

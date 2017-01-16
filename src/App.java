/**
 * Created by valmach on 15/01/2017.
 */
//String Builder String Buffer

public class App {
    public static void main(String[] args) {
    //inefficient
        String info = "";
        info += "My name is Bob. ";
        info += "";
        info += "I am Builder . ";
        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue . ");
        sb.append(" ");
        sb.append("I ama lion tame. ");

        System.out.println(sb.toString());
        //stringBuilder not thread safe, more lightweight thant string buffer

        StringBuilder s = new StringBuilder();
        s.append(("My name is Roger . "))
                .append(" ")
                .append(("I am a skydiver. "));
        System.out.println(s.toString());

        ///////////Formatting///////////////////////////
        System.out.println("Here is some text.\t That was a tab.\nThat was a newline");
        //formatting floating integers
        System.out.printf("Total cost %-10d;R Quantity is %d\n", 5, 120);
        for(int i=0; i<20; i++){

            System.out.printf("%2d: some text here %s\n", i, "here is some text");
        }
        //formatting floating point value
        System.out.printf("Total value: %f \n", 5.6784);
        System.out.printf("Total value: %6.lf\n", 343.23423);
    }
}

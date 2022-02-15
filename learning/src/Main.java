public class Main {
    public static void main(String[] args){
        // int x; //declaring a datatype
        // x = 123; //assignment

        //System.out.println("My number is: "+x);

        String x = "vodka";
        String y = "redbull";
        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}

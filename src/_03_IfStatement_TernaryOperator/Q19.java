package _03_IfStatement_TernaryOperator;

public class Q19 {
    public static void main(String[] args) {
        int x=7;
        Boolean y=true;

        if (x>5)
            if(x<10)
                y=true;
        else
            y=false;
        else if (y)
            x=15;
        System.out.println(y);

        String yy= "123asdfghi@gmail.com";
        if (yy.substring(yy.length()-5).equals(".com")) {
            System.out.println(yy.substring(1));
        }
        else
            System.out.println("y.length()");

        System.out.println(!!!true && !!false);

    }



}


// Output -- true;
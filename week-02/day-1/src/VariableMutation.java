public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;

        // make the "a" variable's value bigger by 10

        System.out.println(a+10);

        int b = 100;
        // make b smaller by 7

        System.out.println(b-7);

        int c = 44;
        // please double c's value

        System.out.println(c*2);

        int d = 125;
        // please divide by 5 d's value

        System.out.println(d/5);

        int e = 8;
        // please cube of e's value

        System.out.println(e*e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        if(f1>f2)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        if(g2*2>g1)
        {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        int h = 135798745;
        int maradek=h%11;

        // tell if it has 11 as a divisor (print as a boolean)
   /*if(maradek=0)
    {
        System.out.println(true);
    }else
    {
        System.out.println(false);
    }*/

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if(i1>i2*i2 && i1<i2*i2*i2)
        {
            System.out.println(true);
        }else
        {
            System.out.println(false);
        }
        int j = 1521;
        int harom= j%3;
        int ot = j%5;
        // tell if j is dividable by 3 or 5 (print as a boolean)
    /*if(harom=0 || ot=0)
    {
        System.out.println(true);
    }else
    {
       System.out.println(false);
    }*/

        String k = "Apple";
        //fill the k variable with its content 4 times
        for(int i = 0; i<4; i++) {
            System.out.println(k);
        }
    }
}
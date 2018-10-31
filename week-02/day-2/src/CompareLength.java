public class CompareLength {
    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`

    public static void main(String args[]) {
        int[] p1 = {1, 2, 3};
        int[] p2= {4, 5};
        int p1_length = 0;
        int p2_length = 0;

        for(int i=0; i<p1.length; i++){
            p1_length += i;
        }

        for(int j=0; j<p2.length; j++){
            p2_length += j;
        }

        System.out.println(p1_length);
        System.out.println(p2_length);

        /*if(p2_length > p1_length){
            System.out.println("p2 has more elements than p1");
        }*/
    }
}
package array;

import java.util.Arrays;

/**
 * Created by students on 20/01/22.
 */
public class amm {
    public static void main(String[] args) {
        int a[] ={11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(a));
        System.out.println("after reverse");
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println(Arrays.toString(rotate(a)));
        System.out.println("Shift Right");

    }

    public static int[] reverse(int[] x)
    {
int n=x.length-1;
        for (int i=0; i<x.length/2 ;i++) {
            int t=x[i];
            x[i]=x[n];
            x[n]=t;
            n--;
        }
        return x;
    }

    public static int[] rotate (int []z)
    {
        int t=z[0];
        for (int i=0; i<z.length ; i++) {
            z[i]=z[i+1];

        }
        z[z.length-1]=t;
        return z;
    }
    public static int[] shiftRight (int []z)
    {
        int t=z[0];
        for (int i=z.length ; i>0; i--) {
            z[i]=z[i-1];

        }
        z[0]=t;
        return z;
    }
}
import java.util.Arrays;

public class PrefixSum {
    static int[] arr = { 1, 3, 2, 5, 4, 2 };
    static int[] prest = new int[arr.length];
    static int [] rightHand = new int[arr.length];

    public static void main(String[] args) {
       int[] arVal = preSum(arr);
       int[] rVal = rightSum(arr);
       System.out.println(Arrays.toString(arVal));
       System.out.println(Arrays.toString(rVal));
    }
    

    static int[] preSum(int[] arr) {
        int initVal = 0;
        for (int i = 0; i < arr.length; i++) {
            initVal = initVal + arr[i];
            prest[i] = initVal;
        }

        return prest;

    }
    static int[] rightSum(int[] arr) {
        int initVal ;
        for (int i = arr.length-1 ; i >=1; i--) {
            System.out.println(arr[i]);
            initVal = arr[i-1]+ arr[i];
            rightHand[i] = initVal;
        }

        return rightHand;

    }

}

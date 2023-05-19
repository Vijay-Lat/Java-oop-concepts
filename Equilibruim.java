public class Equilibruim {
    public static void main() {
        int[] arr = { 1, 2, 4, 5, 6, 2 };
        equili(arr);

    }

    static int equili(int[] arr) {
        int leftSum = 0 ;
        int rightSum = 0;
        for (int i = 0; i <= arr[i]; i++) {
            leftSum = leftSum+arr[i]
        }
        for (int i = 0; i < arr.length; i++) {
            rightSum = leftSum+arr[i+1]
        }
        if( leftSum == rightSum){
            return i;
        }
        else{
            return -1;
        }
    }

}

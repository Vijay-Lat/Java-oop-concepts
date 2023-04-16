import java.util.Arrays;

public class AddDigitsToSingle {
    public static void main (String []args){
     int val = addNumbers(386789);
     System.out.println(val+"answer");
    }
    public static int addNumbers(int num){
        if(num>0){
        String numStr = String.valueOf(num);
        char[] separateNums = numStr.toCharArray();
        System.out.println(Arrays.toString(separateNums));
        int addedVal=0 ;
        for(int i = 0; i<separateNums.length;i++){
            addedVal = addedVal+(separateNums[i]-'0');
        }
        System.out.println(addedVal+" added");
        if(addedVal<10){
        return addedVal;
        }
        else{
           return addNumbers(addedVal);
        }
    }
    else{
        return 0;
    }
    }
}
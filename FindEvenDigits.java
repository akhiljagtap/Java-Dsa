package Questions;

public class FindEvenDigits {
    public static void main(String[] args) {
        int[] nums = {11,123,1234,111,11};
//        int nums = 1111111;
//        System.out.println(count(nums));

        System.out.println(findNo(nums));


    }

    static  int findNo(int[] arr){
        int count = 0;
       for(int num:arr){
           if(isEven(num)){
               count++;
           }
       }
        return  count;

    }

    //check is even or not
    static boolean isEven(int num){
        int noOfDigits = count(num);
        if(noOfDigits % 2 == 0){
            return  true;
        }
        return  false;
    }

    //counting the digits:
    static int count(int nums){
        int count = 0;
        while (nums>0){
            nums/=10;
            count++;
        }
        return count;
    }


}

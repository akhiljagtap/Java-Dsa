package Questions;

public class isEvenDigits {
    public static void main(String[] args) {
        int[]arr = {11,111,223,2456};
        System.out.println(findNo(arr));

    }
    static int findNo(int[]arr){
        int count = 0 ;
        for(int num:arr){
            if(isEven(num)){
                count++;
            }
        }
        return count;

    }

    static boolean isEven(int nusm){
        int noOfDigits = countDigits(nusm);
        if(noOfDigits % 2 == 0 ){
            return true;
        }
        return false;
    }
    static int countDigits(int nums){
        int count = 0 ;
        while (nums>0){
            nums/=10;
            count++;

        }
        return count;

    }

}

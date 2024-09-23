package Questions;

public class NoOfDaysInMonth {
    public static void main(String[] args) {
        int month = 7;
        int year = 2024;

        int getdAays = getNoOfDays(month,year);
        if(getdAays != -1){
            System.out.println(" no of days in " + month + " of yr " + year + " is " + getdAays);

        }else {
            System.out.println("invalid month or yr provided ");
        }

    }
    static int getNoOfDays(int month , int year){
        if(month < 1 || month > 12){
            return -1;
        }
        int[] numOfDays = {31,28 + isLeepyear(year),31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return numOfDays[month -1];

    }
    static int isLeepyear(int yr){
        if((yr % 4 == 0 && yr % 100 != 0) ||  yr % 400 == 0){
            return 1;
        }else {
            return -1;
        }
    }
}

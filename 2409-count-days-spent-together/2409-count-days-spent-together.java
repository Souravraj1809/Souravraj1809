class Solution {
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startdayAlice = day(arriveAlice);
        int enddayAlice = day(leaveAlice);
        int startdayBob = day(arriveBob);
        int enddayBob = day(leaveBob);
        int start = Math.max(startdayAlice, startdayBob);
        int end = Math.min( enddayAlice, enddayBob);
        return  Math.max(0,end - start + 1);
        
    }
    int day(String day){
        int month = Integer.parseInt(day.substring(0,2));
        int days = Integer.parseInt(day.substring(3,5));;
        int total = days;
        for(int i = 0 ;i < month - 1;i++){
            total += months[i];
        }
        return total;

    }
}
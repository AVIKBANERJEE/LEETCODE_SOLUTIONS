class Solution {
    public int bestClosingTime(String customers) {
        int ans=Integer.MAX_VALUE;
        int open=0;
        //calculating the total no of customers
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y')
                open+=1;
            else
                open+=0;
        }
        int curropen=0;
        int currclosed=0;
        int hour=0;
        for(int i=0;i<customers.length();i++){
            int currPenalty=open-curropen+currclosed;
            if(currPenalty<ans){
                ans=currPenalty;
                hour=i;
            }
            if(customers.charAt(i)=='Y')
                curropen+=1;
            else
                curropen+=0;
            if(customers.charAt(i)=='N')
                currclosed+=1;
            else
                currclosed+=0;
        }
        //checking if the shop will closes at length+1
        int currPenalty=open-curropen+currclosed;
        if(currPenalty<ans){
            ans=currPenalty;
            hour=customers.length();
        }
        return hour;
        
    }
}

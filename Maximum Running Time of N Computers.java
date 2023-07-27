class Solution {
    public boolean isPossibleToRun(int n, int[] batteries,long avgTime){
        long duration=0;
        for(int ele:batteries){
            if(ele<avgTime)
                duration+=ele;
            else
                duration+=avgTime;
        }
        //as arithmetic exception is commng
        boolean res=false;
        try{
            res=duration/avgTime>=n;
        } 
        catch(Exception e){
            
        }
        return res;
        
    }
    public long maxRunTime(int n, int[] batteries) {
        if(n==1 && batteries[0]==1)
            return 1;
        long sum=0;
        for(int el:batteries){
            sum+=el;
        }
        long startTime=0,endTime=sum,ans=0;
        while(startTime<=endTime){
            long avgTime=(startTime+endTime)/2;
            if(isPossibleToRun(n,batteries,avgTime)){
                ans=avgTime;
                startTime=avgTime+1;
            }
            else{
                endTime=avgTime-1;
            }
        }
        return ans;
    }
}

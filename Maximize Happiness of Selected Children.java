class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        Stack<Integer>st=new Stack<>();
        for(int i:happiness){
            st.push(i);
        }
        long max=0;
        for(int i=0;i<k;i++){
            if(!st.isEmpty()){
                int temp=st.pop();
                if((temp-i)>0){
                    max+=(temp-i);
                }
            } 
            
        }
        return max;
        
         
    }
}

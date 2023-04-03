class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int sum=0;
        int c=0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                c++;
                i++;
                j--;
            }
            else if(people[i]<=limit)
            {
                c++;
                j--;
            }
        }
        return c;
        
    }
}

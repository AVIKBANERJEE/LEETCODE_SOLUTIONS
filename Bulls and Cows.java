class Solution {
    public String getHint(String secret, String guess) {
        //matching the character is denoted by bull
        //not matching the characters is denoted by cow
        int bulls=0,cows=0;
        int num[]=new int[10];
        for(int i=0;i<secret.length();i++){
            int s=secret.charAt(i)-'0';//converting to integer
            int g=guess.charAt(i)-'0';
            if(s==g)
                bulls++;
            else{
                if(num[s]<0)
                    cows++;
                if(num[g]>0)
                    cows++;
                num[s]++;
                num[g]--;
            }
        }
        return bulls+"A"+cows+"B";
    }
}

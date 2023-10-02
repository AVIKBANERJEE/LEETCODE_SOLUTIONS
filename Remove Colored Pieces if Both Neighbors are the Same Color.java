class Solution {
    public boolean winnerOfGame(String colors) {
        char a[]=colors.toCharArray();
        int alice=0,bob=0;
        for(int i=1;i<a.length-1;i++){
            if((a[i]=='A') && (a[i-1]=='A') && (a[i+1]=='A')){
                alice++;
            }
            if((a[i]=='B') && (a[i-1]=='B') && (a[i+1]=='B')){
                bob++;
            }
        }
        if(alice>bob)
            return true;
        return false;
    }
}

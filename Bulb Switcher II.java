class Solution {
    public int flipLights(int n, int presses) {
       if(presses==0)
       {
           return 1;
       }
        if(presses==1)
        {
            if(n==1)
                return 2;
            
            else if(n==2)
                return 3;
            else
                return 4;
        }
        if(presses==2){
            if(n==1)
                return 2;
            else if(n==2)
                return 4;
            else 
                return 7;
            
        }
        else{
            if(n==1)
                return 2;
            else if(n==2)
                return 4;
            else
                return 8;
        }
        
    }
}

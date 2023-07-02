class Solution {
   int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        dist(0, cookies, new int[k], 0);
        return res;
    }

    public void dist(int idx, int[] cookies, int[] arr, int max){
        if(idx == cookies.length){
            res = Math.min(res, max);
        }
        else{
            for(int i = 0; i < arr.length; i++){
                arr[i] += cookies[idx];
                int nm = Math.max(max, arr[i]);
                dist(idx + 1, cookies, arr, nm);
                arr[i] -= cookies[idx];
            }
        }
        
    }
}

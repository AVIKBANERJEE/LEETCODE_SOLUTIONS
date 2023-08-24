class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> al=new ArrayList<>();
        int start =0, end=0;
        for(int i=0; i<s.length(); i++){
			// i== s.length() when there is no next element to check with
			if(i== s.length()-1 || s.charAt(i) != s.charAt(i+1)){
				end = i;
				if(end-start +1 >=3){
					al.add(Arrays.asList(start, end));
				}
				// update the start for next end, as end will be updated next
				start = i+1;
			}
		}
        return al;
    }
}

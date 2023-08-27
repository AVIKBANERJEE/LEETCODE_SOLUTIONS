class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(String s :words){
            String[] temp=s.split(String.valueOf("\\Q" +separator+ "\\E")); //\\Q->denotes start of a literal string and \\E denotes the end of a literal string
            for(String ss:temp){
                if(ss.length()>=1)
                    result.add(ss);
            }
        }
        return result;

    }
}

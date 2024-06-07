public String replaceWords(List<String> dictionary, String sentence) {
        String s[]=sentence.split("\\s");
        for(int i=0;i<s.length;i++){
            String s1=s[i];
            for(int j=0;j<dictionary.size();j++){
                String s2=dictionary.get(j);
                if((s1.charAt(0)==s2.charAt(0)) && s1.length()>s2.length()){
                    s[i]=s2;
                    break;
                }
            }
        }
        String res=String.join(" ",s);
        return res;
    }

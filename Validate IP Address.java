class Solution {
    public String validIPAddress(String queryIP) {
        if(queryIP==null || queryIP.isEmpty()){
            return "Neither";
        }
        if(queryIP.indexOf(".")>=0)
            return validateIPV4(queryIP);
        if(queryIP.indexOf(":")>=0)
            return validateIPV6(queryIP);
        return "Neither";
        
    }
    public static String validateIPV4(String ip){
        if(ip.charAt(0)=='.' || ip.charAt(ip.length()-1)=='.')
            return "Neither";
        String[] components=ip.split("\\."); /*spliting on the basis of dot*/
        if(components.length!=4)
            return "Neither";
        for(String comp:components){
            if(comp.isEmpty() || comp.length()>3 || (comp.charAt(0)=='0' && comp.length()>1))
                return "Neither";
            for(char ch:comp.toCharArray()){
                if(ch<'0' || ch>'9')
                    return "Neither";
            }
            int num=Integer.parseInt(comp);
            if(num<0 || num>255)
                return "Neither";
        }
        return "IPv4";
        
    }
    public static String validateIPV6(String ip){
        if(ip.charAt(0)==':' || ip.charAt(ip.length()-1)==':')
            return "Neither";
        String[] components=ip.split("\\:"); /*spliting on the basis of :*/
        if(components.length!=8)
            return "Neither";
        for(String comp:components){
            if(comp.isEmpty() || comp.length()>4)
                return "Neither";
            for(char ch:comp.toLowerCase().toCharArray()){
                if((ch<'0' || ch>'9') && (ch!='a' && ch!='b' && ch!='c' && ch!='d' && ch!='d' && ch!='e' && ch!='f'))
                    return "Neither";
            }
        }
        return "IPv6";
        
        
    }
    
    
}

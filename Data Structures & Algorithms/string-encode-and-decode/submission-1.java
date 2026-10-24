class Solution {

    List<String> x;
    public String encode(List<String> strs) {
        x = strs;
        String str = "";
        for(String s : strs){
            str=str+s+" ";
        }
        return str;
    }

    public List<String> decode(String str) {
      
        return x;

    }
}

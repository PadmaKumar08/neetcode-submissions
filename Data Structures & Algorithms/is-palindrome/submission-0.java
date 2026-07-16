class Solution {
    public boolean isPalindrome(String s){
        String a = s.replace(" ","");
        String b = a.replaceAll("[^a-zA-Z0-9]","");
        String l = b.toLowerCase();
        String c = new StringBuilder(l).reverse().toString();
        if(c.equals(l)){
            return true;
        }return false;
    }
}

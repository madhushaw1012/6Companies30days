class Solution {
    public String getHint(String secret, String guess) {
        int[] g= new int[10];
        int cows=0, bulls=0;
        for(int i=0; i< secret.length(); i++) {
            if(secret.charAt(i)== guess.charAt(i)) bulls++;
            else
                g[guess.charAt(i)-'0']++;
        }
        for(int i=0; i< secret.length();i++) {
            if(secret.charAt(i)== guess.charAt(i)) continue;
            if(g[secret.charAt(i)-'0'] > 0) {
                cows++;
                g[secret.charAt(i)-'0']--;
            }
        }
        String ans= bulls+"A"+cows+"B";
        return ans;
    }
}

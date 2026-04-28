class Solution {
    public int[] solution(long n) {
    String str = String.valueOf(n);
        int  length = str.length();
        int [] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
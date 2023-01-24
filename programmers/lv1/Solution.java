package lv1;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pValue = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));

            if (tValue <= pValue) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("3141592", "271"));
        System.out.println(solution.solution("88888888888888888888888888888888888888888888", "777777777777777777"));
        System.out.println(solution.solution("10203", "15"));
    }

}
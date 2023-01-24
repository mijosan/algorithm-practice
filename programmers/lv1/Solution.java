package lv1;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int pLength = p.length();

        int[] arr = new int[t.length()];

        for (int i = 0; i < t.length(); i++) {
            arr[i] = t.charAt(i) - '0';
        }

        for (int i = 0; i < t.length(); i++) {
            if (arr.length - pLength < i) {
                break;
            }

            StringBuffer sb = new StringBuffer();

            int count = 0;
            for (int j = i; count < pLength; j++) {

                sb.append(arr[j]);
                count++;
            }

            if (Long.parseLong(p) >= Long.parseLong(sb.toString())) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // System.out.println(solution.solution("3141592", "271"));
        System.out.println(solution.solution("88888888888888888888888888888888888888888888", "777777777777777777"));
        // System.out.println(solution.solution("10203", "15"));
    }

}
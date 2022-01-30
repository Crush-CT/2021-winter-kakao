import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int i = 0;
        String reporter = "";
        String reported = "";

        LinkedHashMap<String, Integer> mail = new LinkedHashMap<>();
        HashMap<String, Integer> report_2 = new HashMap<>();
        HashMap<String, Integer> report_3 = new HashMap<>();
        String[][] report_arr = new String[report.length][2];

        for (String s : id_list) {
            mail.put(s, 0);
        }

        // 1. 중복 체크
        for (String s : report) {
            report_2.put(s, 0);
        }

        for (String key : report_2.keySet()) {
            reporter = key.split(" ")[0];
            reported = key.split(" ")[1];

            report_arr[i][0] = reporter;
            report_arr[i][1] = reported;

            // 2. 몇번 신고받았는지
            if (report_3.get(reported) == null) {
                report_3.put(reported, 1);
            } else {
                report_3.put(reported, report_3.get(reported) + 1);
            }

            i++;
        }

        for (i = 0; i < report_arr.length; i++) {
            reporter = report_arr[i][0];
            reported = report_arr[i][1];

            if (report_3.get(reported) != null && report_3.get(reported) >= k) {
                mail.put(reporter, mail.get(reporter) + 1);
            }
        }

        i = 0;

        for (String key : mail.keySet()) {
            answer[i] = mail.get(key);
            i++;
        }

        return answer;
    }
}
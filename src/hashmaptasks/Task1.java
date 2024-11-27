package hashmaptasks;

import java.util.ArrayList;
import java.util.HashMap;

public class Task1 {
    private HashMap<String, ArrayList<Integer>> students;

    public Task1() {
        students = new HashMap<>();
    }

    public void addScore(String studentName, int score) {
        students.putIfAbsent(studentName, new ArrayList<>());
        students.get(studentName).add(score);
    }

    public double averageScore(String studentName) {
        if (students.containsKey(studentName)) {
            ArrayList<Integer> list = students.get(studentName);
            int total = 0;
            for (int score : list) {
                total += score;
            }
            return (double) total / list.size();
        }
        return -1;
    }

    public String findMaxAverageStudent() {
        String name = null;
        double score = -1;
        for (String s : students.keySet()) {
            double averageScore = averageScore(s);
            if (score < averageScore) {
                score = averageScore;
                name = s;
            }
        }
        return name;
    }
}

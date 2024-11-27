package linkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomeoneTest {
    private Map<String, List<Integer>> studentScores = new HashMap<>();

    public void addScore(String studentName, int score) {
        studentScores.computeIfAbsent(studentName, k -> new ArrayList<>()).add(score);
    }

    public double calculateAverageScore(String studentName) {
        List<Integer> scores = studentScores.get(studentName);
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (int score : scores) {
            total += score;
        }
        return total / scores.size();
    }

    public String findStudentWithHighestAverage() {
        String topStudent = null;
        double highestAverage = 0.0;
        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            double average = calculateAverageScore(entry.getKey());
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = entry.getKey();
            }
        }
        return topStudent;
    }
}




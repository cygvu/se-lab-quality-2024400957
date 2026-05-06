// After.java 重构后的优质代码
public class After {
    // 抽取通用方法：消除重复代码 + 缩短方法
    private static int getTotal(int a, int b, int c) {
        return a + b + c;
    }

    private static double getAvg(int total) {
        return total / 3.0;
    }

    private static String getLevel(double avg) {
        if (avg >= 90) return "A";
        if (avg >= 80) return "B";
        if (avg >= 70) return "C";
        return "D";
    }

    private static void showResult(String type, String name, int total, double avg, String level) {
        System.out.println(type + "：" + name);
        System.out.println("总分：" + total);
        System.out.println("平均分：" + avg);
        System.out.println("等级：" + level);
    }

    // 简化后的方法：不再冗长
    public static void calculateStudentScore(String name, int math, int english, int code) {
        int total = getTotal(math, english, code);
        double avg = getAvg(total);
        String level = getLevel(avg);
        showResult("学生", name, total, avg, level);
    }

    // 简化后的方法：无重复代码
    public static void calculateTeacherScore(String name, int test1, int test2, int test3) {
        int total = getTotal(test1, test2, test3);
        double avg = getAvg(total);
        String level = getLevel(avg);
        showResult("教师", name, total, avg, level);
    }

    public static void main(String[] args) {
        calculateStudentScore("小明", 85, 90, 88);
        calculateTeacherScore("李老师", 95, 88, 92);
    }
}

// Before.java 带坏味道的原始代码
public class Before {
    // 坏味道1：方法太长
    public static void calculateStudentScore(String name, int math, int english, int code) {
        // 计算总分
        int total = math + english + code;
        // 计算平均分
        double avg = total / 3.0;
        // 判断等级
        String level;
        if (avg >= 90) {
            level = "A";
        } else if (avg >= 80) {
            level = "B";
        } else if (avg >= 70) {
            level = "C";
        } else {
            level = "D";
        }
        // 输出结果
        System.out.println("学生：" + name);
        System.out.println("总分：" + total);
        System.out.println("平均分：" + avg);
        System.out.println("等级：" + level);
    }

    // 坏味道2：完全重复的代码块（和上面几乎一样）
    public static void calculateTeacherScore(String name, int test1, int test2, int test3) {
        // 重复：计算总分
        int total = test1 + test2 + test3;
        // 重复：计算平均分
        double avg = total / 3.0;
        // 重复：判断等级
        String level;
        if (avg >= 90) {
            level = "A";
        } else if (avg >= 80) {
            level = "B";
        } else if (avg >= 70) {
            level = "C";
        } else {
            level = "D";
        }
        // 重复：输出结果
        System.out.println("教师：" + name);
        System.out.println("总分：" + total);
        System.out.println("平均分：" + avg);
        System.out.println("等级：" + level);
    }

    public static void main(String[] args) {
        calculateStudentScore("小明", 85, 90, 88);
        calculateTeacherScore("李老师", 95, 88, 92);
    }
}

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student st = new Student();
        String name;
        int kor, eng, math;

        System.out.print("성적을 계산합니다.\n이름을 입력하세요 : ");
        name = scanner.next();

        System.out.print("국어 성적을 입력하세요 : ");
        kor = scanner.nextInt();

        System.out.print("영어 성적을 입력하세요 : ");
        eng = scanner.nextInt();

        System.out.print("수학 성적을 입력하세요 : ");
        math = scanner.nextInt();

        int[] scores = new int[] { kor, eng, math };

        st.AddStudent(name, scores);

        System.out.println("평균 : " + st.GetAverage() + ", 학점 : " + st.GetGrade());
    }
}
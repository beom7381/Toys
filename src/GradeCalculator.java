import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student st = new Student();
        String name;
        int kor, eng, math;
        int[] scores;

        for(int i = 0; i < 3; i++){
            System.out.print("성적을 계산합니다.\n이름을 입력하세요 : ");
            name = scanner.next();

            System.out.print("국어 성적을 입력하세요 : ");
            kor = scanner.nextInt();

            System.out.print("영어 성적을 입력하세요 : ");
            eng = scanner.nextInt();

            System.out.print("수학 성적을 입력하세요 : ");
            math = scanner.nextInt();

            scores = new int[] { kor, eng, math };

            st.AddStudent(name, scores);
        }

        for(Student sts : Student.List){
            System.out.println("이름 : " + sts.GetName() + ", 평균 : " + sts.GetAverage() + ", 학점 : " + sts.GetGrade());
        }
    }
}
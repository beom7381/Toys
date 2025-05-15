import java.util.ArrayList;

public class Student implements ScoreChecker {
    public static ArrayList<Student> List;
    private String _name;
    private int[] _scores;
    private int _sum;
    private char _grade;

    public Student(){
        List = new ArrayList<>();
    }

    public void AddStudent(String name, int[] scores){
        SetName(name);
        SetScores(scores);

        List.add(this);
    }

    private void SetName(String name){
        _name = name;
    }

    private void SetScores(int[] scores){
        int sum = 0;

        _scores = scores;

        for (int score : _scores) {
            sum += score;
        }

        _sum = sum;
        _grade = CheckGrade(GetAverage());
    }

    public String GetName(){
        return _name;
    }

    public int GetAverage(){
        return _sum / _scores.length;
    }

    public char GetGrade(){
        return _grade;
    }

    private char CheckGrade(int average){
        return average >= 90 ? 'A' :
               average >= 80 ? 'B' :
               average >= 70 ? 'C' :
               average >= 60 ? 'D' : 'F';
    }
}


/*
주제 1: 학생 성적 계산기 (성적 관리 시스템)
기능: 이름, 국어/영어/수학 점수를 입력받고 총점, 평균, 등급(A/B/C 등)을 출력
필수 구현 요소:

Student 클래스를 만들고 필드를 캡슐화

평균을 구하는 getAverage() 메소드

등급을 리턴하는 getGrade() 메소드

여러 명을 저장하려면 배열이나 ArrayList 사용

 */
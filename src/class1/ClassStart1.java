package class1;
// 학생이 늘어날때 마다 추가로 변수를 선언 해줘야하는 귀찮음이 있다.
public class ClassStart1 {
    public static void main(String[] args) {
        String student1 = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2 = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1 + ", 나이 : " + student1Age + ", 성적: " + student1Grade);
        System.out.println("이름: " + student2 + ", 나이 : " + student2Age + ", 성적: " + student2Grade);
    }
}

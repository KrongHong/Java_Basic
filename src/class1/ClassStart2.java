package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};
    // 배열의 한계 : 학생하나의 요소를 제거하기 위해서는 위치를 잘 찾아서 3개의 배열의 요소를 다 제거 해줘야한다.
        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + ", 나이 : " + studentAges[i] + ", 성적: " + studentGrades[i]);
        }
    }
}

package access.ex;

public class MaxCount {

    private int count;
    private int max;

    MaxCount(int max){
        this.max = max;
    }

    public void increament() {
        if (count >= 3) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount(){
        return count;
    }
}

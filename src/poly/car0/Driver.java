package poly.car0;

public class Driver {

    private K3Car k3Car;
    // 기본값이 null이 된다
    private Model3Car model3Car;
    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    } // 외부에서 k3Car를 받아오기 위한 함수

    //추가
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }
}

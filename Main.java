package homework3;

import java.util.Objects;

class Bus {
    String state;
    int maxPassenger;
    int pee;
    int busNumber;
    int oil;
    int currentSpeed;
    int currentPassenger;

    public Bus(String state, int maxPassenger, int pee, int busNumber, int oil, int currentSpeed, int currentPassenger) {
        this.state = state;
        this.maxPassenger = maxPassenger;
        this.pee = pee;
        this.busNumber = busNumber;
        this.oil = oil;
        this.currentSpeed = currentSpeed;
        this.currentPassenger = currentPassenger;
    }

    public Bus(String state, int maxPassenger, int pee, int busNumber, int oil) {
        this("'운행'", maxPassenger, pee, busNumber, oil, 0, 0);
    }

//    public void printNeedOil() {
//        System.out.println("주유량을 확인해주세요");
//    }

    public void start() {
        if (oil < 10) {
            state = "'차고지행'";
            System.out.println("'주유가 필요하다");
        }
        state = "'운행'";
        System.out.println(state);
    }

    public void getOnTheBus(int n){
        if (Objects.equals(state, "'운행'")){
            for (int j =0 ; j<n ; j++){
                if (maxPassenger>currentPassenger) {
                    currentPassenger += 1;
                }
            }
        }
        System.out.println(currentPassenger);


    }

    public void speedChange(int c){
        if (oil>=10){
            System.out.println("주유량을 확인해주세요");

            currentSpeed += c;
            System.out.println(currentSpeed);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Bus yangyang9 = new Bus("'운행'", 40, 1500, 9, 8);

        yangyang9.start();
        yangyang9.getOnTheBus(50);
        yangyang9.speedChange(80);
    }
}
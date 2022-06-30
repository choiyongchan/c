package homework3;

import java.util.Objects;

class taxi {
    String state;
    int taxiNumber;
    int oil;
    int currentSpeed;
    String destination;
    int basicDistance;
    int distance;
    int basicFee;
    int distanceFee;
    int extramoney;


    public taxi(String state, int taxiNumber, int oil, int currentSpeed, String destination, int basicDistance, int distance, int basicFee, int distanceFee) {
        this.state = state;
        this.taxiNumber = taxiNumber;
        this.oil = oil;
        this.currentSpeed = currentSpeed;
        this.destination = destination;
        this.basicDistance = basicDistance;
        this.distance = distance;
        this.basicFee = basicFee;
        this.distanceFee = distanceFee;
    }

    public taxi(String state, int taxiNumber, int oil, String destination, int distance){
        this(state,taxiNumber,oil,0,destination,4,distance,3800, 900);
    }




    public void start(){
        if(oil>=10){
            state = "'일반'";
        }else {
            state = "운행 불가";
        }
        System.out.println(state);
    }

    public void passenger(){

        if(Objects.equals(state, "'일반'")){
            state = "'운행 중'";
        }else{
            state = "'탑승 불가'";
        }
        System.out.println(state);
    }

    public void speedChange(int s){
        currentSpeed += s;
    }

    public void extraFee(){

        if(distance>basicDistance){
             extramoney = (distance-basicDistance)*distanceFee;
        }else{
            extramoney = 0;
        }
    }

    public void totalFee() {
        if (Objects.equals(state, "'운행 중'")) {
            System.out.println(basicFee + extramoney);

        }
    }
}


public class Taxi {
    public static void main(String[] args){
        taxi mytaxi = new taxi("상태", 9, 30, "Sokcho", 20);

        mytaxi.start();
        mytaxi.passenger();
        mytaxi.speedChange(30);
        mytaxi.extraFee();
        mytaxi.totalFee();
    }
}

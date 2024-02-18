package designPatterns.strategy.scalarQuestions.Q5_PricingCalculator;

public class RideDetails {
    private double distance; // Distance in kilometers
    private int duration; // Duration in minutes

    public RideDetails(double distance, int duration){
        this.distance = distance;
        this.duration = duration;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getDistance(){
        return this.distance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}



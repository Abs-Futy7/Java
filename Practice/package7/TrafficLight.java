package package7;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    public String getColor(){
        return color;
    }

    public int getDuration(){
        return duration;
    }

    public void changeColor(String newColor){
        color = newColor;
    }

    public boolean isRed(){
        return color.equals("Red");
    }

    public boolean isGreen(){
        return color.equals("Green");
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

}

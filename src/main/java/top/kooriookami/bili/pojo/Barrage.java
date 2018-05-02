package top.kooriookami.bili.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: fei
 * @Date: 2018/4/27
 * @Time: 10:01
 * @Description:
 */
public class Barrage {

    String text;
    String color;
    String speed;

    public Barrage(String text, String color, String speed, String top) {
        this.text = text;
        this.color = color;
        this.speed = speed;
        this.top = top;
    }

    @Override
    public String toString() {
        return "Barrage{" +
                "text='" + text + '\'' +
                ", color='" + color + '\'' +
                ", speed='" + speed + '\'' +
                ", top='" + top + '\'' +
                '}';
    }

    String top;

    public Barrage() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}

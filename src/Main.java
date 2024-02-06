import com.peace.Class.Ball;
import com.peace.Class.BaseBall;
import com.peace.Class.BasketBall;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
      Ball ball = new Ball();
        BasketBall basketball = new BasketBall();
        basketball.name = "round";
        basketball.color = "red";
        System.out.println(basketball.name);
    }
}
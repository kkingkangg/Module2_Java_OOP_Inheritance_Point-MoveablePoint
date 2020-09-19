public class Main {
    public static void main(String[] args) {
        MoveablePoint ball = new MoveablePoint(3.5f, 3.6f, 1.3f, 5.8f);
        System.out.println(ball);
        System.out.println(ball.move());
    }
}

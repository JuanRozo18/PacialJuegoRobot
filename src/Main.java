
public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        Hombre hombre = new Hombre("Jugador");

        System.out.println("Jugador comieza a jugar");
        hombre.jugar(robot);
        if (robot.estaDormido()){
            robot.despertar();
        }

    }
}
import java.util.Scanner;

public class Hombre {

    private String nombre;


    public Hombre(String nombre){
        this.nombre = nombre;
    }

        public void jugar (Robot robot){
        Scanner teclado = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("---- Menu Juego----");
            System.out.println("1. Avanzar una cantidad de pasos");
            System.out.println("2. Retroceder una cantidad de pasos");
            System.out.println("3. Ver energia actual");
            System.out.println("4. Dormir al robot");
            System.out.println("5. Despertar al robot");
            System.out.println("6. Recargar la bateria");
            System.out.println("7. Terminar juego");
            System.out.println("Seleccione una opcion");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la cantidad de pasos a avanzar");
                    int pasosAvamzar = teclado.nextInt();
                    robot.avanzar(pasosAvamzar);
                }
                case 2 -> {
                    System.out.println("Ingrese la cantida de pasos a retroceder");
                    int pasosRetoceder = teclado.nextInt();
                    robot.retroceder(pasosRetoceder);
                }
                case 3 -> {
                    System.out.println("La energia atual es: " + robot.energiaActual());
                }
                case 4 -> {
                    robot.dormir();
                }
                case 5 -> {
                    robot.despertar();
                }
                case 6 -> {
                    robot.recargar();
                }
                case 7 -> {
                    System.out.println("Terminando juego...");
                }
                default -> System.out.println("Seleccione una opcion valida");
            }
        } while (opcion != 7 );

        System.out.println(nombre + "ha terminado el juego");
    }



}

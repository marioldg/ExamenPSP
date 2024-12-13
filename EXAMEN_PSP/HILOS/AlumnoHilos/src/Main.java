import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * ALUMNO 1
         */
        //PEDIR POR PANTALLA NOMBRE ALUMNO1
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime nombre del primer alumno");
        String nombre1 = sc.nextLine();

        //CREACION ALUMNO 1 Y SU HILO
        Alumno alumno1 = new Alumno(nombre1);
        Thread hilo1 = new Thread(alumno1);
        if(nombre1.equalsIgnoreCase("Pepito")){
            System.out.println("Mira que ser yo.."+" "+ nombre1);
        }else{
            hilo1.start();
            try {
                hilo1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        /**
         * ALUMNO 2
         */
        //PEDIR POR PANTALLA NOMBRE ALUMNO2
        System.out.println("Dime nombre del segundo alumno");
        String nombre2 = sc.nextLine();

        //CREACION ALUMNO 2 Y SU HILO
        Alumno alumno2 = new Alumno(nombre2);
        Thread hilo2 = new Thread(alumno2);
        if(nombre2.equalsIgnoreCase("Pepito")){
            System.out.println("Mira que ser yo.."+" "+ nombre2);
        }else{
            hilo2.start();
            try {
                hilo2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        /**
         * ALUMNO 3
         */
        //PEDIR POR PANTALLA NOMBRE ALUMNO3
        System.out.println("Dime nombre del tercer alumno");
        String nombre3 = sc.nextLine();

        //CREACION ALUMNO 3 Y SU HILO
        Alumno alumno3 = new Alumno(nombre3);
        Thread hilo3 = new Thread(alumno3);
        if(nombre3.equalsIgnoreCase("Pepito")){
            System.out.println("Mira que ser yo.."+" "+ nombre3);
        }else{
            hilo3.start();
            try {
                hilo3.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }

        }


    }


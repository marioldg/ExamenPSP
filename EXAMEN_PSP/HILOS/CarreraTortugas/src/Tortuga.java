public class Tortuga extends Thread {
    private static boolean carreraTerminada = false;
    private int id;
    private int distanciaRecorrida = 0;

    public Tortuga(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (!carreraTerminada) {
            int avance = (int) (Math.random() * 11); // Avance aleatorio entre 0 y 10
            distanciaRecorrida += avance;
            System.out.println("La tortuga " + id + " ha avanzado " + distanciaRecorrida + " metros.");


            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("La tortuga " + id + " se ha detenido.");
                break;
            }


            if (distanciaRecorrida >= 100 && !carreraTerminada) {
                    carreraTerminada = true;
                    System.out.println("¡La tortuga " + id + " ha ganado la carrera!");

                break;
            }
        }
    }
}

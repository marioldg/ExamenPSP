public class Alumno implements Runnable{

    private String nombre;
    private String mensaje;

    public Alumno(String nombre){
        this.nombre= nombre;
        this.mensaje= mensaje;

    }


    @Override
    public void run() {
        int contador= 1;
        while(contador<6){
            System.out.println("Hola soy"
                    + " "+ nombre + " " +
                    "y este es mi mensaje numero "+ contador);
            contador++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }




    }
}

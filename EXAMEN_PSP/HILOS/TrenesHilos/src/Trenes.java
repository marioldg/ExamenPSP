public class Trenes extends Thread{
    private String nombre;
    private int id;

    public Trenes(String nombre,int id){
        this.id= id;
        this.nombre=nombre;
    }

    public void run(){
        System.out.println("Tren " + nombre + " está usando la vía");
        if(Thread.interrupted()){
            System.out.println("El tren se fue a la mierda");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(4000);
            System.out.println("Tren "+ nombre+" ha dejado la vía");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

package EjerciciosEnJavaDeProcesosConHilosTarea.Semaforo;
import java.util.concurrent.Semaphore;

class AccesoVentanilla implements Runnable{
    private final Semaphore semaforo;
    private final int id;
    public AccesoVentanilla(Semaphore semaforo,int id){
        this.semaforo = semaforo;
        this.id=id;
    }
    @Override
    public void run(){
        try {
            System.out.println("Hilo "+id+" Esperando en fila");
            semaforo.acquire();//avisa al resto de hilos que la seccion esta ocupada y detiene hilo hasta que espacio en semaforo
            System.out.println("Hilo "+id+" Esta en la ventanilla");
            Thread.sleep(2000);
            System.out.println("Hilo "+id+" esta saliendo de la ventanilla");
            semaforo.release();//avisa que hilo termino
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Main {
    public static void main(String args[]){
        Semaphore semaforo1=new Semaphore(2);
        for (int i=0;i<5;i++){
            Thread t = new Thread(new AccesoVentanilla(semaforo1,i));
            t.start();
        }
    }
}

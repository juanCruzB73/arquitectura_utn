package EjerciciosEnJavaDeProcesosConHilosTarea.WaitNotify;

class WaitNotify {
    public synchronized void Esperar() throws InterruptedException{
            System.out.println("Esperando...");
            wait();
            System.out.println("Liberando");
        }
    public synchronized void Liberar()throws InterruptedException{
        System.out.println("comienza metodo liberar");
        Thread.sleep(2000);
        notify();
        System.out.println("El hilo se libero");
    }
}
public class Main{
    public static void main(String args[]){
        WaitNotify esperandoNoti = new WaitNotify();

        Thread espera = new Thread( () -> {
            try{
                esperandoNoti.Esperar();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        Thread liberar = new Thread(()->{
           try {
               esperandoNoti.Liberar();
           }catch (InterruptedException e){
               throw new RuntimeException(e);
           }
        });

        espera.start();
        liberar.start();
    }
}


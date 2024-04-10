package EjerciciosEnJavaDeProcesosConHilosTarea.ThreadAutoLanzado;

public class SelfRun implements Runnable {
    private Thread internalThread;
    private boolean noStopRequired;

    public SelfRun() {
        System.out.println("Comienza ejecución");
        noStopRequired = true;
        internalThread = new Thread(this);
        internalThread.start();//Inicia la ejecución del thread.
    }

    public void run() {//Contiene el código que ejecuta el thread.
        while (noStopRequired) {
            System.out.println("En ejecución");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();//Retorna el objeto Thread que ha ejecutado este método.
            }
        }
    }

    public void stopRequest() {
        noStopRequired = false;
        internalThread.interrupt();
    }
}

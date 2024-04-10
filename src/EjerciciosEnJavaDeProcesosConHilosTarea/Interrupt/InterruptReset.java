package EjerciciosEnJavaDeProcesosConHilosTarea.Interrupt;

public class InterruptReset {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("A: Thread.interrupted()="+Thread.interrupted());
        t.interrupt();//This method not only checks the interrupt status but also clears the interrupt status of the current thread.
        System.out.println("B: Thread.interrupted()="+Thread.interrupted());
        System.out.println("C: Thread.interrupted()="+Thread.interrupted());
        try{
            Thread.sleep(2000);
            System.out.println("No ha sido interrumpida");
        }catch(InterruptedException e){
            System.out.println("Si ha sido interrumpida");
        }
        System.out.println("D: t.isInterrupted()="+t.isInterrupted());
    }
}

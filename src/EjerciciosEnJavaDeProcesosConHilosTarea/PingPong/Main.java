package EjerciciosEnJavaDeProcesosConHilosTarea.PingPong;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args){
//declaración
        PingPong t1 =new PingPong("ping",33);
        PingPong t2= new PingPong("pong",10);
//activacion
        t1.start();
        t2.start();
// Espera 2 segundos
        try{ sleep(5000);
        }catch (InterruptedException e){};
// Finaliza la ejecución de los threads
        t1.stop();
        t2.stop();
    }
}
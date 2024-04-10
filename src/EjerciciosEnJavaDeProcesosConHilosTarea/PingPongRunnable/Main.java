package EjerciciosEnJavaDeProcesosConHilosTarea.PingPongRunnable;

import EjerciciosEnJavaDeProcesosConHilosTarea.PingPong.PingPong;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args){
//declaración creacion
        PingPong r1 =new PingPong("ping",33);
        PingPong r2= new PingPong("pong",10);
//
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
//activacion
        t1.start();
        t2.start();
    }
}
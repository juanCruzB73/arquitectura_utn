package EjerciciosEnJavaDeProcesosConHilosTarea.Join;

public class Main {
    public static void main(String[] args){
        Obrera agente = new Obrera();
        agente.start();
// Hace algo durante el cálculo.
        try { //Espera a que agente termine
            agente.join();
        }catch (InterruptedException e){};
// Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}

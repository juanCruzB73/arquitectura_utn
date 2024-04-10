package EjerciciosEnJavaDeProcesosConHilosTarea.ThreadAutoLanzado;
public class Main {
    public static void main(String[] args) {
        SelfRun objActivo=new SelfRun();
        try{
            Thread.sleep(2000);//espera tres segundos y ejecuta stopRequest
        }catch(InterruptedException e){};
        // Termina el objeto activo
        System.out.println("main invoca stopRequest()");
        objActivo.stopRequest();//Termina la ejecución del thread (*)
    }
}

package filosofos;

public class Main {
    public static void main(String[]args){
        String[] phylosophers={"elliot","terry davis","ted kaczinki","Lain","Moore Jack"};
        Table table=new Table(5);
        for(int i =0;i<5;i++){
            Phylosopher phylosopher = new Phylosopher(table,phylosophers[i],i);
            phylosopher.start();
        }
    }
}

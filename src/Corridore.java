public class Corridore  extends Thread{
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Corridore: nome=" + nome ;
    }

    public void run (){
        for (int i=0;i<=100;i++)
        {
            System.out.println(this.nome + " -->" + i + "metri");
            try{
                Thread.sleep(100);
            }catch(Exception e) {}
        }
        System.out.println(this.nome + " ha finito la corsa");
    }

    
}

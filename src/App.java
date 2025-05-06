public class App {
    public static void main(String[] args) throws Exception {
       
        final int  max = 4;
       String nomi[] = {"Matteo","Gabriele","Samuele","Davide"};
       Corridore lista[] = new Corridore[max];

       for (int i=0;i<max;i++)
       {
            lista[i] = new Corridore(nomi[i]);
            lista[i].start();
       }

         

        for (int i=0;i<max;i++)
       {
        lista[i].join();
         }

        System.out.println("Gara Terminata");
       
}
}

import java.util.Scanner;

public class Fatorial {
    Scanner prompt = new Scanner(System.in);
        int n, prod = 1, i = 0;

            public void FatorialN(){
                System.out.println("Entre com um valor : ");
                n = prompt.nextInt();
                while(i < n){
                    i = i + 1;
                    prod = prod * i;
                }
                System.out.println("O fatorial de " + n + " é : " + prod);
            }

}
    


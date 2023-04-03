import java.util.Scanner;
public class ParesImpares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numImpar = 0;
        int numPar = 0;
        System.out.println("Informe 10 números: ");
        for(int i = 0; i <10; i++){
            int num = sc.nextInt();
            if(num % 2 == 0){
                numPar += 1;
            } else{
                numImpar +=1;
            }
        }
        System.out.println("A quantidade números pares são: " + numPar + "\nA quantidade de números ímpares são: " + numImpar);
        sc.close();
    }

}

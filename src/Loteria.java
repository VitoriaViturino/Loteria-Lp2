import banco.entidades.ContaSimples;
import banco.entidades.Pessoa;

import java.util.Random;

public class Loteria {
    public static void main(String[] args) {

        ContaSimples conta = new ContaSimples(new Pessoa("Vitória", "111222333-44"));
        conta.depositar(1000);
        Boolean ganhou = loteria();
        //System.out.println(ganhou);
        double num= 0;
        if(ganhou){
            num = getValorDoPremio(1000000);
            System.out.println("você ganhou:" + num);
        } else{
            num = 0.0;
        }

        conta.depositar(num);
        System.out.println("Seu saldo é de: " + conta.getSaldo());
    }

    private static boolean loteria() {

        Random rand = new Random();
        return rand.nextBoolean();

        }

    public static double getValorDoPremio(double valorMaximoDoPremio) {
        Random rand = new Random();
        return rand.nextDouble(valorMaximoDoPremio);
    }

}


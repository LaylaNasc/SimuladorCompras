import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do seu cartão");
        double limite = leitura.nextDouble();
        Cartao_de_credito cartao = new Cartao_de_credito(limite);

        int sair = 1;
        while (sair != 0 ) {
            System.out.println("Digite a descrição da sua compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da sua compra");
            double valor = leitura.nextDouble();

            Compras compras = new Compras(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compras);

            if(compraRealizada) {
            System.out.println("Compra realizada com sucesso!");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            sair = leitura.nextInt();
            } else  {
                System.out.println("Saldo insulficiente!");
                sair = 0;
            }
        }

        System.out.println("*******************************************************");
        System.out.println("Compras realizadas: \n");


        Collections.sort(cartao.getCompras());
        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }

}

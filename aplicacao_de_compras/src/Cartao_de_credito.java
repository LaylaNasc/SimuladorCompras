import java.util.ArrayList;
import java.util.List;

public class Cartao_de_credito {
    private double limite;
    private  double saldo;
    private List<Compras> compras;


    public Cartao_de_credito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compras) {
        if (this.saldo > compras.getValor()) {
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return  true;
        }

        return  false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}

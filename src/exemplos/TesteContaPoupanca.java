package exemplos;

public class TesteContaPoupanca {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(123, "Marcelo");
        cp.depositar(1000);
        System.out.println(cp);
        cp.reajustar(0.85);
        System.out.println(cp);
    }
}

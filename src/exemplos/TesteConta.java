package exemplos;

public class TesteConta {

    public static void main(String[] args) {
        Conta c = new Conta(123456, "Marcelo", 1000); 
        c.depositar(100);
        c.depositar(50);
//        c.setNomeTitular("Marcelo");
//        c.setNumero(123456);
        boolean saqueEfetuado = c.sacar(300);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("ERRO AO SACAR!!!");
        }
//        System.out.println("Nome Titular: " + c.getNomeTitular());
//        System.out.println("Número: " + c.getNumero());
//        System.out.println("Saldo: " + c.getSaldo());
        System.out.println(c);
        System.out.println(new Conta(123, "Virna"));
        System.out.println(new Conta(456, "Priscila", 10));
    }
}

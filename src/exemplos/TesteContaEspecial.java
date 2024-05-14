package exemplos;

public class TesteContaEspecial {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(456, "Yuri", 500);
        ce.depositar(100);
//        ce.setNumero(123);
//        ce.setNomeTitular("Marcelo");
//        ce.setLimite(500);
        System.out.println(ce);
        System.out.println(ce.getLimite());
    }
}

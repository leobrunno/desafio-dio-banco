public class Main {
    public static void main(String[] args) {
        Banco javaBank = new Banco("JavaBank");

        Cliente joaquim = new Cliente("Joaquim");
        Conta cc = new ContaCorrente(joaquim);
        Conta cp = new ContaPoupanca(joaquim);

        javaBank.setContas(cc);
        javaBank.setContas(cp);
        javaBank.imprimirInfoBanco();

        cc.depositar(100);
        cc.transferir(75, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private ArrayList<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return contas;
    }

    public void setContas(Conta contaAdd) {
        if(!this.contas.contains(contaAdd)) {
            this.contas.add(contaAdd);
        }
    }

    public void imprimirInfoBanco() {
        System.out.println("\n---- Informações do banco ----");
        System.out.println(String.format("Instituição: %s", this.nome));
        System.out.println(String.format("Numeros de contas: %d", this.contas.size()));
        for (Conta conta: this.contas) {
            System.out.println("\n------------------------------");
            System.out.println(String.format("Nome do titular: %s", conta.cliente.getNome()));
            String tipoConta = conta instanceof ContaCorrente ? "Conta Corrente" : "Conta poupança";
            System.out.println("Tipo da conta: " + tipoConta );
            System.out.println("------------------------------");
        }
        System.out.println("\n---- Informações do banco ----");
    }
}

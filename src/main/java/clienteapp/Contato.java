
package clienteapp;

/**
 *
 * @author tiago.nascimento
 */
public class Contato {
    private String nome;
    private Telefone telefone;

    public Contato() {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + ": " + telefone;
    }
}


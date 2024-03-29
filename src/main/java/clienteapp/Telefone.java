package clienteapp;
/**
 *
 * @author tiago.nascimento
 */
public class Telefone {
    private String codigoPais;
    private String ddd;
    private String numero;
    public Telefone() {
        this.codigoPais = codigoPais;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "+" + codigoPais + " (" + ddd + ") " + numero;
    }
}

package clienteapp;

/**
 *
 * @author tiago.nascimento
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Endereco endereco;
    private Telefone telefoneResidencial;
    private Telefone telefoneCelular;
    private Telefone telefoneComercial;
    private DataNascimento dataNascimento;
    private String estadoCivil;
    private String genero;
    private String email;
    private Contato contato;

    public Cliente() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.telefoneComercial = telefoneComercial;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.email = email;
        this.contato = contato;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone Residencial: " + telefoneResidencial);
        System.out.println("Telefone Celular: " + telefoneCelular);
        System.out.println("Telefone Comercial: " + telefoneComercial);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Gênero: " + genero);
        System.out.println("E-mail: " + email);
        System.out.println("Contato: " + contato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(Telefone telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public Telefone getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(Telefone telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public Telefone getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(Telefone telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public DataNascimento getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DataNascimento dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    
}
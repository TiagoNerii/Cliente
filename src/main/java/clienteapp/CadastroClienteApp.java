package clienteapp;

/**
 *
 * @author tiago.nascimento
 */

import java.util.Scanner;

import java.util.Scanner;

public class CadastroClienteApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Cliente cliente = new Cliente();

            System.out.println("Digite o nome do cliente:");
            cliente.setNome(scanner.nextLine());

            System.out.println("Digite o sobrenome do cliente:");
            cliente.setSobrenome(scanner.nextLine());

            System.out.println("Digite o CPF do cliente:");
            cliente.setCpf(scanner.nextLine());

            System.out.println("Digite o RG do cliente:");
            cliente.setRg(scanner.nextLine());

            // Endereço
            Endereco endereco = new Endereco();
            System.out.println("Digite o CEP do endereço:");
            endereco.setCep(scanner.nextLine());

            System.out.println("Digite o logradouro do endereço:");
            endereco.setLogradouro(scanner.nextLine());

            System.out.println("Digite o número do endereço:");
            endereco.setNumero(scanner.nextLine());

            System.out.println("Digite o complemento do endereço:");
            endereco.setComplemento(scanner.nextLine());

            System.out.println("Digite a cidade do endereço:");
            endereco.setCidade(scanner.nextLine());

            System.out.println("Digite o estado do endereço:");
            endereco.setEstado(scanner.nextLine());

            System.out.println("Digite o país do endereço:");
            endereco.setPais(scanner.nextLine());

            cliente.setEndereco(endereco);

            // Telefone Residencial
            Telefone telefoneResidencial = new Telefone();
            System.out.println("Digite o código do país do telefone residencial:");
            telefoneResidencial.setCodigoPais(scanner.nextLine());

            System.out.println("Digite o DDD do telefone residencial:");
            telefoneResidencial.setDdd(scanner.nextLine());

            System.out.println("Digite o número do telefone residencial:");
            telefoneResidencial.setNumero(scanner.nextLine());

            cliente.setTelefoneResidencial(telefoneResidencial);

            // Telefone Celular
            Telefone telefoneCelular = new Telefone();
            System.out.println("Digite o código do país do telefone celular:");
            telefoneCelular.setCodigoPais(scanner.nextLine());

            System.out.println("Digite o DDD do telefone celular:");
            telefoneCelular.setDdd(scanner.nextLine());

            System.out.println("Digite o número do telefone celular:");
            telefoneCelular.setNumero(scanner.nextLine());

            cliente.setTelefoneCelular(telefoneCelular);

            // Telefone Comercial
            Telefone telefoneComercial = new Telefone();
            System.out.println("Digite o código do país do telefone comercial:");
            telefoneComercial.setCodigoPais(scanner.nextLine());

            System.out.println("Digite o DDD do telefone comercial:");
            telefoneComercial.setDdd(scanner.nextLine());

            System.out.println("Digite o número do telefone comercial:");
            telefoneComercial.setNumero(scanner.nextLine());

            cliente.setTelefoneComercial(telefoneComercial);

            // Data de Nascimento
            DataNascimento dataNascimento = new DataNascimento();
            System.out.println("Digite o dia de nascimento:");
            dataNascimento.setDia(scanner.nextInt());

            System.out.println("Digite o mês de nascimento:");
            dataNascimento.setMes(scanner.nextInt());

            System.out.println("Digite o ano de nascimento:");
            dataNascimento.setAno(scanner.nextInt());

            scanner.nextLine();  // Consumir a quebra de linha pendente

            cliente.setDataNascimento(dataNascimento);

            // Outros dados
            System.out.println("Digite o estado civil:");
            cliente.setEstadoCivil(scanner.nextLine());

            System.out.println("Digite o gênero:");
            cliente.setGenero(scanner.nextLine());

            System.out.println("Digite o e-mail:");
            cliente.setEmail(scanner.nextLine());

            // Contato
            Contato contato = new Contato();
            System.out.println("Digite o nome do contato:");
            contato.setNome(scanner.nextLine());

            // Telefone do Contato
            Telefone telefoneContato = new Telefone();
            System.out.println("Digite o código do país do telefone do contato:");
            telefoneContato.setCodigoPais(scanner.nextLine());

            System.out.println("Digite o DDD do telefone do contato:");
            telefoneContato.setDdd(scanner.nextLine());

            System.out.println("Digite o número do telefone do contato:");
            telefoneContato.setNumero(scanner.nextLine());

            contato.setTelefone(telefoneContato);

            cliente.setContato(contato);

            // Exibir dados cadastrados
            System.out.println("\nDados cadastrados:");
            cliente.exibirInformacoes();
        }
    }
}



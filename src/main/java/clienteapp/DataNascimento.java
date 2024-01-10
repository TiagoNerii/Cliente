package clienteapp;

/**
 *
 * @author tiago.nascimento
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataNascimento {
    private LocalDate data;

    public DataNascimento() {
        // Verificações de validade para dia, mês e ano podem ser adicionadas se necessário
        this.data = LocalDate.of(ano, mes, dia);
    }

    public int getDia() {
        return data.getDayOfMonth();
    }

    public void setDia(int dia) {
        // Adicione verificações de validade se necessário
        data = data.withDayOfMonth(dia);
    }

    public int getMes() {
        return data.getMonthValue();
    }

    public void setMes(int mes) {
        // Adicione verificações de validade se necessário
        data = data.withMonth(mes);
    }

    public int getAno() {
        return data.getYear();
    }

    public void setAno(int ano) {
        // Adicione verificações de validade se necessário
        data = data.withYear(ano);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        // Adicione verificações de validade se necessário
        this.data = data;
    }

    @Override
    public String toString() {
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}




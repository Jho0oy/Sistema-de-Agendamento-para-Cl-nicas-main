public class Paciente {

    String nome;
    String cpf;
    String telefone;

    public Paciente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getCpfFormatado() {
        if (cpf == null || cpf.length() != 11) {
            return cpf;
        }

        return cpf.substring(0, 3) + "." +
            cpf.substring(3, 6) + "." +
            cpf.substring(6, 9) + "-" +
            cpf.substring(9, 11);
    }

    public String getTelefoneFormatado() {
        if (telefone == null || telefone.length() != 11) {
            return telefone;
        }

    return "(" + telefone.substring(0, 2) + ") " +
        telefone.substring(2, 7) + "-" +
        telefone.substring(7, 11);
    }
}
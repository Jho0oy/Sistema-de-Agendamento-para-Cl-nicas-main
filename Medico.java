public class Medico {

    private final String nome;
    private final String especialidade;
    private final String crm;
    private final String ufCrm;

    public Medico(String nome, String especialidade, String crm, String ufCrm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
        this.ufCrm = ufCrm;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public String getUfCrm() {
        return ufCrm;
    }
}
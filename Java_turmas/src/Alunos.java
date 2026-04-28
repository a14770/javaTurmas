public class Alunos {
    private String codigo;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento;
    private String turma;

    
    
    public Alunos() {
        codigo = "";
        nomeProprio = "";
        nomeApelido = "";
        anoNascimento = 0;
        turma = "";
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomeApelido() {
        return nomeApelido;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Alunos [codigo=" + codigo + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", turma=" + turma + "]";
    }

    public String getNomeCompleto(String nomeProprio, String nomeApelido) {
        return ("O teu nome completop e " + nomeProprio + nomeApelido);
    }

    public String getIdade (int anoNascimento) {
        return ("Voce nasceu em " + anoNascimento + "");
    }    
    
}

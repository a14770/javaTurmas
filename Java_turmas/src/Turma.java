public class Turma {
    private String codigo;
    private String nomeCurso;
    private int anoInico;
    private int anoFim;
    private Turma turma;
    
    public Turma() {
        this.codigo = "";
        this.nomeCurso = "";
        this.anoInico = 0;
        this.anoFim = 0;
        this.turma = new Turma();
        }

    public Turma(String codigo, String nomeCurso, int anoInico, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInico = anoInico;
        this.anoFim = anoFim;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public void setAnoInico(int anoInico) {
        this.anoInico = anoInico;
    }
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public int getAnoInico() {
        return anoInico;
    }
    public int getAnoFim() {
        return anoFim;
    }

    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInico=" + anoInico + ", anoFim=" + anoFim
                + "]";
    }


    public String getInfoTurma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
        return ("\n O codigo da tua turma e " + codigo.toUpperCase() + "\n O nome do teu curso e " +nomeCurso.toUpperCase() + "\nO inicio do ano foi" + anoInicio + "\nO fim do ano foi" +anoFim+ "");
        
    }
    

}

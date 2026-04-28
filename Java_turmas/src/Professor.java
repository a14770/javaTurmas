public class Professor {
    private int numero;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNacimento;
    private String area;

    public Professor() {
        numero = 0;
        nomeProprio = "";
        nomeApelido = "";
        anoNacimento = 0;
        area = "";
    }

    public Professor(int numero, String nomeProprio, String nomeApelido, int anoNacimento, String area) {
        this.numero = numero;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNacimento = anoNacimento;
        this.area = area;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public void setAnoNacimento(int anoNacimento) {
        this.anoNacimento = anoNacimento;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getNumero() {
        return numero;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public int getAnoNacimento() {
        return anoNacimento;
    }
    public String getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "Professor [numero=" + numero + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNacimento=" + anoNacimento + ", area=" + area + "]";
    }

    public String getNomeCompleto(String nomeProprio, String nomeApelido) {
        return ("O teu nome completop e " + nomeProprio + nomeApelido);
    }
}

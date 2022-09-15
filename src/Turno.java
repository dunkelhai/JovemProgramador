public enum Turno {

    MANHA("manhã"),
    TARDE("tarde"),
    NOITE("noite");

    private String descricao;

    Turno(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
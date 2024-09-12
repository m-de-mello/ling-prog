package school.sptech;

// Objeto Parte
public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }

    public void bloquear() {
        if (!this.bloqueado) this.bloqueado = true;
    }

    public void desbloquear() {
        if (this.bloqueado) this.bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    // Polimorfismo:
    /*
        Sobrecarga -> Muda a Assinatura do Método.

        Sobrescrita:
            No Relacionamento de Herança
            Não altera a Assinatura do Método, somente o Corpo dele.
     */
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", bloqueado=" + bloqueado +
                '}';
    }
}

public class Aluno extends PessoaFisica {
    private String email;

    public Aluno(String nome, String cpf, int idade, String endereco, String telefone, String email) {
        super(nome, cpf, idade, endereco, telefone);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", idade=" + getIdade() +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package classes;

public class Aluno
{
    // Atributos da classe
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    // Construtor da classe
    public Aluno(String nome, String cfp)
    {
        this.nome = nome;
        this.cpf = cpf;
    }


    // Métodos de acesso aos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

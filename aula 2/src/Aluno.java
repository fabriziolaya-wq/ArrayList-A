
public class Aluno {
    private String nome;
    private Integer idade;
    private String curso;
    private String turma;

    
    public Aluno() {
    }
    public Aluno(String nome, Integer idade, String curso, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.turma = turma;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}

package classes;

public class Boletim<percentualFalta>
{

    private Aluno aluno;
    private Disciplina disciplina;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private int falta;
    private double percentualFalta;
    private double media;
    private String conceito;

    public Boletim(Aluno aluno, Disciplina disciplina)
    {
        this.aluno = aluno;
        this.disciplina = disciplina;
        percentualFalta = falta * 100 / disciplina.getCargaHoraria();
    }

    public double verMedia() {
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        return (int) media;
    }

    public String verPassou() {
        if (media >= 7.0) {
            return aluno.getNome() + " está aprovado.";
        } else if (media < 7.0 & media > +4.0) {
            return aluno.getNome() + " está de recuperação.";
        } else {
            return aluno.getNome() + " reprovou.";
        }
    }

    public void verConceito()
    {
        if(media >= 9){
            conceito = "A";
        }
        else if(media < 9 & media >= 7){
            conceito = "B";
        }
        else if(media < 7 & media >= 4){
            conceito = "C";
        }
        else{
            conceito = "D";
        }
    }

    public String verFaltas() {
        if(percentualFalta > 25){
            return aluno.getNome() + " reprovou por falta.";
        }
        else{
            return aluno.getNome() + " não reprovou por falta.";
        }
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getConceito() {
        return conceito;
    }

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }
}

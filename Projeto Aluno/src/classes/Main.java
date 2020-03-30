package classes;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Antonio Carlos", "12312312312");
        a.setEmail("antoni@gmial.com");
        a.setEndereco("Rua José da Silva");
        a.setTelefone("12312345612");
        Disciplina mat = new Disciplina("Matemática", 200);
        Boleteim aMat = new Boleteim(a, mat);
        aMat.setFalta(5);
        aMat.setNota1(8);
        aMat.setNota2(9);
        aMat.setNota3(4);
        aMat.setNota4(5);

        System.out.println("O(a) aluno(a) atingiu o conceito " + aMat.getConceito());
        System.out.println(aMat.verFaltas());
        System.out.println("A média do(a) " + a.getNome() + " é " + aMat.verMedia() + ".");
        System.out.println(aMat.verPassou());


    }
}

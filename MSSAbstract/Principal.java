package MSSAbstract;

public class Principal {
    public static void main(String[] args) {
        Professor maria = new Professor("Maria", 2, 3000);
        Professor jose = new Professor("Jose", 3, 2000);
        Aluno primeiroAluno = new Aluno("M", 12345);

        Estudante[] pessoasQueEstudam = new Estudante[3];
        pessoasQueEstudam[0] = maria;
        pessoasQueEstudam[1] = jose;
        pessoasQueEstudam[2] = primeiroAluno;

        for (Estudante estudante : pessoasQueEstudam) {
            estudante.estudar();
        }

        Prova[] provasDaFaculdade = new Prova[3];
        for (int i = 0; i < 3; i++) {
            String[] questoes = {"P" + (i + 1) + "Q1", "P" + (i + 1) + "Q2"};
            provasDaFaculdade[i] = new Prova(questoes);
        }

        Prova prova = provasDaFaculdade[0];
        double nota = maria.corrigirProva(prova);
        System.out.println("O aluno " + primeiroAluno.getnome() + " tirou " + nota + " na prova.");
    }
}
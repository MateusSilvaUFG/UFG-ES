package MSSAbstract;

public class Principal {
    public static void main(String[] args) {
    	ProfessorUniversitario maria = new ProfessorUniversitario("Maria", 2, 3000);
        ProfessorDaEducacaoBasica jose = new ProfessorDaEducacaoBasica("Jose", 3, 2000);
        Aluno primeiroAluno = new Aluno("Mateus Silva", 12345);

        Estudante[] pessoasQueEstudam = new Estudante[3];
        pessoasQueEstudam[0] = maria;
        pessoasQueEstudam[1] = jose;
        pessoasQueEstudam[2] = primeiroAluno;

        for (Estudante estudante : pessoasQueEstudam) {
            estudante.estudar();
        }

        Prova[] provasDaFaculdade = new Prova[3];
        ProfessorUniversitario professorUniversitario = new ProfessorUniversitario("João", 4, 4000);
        provasDaFaculdade = professorUniversitario.elaborarProvas();

        primeiroAluno.fazerProva(provasDaFaculdade[0]);
        double nota = maria.corrigirProva(provasDaFaculdade[0]);
        System.out.println("O aluno " + primeiroAluno.getnome() + " tirou " + nota + " na prova.");
    }
}

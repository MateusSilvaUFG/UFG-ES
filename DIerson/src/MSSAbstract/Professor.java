package MSSAbstract;

public abstract class Professor implements Estudante, FuncionarioAssalariado {
    private String nome;
    private int nTurmas;
    private double salario;

    public Professor(String nome, int nTurmas, double salario) {
        this.nome = nome;
        this.setnTurmas(nTurmas);
        this.salario = salario;
    }

    public abstract Prova[] elaborarProvas();

    public double corrigirProva(Prova prova) {
        double aux = 0;
        double nota = 0;
        String[] respostasAluno = prova.getQuestoes();
        String[] gabarito = prova.getQuestoes();

        for (int i = 0; i < respostasAluno.length; i++) {
            if (respostasAluno[i].equals(gabarito[i])) {
                nota += 1.0;
            }
            aux++;
        }
        if (aux == nota) {
            nota = 10;
        } else {
            nota = (nota * 10) / aux;
        }
        return nota;
    }

    public void estudar() {
        System.out.println("O professor " + nome + " está estudando.");
    }

    public double receberSalario(int nTurmas) {
        double novoSalario = salario + (nTurmas * salario * 0.05);
        System.out.println("O professor " + nome + " recebeu o salário de " + novoSalario + ".");
        return novoSalario;
    }

    public int getnTurmas() {
        return nTurmas;
    }

    public void setnTurmas(int nTurmas) {
        this.nTurmas = nTurmas;
    }
}

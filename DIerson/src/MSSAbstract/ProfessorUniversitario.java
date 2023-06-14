package MSSAbstract;

public class ProfessorUniversitario extends Professor {
    public ProfessorUniversitario(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    
    public Prova[] elaborarProvas() {
        Prova[] provas = new Prova[3];

        for (int i = 0; i < provas.length; i++) {
            String[] questoes = new String[2];
            for (int j = 0; j < questoes.length; j++) {
                questoes[j] = "P" + (i + 1) + "Q" + (j + 1);
            }
            provas[i] = new Prova(questoes);
        }

        return provas;
    }
}

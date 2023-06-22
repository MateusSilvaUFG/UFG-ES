package MSSAbstract;

public class ProfessorDaEducacaoBasica extends Professor {
    public ProfessorDaEducacaoBasica(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    
    public  Prova[] elaborarProvas() {
        Prova[] provas = new Prova[4];

        for (int i = 0; i < provas.length; i++) {
            String[] questoes = new String[5];
            for (int j = 0; j < questoes.length; j++) {
                questoes[j] = "P" + (i + 1) + "Q" + (j + 1);
            }
            provas[i] = new Prova(questoes);
        }

        return provas;
    }
}

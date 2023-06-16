package MSSAbstract;

class Prova {
    private String[] questoes;
    private double nota;

    public Prova(String[] questoes) {
        this.questoes = questoes;
 
    }

    public String[] getQuestoes() {
        return questoes;
    } 


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
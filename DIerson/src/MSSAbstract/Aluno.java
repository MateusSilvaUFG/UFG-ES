package MSSAbstract;

class Aluno implements Estudante {
    private String nome;
    private int nMatricula;
   

    public Aluno(String nome, int nMatricula) {
        this.nome = nome;
        this.nMatricula = nMatricula;
    }

    public void fazerProva(Prova Prova) {
    	
        System.out.println("O aluno " + nome + " fez a prova.");
    }

    public void estudar() {
        System.out.println("O aluno " + nome + " está estudando.");
    }

	public int getnMatricula() {
		return nMatricula;
	}

	public void setnMatricula(int nMatricula) {
		this.nMatricula = nMatricula;
	}
	
	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}
}
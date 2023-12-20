package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime() {
        System.out.println("--- Seminário ---");
        System.out.println("Titulo: " + this.titulo);
        System.out.print("Alunos: ");
        if (alunos == null) {
            System.out.println("nenhum aluno");
        } else {
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + ", ");
            }
            System.out.println();
        }
        System.out.println("Local: " + this.local.getEndereco());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}

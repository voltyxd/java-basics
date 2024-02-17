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
        System.out.println("------------ Seminario ------------");
        System.out.println("Titulo: " + this.titulo);
        if (alunos != null) {
            System.out.print("Alunos: ");
            for (Aluno aluno : this.alunos) {
                System.out.print(aluno.getNome() + " / ");
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

import java.util.ArrayList;

public class Curso {
    private String nomeCurso;
    private String codigoCurso;
    private String coordenador;
    private ArrayList<Turma> turmas;

    public Curso(String nomeCurso, String codigoCurso, String coordenador) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.coordenador = coordenador;
        this.turmas = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void removerTurma(Turma turma) {
        turmas.remove(turma);
    }

    public void listarTurmas() {
        for (Turma turma : turmas) {
            System.out.println("Turma: " + turma.getNomeTurma());
            turma.listarAlunos();
        }
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}

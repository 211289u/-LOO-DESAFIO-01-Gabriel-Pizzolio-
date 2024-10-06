public class Main {
    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("Uniderp", "12.345.678/0001-12", "Rua Principal, 123");

        Curso curso1 = new Curso("Engenharia de Software", "C001", "Dr. João");
        Curso curso2 = new Curso("Administração", "C002", "Prof. Maria");
        Curso curso3 = new Curso("Direito", "C003", "Dr. Pedro");

        faculdade.adicionarCurso(curso1);
        faculdade.adicionarCurso(curso2);
        faculdade.adicionarCurso(curso3);

        Turma turma1Curso1 = new Turma("Turma 1 - Engenharia", "T001", "Prof. Carlos");
        Turma turma2Curso1 = new Turma("Turma 2 - Engenharia", "T002", "Prof. Ana");

        Turma turma1Curso2 = new Turma("Turma 1 - Administração", "T003", "Prof. Paulo");
        Turma turma2Curso2 = new Turma("Turma 2 - Administração", "T004", "Prof. Clara");

        Turma turma1Curso3 = new Turma("Turma 1 - Direito", "T005", "Prof. Augusto");
        Turma turma2Curso3 = new Turma("Turma 2 - Direito", "T006", "Prof. Roberta");

        curso1.adicionarTurma(turma1Curso1);
        curso1.adicionarTurma(turma2Curso1);

        curso2.adicionarTurma(turma1Curso2);
        curso2.adicionarTurma(turma2Curso2);

        curso3.adicionarTurma(turma1Curso3);
        curso3.adicionarTurma(turma2Curso3);

        Aluno aluno1Turma1 = new Aluno("José da Silva", "123.456.789-00", 20, "Rua A, 123", "99999-9999", "jose@uniderp.edu");
        Aluno aluno2Turma1 = new Aluno("Maria Oliveira", "987.654.321-00", 22, "Rua B, 456", "88888-8888", "maria@uniderp.edu");
        Aluno aluno3Turma1 = new Aluno("Carlos Alberto", "111.222.333-00", 21, "Rua C, 789", "77777-7777", "carlos@uniderp.edu");

        turma1Curso1.adicionarAluno(aluno1Turma1);
        turma1Curso1.adicionarAluno(aluno2Turma1);
        turma1Curso1.adicionarAluno(aluno3Turma1);

        Aluno aluno1Turma2 = new Aluno("Ana Silva", "444.555.666-00", 23, "Rua D, 321", "66666-6666", "ana@uniderp.edu");
        Aluno aluno2Turma2 = new Aluno("João Santos", "777.888.999-00", 24, "Rua E, 654", "55555-5555", "joao@uniderp.edu");
        Aluno aluno3Turma2 = new Aluno("Laura Pereira", "000.111.222-00", 25, "Rua F, 987", "44444-4444", "laura@uniderp.edu");

        turma2Curso1.adicionarAluno(aluno1Turma2);
        turma2Curso1.adicionarAluno(aluno2Turma2);
        turma2Curso1.adicionarAluno(aluno3Turma2);

        Aluno aluno1Turma3 = new Aluno("Roberto Lima", "333.444.555-00", 26, "Rua G, 111", "33333-3333", "roberto@uniderp.edu");
        Aluno aluno2Turma3 = new Aluno("Fernanda Alves", "666.777.888-00", 27, "Rua H, 222", "22222-2222", "fernanda@uniderp.edu");
        Aluno aluno3Turma3 = new Aluno("Rafael Souza", "999.000.111-00", 28, "Rua I, 333", "11111-1111", "rafael@uniderp.edu");

        turma1Curso2.adicionarAluno(aluno1Turma3);
        turma1Curso2.adicionarAluno(aluno2Turma3);
        turma1Curso2.adicionarAluno(aluno3Turma3);

        Aluno aluno1Turma4 = new Aluno("Lucas Mendes", "222.333.444-00", 29, "Rua J, 444", "00000-0000", "lucas@uniderp.edu");
        Aluno aluno2Turma4 = new Aluno("Patrícia Monteiro", "555.666.777-00", 30, "Rua K, 555", "99999-0000", "patricia@uniderp.edu");
        Aluno aluno3Turma4 = new Aluno("Bianca Santos", "888.999.000-00", 31, "Rua L, 666", "88888-9999", "bianca@uniderp.edu");

        turma2Curso2.adicionarAluno(aluno1Turma4);
        turma2Curso2.adicionarAluno(aluno2Turma4);
        turma2Curso2.adicionarAluno(aluno3Turma4);

        Aluno aluno1Turma5 = new Aluno("Cláudia Ribeiro", "111.222.333-44", 22, "Rua M, 777", "77777-7777", "claudia@uniderp.edu");
        Aluno aluno2Turma5 = new Aluno("Bruno Costa", "444.555.666-77", 23, "Rua N, 888", "66666-6666", "bruno@uniderp.edu");
        Aluno aluno3Turma5 = new Aluno("Sérgio Castro", "777.888.999-00", 24, "Rua O, 999", "55555-5555", "sergio@uniderp.edu");

        turma1Curso3.adicionarAluno(aluno1Turma5);
        turma1Curso3.adicionarAluno(aluno2Turma5);
        turma1Curso3.adicionarAluno(aluno3Turma5);

        Aluno aluno1Turma6 = new Aluno("Fábio Souza", "000.111.222-33", 25, "Rua P, 123", "44444-4444", "fabio@uniderp.edu");
        Aluno aluno2Turma6 = new Aluno("Juliana Mendes", "333.444.555-66", 26, "Rua Q, 456", "33333-3333", "juliana@uniderp.edu");
        Aluno aluno3Turma6 = new Aluno("Gustavo Almeida", "666.777.888-99", 27, "Rua R, 789", "22222-2222", "gustavo@uniderp.edu");

        turma2Curso3.adicionarAluno(aluno1Turma6);
        turma2Curso3.adicionarAluno(aluno2Turma6);
        turma2Curso3.adicionarAluno(aluno3Turma6);

        faculdade.removerCurso(curso3);
        faculdade.editarNomeCurso(curso2, "Administração de Empresas");
        turma1Curso1.removerAluno(aluno1Turma1);
        aluno2Turma1.setNome("Maria Oliveira Santos");
        aluno2Turma1.setEmail("maria.santos@uniderp.edu");

        faculdade.listarCursos();
    }
}

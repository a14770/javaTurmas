public class App {
    public static void main(String[] args) throws Exception {
        Professor prof;
        Turma turma1;
        Alunos aluno1, aluno2, aluno3;

        prof = new Professor(14770, "Giovani", "Trindade", 2010, "Progamação");
        turma1 = new Turma( "a1212", "Programador de Informática", 2025 , 2026);

        aluno1 = new Alunos(14777, "Tiago", "Sá", 2010, turma1);
        aluno2 = new Alunos();
        aluno3 = new Alunos();
    }
}

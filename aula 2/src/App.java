import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {

            System.out.println("\n=== CRUD DE ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Mostrar alunos");
            System.out.println("3 - Deletar aluno");
            System.out.println("4 - Editar aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    mostrar();
                    System.out.print("Digite o ID a ser deletado: ");
                    int idDelete = sc.nextInt();
                    deletar(idDelete);
                    break;
                case 4:
                    mostrar();
                    System.out.print("Digite o ID a ser editado: ");
                    int idEdit = sc.nextInt();
                    editar(idEdit);
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Curso: ");
        aluno.setCurso(sc.nextLine());

        System.out.print("Turma: ");
        aluno.setTurma(sc.nextLine());

        System.out.print("Idade: ");
        aluno.setIdade(sc.nextInt());

        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void mostrar() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("\nID: " + i);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Turma: " + aluno.getTurma());
            System.out.println("Idade: " + aluno.getIdade());
        }
    }

    public static void deletar(int id) {
        if (id >= 0 && id < alunos.size()) {
            alunos.remove(id);
            System.out.println("Aluno deletado!");
        } else {
            System.out.println("ID inválido!");
        }
    }

    public static void editar(int id) {
        if (id < 0 || id >= alunos.size()) {
            System.out.println("ID inválido!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        Aluno aluno = alunos.get(id);

        System.out.println("\nEditando aluno: " + aluno.getNome());

        sc.nextLine(); // limpar buffer

        System.out.print("Novo nome (" + aluno.getNome() + "): ");
        aluno.setNome(sc.nextLine());

        System.out.print("Novo curso (" + aluno.getCurso() + "): ");
        aluno.setCurso(sc.nextLine());

        System.out.print("Nova turma (" + aluno.getTurma() + "): ");
        aluno.setTurma(sc.nextLine());

        System.out.print("Nova idade (" + aluno.getIdade() + "): ");
        aluno.setIdade(sc.nextInt());

        System.out.println("Aluno editado com sucesso!");
    }
}
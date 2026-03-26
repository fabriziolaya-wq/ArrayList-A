
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Aluno> alunos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer opcao = 0;
        while(opcao != 6){
            
            System.out.println("Este é um CRUD de alunos! Digite 1 para cadastrar\nDigite 2 para mostrar"); 
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cadastrar();
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    mostrar();
                    System.out.println("Digite o id a ser deletado: ");
                    Integer id = sc.nextInt();
                    deletar(id);
                    break;
            }
        }
    }

    public static void cadastrar(){
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();  
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());
        System.out.println("Digite o curso do aluno: ");
        aluno.setCurso(sc.nextLine());
        System.out.println("Digite a turma do aluno: ");
        aluno.setTurma(sc.nextLine());
        System.out.println("Digite a idade do aluno: ");
        aluno.setIdade(sc.nextInt());
        alunos.add(aluno);
    }

    public static void mostrar(){
        for(int i = 0; i < alunos.size(); i++){
            Aluno aluno = alunos.get(i);
            System.out.println("Id: "+i);
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("Turma: "+aluno.getTurma());
            System.out.println("Idade: "+aluno.getIdade());
            System.out.println("Curso: "+aluno.getCurso());
            System.out.println("----------------------------------");
        }
    }

    public static void deletar(Integer id){
        Aluno aluno = alunos.get(id);
        alunos.remove(aluno);
    }
}

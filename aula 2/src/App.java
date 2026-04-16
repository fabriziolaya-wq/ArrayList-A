import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Aluno> alunos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer opcao = 0;
        while(opcao != 6){
           
            System.out.println("Este é um CRUD de alunos! Digite 1 para cadastrar\nDigite 2 para mostrar\nDigite 3 para deletar\nDigite 4 para editar\nDigite 5 para filtar por nome");
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
                case 4:
                    mostrar();
                    System.out.println("Digite o id a ser editado: ");
                    Integer id2 = sc.nextInt();
                    editar(id2);
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("opção invalida!");

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

    public static void editar(Integer id){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno aluno = alunos.get(id);
        System.out.println("O nome do aluno é: "+aluno.getNome()+"digite 1 para editar: ");
        Integer opcao = sc.nextInt();
        if(opcao == 1){
            System.out.println("Digite o novo nome: ");
            aluno.setNome(sc2.nextLine());
        }
        System.out.println("A idade do aluno é: "+aluno.getIdade()+"digite 1 para editar: ");
        opcao = sc.nextInt();
        if(opcao ==1){
            System.out.println("Digite a nova idade: ");
            aluno.setIdade(sc.nextInt());
        }
        System.out.println("O curso do aluno é: "+aluno.getCurso()+"digite 1 para editar: ");
        opcao = sc.nextInt();
        if(opcao ==1){
            System.out.println("Digite o novo curso: ");
            aluno.setCurso(sc2.nextLine());
        }
        System.out.println("A turma do aluno é: "+aluno.getTurma()+"digite 1 para editar: ");
        opcao = sc.nextInt();
        if(opcao ==1){
            System.out.println("Digite o novo turma: ");
            aluno.setTurma(sc2.nextLine());
        }
        System.out.println("Nova idade("+ aluno.getIdade() + "):"); 
        aluno.setIdade(sc.nextInt());  
    {
        System.out.println("Aluno editado com sucesso!");
     }
    
    }

   
}
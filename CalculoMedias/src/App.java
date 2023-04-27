import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n_alunos;
        double nota1, nota2, nota3, media_indiv, mediaGeral, soma_medias = 0;

        System.out.print("Número de alunos: ");
        n_alunos = sc.nextInt();

        soma_medias = 0.0;

        for (int i=0; i < n_alunos; i++) {
            System.out.print("Nome do aluno: ");
            String nome = sc.next();

            // receber as 3 notas dos alunos
            System.out.print("Nota 1: ");
            nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            nota3 = sc.nextDouble();

            // calcular media individual dos alunos
            media_indiv = (nota1 + nota2 + nota3) / 3;

            // print do nome e media individual
            System.out.printf("Aluno: " + nome + ", Média: %.2f\n", media_indiv);

            // somar medias individuais
            soma_medias += media_indiv; 
        }
        
        // calcular media geral da turma
        mediaGeral = soma_medias / n_alunos;

        // print media geral da turma
        System.out.printf("Média da turma: ", mediaGeral);

        sc.close();
    }
}

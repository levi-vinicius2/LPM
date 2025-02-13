import java.util.Scanner;

public class App {

    static double lerNumeros(String mensagem){
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println(mensagem);
        valor = sc.nextDouble();
        return valor;
    }

    static void lerNotas(double[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumeros("Digite a nota" + i);
        }
    }

    static double calculaMedia(double[] vetor, double peso){
        double soma = 0d;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (soma/vetor.length) * peso;
    }

    public static void main(String[] args) throws Exception {
        double[] provas = new double[2];
        double[] exercicios = new double[4];
        double   trabalho, mediaExercicios, mediaProva, notaFinal;
        System.out.println("Nota da prova:");
        lerNotas(provas);
        System.out.println("Nota da execício:");
        lerNotas(exercicios);
        trabalho = lerNumeros("Digite a nota do trabalho");
        mediaExercicios = calculaMedia(exercicios, 0.2);
        mediaProva = calculaMedia(provas, 0.6);
        notaFinal = mediaExercicios + mediaProva + trabalho;
        System.out.printf("Nota final: %.2f", notaFinal);
    }
}

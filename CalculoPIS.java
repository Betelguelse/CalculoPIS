import java.util.Scanner;

public class CalculoPIS {
    public static void main(String[] args) throws Exception {
  
        Scanner ler = new Scanner(System.in);

        long numeroPIS;
        long cal = 3298765432l;
        long Soma = 0;
        long Resto = 0;
        long Digito;

        System.out.println("Digite o número do seu PIS/PASEP: ");
        numeroPIS = ler.nextLong();

        for(int i = 0; i < 10; i++){
            Soma += (numeroPIS % 10) * (cal % 10);
            numeroPIS /= 10;
            cal /= 10;
        }

        Resto = Soma % 11;        
        Digito = 11 - Resto;

        System.out.println("O digito do PIS/PASEP é: " + Digito);

    }
}

import java.util.Scanner;

public class NivelHeroi {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu Herói: ");
        String nomeDoHeroi = scanner.nextLine();

        System.out.println("Qual a quantidade de (XP) que o seu herói tem: ");
        int xpDoHerói = scanner.nextInt();

        String nivelDoHeroi;

        if(xpDoHerói < 1000){
            nivelDoHeroi = "Ferro";
        } else if(xpDoHerói <= 2000){
            nivelDoHeroi = "Bronze";
        } else if(xpDoHerói <= 5000){
            nivelDoHeroi = "Prata";
        } else if(xpDoHerói <= 7000){
            nivelDoHeroi = "Ouro";
        } else if(xpDoHerói <= 8000){
            nivelDoHeroi = "Platina";
        } else if(xpDoHerói <= 9000){
            nivelDoHeroi = "Ascendente";
        } else if(xpDoHerói <= 10000){
            nivelDoHeroi = "Imortal";
        } else{
            nivelDoHeroi = "Radiante";
        }

        System.out.println("O herói de nome " + nomeDoHeroi + " está no nível de " + nivelDoHeroi + ".");
    }
}
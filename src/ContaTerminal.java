import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args){
        //Atributos
        int numero = 0;
        String agencia = " ";
        String nomeCliente = " ";
        float saldo = 0;

        System.out.println("Vamos fazer uma Conta Bancaria!");
        Scanner scan = new Scanner(System.in);//Criando objeto scanner

        //Inserir numero da conta
        System.out.println("Insira o número da sua conta: ");
        numero = scan.nextInt();
        System.out.println("Sua conta é: "+numero);
        scan.nextLine();//Limpando buffer

        //Inserir agencia
        System.out.println("Insira a sua Agência: ");
        agencia = scan.nextLine();
        System.out.println("Sua agência é: "+agencia);

        //Inserir nome
        System.out.println("Insira o seu nome: ");
        nomeCliente = scan.nextLine();
        System.out.println("Seu nome é: "+nomeCliente);

        //Inserir valor do saldo
        System.out.println("Insira o valor do seu saldo: ");
        saldo = scan.nextFloat();
        System.out.println("Sua conta é: "+saldo);

        

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");
        
    }
}
    
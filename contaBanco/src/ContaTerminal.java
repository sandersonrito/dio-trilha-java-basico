import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        boolean validacaoEntradaDados =false;

        while(!validacaoEntradaDados){
            try{                
                
                System.out.println("Digite o nome do cliente: ");
                nomeCliente = sc.next();
                
                System.out.println("Digite o número da sua conta: ");
                numero = sc.nextInt();
                
                System.out.println("Digite o número da sua agencia: ");
                agencia = sc.next();
                
                System.out.println("Digite o saldo: ");
                saldo = sc.nextDouble();
                
                System.out.println("Conta Criada com sucesso!");
                
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
                
                System.out.println("Olá " + nomeCliente + "!");
                System.out.println("Sua agencia é: " + agencia);
                System.out.println("O número da sua conta é: " + numero);
                System.out.println("Seu saldo é: " + saldo);

                validacaoEntradaDados = true;

            }  catch(InputMismatchException e){

                System.out.println("Informação inválida. Por favor, insira os valores corretamente.");
            }
            sc.close();
        }
            
        }
    }
    
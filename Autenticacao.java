import java.util.Scanner;

class Autenticacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String user = "Pedrovs";
        int password = 123;
        int i = 0;

        while(i<3){
            System.out.println("Digite o Usuário: ");
            String userInsert = ler.next();

            System.out.println("Digite a Senha do usuário: ");
            int passInsert = ler.nextInt();

            if(user.equals(userInsert) && passInsert == password){
                System.out.printf("Bem vindo %s!", user);
                System.exit(0);
            } else{
            i++;
            System.out.println("Tente Novamente!");
            } 
        }
        System.out.print("Aplicação Encerrada!");
    }
}    
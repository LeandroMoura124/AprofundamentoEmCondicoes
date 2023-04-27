import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class TestaComparaIfs {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        //A condição de um if sempre tem que ser um valor booleano:


        boolean autentico = true;
        
        if(autentico){
            System.out.println("OK");
        }else{
            System.out.println("Não autorizado");
        }

        boolean valor = true;

        if(valor == false){
            System.out.println("false");
        }

        //Se eu ja defini o valor da minha variavel, posso fazer apenas um simples if sem o == true no parametro
        if(valor){// ja sei que ele é true, nao precisamos fazer == true
            System.out.println("OK"); //Compila
        }


        // int g = 0, c = 3;
        // if(g = c){ // nao compila, está atribuindo valor "=" e nao comparando "=="
        //     System.out.println("Ok");
        // }

        if(valor = false){ // mesmo que seja atribuicao "=", o valor é variavel do tipo boolean, entao compila
            System.out.println("ok");
        }

        boolean v = true;

        if(v)
            System.out.println("true");
        else 
            System.out.println("false");

       boolean d = true;

        if(d)
            System.out.println((d==false)? 1: 0); //imprime 0
        else 
            System.out.println("false");
          //  System.out.println("ex"); //esse trecho do if nao faz parte, pois sem as chaves só um linha é executada



        //  public int metodo(){
        //     return 5;
        //     System.out.println("dsdsd")// nao imprime, depois do return nada imprime no metodo
        //  }
      


        //  System.out.println("digite o num magico");
        //  int escolha = entrada.nextInt();

        //   while (escolha != 42){
        //     System.out.println("escolha o número certo");
        //     escolha = entrada.nextInt();
        //   }
        //   System.out.println("Parabéns, acertou!");
          
    }
    
    
        public int metodo3(int x) {
            if(x > 200) {
                return 5;
            }
        }
        //Este também não compila. O que será retornado se x for <= 200?
        
        public int metodo(int x){
            if(x > 200){
                return 10;
            }// se meu x nao for maior que 200, lança um exceção
            throw new RuntimeErrorException(null);
    }
    
}

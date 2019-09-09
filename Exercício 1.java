public class vetor
{
private int vetor[] = new int[20];
private int i;
private String valor;

public void main (String args[])
{
    inserir();
    imprimir();
    alterarValor();
    anularValores();
}    

public void inserir() {
      for (int i = 0; i < 20; i++) {
      valor = JOptionPane.showInputDialog("Digite os valores");
      vetor[i] = Integer.parseInt(valor);
     }
}

public void imprimir() {
      for (int i = 0; i < 20; i++) {
      System.out.println(vetor[i]);
     }
}[/code]

public class Classe1{
   int valor;
   String nome;
   public Classe1(){
      valor = 0;
      nome = "ninguem";
   }
}


public class Classe2{

   public Classe2(){
     Classe1 c = new Classe1();
     System.out.println(c.nome + " , " + c.valor);
     altera(c);  //por referencia
     System.out.println(c.nome + " , " + c.valor);
   }

   public void altera(Classe1 newC){
      newC.valor = 100;
      newC.nome = "Isso é referencia";
   }

   public static void main(String args[]){
      new Classe2();
   }
}



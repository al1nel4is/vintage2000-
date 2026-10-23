
import model.Receita;
import model.Despesa;

public class Programa.java {
public class Programa {
    public static void main(String args[]) {

     Scanner sc = new Scanner(System.in);
@@ -43,7 +43,7 @@ public static void main(String args[]) {
        System.out.print("Deseja pagar a despesa [" + despesa.getDescricao()
                + "] de R$ " + despesa.getValor()
                + "? (1-Sim / 2-Não): ");
        opcao = entrada.nextInt();
        int opcao = sc.nextInt();

        if (opcao == 1) {

@@ -65,7 +65,7 @@ public static void main(String args[]) {



        System.out.println("Deseja poupar R$300 para a meta ("+ conta.getObjetivo() + "?) [1 - sim  / 2 - não]" );
        System.out.println("Deseja poupar R$300 para a meta ("+ meta.getObjetivo() + "?) [1 - sim  / 2 - não]" );
        int pouparResposta = sc.nextInt();
        if (pouparResposta == 1){

@@ -89,8 +89,8 @@ public static void main(String args[]) {
        System.out.println("====================================");
        System.out.println("Conta:" + conta.getNumero() + "|Cliente" + conta.getCliente());
        System.out.println("Saldo final" + RS  + "|Limite" + conta.getLimite());
        System.out.println("Situação do aluguel:" + );
        System.out.println("Meta [Comprar moto]" + );
        System.out.println("Situação do aluguel:" + despesa.setStatus);
        System.out.println("Meta [Comprar moto]" + meta.setValourPoupado );
        System.out.println("====================================");

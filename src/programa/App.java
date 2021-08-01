package programa;

import java.io.IOException;
import java.util.Scanner;

import classes.Produtos;
import classes.Vendas;

public class App {

    private static Produtos[] produts;
    public static void main(String[] args, Produtos[] produto, Object prodBusca, Object codigProdutos, boolean b) throws Exception {
        Scanner sc = new Scanner (System.in);
        int MAX_DE_PRODUTOS_EM_ESTOQUE = 100000;
        int QuantidadeProdutosEmEstoque = 0;
        int opcao =sc.nextInt();
        int qntCadastrado = 0;

        setProduts(new Produtos[QuantidadeProdutosEmEstoque]);
        Vendas venda = new Vendas("04/03","leite","1","10.00","10.00");

        do {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-* \n");
            System.out.println("Bem vindo a nossa página!!");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-* \n");
        
             System.out.println("Menu:");  

            System.out.println("1- Incluir produto:");
            System.out.println("2- Consultar produtos:");  
            System.out.println("3- Listagem de produtos:");  
            System.out.println("4- Vendas por período:");  
            System.out.println("5- Realizar venda:");  
            System.out.println("0- Sair:");  
            System.out.print("Opção:");
           
            sc.nextLine(); //até aqui ta ok!
        
        if (opcao == 1){        //incluir produto:

            if (QuantidadeProdutosEmEstoque == MAX_DE_PRODUTOS_EM_ESTOQUE ){
                System.out.println("\nNão há mais esse produto no estoque!");
                voltarMenu(sc);
                  continue;
            }
       Produtos produtos = new Produtos();

        System.out.println("Infome o código d produto:");  
        produtos.setCodigo(RelatorioVendas.nextLine());
        System.out.println("Informe o nome do produto:");
        produtos.setNome(RelatorioVendas.nextLine());
        System.out.println("Informe o valor:");
        produtos.setValor(RelatorioVendas.nextLine());
       
        qntCadastrado = qntCadastrado + 1;


        System.out.println("Produto castrado com sucesso!");
        voltarMenu(sc);



    } else if (opcao == 2) { //consultar produto
        if (qntCadastrado == 0) {
            System.out.println("\nNão há produtos cadastrados.");
            voltarMenu(sc);
            continue;
        }

        System.out.print("\nInsira o código do produto para ser consultado: ");
        String cpf = sc.nextLine();

        for (int i = 0; prodBusca == null && i < qntCadastrado; i++) {
            if (cpf.equals(produto[i].getCodigo())) {
                prodBusca = produto[i];
            }
        }

        if (prodBusca == null) {
            System.out.println("O código informado não foi localizado!");
        } else {
            System.out.println("Código localizado:");
            Produtos.exibirProduto(prodBusca);
        }

        voltarMenu(sc);
    
    
    
     } else if (opcao == 3) { //listagem do produto
        if ( QuantidadeProdutosEmEstoque== 0) {
            System.out.println("\n Não há produtos cadastrados para ser exibido!");
            voltarMenu(sc);
            continue;
        }

        System.out.println("\nProdutos cadastrados:");

        for (int i = 0; i < QuantidadeProdutosEmEstoque; i++) {
         Produtos.exibirProduto(produto[i]);
        }
            voltarMenu(sc);
        continue;
    
        }else if (opcao == 4) { // Vendas por período:

            System.out.println("Vendas por período");
            System.out.printf("data da venda %s:" + venda.getDataVenda());
            System.out.printf("produto %d:" + venda.getProdutoVendido());
            System.out.printf("quantidade vendida: %s" + venda.getQntVendida());
            voltarMenu(sc);
            continue;

             
        } if(opcao == 5) {  //Realizar venda
            System.out.println("Informe o código do produto:");
            sc.next(); 
        Produtos codigoProdutos[]= new Produtos [1];
        codigoProdutos [0] = new Produtos();
        
        }
}while (codigProdutos != null);  {
             System.out.println("codigo invalido");
         voltarMenu(sc);
        }              
        
    }   

    public static Produtos[] getProduts() {
        return produts;
    }



    public static void setProduts(Produtos[] produts) {
        App.produts = produts;
    }



    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();
    
        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
    
        System.out.flush();
    } 
 }       
        

    
   
    
    
    
 
   

    


  

 

  
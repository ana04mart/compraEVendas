package programa;
import java.util.ArrayList;
import java.util.Scanner;
import classes.Vendas;
import util.ConvertendoDataEHora;

public class RelatorioVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);   
       ArrayList<Vendas> vendas = new ArrayList<Vendas>();
       
         System.out.println("Informe o código do produto: ");
         int codigoInformado = sc.nextInt();
        
        System.out.println("*********************************");
        System.out.println("******* Extrato de Vendas *******");
        System.out.println("*********************************");
        
        

        for (Vendas vendas2 : vendas) {
            System.out.println(vendas);
            
        }

        
        System.out.println("Gerado em: " + ConvertendoDataEHora.converterDateParaData("dd/MM/yyyy"));
        System.out.println(); 
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***********************************");

        System.out.println();

      
        }

   public static int nextLine() {
        return 0;
    }
    

   
}
    


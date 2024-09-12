import dominio.Apartamento;
import dominio.Casa;
import dominio.Endereco;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");


        var endereco = new Endereco("Sidônio", "Rio de Janeiro", 20);
        var endereco2 = new Endereco("Dias", "Rio de Janeiro", 123);


        var ap1 = new Apartamento(200, endereco, false, 2001, "102");

        var cs1 = new Casa(endereco2, false, 2010);

        //-------------------------------APARTAMENTO-----------------------------
        System.out.println("Exibindo métodods do Imóvel Apartamento: ");
        System.out.println(ap1.ObterEnderecoImovel());
        System.out.println(ap1.ObterTempoExistenciaImovel() + " anos");
        System.out.printf("R$ %.2f", ap1.CalcularValorCondominio());
        System.out.println();
        System.out.printf("R$ %.2f", ap1.CalcularValorCondominio(1.3));
        System.out.println("\n========================================================");


        // -------------------------------CASA-----------------------------
        System.out.println("Exibindo métodods do Imóvel Casa: ");
        System.out.println(cs1.ObterEnderecoImovel());
        System.out.println(cs1.ObterTempoExistenciaImovel() + " anos");


    }
}
import dominio.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {

        var endereco = new Endereco("Sidônio", "Minas Gerais", 20);
        var endereco2 = new Endereco("Dias", "Rio de Janeiro", 123);
        var endereco3 = new Endereco("Galvão", "São Paulo", 1000);
        var endereco4 = new Endereco("Real", "Madrid", 800);

        var ap1 = new Apartamento(endereco, false, 2001, "102",200);
        var ap2 = new Apartamento(endereco4, true, 2022, "500",450);

        //Testando Equals e HashCode
        var cs1 = new Casa(endereco2, false, 2010);
        var cs2 = new Casa(endereco2, false, 2010);
        //------------------------------------------------------------------
        var cs3 = new Casa(endereco3, true, 2015);

        //-------------------------------APARTAMENTO-----------------------------
        System.out.println("Exibindo métodods do Imóvel Apartamento: ");
        System.out.println(ap1.toString());
        System.out.println(ap1.ObterEnderecoImovel());
        System.out.println(ap1.ObterTempoExistenciaImovel() + " anos");
        System.out.printf("R$ %.2f", ap1.CalcularValorCondominio());
        System.out.println();
        System.out.printf("R$ %.2f", ap1.CalcularValorCondominio(1.3));
        System.out.println("\n========================================================\n");

        System.out.println(ap2.toString());
        System.out.println(ap2.ObterEnderecoImovel());
        System.out.println(ap2.ObterTempoExistenciaImovel() + " anos");
        System.out.printf("R$ %.2f", ap2.CalcularValorCondominio());
        System.out.println();
        System.out.printf("R$ %.2f", ap2.CalcularValorCondominio(1.5));
        System.out.println("\n========================================================\n");

        // -------------------------------CASA-----------------------------
        System.out.println("Exibindo métodods do Imóvel Casa: ");
        System.out.println(cs1.toString());
        System.out.println(cs1.ObterEnderecoImovel());
        System.out.println(cs1.ObterTempoExistenciaImovel() + " anos");
        System.out.println("\n========================================================\n");

        // -------------------------------CONSTRUTORA-----------------------------
        Set<Imovel> imoveis = new HashSet<>();
        imoveis.add(ap1);
        imoveis.add(cs1);
        imoveis.add(cs2);
        imoveis.add(cs3);
        imoveis.add(ap2);

        var construtora = new Construtora("Jurandir LTDA.",imoveis);

        System.out.println(construtora.toString());
        System.out.println("\n========================================================\n");

        System.out.println("Exibindo Imóveis Alugados: ");
        for (Imovel im : construtora.ObterImoveisAlugados())
        {
            System.out.println(im.toString());
        }
    }
}
package dominio;

import java.time.LocalDate;

public class Apartamento extends Imovel {

    private double valorCondominio;

    private String numeroApartamento;


    public Apartamento(double valorCondominio, Endereco endereco, boolean alugado, int anoConstrucao, String numeroApartamento) {
        this.endereco = endereco;
        this.alugado = alugado;
        this.anoConstrucao = anoConstrucao;
        this.valorCondominio = valorCondominio;
        this.numeroApartamento =  numeroApartamento;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public String getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(String numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    @Override
    public String ObterEnderecoImovel() {
        return this.endereco.toString() + " número apartamento= " + this.numeroApartamento;
    }
    @Override
    public int ObterTempoExistenciaImovel() {
        return LocalDate.now().getYear() - this.anoConstrucao ;
    }

    public double CalcularValorCondominio()
    {
        double valorReajustado = 0.0;

        if (this.ObterTempoExistenciaImovel() < 10)
            valorReajustado = valorCondominio * 1.2;
        else
            valorReajustado = valorCondominio * 1.1;

        return valorReajustado;

    }
    public double CalcularValorCondominio(double fatorAjuste) {
        return valorCondominio * fatorAjuste;
    }


}

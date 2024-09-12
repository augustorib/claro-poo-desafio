package dominio;

public abstract class Imovel {

    protected int anoConstrucao;
    protected boolean alugado;
    protected Endereco endereco;

    public abstract String ObterEnderecoImovel();

    public abstract int ObterTempoExistenciaImovel();

}

package dominio;

import java.util.Objects;

public abstract class Imovel {

    protected int anoConstrucao;
    protected boolean alugado;
    protected Endereco endereco;

    public abstract String ObterEnderecoImovel();

    public abstract int ObterTempoExistenciaImovel();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return anoConstrucao == imovel.anoConstrucao && Objects.equals(endereco, imovel.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anoConstrucao, endereco);
    }

}

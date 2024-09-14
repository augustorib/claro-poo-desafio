package dominio;

import java.time.LocalDate;

public class Casa extends Imovel{


    public Casa(Endereco endereco, boolean alugado, int anoConstrucao)
    {
        this.endereco = endereco;
        this.alugado = alugado;
        this.anoConstrucao = anoConstrucao;
    }

    @Override
    public String ObterEnderecoImovel() {
        return this.endereco.toString();
    }

    @Override
    public int ObterTempoExistenciaImovel() {
        return LocalDate.now().getYear() - this.anoConstrucao;
    }

    @Override
    public String toString() {
        return "\nCasa{" +
                "anoConstrucao=" + anoConstrucao +
                ", alugado=" + alugado +
                ", endereco=" + endereco +
                '}';
    }
}

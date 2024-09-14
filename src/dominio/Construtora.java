package dominio;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Construtora {

    private String nome;
    private Set<Imovel> imoveis = new HashSet<>();

    public Construtora(String nome, Set<Imovel> imoveis) {
        this.nome = nome;
        this.imoveis = imoveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(Set<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public List<Imovel> ObterImoveisAlugados()
    {
        return imoveis.stream().filter(i -> i.alugado == true).toList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Construtora that = (Construtora) o;
        return Objects.equals(nome, that.nome) && Objects.equals(imoveis, that.imoveis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, imoveis);
    }

    @Override
    public String toString() {
        return "Construtora{\n" +
                "nome='" + nome + '\'' +
                ", \nimoveis=" + imoveis + "\n" +
                '}';
    }
}

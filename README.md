# Claro POO Desafio

## Abstraindo Elementos Usando Orientação a Objetos em Java

Reposítorio contendo o projeto para a prática da programação orientada a objetos: 
- Encapsulamento
- Abstração
- Herança 
- Polimorfismo (Tempo de execução e tempo de compilação)


## Diagrama de Classes

```mermaid
classDiagram
    class Imovel {
        #int anoConstrucao
        #boolean alugado
        #Endereco endereco
        +String ObterEnderecoImovel()
        +int ObterTempoExistenciaImovel()
    }

    class Apartamento {
        -double valorCondominio
        -String numeroApartamento
        +String ObterEnderecoImovel()
        +int ObterTempoExistenciaImovel()
        +double CalcularValorCondominio()
        +double CalcularValorCondominio(double fatorAjuste)
    }

    class Casa {
        +String ObterEnderecoImovel()
        +int ObterTempoExistenciaImovel()
    }

    class Endereco {
        -String rua
        -String cidade
        -int numero
    }

    class Construtora {
        -String nome
        -Set<Imovel> imoveis
        +List<Imovel> ObterImoveisAlugados()
    }

    Imovel <|-- Apartamento
    Imovel <|-- Casa
    Construtora "1" --> "n" Imovel
    Imovel --> Endereco 
```
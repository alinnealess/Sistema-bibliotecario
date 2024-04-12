# Sistema Bibliotecário

Este projeto é um sistema gerenciador de materiais para bibliotecas, desenvolvido como parte da disciplina de Linguagem de Programação II, oferecida no curso de Bacharelado em Tecnologia da Informação pela Universidade Federal do Rio Grande do Norte (UFRN).

## Descrição
O sistema foi criado para gerenciar livros e revistas em uma biblioteca, permitindo operações básicas como cadastro, remoção, pesquisa e listagem de materiais. Este projeto visa aplicar conceitos avançados de programação orientada a objetos, como polimorfismo, abstração e padrões de projeto como Singleton.

## Estrutura do Projeto
O projeto está organizado nos seguintes pacotes:

- model: Contém as classes Material, Livro e Revista.
- DAO: Inclui a classe BibliotecaDAO, que implementa o padrão Singleton para gerenciamento da coleção de materiais.
- utils: Contém a classe BibliotecaFunctions, que oferece métodos estáticos para manipulação dos materiais da biblioteca.

### Funcionalidades
- Cadastro de Material: Adiciona livros ou revistas à biblioteca.
- Remoção de Material: Remove um material específico da biblioteca.
- Pesquisa de Material: Busca por um material pelo título.
- Exibição de Materiais: Lista todos os materiais cadastrados na biblioteca.

## Como Usar
Para executar este projeto, é necessário ter instalado Java JDK 8 ou superior. Clone o repositório para sua máquina local e compile os arquivos .java no diretório src. Você pode executar o sistema a partir da classe Main.

## Licença
Este projeto é licenciado sob a Licença MIT - veja o arquivo LICENSE.md para detalhes.

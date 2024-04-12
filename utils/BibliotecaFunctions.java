package utils;

import DAO.BibliotecaDAO;
import model.Livro;
import model.Material;
import model.Revista;

//Escreva aqui todo o código
public class BibliotecaFunctions {
  private static BibliotecaDAO biblioteca = BibliotecaDAO.getInstance();

  public static void cadastarMaterial(String titulo, String autor, int anoLancamento, String edicao) {
    Livro novoLivro = new Livro(titulo, autor, anoLancamento, edicao);
    biblioteca.getMateriais().add(novoLivro);
  }

  public static void cadastarMaterial(String titulo, String editora, int numeroPaginas) {
    Revista novaRevista = new Revista(titulo, editora, numeroPaginas);
    biblioteca.getMateriais().add(novaRevista);
  }

  public static void exibirListaMateriais() {
    for (Material material : biblioteca.getMateriais()) {
      material.exibirDetalhes();
    }
  }

  public static void pesquisarMaterial(String titulo) {
    Material material = buscaPorNome(titulo);
    if (material != null) {
      material.exibirDetalhes();
    } else {
      System.out.println("Material não encontrado.");
    }
  }

  public static void removerMaterial(String titulo) {
    Material material = buscaPorNome(titulo);
    if (material != null) {
      biblioteca.getMateriais().remove(material);
    }
  }

  private static Material buscaPorNome(String titulo) {
    for (Material material : biblioteca.getMateriais()) {
      if (material instanceof Livro && ((Livro) material).getTitulo().equals(titulo) ||
          material instanceof Revista && ((Revista) material).getTitulo().equals(titulo)) {
        return material;
      }
    }
    return null;
  }
}

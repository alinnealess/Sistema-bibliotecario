package DAO;

import java.util.ArrayList;
import model.Material;

//Escreva aqui todo o código

public class BibliotecaDAO {
  ArrayList<Material> materiais;
  private static BibliotecaDAO biblioteca;

  private BibliotecaDAO() {
    materiais = new ArrayList<>();
  }

  public static BibliotecaDAO getInstance() {
    if (biblioteca == null) {
      biblioteca = new BibliotecaDAO();
    }
    return biblioteca;
  }

  public ArrayList<Material> getMateriais() {
    return materiais;
  }
}

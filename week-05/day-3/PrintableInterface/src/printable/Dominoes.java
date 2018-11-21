package printable;
import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();

    for (Domino d: dominoes){
      d.printAllFields();
    }

  }

  public static List<Domino> sortDominoes(List<Domino> listOfDominoes) {

    List<Domino> sortedDominoes = new ArrayList<>();

    sortedDominoes.add(listOfDominoes.get(0));

    for (int i = 0; i < listOfDominoes.size(); i++) {
      for (int j = 1; j < listOfDominoes.size(); j++) {
        if (sortedDominoes.get(sortedDominoes.size() - 1).getValues()[1] == listOfDominoes.get(j).getValues()[0]) {
          sortedDominoes.add(listOfDominoes.get(j));
        }
      }
    }
    return sortedDominoes;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}

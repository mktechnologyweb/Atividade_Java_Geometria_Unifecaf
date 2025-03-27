//Pacote do projeto
package br.com.fecaf;

//Importando as classes
import br.com.fecaf.controller.Menu;
import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;

/*  O metodo principal(main) dentro da classe Geometria
 criara e mostrara o menu para o usuario*/
public class Geometria {
    public static void main(String[] args) {
        // Instancia do objeto menu (Será exibido um menu formado pela classe Menu)
        Menu menu = new Menu();
        // Execultara o menu que vem do metodo (ação/função) executar menu
        menu.executarMenu();

    }
}

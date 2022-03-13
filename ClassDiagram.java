/**
* Vytvořil: Richard Ficek (xficek05)
*/

package ija.homework1.uml;

import java.util.List;
import java.util.ArrayList;

public class ClassDiagram extends Element {
    private String name;
    private List<UMLClassifier> listofclass;
    /**
     * Konstruktor pro vytvoření instance diagramu. Každý diagram má svůj název.
     */
    public ClassDiagram(String name) {
        super(name);
        this.name = name;
        this.listofclass = new ArrayList<>();
    }
    /**
     * Vytvoří instanci UML třídy a vloží ji do diagramu. Pokud v diagramu již existuje třída stejného názvu, nedělá nic.
     */
    public UMLClass createClass(String name) {
        for (UMLClassifier uml : this.listofclass){
            if (listofclass.equals(name)){
                return null;
            }
        }
        UMLClass uml = new UMLClass(name);
        this.listofclass.add(uml);
        return uml;
    }
    /**
     * Vyhledá v diagramu klasifikátor podle názvu. Pokud neexistuje, vytvoří instanci třídy Classifier reprezentující klasifikátor,
     * který není v diagramu zachycen (viz UMLClassifier.forName(java.lang.String)); využito např. pro modelování typu proměnné,
     * který v diagramu není. Tato instance je zařazena do struktur diagramu, tzn. že při dalším pokusu o vyhledání se použije tato již vytvořená instance.
     */
    public UMLClassifier classifierForName(String name) {
        if (findClassifier(name) == null){
            UMLClassifier umlClassifier = UMLClassifier.forName(name);
            this.listofclass.add(umlClassifier);
        }
        return findClassifier(name);
    }
    /**
     * Vyhledá v diagramu klasifikátor podle názvu.
     */
    public UMLClassifier findClassifier(String name) {
        for (UMLClassifier umlClassifier : this.listofclass) {
            if (umlClassifier.getName().equals(name)) {
                return umlClassifier;
            }
        }
        return null;
    } 
}
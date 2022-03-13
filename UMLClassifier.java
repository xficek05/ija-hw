/**
* Vytvořil: Richard Ficek (xficek05)
*/

package ija.homework1.uml;

public class UMLClassifier extends Element {
    private String name;
    private boolean isUserDefined;

    /**
     * Vytvoří instanci třídy Classifier.
     */
    public UMLClassifier(String name, boolean isUserDefined) {
        super(name);
        this.name = name;
        this.isUserDefined = isUserDefined;
    }

    /**
     * Vytvoří instanci třídy Classifier. Instance je uživatelsky definována (je součástí diagramu).
     */
    public UMLClassifier(String name) {
        this(name, true);
    }
    
    /**
     * Zjišťuje, zda objekt reprezentuje klasifikátor, který je modelován uživatelem v diagramu nebo ne.
     */
    public boolean isUserDefined() {
        return isUserDefined;
    }

    /**
     * Tovární metoda pro vytvoření instance třídy Classifier pro zadané jméno. Instance reprezentuje klasifikátor, který není v diagramu modelován.
     */
    public static UMLClassifier forName(String name) {
        return new UMLClassifier(name, false);
    }

    /**
     * Vrací řetězec reprezentující klasifikátor v podobě "nazev(userDefined)", kde userDefined je true nebo false.
     */
    @Override
    public String toString() {
        return this.name + "(" + this.isUserDefined + ")";
    }
    
}

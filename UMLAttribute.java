/**
* Vytvořil: Richard Ficek (xficek05)
*/

package ija.homework1.uml;


public class UMLAttribute extends Element {
    public String name;
    UMLClassifier type;
    /**
     * Vytvoří instanci atributu.
     */
    public UMLAttribute(String name, UMLClassifier type) {
        super(name);
        this.name = name;
        this.type = type;
    }
    /**
     * Poskytuje informaci o typu atributu.
     */
    public UMLClassifier getType() {
        return this.type;
    }
    /**
     * Vrací řetězec reprezentující stav atributu v podobě "nazev:typ".
     */
    @Override
    public String toString() {
        return this.name + ":"+ this.getType().toString();
    }
    
}


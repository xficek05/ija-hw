/**
* Vytvořil: Richard Ficek (xficek05)
*/

package ija.homework1.uml;

public class Element {
    private String name;
    /**
     * Vytvoří instanci se zadaným názvem.
     */
    public Element(String name) {
        this.name = name;
    }
    /**
     * Vrátí název elementu.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Přejmenuje element.
     */
    public void rename(String newName) {
        this.name = newName;
    }
}
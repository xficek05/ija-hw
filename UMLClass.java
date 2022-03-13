/**
* Vytvořil: Richard Ficek (xficek05)
*/

package ija.homework1.uml;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class UMLClass extends UMLClassifier{
    private boolean isAbstract;
    private List<UMLAttribute> atribut;
    /**
     * Vytvoří instanci reprezentující model třídy z jazyka UML. Třída není abstraktní.
     */
    public UMLClass (String name) {
        super(name);
        this.isAbstract = false;
        this.atribut = new ArrayList<>();
    }
    /**
     * Test, zda objekt reprezentuje model abstraktní třídy.
     */
    public boolean isAbstract() {
        return this.isAbstract;
    }
    /**
     * Změní informaci objektu, zda reprezentuje abstraktní třídu.
     */
    public void setAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }
    /**
     * Vloží atribut do modelu UML třídy. Atribut se vloží na konec seznamu (poslední položka).
     * Pokud již třída obsahuje atribut stejného jména, nedělá nic.
     */
    public boolean addAttribute(UMLAttribute attr) {
        for (int i = 0; i < atribut.size(); i++){
            if (atribut.equals(attr)){
                return false;
            }
        }
        this.atribut.add(attr);
        return true;
    }
    /**
     * Vrací pozici atributu v seznamu atributů. Pozice se indexuje od hodnoty 0.
     * Pokud třída daný atribut neobsahuje, vrací -1.
     */
    public int getAttrPosition(UMLAttribute attr) {
        for (int position = 0; position < atribut.size(); position++){
            if (atribut.equals(attr)){
                return position;
            }
        }
        return -1;
    }
    /**
     * Přesune pozici atributu na nově zadanou. Pozice se indexuje od hodnoty 0.
     * Pokud třída daný atribut neobsahuje, nic neprovádí a vrací -1. Při přesunu
     * na pozici pos se všechny stávající položky (atributy) od pozice pos (včetně)
     * posunou o jednu pozici doprava.
     */
    public int moveAttrAtPosition(UMLAttribute attr, int pos) {
        int position = getAttrPosition(attr);
        UMLAttribute old;
        if (position == -1 || position == pos){
            return position;
        }
        for (int i = pos; i < position; i++){
               old = atribut.get(i);
               atribut.set(i, atribut.get(position));  
               atribut.set(position,old);          
        }
        return 0;
    }
    /**
     * Vrací nemodifikovatelný seznam atributů. Lze využít pro zobrazení atributů třídy.
     */
    public List<UMLAttribute> getAttributes() {
        return Collections.unmodifiableList(this.atribut);
    }
    
}


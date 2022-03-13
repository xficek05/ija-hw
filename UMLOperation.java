/**
* Vytvořil: Richard Ficek (xficek05)
*/

package ija.homework1.uml;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UMLOperation extends UMLAttribute {
    private UMLClassifier type;
    private String name;
    private List<UMLAttribute> atributList;
    /**
     * Konstruktor pro vytvoření operace s daným názvem a návratovým typem.
     */
    public UMLOperation(String name, UMLClassifier type) {
        super(name, type);
        this.name = name;
        this.type = type;
        atributList = new ArrayList<>();
    }
    /**
     * Přidá nový argument do seznamu argumentů. Argument se vloží na konec seznamu. Pokud v seznamu již existuje argument stejného názvu, operaci neprovede.
     */
    public boolean addArgument(UMLAttribute arg) {
        for (UMLAttribute attribute : atributList) {
            if (attribute.equals(arg)) {
                return false;
            }
        }
        atributList.add(arg);
        return true;
    }
    /**
     * Tovární metoda pro vytvoření instance operace.
     */
    public static UMLOperation create(String name, UMLClassifier type, UMLAttribute ... args) {
        UMLOperation newoper = new UMLOperation(name,type);
        newoper.atributList.addAll(Arrays.asList(args));
        return newoper;
    }
    /**
     * Vrací nemodifikovatelný seznam argumentů. Lze využít pro zobrazení.
     */    
    public List<UMLAttribute> getArguments() {
        return Collections.unmodifiableList(atributList);
    }
}

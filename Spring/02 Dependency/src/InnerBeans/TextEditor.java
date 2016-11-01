package InnerBeans;

import java.util.List;

public class TextEditor {
    private SpellChecker spellChecker;
    List addressList;
    private String name;

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    // a setter method to set List
    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    // prints and returns all the elements of the list.
    public List getAddressList() {
        System.out.println("List Elements :"  + addressList);
        return addressList;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
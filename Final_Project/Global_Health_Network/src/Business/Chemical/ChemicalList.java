/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chemical;

import java.util.ArrayList;

/**
 *
 * @author keshav
 */
public class ChemicalList {
    private ArrayList<Chemical> chemicalList;

    public ChemicalList() {
         this.chemicalList = new ArrayList<Chemical>();
    }

    public ArrayList<Chemical> getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(ArrayList<Chemical> chemicalList) {
        this.chemicalList = chemicalList;
    }
      public Chemical addChemicalList()
   {
       Chemical c = new Chemical();
       chemicalList.add(c);
       return c;
       
   }
}

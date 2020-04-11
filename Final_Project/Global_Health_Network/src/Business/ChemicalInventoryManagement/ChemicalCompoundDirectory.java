/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ChemicalInventoryManagement;

import java.util.ArrayList;

/**
 *
 * @author keshav
 */
public class ChemicalCompoundDirectory {
      private ArrayList<ChemicalCompound> chemicalDirectory;

    public ChemicalCompoundDirectory() {
        chemicalDirectory =  new ArrayList<ChemicalCompound>();
    }

    public ArrayList<ChemicalCompound> getChemicalDirectory() {
        return chemicalDirectory;
    }

    public void setChemicalDirectory(ArrayList<ChemicalCompound> chemicalDirectory) {
        this.chemicalDirectory = chemicalDirectory;
    }
    
    public ChemicalCompound addChemial()
    {
        ChemicalCompound ci = new ChemicalCompound();
        chemicalDirectory.add(ci);
        return ci;
    }
    
    public void deleteChemical(ChemicalCompound cid){
     chemicalDirectory.remove(cid);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Gene;


import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class GeneHistory {
    private ArrayList<Gene> geneList;

    public GeneHistory() {
        
        geneList = new  ArrayList<Gene>();
    }

    public ArrayList<Gene> getGeneList() {
        return geneList;
    }

    public void setGeneList(ArrayList<Gene> geneList) {
        this.geneList = geneList;
    }
    
    public Gene addGene(){
        Gene gene = new Gene();
        geneList.add(gene);
        return gene;
    }


    

}

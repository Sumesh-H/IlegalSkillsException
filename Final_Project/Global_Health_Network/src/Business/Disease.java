/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Gene.Gene;
import java.util.List;

/**
 *
 * @author krish
 */
public class Disease {
    private int diseaseId;
    private String diseaseName;
    private List<Gene> geneDisease;

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public List<Gene> getGeneDisease() {
        return geneDisease;
    }

    public void setGeneDisease(List<Gene> geneDisease) {
        this.geneDisease = geneDisease;
    }
    
    
}

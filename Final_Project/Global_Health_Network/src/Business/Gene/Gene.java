/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Gene;

/**
 *
 * @author krish
 */
public class Gene {
    private String geneName;
    private int id;
    private static int count =1;

    public Gene() {
        id=count;
        count++;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Gene{" + "geneName=" + geneName + ", id=" + id + '}';
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Gene.GeneHistory;

/**
 *
 * @author krish
 */
public class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String test;
    private GeneHistory geneHistory;
    private String sex;
    private String newDrug;
    private String clinicalStatus;

    public Patient() {
        geneHistory = new GeneHistory();
    }
    
    

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public GeneHistory getGeneHistory() {
        return geneHistory;
    }

    public void setGeneHistory(GeneHistory geneHistory) {
        this.geneHistory = geneHistory;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNewDrug() {
        return newDrug;
    }

    public void setNewDrug(String newDrug) {
        this.newDrug = newDrug;
    }

    public String getClinicalStatus() {
        return clinicalStatus;
    }

    public void setClinicalStatus(String clinicalStatus) {
        this.clinicalStatus = clinicalStatus;
    }
    
    @Override
    public String toString(){
        return this.patientName;
    }
}

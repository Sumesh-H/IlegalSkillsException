/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Disease;
import Business.Doctor.Patient;
import Business.Gene.Gene;
import java.util.List;
import java.util.Map;

/**
 *
 * @author krish
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private Map<Disease, List<Gene>> geneDiseasesList;
    private String patientName;
    private Patient patient;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Map<Disease, List<Gene>> getGeneDiseasesList() {
        return geneDiseasesList;
    }

    public void setGeneDiseasesList(Map<Disease, List<Gene>> geneDiseasesList) {
        this.geneDiseasesList = geneDiseasesList;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString(){
        return this.patientName;
    }
    
}

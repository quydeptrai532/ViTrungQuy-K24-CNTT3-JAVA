package BTTH;

import java.util.ArrayList;

public class PatientManager {
      protected ArrayList<Patient> quydz=new ArrayList();
      void addPatient(Patient patient){
         quydz.add(patient);
         System.out.println("Them thanh cong");
      }
      void removePatient(int patientId){
          quydz.remove(patientId);
      }
      void updatePatient(int patienId,Patient updatedPatient){

      }
      void searchPatientByName(String name){

      }
      void displayPatient(){

      }
}

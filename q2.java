import doctor.doctor; 
import patient.patient; 
public class q2 { 
public static void main(String[] args) { 
doctor d1 = new doctor(101, "Dr. Ravi", "Cardiologist", 1000); doctor d2 = new doctor(102, "Dr. Priya", "Dermatologist", 800); patient p1 = new patient(201, "Arun", "Heart Disease", 45); patient p2 = new patient(202, "Meena", "Skin Allergy", 30); patient p3 = new patient(203, "Rahul", "Heart Disease", 50); doctor doctorForP1 = d1;  
doctor doctorForP2 = d2;  
doctor doctorForP3 = d1;  
p1.displayPatient(); 
System.out.println("\nDoctor Treating Patient:"); 
doctorForP1.displayDoctor(); 
p2.displayPatient(); 
System.out.println("\nDoctor Treating Patient:");
doctorForP2.displayDoctor(); 
p3.displayPatient(); 
System.out.println("\nDoctor Treating Patient:"); 
doctorForP3.displayDoctor(); 
int patientsForD1 = 2; 
int patientsForD2 = 1; 
double totalD1 = patientsForD1 * d1.getConsultationFee(); 
double totalD2 = patientsForD2 * d2.getConsultationFee(); 
System.out.println("Total Fees:"); 
System.out.println(d1.getName() + ": Rs." + totalD1); 
System.out.println(d2.getName() + ": Rs." + totalD2); 
} 
} 

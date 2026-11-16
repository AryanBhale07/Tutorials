public class q3 { 
public static void main(String[] args) { 
AdvancedSecurity app = new BankingApplication(); 
app.login("Aryan", "securePass123"); 
app.fingerprintAuth(); 
app.faceRecognitionAuth(); 
app.logout(); 
} 
} 
interface BasicSecurity { 
void login(String username, String password); 
void logout(); 
} 
interface AdvancedSecurity extends BasicSecurity { 
void fingerprintAuth(); 
void faceRecognitionAuth(); 
}
class BankingApplication implements AdvancedSecurity { 
public void login(String username, String password) { 
System.out.println("User " + username + " logged in with password authentication."); } 
public void logout() { 
System.out.println("User logged out successfully."); 
} 
public void fingerprintAuth() { 
System.out.println("Fingerprint authentication successful."); 
} 
public void faceRecognitionAuth() { 
System.out.println("Face recognition authentication successful."); 
} 
} 

import java.util.*; 
class Candidate{ 
 int id,ap,te,co; 
 String n; 
 Candidate(int id,String n,int ap,int te,int co){  this.id=id; 
 this.n=n; 
 this.ap=ap; 
 this.te=te; 
 this.co=co; 
 } 
 int getTotalScore(){ 
 return ap+te+co; 
 } 
} 
public class q6{ 
 public static void main(String[] args){  Scanner sc=new Scanner(System.in);  int N=sc.nextInt(); 
 int K=sc.nextInt(); 
 Candidate[] c=new Candidate[N];  for(int i=0;i<N;i++){ 
 int id=sc.nextInt(); 
 String n=sc.next(); 
 int ap=sc.nextInt(); 
 int te=sc.nextInt(); 
 int co=sc.nextInt(); 
 c[i]=new Candidate(id,n,ap,te,co);  }
 for(int i=0;i<N-1;i++){ 
 for(int j=i+1;j<N;j++){ 
 if(c[i].getTotalScore()<c[j].getTotalScore()|| 
 (c[i].getTotalScore()==c[j].getTotalScore()&&c[i].id>c[j].id)){  Candidate t=c[i]; 
 c[i]=c[j]; 
 c[j]=t; 
 } 
 } 
 } 
 for(int i=0;i<K;i++){ 
 System.out.println(c[i].id+" "+c[i].n+" "+c[i].getTotalScore());  } 
 } 
}

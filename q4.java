public class q4 
{ 
public static void main(String[] args) 
{ 
Document d1 = new PersonalDocument(); 
Document d2 = new PublicDocument(); 
Document d3 = new CompanyDocument(); 
if(d1 instanceof Confidential) 
System.out.println("Personal Document is Confidential");
else 
System.out.println("Personal Document is not Confidential"); 
if(d2 instanceof Confidential) 
System.out.println("Public Document is Confidential"); else 
System.out.println("Public Document is not Confidential"); 
if(d3 instanceof Confidential) 
System.out.println("Company Document is Confidential"); else 
System.out.println("Company Document is not Confidential"); } 
} 
interface Confidential 
{ 
} 
class Document 
{ 
} 
class PersonalDocument extends Document implements Confidential { 
} 
class PublicDocument extends Document 
{
} 
class CompanyDocument extends Document implements Confidential 
{ 
} 

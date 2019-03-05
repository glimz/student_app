import java.util.Objects;

public class Student2{
		private String studentName;
   private String studentSurname;
   private Integer matriculationNumber;
   private Integer zipCode;
   private String streat;
   private String city;

   public Student2(String studentName, String studentSurname, int matriculationNumber, int zipCode, String streat, String city) {
       this.studentName = studentName;
       this.studentSurname = studentSurname;
       this.matriculationNumber = matriculationNumber;
       this.zipCode = zipCode;
       this.streat = streat;
       this.city = city;

   }

   public String getStudentData(){
       return studentName + "" + studentSurname + ""+ matriculationNumber + ""+zipCode+""+streat+""+city ;
   }

   public void setZipCode(int zipCode) {
       this.zipCode = zipCode;
   }

   public String getStreat() {
       return streat;
   }

   public void setStreat(String streat) {
       this.streat = streat;
   }

   public String getCity() {
       return city;
   }

   public void setCity(String city) {
       this.city = city;
   }

   @Override
   public boolean equals(Object obj) {
       if (this == obj) {
           return true;
       }
       if (obj == null) {
           return false;
       }
       if (getClass() != obj.getClass()) {
           return false;
       }
       final Student2 other = (Student2) obj;
       return Objects.equals(this.matriculationNumber, other.matriculationNumber);
           // just to reduce code complexity i used Matriculation number because of its uniqueness.
   }

   @Override
   public int hashCode() {
       int hash = getStudentData().hashCode();
       return hash ;
   }

   public static void main(String[] args) {
       // TODO code application logic here
       Student2 student1 = new Student2("martin","jack",3251,3242,"Kaemer 12","Hamburg");
       Student2 student2 = new Student2("aneel","ahmed",7642,2311,"hnse 12","Hamburg");
       System.out.println("Hash code :"+ student1.hashCode());
       System.out.println("is Data Matching : " + student2.equals(student1));
   }
}
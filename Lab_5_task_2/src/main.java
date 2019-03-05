
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student1 = new Student("Ahmed","Galadima", "32514385", "Moorstrasse 7", 21073, "Hamburg");
	       Student student2 = new Student("Desmond","Nduma","69785343","Jenny strasse 7", 2175, "Hamburg");
	       System.out.println("Student 1 :"+student1.toString());
	       System.out.println("Student 2 :"+student2.toString());
	       
	       System.out.println("\nHash code :"+ student1.hashCode());
	       System.out.println("True if Datas match and/false if they do not: \n" +student2.equals(student1));

	}

}

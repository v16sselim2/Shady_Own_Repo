import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		
		String stringInput = JOptionPane.showInputDialog("Enter Students Number");
		int input = Integer.parseInt(stringInput);
		
		Student [] students = new Student[input];
		
		for (int i = 0 ; i < input ; i++){
			
			String name = JOptionPane.showInputDialog("Enter Student Number " + (i+1) + " Name " );
			String mail = JOptionPane.showInputDialog("Enter Student mail " + (i+1) + " Name " );
			String mobile = JOptionPane.showInputDialog("Enter Student mobile " + (i+1) + " Name " );
			String faculty = JOptionPane.showInputDialog("Enter Student faculty " + (i+1) + " Name " );
	
			Student student = new Student (name, mail, mobile, faculty );
			students[i] = student;
		
		}
		String result = "";
		
		for (int i = 0 ; i< students.length; i++){
			result+= "Student number " + (i+1) +"Name is " + students [i].getName()+ "\n";
			result = result + "Student Number " + (i +1) + "name is " + students[i].getName()+"\n";
			
		}
		}

}



class Student {

	private String name;
	private String mail;
	private String mobile;
	private String faculty;
	private StudentGrades[] grades;

	public Student(String name2, String mail2, String mobile2, String faculty2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;

	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public StudentGrades[] getGrades() {
		return grades;
	}

	public void setGrades(StudentGrades[] grades) {
		this.grades = grades;
	}

	public void setName(String name) {
		this.name = name;
	}

}
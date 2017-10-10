package com.cg.student.bean;

public class StudentDetail 
{
	private int studentId;
	private String studentName;
	private String subject;
	private int theoryMarks;
	private int McqMarks;
	private int labScore;
	private int totalScore;
	private String grade;
	
	
	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String toString() {
		return "StudentDetail [studentId=" + studentId + ", studentName="
				+ studentName + ", subject=" + subject + ", theoryMarks="
				+ theoryMarks + ", McqMarks=" + McqMarks + ", labScore="
				+ labScore + "]";
	}
	
	
	public StudentDetail(String studentName, String subject, int theoryMarks,
			int mcqMarks, int labScore) {
		super();
		this.studentName = studentName;
		this.subject = subject;
		this.theoryMarks = theoryMarks;
		McqMarks = mcqMarks;
		this.labScore = labScore;
	}
	
	
	public StudentDetail() {
		super();
	}
	
	
	public StudentDetail(int studentId) {
		super();
		this.studentId = studentId;
		
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getTheoryMarks() {
		return theoryMarks;
	}


	public void setTheoryMarks(int theoryMarks) {
		this.theoryMarks = theoryMarks;
	}


	public int getMcqMarks() {
		return McqMarks;
	}


	public void setMcqMarks(int mcqMarks) {
		McqMarks = mcqMarks;
	}


	public int getLabScore() {
		return labScore;
	}


	public void setLabScore(int labScore) {
		this.labScore = labScore;
	}
	
	
}

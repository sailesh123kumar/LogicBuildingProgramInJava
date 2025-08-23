package com.student.management.system;

import java.io.InputStream;
import java.util.Scanner;

public class StudentMangementSystem {

	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static int studentRollNumber[] = new int[100];
	public static double marksObtainedInEnglish[] = new double[100];
	public static double marksObtainedInMaths[] = new double[100];
	public static double marksObtainedInScience[] = new double[100];
	public static String studentGrade[] = new String[100];
	public static Scanner scanner = new Scanner(System.in);
	public static int index = 0;

	public static void main(String[] args) {

		System.out.println("===========Student Mangement System===========");

		while (true) {

			System.out.println("1. Add a student");
			System.out.println("2. Print student details");
			System.out.println("3. Print all student details");
			System.out.println("4. Exit");

			System.out.println("Enter an option between 1 to 4");

			int option = scanner.nextInt();
			switch (option) {
			case 1:
				addStudent();
				break;
			case 2:
				printStudentInfo();
				break;
			case 3:
				printAllStudentInfo();
				break;
			case 4:
				exitApp();
				break;

			default:
				break;
			}
		}
	}

	private static void exitApp() {
		System.out.println("Exiting from the app....");
		System.exit(0);
	}

	private static void printAllStudentInfo() {
		System.out.println("=====Print All Student Details=====");
		
		for (int i = 0; i < index; i++) {
			
			System.out.println("=======================================");
			
			System.out.println("Student Name :" + studentName[i]);
			System.out.println("Student Age :" + studentAge[i]);
			System.out.println("Student RollNo :" + studentRollNumber[i]);
			System.out.println("=====Marks Obtained=====");
			System.out.println("English :" + marksObtainedInEnglish[i]);
			System.out.println("Maths :" + marksObtainedInMaths[i]);
			System.out.println("Science :" + marksObtainedInScience[i]);
			System.out.println("Student Grade:" + studentGrade[i]);
			
			System.out.println("=======================================");
			
		}
		

	}

	private static void printStudentInfo() {
		System.out.println("=====Printing Student Details=====");
		System.out.println("Enter the student index");
		int userIndex = scanner.nextInt();

		System.out.println("Student Name :" + studentName[userIndex]);
		System.out.println("Student Age :" + studentAge[userIndex]);
		System.out.println("Student RollNo :" + studentRollNumber[userIndex]);
		System.out.println("Marks Obtained");
		System.out.println("English :" + marksObtainedInEnglish[userIndex]);
		System.out.println("Maths :" + marksObtainedInMaths[userIndex]);
		System.out.println("Science :" + marksObtainedInScience[userIndex]);
		System.out.println("Student Grade:" + studentGrade[userIndex]);
	}

	public static void addStudent() {
		System.out.println("Enter the Student Name");
		studentName[index] = scanner.next();

		System.out.println("Enter the Student Age");
		studentAge[index] = scanner.nextInt();

		System.out.println("Enter the Student Roll Number");
		studentRollNumber[index] = scanner.nextInt();

		System.out.println("Enter the Student marks Obtained in English");
		marksObtainedInEnglish[index] = scanner.nextDouble();

		System.out.println("Enter the Student marks Obtained in Maths");
		marksObtainedInMaths[index] = scanner.nextDouble();

		System.out.println("Enter the Student marks Obtained in Science");
		marksObtainedInScience[index] = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInMaths[index]
				+ marksObtainedInScience[index];
		double percentageObtained = totalMarksObtained / 3.0;

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 65) {
			studentGrade[index] = "C";
		} else {
			studentGrade[index] = "F";
		}

		index++;
		System.out.println("Student info stored successfully..!!!");
	}

}

CSCI-2467 Lab 10 – Comparator Class for Sorting
Background
This lab uses a Student class with the following fields:
private final String firstName;
private final String lastName;
private final String major;
private final int zipcode;
private final String studentID;
private final double gpa;

A TestData class has been provided that contains a createStudents() method that returns an array of populated Student objects.
Assignment
Download the Lab10.zip starter file. Use 7zip to unzip the file using ‘Extract Here’. Open the project folder in IntelliJ. 
The Main method prints the list of Students sorted by last name. It uses the Arrays.sort() method and an anonymous Comparator object to sort the array by the student’s last name.
Using the Arrays.sort() method and anonymous Comparator objects print out the array of students using the following three sorting criteria:
1.	Sorted in order of major (A-Z)
2.	Sorted by zip code (increasing)
3.	Sorted by Grade Point Average (GPA) (decreasing)
Note: when sorting by GPA, you will need to be clever to correctly sort GPA’s such as 3.1, 3.2, 3.4 in the correct order.
Note: In this assignment the Comparator class will be instantiated as:
	new Comparator<Student>()
The <Student> type argument means that the Comparator operates on Student objects. You will learn more about this in the next lesson on Generics.
Example Output
Students Sorted By LastName
First Name   Last Name    Major              Zip Code     GPA         
Penny        Adiyodi      Finance            90304        3.1         
Marina       Andrieski    Marketing          76821        3.4         
Quentin      Coldwater    Biology            43109        2.7         
Henry        Fogg         Botany             49022        3.8         
Margo        Hanson       Psychology         56231        2.91        
Josh         Hoberman     Astronomy          33021        2.5         
Kady         Orloff-Diaz  English            65421        3.2         
Alice        Quinn        Math               89123        4.0         
Eliot        Waugh        Chemistry          12345        2.1         
Julia        Wicker       Computer Science   43210        4.0         
==============================================================

Students Sorted By Major
First Name   Last Name    Major              Zip Code     GPA         
Josh         Hoberman     Astronomy          33021        2.5         
Quentin      Coldwater    Biology            43109        2.7         
Henry        Fogg         Botany             49022        3.8         
Eliot        Waugh        Chemistry          12345        2.1         
Julia        Wicker       Computer Science   43210        4.0         
Kady         Orloff-Diaz  English            65421        3.2         
Penny        Adiyodi      Finance            90304        3.1         
Marina       Andrieski    Marketing          76821        3.4         
Alice        Quinn        Math               89123        4.0         
Margo        Hanson       Psychology         56231        2.91        
==============================================================

Students Sorted By Zip Code
First Name   Last Name    Major              Zip Code     GPA         
Eliot        Waugh        Chemistry          12345        2.1         
Josh         Hoberman     Astronomy          33021        2.5         
Quentin      Coldwater    Biology            43109        2.7         
Julia        Wicker       Computer Science   43210        4.0         
Henry        Fogg         Botany             49022        3.8         
Margo        Hanson       Psychology         56231        2.91        
Kady         Orloff-Diaz  English            65421        3.2         
Marina       Andrieski    Marketing          76821        3.4         
Alice        Quinn        Math               89123        4.0         
Penny        Adiyodi      Finance            90304        3.1         
==============================================================

Students Sorted By GPA
First Name   Last Name    Major              Zip Code     GPA         
Julia        Wicker       Computer Science   43210        4.0         
Alice        Quinn        Math               89123        4.0         
Henry        Fogg         Botany             49022        3.8         
Marina       Andrieski    Marketing          76821        3.4         
Kady         Orloff-Diaz  English            65421        3.2         
Penny        Adiyodi      Finance            90304        3.1         
Margo        Hanson       Psychology         56231        2.91        
Quentin      Coldwater    Biology            43109        2.7         
Josh         Hoberman     Astronomy          33021        2.5         
Eliot        Waugh        Chemistry          12345        2.1         

Additional Information
Novice software developers are frequently tempted to immediately begin an assignment by writing code. This lab requires that you write very little code, but that you first thoroughly understand the problem. Watch the video associated with this lab. Read the documentation on the Arrays.sort() method and the Comparator class and the compare() method. Study the code already provided in the Lab11 starter file. Do not begin writing code until you feel you thoroughly understand the assignment.

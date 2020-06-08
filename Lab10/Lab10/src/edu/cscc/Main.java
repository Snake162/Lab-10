package edu.cscc;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student[] students = TestData.createStudents();
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                String firstname1=s1.getFirstName();
                String firstname2=s2.getFirstName();
                String major1=s1.getMajor();
                String major2=s2.getMajor();
                int zipcode1=s1.getZipcode();
                int zipcode2=s2.getZipcode();
                double gpa1= s1.getGpa();
                double gpa2= s2.getGpa();
                String studentID1=s1.getStudentID();
                String studentID2=s2.getStudentID();

                if (lastname1==lastname2) {
                    //if they have the same last it is sorted by first name
                    if (firstname1==firstname2){
                        //if same first and last name it is sorted by major
                        if (major1==major2) {
                            //if somehow same first and last name and same major, sorted by zip code
                            if (zipcode1==zipcode2){
            //if by some miracle same first and last name, major and zip code is sorted by gpa
            if (gpa1==gpa2) {
                return studentID1.compareTo(studentID2);
            } else {
                if (gpa1>gpa2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else {
            return zipcode1-zipcode2;
        }
    }         return major1.compareTo(major2);

} else {
        return firstname1.compareTo(firstname2);
        }
        }else {
        return lastname1.compareTo(lastname2);
        }
        }
        });
        printStudentList("Students Sorted By LastName",students);

        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                String firstname1=s1.getFirstName();
                String firstname2=s2.getFirstName();
                String major1=s1.getMajor();
                String major2=s2.getMajor();
                int zipcode1=s1.getZipcode();
                int zipcode2=s2.getZipcode();
                double gpa1= s1.getGpa();
                double gpa2= s2.getGpa();
                String studentID1=s1.getStudentID();
                String studentID2=s2.getStudentID();

                if (major1==major2) {
                if (lastname1==lastname2) {
                    if (firstname1==firstname2){
                            if (zipcode1==zipcode2){
                                if (gpa1==gpa2) {
                                    return studentID1.compareTo(studentID2);
                                } else {
                                    if (gpa1>gpa2) {
                                        return -1;
                                    } else {
                                        return 1;
                                    }
                                }
                            } else {
                                return zipcode1-zipcode2;
                            }
                        }         return firstname1.compareTo(firstname2);

                    } else {
                        return lastname1.compareTo(lastname2);
                    }
                }else {
                    return major1.compareTo(major2);
                }
            }
        });
        printStudentList("Students Sorted By Major",students);

        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                String firstname1=s1.getFirstName();
                String firstname2=s2.getFirstName();
                String major1=s1.getMajor();
                String major2=s2.getMajor();
                int zipcode1=s1.getZipcode();
                int zipcode2=s2.getZipcode();
                double gpa1= s1.getGpa();
                double gpa2= s2.getGpa();
                String studentID1=s1.getStudentID();
                String studentID2=s2.getStudentID();


                if (zipcode1==zipcode2){
                    if (lastname1==lastname2) {
                        if (firstname1==firstname2){
                            if (major1==major2) {
                                if (gpa1==gpa2) {
                                    return studentID1.compareTo(studentID2);
                                } else {
                                    if (gpa1>gpa2) {
                                        return -1;
                                    } else {
                                        return 1;
                                    }
                                }
                            } else {
                                return major1.compareTo(major2);
                            }
                        }         return firstname1.compareTo(firstname2);

                    } else {
                        return lastname1.compareTo(lastname2);
                    }
                }else {
                    return zipcode1-zipcode2;
                }
            }
        });

        printStudentList("Students Sorted By Zip Code",students);

        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                String firstname1=s1.getFirstName();
                String firstname2=s2.getFirstName();
                String major1=s1.getMajor();
                String major2=s2.getMajor();
                int zipcode1=s1.getZipcode();
                int zipcode2=s2.getZipcode();
                double gpa1= s1.getGpa();
                double gpa2= s2.getGpa();
                String studentID1=s1.getStudentID();
                String studentID2=s2.getStudentID();

                if (gpa1==gpa2) {
                    if (lastname1==lastname2) {
                        if (firstname1==firstname2){
                            if (major1==major2) {
                                if (zipcode1==zipcode2){
                                    return studentID1.compareTo(studentID2);
                                } else {
                                    return zipcode1-zipcode2;
                                }
                            } else {
                                return major1.compareTo(major2);
                            }
                        }         return firstname1.compareTo(firstname2);

                    } else {
                        return lastname1.compareTo(lastname2);
                    }
                }else {
                    if (gpa1>gpa2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });

        printStudentList("Students Sorted By GPA",students);
    }

    public static void printStudentList(String title,Student[] list) {
        final String format = "%-12s %-12s %-18s %-12s %-12s\n";
        System.out.println(title);
        System.out.printf(format,"First Name","Last Name","Major","Zip Code","GPA");
        for (Student s : list) {
            System.out.printf(format,s.getFirstName(),s.getLastName(),s.getMajor(),s.getZipcode(),s.getGpa());
        }
        System.out.println("==============================================================\n");
    }
}

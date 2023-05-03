package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Test_4 {

    public static void main(String[] args) {
        TreeMap<Integer, ArrayList<Student>> mapStudents = new TreeMap<Integer, ArrayList<Student>>();
        ArrayList<Student> studentsZero = new ArrayList<>();
        Student s1 = new Student("Paško");
        Student s2 = new Student("Ivan");
        Student s3 = new Student("Lucija");
        Student s4 = new Student("Martina");
        studentsZero.add(s1);
        studentsZero.add(s2);
        studentsZero.add(s3);
        studentsZero.add(s4);
        studentsZero.add(s3);
        ArrayList<Student> studentsOne = new ArrayList<>(studentsZero);
        ArrayList<Student> studentsTwo = new ArrayList<>(studentsZero);
        ArrayList<Student> studentsThree = new ArrayList<>(studentsZero);
        mapStudents.put(10, studentsZero);
        mapStudents.put(20, studentsOne);
        mapStudents.put(1, studentsTwo);
        //System.out.println(mapStudents);
//      listElementsFromMap(mapStudents);
        addElementForKey(mapStudents, 10, new Student("Slavena"));
        listElementsFromMap(mapStudents);
        addElementForKey(mapStudents, 100, new Student("Edvina"));
        listElementsFromMap(mapStudents);
    }


    private static void addElementForKey(TreeMap<Integer, ArrayList<Student>> mapStud, int key, Student s) {
        if (mapStud.containsKey(key)) {
            ArrayList<Student> studentsKey = mapStud.get(key);
            studentsKey.add(s);
            mapStud.put(key, studentsKey);
        } else {
            ArrayList<Student> students = new ArrayList<>();
            students.add(s);
            mapStud.put(key, students);
        }
    }

    private static void listElementsFromMap(TreeMap<Integer, ArrayList<Student>> mapStud) {
        for (Integer key : mapStud.keySet()) {
            System.out.println("Key: " + key);
            for (Student student : mapStud.get(key)) {
                System.out.println("Value: " + student);
            }
            System.out.println("---------------------------------------------------------------------------------");
        }
    }
}

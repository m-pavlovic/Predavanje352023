package collections;

import java.util.concurrent.ThreadLocalRandom;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private static int cntID = 100;
    private int yearsOnStudyPrograms;
    private static final int MINY = 1;
    private static final int MAXY = 7;


    public Student (String name) {
        this.name = name;
        this.id = cntID++;
        this.yearsOnStudyPrograms = ThreadLocalRandom.current().nextInt(MINY+1, MAXY + 1);
    }


    public int getYearsOnStudyPrograms() {
        return yearsOnStudyPrograms;
    }

    @Override
    public int compareTo(Student s2) {
        if (this.yearsOnStudyPrograms > s2.getYearsOnStudyPrograms())
            return 1;
        else if (this.yearsOnStudyPrograms < s2.getYearsOnStudyPrograms())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", yearsOnStudyPrograms=" + yearsOnStudyPrograms +
                '}';
    }
}

package findTopTwoStudentsHavingMoreMarks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int roll;
    List<Subject> sub;

    public Student(String name, int roll, List<Subject> sub) {
        this.name = name;
        this.roll = roll;
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public List<Subject> getSub() {
        return sub;
    }

    public void setSub(List<Subject> sub) {
        this.sub = sub;
    }

    public int getTotalMarks(){
        int sum = 0;
        if(this.sub == null) {
            return sum;
        }
        for(Subject subject : this.sub) {
            sum += subject.getMarks();
        }
        return sum;
    }
    public List<Subject> getSortedSubjectByMarks(){
        List<Subject> sortedSubject = new ArrayList<>();
        if(sub == null) {
            return sortedSubject;
        }
        sortedSubject.addAll(this.sub);
        Collections.sort(sortedSubject, new Comparator<Subject>() {
            @Override
            public int compare(Subject s1, Subject s2) {
                return (int) (s2.getMarks()-s1.getMarks());
            }
        });
        return sortedSubject;
    }
}

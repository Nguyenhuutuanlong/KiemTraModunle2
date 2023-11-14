package Manager;

import Model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student> {
    ArrayList<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        this.list.add(student);
    }

    @Override
    public void delete(int id) {
        int index = findIndexByid(id);
        this.list.remove(index);
    }

    @Override
    public int findIndexByid(int id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return id;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Student student) {
        int index = findIndexByid(id);
        list.set(index, student);
    }
public void Arrange(){
    for (int i = 0; i < list . size(); i++) {
        for (int j = 0; j < list.size()-1; j++) {
            if (list.get(j).getScore()>list.get(j+1).getScore()){
                Student temp = list.get(j);
                list.set(j,list.get(j+1));
                list.set(j+1,temp);

            }

        }
    }
    for (Student student : list){
        System.out.println(student);
    }
}

    @Override
    public ArrayList<Student> findAll() {
        return this.list;
    }
}
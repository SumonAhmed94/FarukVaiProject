package Students.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoService {

	private static List<Students> students = new ArrayList<>();
	static {
		students.add(new Students(1, "Sabrina", "Srarna", "Sabrina@gmail.com", "7031112222", new Date()));
		students.add(new Students(2, "Samina", "Sumi", "Samina@gmail.com", "7032223333", new Date()));
		students.add(new Students(3, "Anik", "Shen", "Anik@gmail.com", "7033334444", new Date()));
		students.add(new Students(4, "Anik", "Khandoker", "Khandoker@gmail.com", "7034445555", new Date()));
	}

	private static int studentCount = 4;

	public List<Students> findAllStudent() {
		return students;

	}

	public Students saveStudent(Students student) {
		if (student.getsId() == null) {
			student.setsId(++studentCount);
		}
		students.add(student);
		return student;
	}

	public Students findOneStudent(int sId) {
		for (Students student : students) {
			if (student.getsId() == sId) {
				return student;
			}
		}
		return null;
	}
	public Students deleteStudent(int sId) {
	Iterator<Students> iterator=students.iterator();
		while(iterator.hasNext()){
		Students student=	iterator.next();
		if(student.getsId()==sId) {
			iterator.remove();
			return student;
		}
		}
	return null;
		
	}

}

import java.util.ArrayList;//修改
import java.util.Scanner;
public class SchoolSystem {
	int big,medium,small;
	Scanner in=new Scanner(System.in);
	ArrayList<Student> array=new ArrayList<Student>();
	public void SchoolSystem(int big,int medium,int small) {
		this.big=big;
		this.small=small;
		this.medium=medium;
	}
	public boolean addStudent(int stuType) {
		for(int i=1;i<=3;i++) {
			if(stuType==1) {
				if(big!=0) {
					System.out.println("大班剩余"+big+"个名额");
					System.out.print("请输入学生姓名：");
					String name=in.next();
					System.out.print("请输入学生班级：");
					String schoolsystem=in.next();
					Student s=new Student();
					s.setName(name);
					s.setSchoolSystem(schoolsystem);
					array.add(s);
					big--;
					return true;
				}
				else {
					System.out.println("大班名额已满");
					return false;
				}
			}
			else if(stuType==2) {
				if(medium!=0) {
					System.out.println("中班剩余"+medium+"个名额");
					System.out.print("请输入学生姓名：");
					String name=in.next();
					System.out.print("请输入学生班级：");
					String schoolsystem=in.next();
					Student s=new Student();
					s.setName(name);
					s.setSchoolSystem(schoolsystem);
					array.add(s);
					medium--;
					return true;
				}
				else {
					System.out.println("中班名额已满");
					return false;
				}
			}
			else if(stuType==3) {
				if(small!=0) {
					System.out.println("小班剩余"+small+"个名额");
					System.out.print("请输入学生姓名：");
					String name=in.next();
					System.out.print("请输入学生班级：");
					String schoolsystem=in.next();
					Student s=new Student();
					s.setName(name);
					s.setSchoolSystem(schoolsystem);
					array.add(s);
					small--;
					return true;
				}
				else {
					System.out.println("小班名额已满");
					return false;
				}
			}
		}
		return false;
	}
	public void print(ArrayList<Student> a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.size();i++) {
			Student s=a.get(i);
			System.out.println(s.getName()+","+s.getSchoolSystem());
		}
	}
	public static void main(String[] args) throws Exception {
		ArrayList<Student> list=new ArrayList<Student>();
		SchoolSystem a=new SchoolSystem();
		a.SchoolSystem(10, 8, 9);
		Scanner in=new Scanner(System.in);
		System.out.print("请输入共有几个学生：");
		int i=in.nextInt();
		for(int n=0;n<i;n++) {
			int m=n+1;
			System.out.print("第"+m+"个学生，请输入要查询的班级(1：大班2：中班3：小班)");
			int j=in.nextInt();
			a.addStudent(j);
		}
        System.out.println("班级学生信息");
        list=a.array;
        a.print(list);
        
}

	public class Student{
		String name,schoolsystem;
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setSchoolSystem(String schoolsystem) {
			this.schoolsystem=schoolsystem;
		}
		public String getSchoolSystem() {
			return schoolsystem;
		}
		public void student(String name,String schoolsystem) {
			this.name =name;
			this.schoolsystem=schoolsystem;
		}
	}
public boolean delStudent(int stuType) {
		if(stuType==-1) {
			if(array1.size()!=0) {
				array1.remove(array1.size()-1);
				return true;
			}
			else
				return false;
		}
		else if(stuType==-2) {
			if(array2.size()!=0) {
				array2.remove(array2.size()-1);
				return true;
			}
			else
				return false;
		}
		else if(stuType==-3) {
			if(array3.size()!=0) {
				array3.remove(array3.size()-1);
				return true;
			}
			else
				return false;
		}
		return false;
	}
}
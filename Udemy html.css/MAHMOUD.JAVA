public class Subject {


public String name;
public int Students;
public String NameOfLecturer;
public ClassVenu addVenues;

public Subject(String argName, String argNameofLecturer, int  argStudents) 
{ name = argName; NameOfLecturer=argNameofLecturer; Students=argStudents;

}

public String toString() { return name;}}

public class ClassVenu {
  public String ClassName;
public int ClassCapacity;

public ClassVenu(int argClassCapacity, String argClassName)
{ ClassName = argClassName; ClassCapacity = argClassCapacity; }

    }

public class Days extends Hours{

public Days(Subject a, Subject b,Subject c, Subject d,Subject e, Subject  f,Subject g,Subject h, Subject j)
{int i=0;
   TimeSlot[i]=a;
    TimeSlot[i+1]=b;
     TimeSlot[i+2]=c;
      TimeSlot[i+3]=d;
       TimeSlot[i+4]=e;
        TimeSlot[i+5]=f;
         TimeSlot[i+6]=g;
          TimeSlot[i+7]=h;
           TimeSlot[i+8]=j;

   }

package fyp_small_timetable;
public class Hours {
public Subject [] TimeSlot = new Subject[9];

}

 package fyp_small_timetable;



public static void main(String[] args) {
    //creating Subjects
Subject A = new Subject("Human Computer Interaction", "Batman" , 49);
Subject B = new Subject("Artificial Intelligence", "Batman" , 95);
Subject C = new Subject("Human Computer Interaction", "Batman" ,180);
Subject D = new Subject("Human Computer Interaction", "Batman" , 20);
Subject E = new Subject("Empty", "No-One", 0);

    
ClassVenu Class1 = new ClassVenu(100,"LecturerTheater1");
ClassVenu Class2 = new ClassVenu(50,"LecturerTheater2");
ClassVenu Class3 = new ClassVenu(200,"LecturerTheater3");

Days Day1 =new Days(A, A, E, B, B, E, E, A, A);
Days Day2 =new Days(C, C, E, D, D, E, E, A, A);
Days Day3 =new Days(E, E, E, B, B, E, E, A, A);
Days Day4 =new Days(C, C, E, C, C, E, E, A, A);
Days Day5 =new Days(A, A, E, B, B, E, E, A, A);


TimeTable T1 = new TimeTable(Day1, Day2, Day3, Day4, Day5);

List<Subject> answer = T1.ShowTimetable(T1);
System.out.println(answer);


}

}



package arraydomain;

public class Studentlist {
    
    public static void main(String[] args) {
        Student s1 = new Student ("s1", "Yash");
        Student[] studentList = new Student[3];
        studentList[0]=s1;
        studentList[1]= new Student("s2","Yug");
        studentList[2]= new Student("s3","Jay");
        
    }
    
}

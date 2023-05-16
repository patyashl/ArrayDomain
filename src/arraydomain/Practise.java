
import java.util.Scanner;

/*
package arraydomain;

public class ArrayDomain {
    public static void main(String[] args) {

        char[] myLetters = new char[5];
        myLetters[0] ="Y";
        myLetters[1] ="A";
        myLetters[2] ="S";
        myLetters[3] ="H";
        myLetters[4] ="L";
        
        for (int i = 0; i<myLecture.lenth;i++)
        
        
    }
    
}
*/

public class Practise {
public static void main(String[] args){

System.out.println("Enter Word");
Scanner input = new Scanner (System.in);
String myWord = input.nextLine();
char[] myLetters = new char [myWord.length()];
for(int i=myLetters.length - 1;i >= 0;i--){
    myLetters[i] =myWord.charAt(i);
    System.out.println(myLetters[i]);
}
  }
}
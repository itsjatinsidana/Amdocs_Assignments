import java.util.*;

public class Arraylist_example {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("shivam");
        students.add("jatin");
        students.add("sahil");
        students.add("nitin");
        students.add("aditya");
        System.out.println("List of students " + students);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the index you want to remove ");
        int index = scan.nextInt();
        System.out.println(students.remove(index));

        System.out.println("updated list is " + students);
        Collections.sort(students);
        

        System.out.println("storted arraylist is " + students);
    scan.close();
    }
}

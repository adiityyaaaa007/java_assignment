// Q. Explain Collection framework with example.
// Ans: Collection framework is used to represent a group of object and java collection provide a classes and interface
// for us to be able to write code quickly and efficiently.public class collection {


import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;



public class assignment_1 {
    public static void main(String[] args){
        // Implement of Set

        Set<String> s1 = new HashSet<>();
        s1.add("Shubham");
        s1.add("sourav");
        s1.add("subhanshu");
        s1.add("golu");

        System.out.println(s1);
        System.out.println(s1.contains("subhanshu"));
        s1.remove("golu");
        System.out.println(s1);


        // Implement of List
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1);

        for(int i=0; i<l1.size(); i++){
             System.out.println(l1.get(i));
        }
        l1.remove(2);
        System.out.println(l1);

    }
}

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        HashSet<Integer>hashSet1=new HashSet<>();
        hashSet1.add(2);
        hashSet1.add(0);
        hashSet1.add(0);
        System.out.println(symmetricDifference(hashSet,hashSet1));
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        newSet.removeAll(temp);
        return newSet;
    }
}

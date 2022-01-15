import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void PresentTwoElements(int[] A,int[]B,int[]C){
        List<Integer>AA=Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer>BB=Arrays.stream(B).boxed().collect(Collectors.toList());
        List<Integer>CC=Arrays.stream(C).boxed().collect(Collectors.toList());
/*
        Set<Integer>s1= Stream.of(AA,BB).flatMap(Collection::stream).collect(Collectors.toSet());
        Set<Integer>s2= Stream.of(AA,CC).flatMap(Collection::stream).collect(Collectors.toSet());
        Set<Integer>s3= Stream.of(BB,CC).flatMap(Collection::stream).collect(Collectors.toSet());*/

        Set<Integer>s4= Stream.of(AA,BB,CC).flatMap(Collection::stream).collect(Collectors.toSet());
        List<Integer> result=s4.stream().filter(x->(AA.contains(x)&&BB.contains(x))||
                        (AA.contains(x)&&CC.contains(x))||
                        (BB.contains(x)&&CC.contains(x)))
                        .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void main(String[] args) {
	int[]A={1,3,4,6,10,999};
    int[]B={1,3,6,7,999};
    int[]C={1,3,5,8,10,3};
    PresentTwoElements(A,B,C);
    }
}

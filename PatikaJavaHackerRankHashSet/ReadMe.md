In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia).  is an example of a set, but  is not a set. Today you will learn how to use sets in java by solving this problem.<br>

You are given  pairs of strings. Two pairs  and  are identical if  and . That also implies  is not same as . After taking each pair as input, you need to print number of unique pairs you currently have.<br>

Complete the code in the editor to solve this problem.<br>

Input Format<br>

In the first line, there will be an integer  denoting number of pairs. Each of the next  lines will contain two strings seperated by a single space.<br>

Constraints:<br>

Length of each string is atmost  and will consist lower case letters only.<br>
Output Format<br>

Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.<br>

Sample Input<br>

5<br>
john tom<br>
john mary<br>
john tom<br>
mary anna<br>
mary anna<br>
Sample Output<br>

1<br>
2<br>
2<br>
3<br>
3<br>
Explanation<br>

After taking the first input, you have only one pair: (john,tom)<br>
After taking the second input, you have two pairs: (john, tom) and (john, mary)<br>
After taking the third input, you still have two unique pairs.<br>
After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)<br>
After taking the fifth input, you still have three unique pairs.<br>

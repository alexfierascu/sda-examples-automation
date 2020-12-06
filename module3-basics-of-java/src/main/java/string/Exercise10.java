package string;
/*
Create a function that will put the first argument, a character, between every word in the second argument, a string.
Examples
add("❤", "I love Tesh!") ➞ "I❤love❤Tesh!"

add("👍", "Java is a lot of fun.") ➞ "Java👍is👍a👍lot👍of👍fun."

add("#", "hello world!") ➞ "hello#world!"

add("&", "you me world") ➞ "you&me&world"
*/

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(add('c', "Alex nu stie programare"));
    }

    public static String add(char c, String str) {
        return str.replace(' ', c);
    }
}

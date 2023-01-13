package com.bridgelabz.palindrome;

public class PalinedromeNumber {
    public static void main(String[] args) {
        int num=132;
        int rev=0;
        int original=num;
while (original!=0){
    int rem=original%10;
    rev=rev*10+rem;
    original=original/10;

        }
if(num==rev){
    System.out.println(num+"is a palinedrome no");
}else {
    System.out.println(num+"is not a palinedrome no");

}

    }
}

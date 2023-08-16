package com.yuhan.test;
//   *           3 1 4
//  ***          2 3 5
// *****         1 5 6
//*******        0 7 7
// *****         1 5 6
//  ***          2 3 5
//   *           3 1 4
public class diamondTest {
    public static void main(String[] agrs){
        for(int i=1;i<=4;i++){
            int k = 1;//空格计数
            for (int j=1;j<=i+3;j++){
                if(k<=4-i){
                    System.out.print(" ");
                    k++;
                }else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        for(int i=1;i<=3;i++){
            int k = 1;
            for(int j=1;j<=7-i;j++){
                if(k<=i){
                    System.out.print(" ");
                    k++;
                }else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

}

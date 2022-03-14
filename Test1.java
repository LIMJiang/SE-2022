package test1;
import java.util.Scanner;



//找出一个整数数组中子数组之和的最大值，例如：数组[1, -2, 3, 5, -1]，返回8（因为符合要求的子数组是 [3, 5]）；
//数组[1, -2, 3, -8, 5, 1]，返回6（因为符合要求的子数组是 [5, 1]）; 
//数组[1, -2, 3,-2, 5, 1]，返回7（因为符合要求的子数组是 [3, -2, 5, 1]）。

public class Test1 { 
static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
    // TODO Auto-generated method stux

    int x;
    System.out.println("请输入数组长度：");
    x=scan.nextInt();
    int a[]=new int [x];
    System.out.println("请输入数组元素：");
    for(int i=0;i<x;i++)
    {
        a[i]=scan.nextInt();
    }
    int i,j,k;
    int max[]=new int [x];
    for(i=0;i<x;i++){
        max[i]=a[i];
        k=a[i];
        for(j=i+1;j<x;j++){
            k=k+a[j];
            if(k>max[i])
            {max[i]=k;}
        }
    }
    int m=max[0];
    for(i=1;i<x;i++)
    {
        if(max[i]>m)
        {m=max[i];}
    }
    System.out.println("所有连续子数组和的最大值为："+m);

}

}

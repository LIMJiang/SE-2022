package test1;
import java.util.Scanner;



//�ҳ�һ������������������֮�͵����ֵ�����磺����[1, -2, 3, 5, -1]������8����Ϊ����Ҫ����������� [3, 5]����
//����[1, -2, 3, -8, 5, 1]������6����Ϊ����Ҫ����������� [5, 1]��; 
//����[1, -2, 3,-2, 5, 1]������7����Ϊ����Ҫ����������� [3, -2, 5, 1]����

public class Test1 { 
static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
    // TODO Auto-generated method stux

    int x;
    System.out.println("���������鳤�ȣ�");
    x=scan.nextInt();
    int a[]=new int [x];
    System.out.println("����������Ԫ�أ�");
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
    System.out.println("��������������͵����ֵΪ��"+m);

}

}

import java.util.StringTokenizer;;

public class simple {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("my name is khan"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());

        }
    }
    
}


import java.util.StringTokenizer;;

public class simple {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("my,name,is,khan","");
        System.out.println("Next token :"+st.nextToken(","));
    }
    
}

import java.util.StringTokenizer;;

public class simple {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("dggsfsdfg sdfgsfgs gdfgh dfgh hgrsddrx"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());

        }
    }
    
}

import java.util.StringTokenizer;;

public class simple {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("hi iam coding using java language in vscode"," ");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());

        }
    }
    
}

import java.util.StringTokenizer;;

public class simple {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("hi iam coding using java language in","");
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());

        }
    }
    
}


import java.util.StringTokenizer;;

public class simple {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("hi iam coding using java language in"," ");
        System.out.println("Total no.of tokens: "+st.countTokens());

        
    }
    
}

LISTS
public class ex1 {
    public static void main(String[] args){
        int[] arr;
        arr=new int[5];

        arr[0]=10;

        arr[1]=20;
        arr[2]=30;

        arr[3]=40;
        arr[4]=50;
;
        for(int i=0;i<arr.length;i++){
            System.out.println("element at index:"+arr[i]);
        }
    }
    
}




class Student{
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}

public class ex2 {
    public static void main(String[] args){
        Student[] arr;
        arr=new Student[5];

        arr[0]=new Student(1,"aman");
        arr[1]=new Student(2,"ranesh");
        arr[2]=new Student(3,"a");
        arr[3]=new Student(4,"r");
        arr[4]=new Student(5,"man");

        for(int i=0;i<arr.length;i++){
            System.out.println("element at"+i+":"+arr[i].roll_no+" "+arr[i].name);
        }

    }
    
}

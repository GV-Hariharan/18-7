
1)APPEND
class StringBufferExample{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        sb.append("java");
        System.out.println(sb);
    }
}

2)INSERT
class StringBufferExample{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        sb.insert(1, "java");
        System.out.println(sb);
    }
}

3)REPLACE
class StringBufferExample{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}

4)DELETE
class StringBufferExample{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.delete(1,3);
        System.out.println(sb);
    }
}

5)REVERSE
class StringBufferExample{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.reverse();
        System.out.println(sb);
    }
}

6)CAPACITY
public class newstringbuffer {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("java is my favourite ");
        System.out.println(sb.capacity());
        
    }
    
}

7)ENSURE
public class newstringbuffer {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("java is my favourite ");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
    
}



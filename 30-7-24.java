
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

4)

package Laboratory1.challenge3;
public class Challenge3{
        //Reverse the StringBuffer
        public static String ReverseaString(String Start){
            StringBuffer sb= new StringBuffer(Start);
            sb.reverse();
            return sb.toString();
        }
            public static void main(String[] args){
                String st="Hola Mundo";
                System.out.println(st);
                System.out.println(ReverseaString(st));
    }
}
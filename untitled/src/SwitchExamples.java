public class SwitchExamples {
    public static void main(String[] args) {
        String s = args[0];
        char a = s.charAt(0);
        switch (a){
            case '+' :
                System.out.println("l'operazione è una somma");
                break;
            case '-' :
                System.out.println("l'operazione è una sottrazione");
                break;
            case '*' :
                System.out.println("l'operazione è una moltiplicazione");
                break;
            case '/' :
                System.out.println("l'operazione è una divisione");
                break;
            default:
                System.out.println("l'operazione non è concessa");
        }

    }
}

public class ArgsLastPrinter {
  public static void main(String[] args) {
    if(args.length==0){
        System.out.println("�Ȃ�");
    }
    else{
        System.out.println(args[args.length-1]);
    }
  }
}
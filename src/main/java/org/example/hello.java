public class hello{
    public static void main(String[] args){
        String name="venkatesh";
        if(args.length>0){
            name=args[0];
        }
        System.out.print("Hello,"+name+"!");
    }
}
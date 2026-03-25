public class CmdLineSum{
    public static void main(String[] args){
        int ans=0;
        for(String i:args){
            System.out.println(i);
            ans+=Integer.parseInt(i);
        }
        System.out.println(ans);
    }
}
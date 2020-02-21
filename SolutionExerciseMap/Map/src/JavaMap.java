import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class JavaMap {

    public static void main(String[] args) {

        Map<String, Integer> nameAndPhone = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            nameAndPhone.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try {
                int phones = nameAndPhone.get(s);
                System.out.println(s+ "=" + phones);
            }catch (NullPointerException e){
                System.out.println("Not found");
            }
        }



    }
}

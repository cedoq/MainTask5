import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter - продолжения ввода слов. хватит - конец ");
        /* String add = "";
        String build = "";
        add = br.readLine();
        boolean f = true;
        if(Objects.equals(add, "хватит")){
            f = false;
        }
        else{
            build = add;
        }
        while (f){
            add = br.readLine();
            if(!Objects.equals(add, "хватит")){
            build = build + "," + add;}
            else{
                build = build + ".";
                f = false;
                break;
            }

        }
        System.out.println(build); */
       boolean f = true;
       String add = br.readLine();
        StringBuilder build = new StringBuilder();
        if(Objects.equals(add, "хватит")){
            f = false;
        }
        else{
            build.append(add);
        }
        while(f){
            add = br.readLine();
            if(Objects.equals(add, "хватит")){
                build.append(".");
                f = false;
                break;
            }
            else{
                build.append(",").append(add);
            }

        }
        System.out.println(build);
    }


}
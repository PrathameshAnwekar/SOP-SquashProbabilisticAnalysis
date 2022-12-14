
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(
                "D:/SOP/2.txt");
        HashMap<String, Integer> mp1 = new HashMap<>();
        HashMap<String, Integer> mp2 = new HashMap<>();
        HashMap<String, Integer> mp3 = new HashMap<>();
        HashMap<String, Integer> mp4 = new HashMap<>();
        Scanner sc = new Scanner(file);
        String temp = sc.nextLine();
        String[] t = temp.split(",");
        while(sc.hasNextLine()){
//            System.out.println(t[0] + " " + t[1] + " " + t[2]);

            String val = t[1] + t[2];
//            System.out.println(val);
            if(t[0].equals("1")){
                if(!mp1.containsKey(val)) mp1.put(val, 1);
                else{
                    int x = mp1.get(val);
                    mp1.replace(val, x+1);
                }
            }
            if(t[0].equals("2")){
                if(!mp2.containsKey(val)) mp2.put(val, 1);
                else{
                    int x = mp2.get(val);
                    mp2.replace(val, x+1);
                }
            }
            if(t[0].equals("3")){
                if(!mp3.containsKey(val)) mp3.put(val, 1);
                else{
                    int x = mp3.get(val);
                    mp3.replace(val, x+1);
                }
            }
            if(t[0].equals("4")){
                if(!mp4.containsKey(val)) mp4.put(val, 1);
                else{
                    int x = mp4.get(val);
                    mp4.replace(val, x+1);
                }
            }
            temp = sc.nextLine();
            t = temp.split(",");
        }
        System.out.println("Shot distribution for region 1 is:");
        System.out.println(mp1);
        System.out.println("Shot distribution for region 2 is:");
        System.out.println(mp2);
        System.out.println("Shot distribution for region 3 is:");
        System.out.println(mp3);
        System.out.println("Shot distribution for region 4 is:");
        System.out.println(mp4);
    }
}
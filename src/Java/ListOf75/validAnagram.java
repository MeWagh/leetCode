

import java.util.HashMap;

import javax.swing.text.AbstractDocument.Content;

public class validAnagram {
    public static void main(String args[])
    {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));

    }
    public static boolean isAnagram(String s1,String s2) {
        
       if(s1.length() != s2.length())
        return false;


       HashMap<Character,Integer> map = new HashMap();
       

       for(int i =0;i<s1.length();i++)
       {
           if(map.containsKey(s1.charAt(i)))
           {
               int count =  map.get(s1.charAt(i));
               map.put(s1.charAt(i),++count);
           }
           else
           {
                map.put(s1.charAt(i),1);
           }
           if(map.containsKey(s2.charAt(i)))
            {
                int count =  map.get(s2.charAt(i));
                map.put(s2.charAt(i),--count);
            }
            else
                map.put(s2.charAt(i),-1);
       }
       for(Character key : map.keySet())
       {
           if(map.get(key) != 0)
                return false;
       }
       return true;
     
    }
}

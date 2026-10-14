package package1;

public class Test {

       static String longestCommonPrefix(String[] strs) {
            String prefix=strs[0];

// i=1---> last string in the array
            for(int i=1;i<strs.length;i++)
            {
                while(strs[i].startsWith(prefix)){
                    prefix.substring(0, prefix.length()-1); //flow

                    if(prefix.isEmpty())
                    {
                        return "";
                    }
                }
            }
            return prefix;
        }


    public static void main(String[] args) {
           String strs[]={"flower","flow","flight"};
       String res= longestCommonPrefix(strs);

        System.out.println(res);
    }
}

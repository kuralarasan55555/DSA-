package Array;

import java.util.ArrayList;


//BACKTRACKING APPROACH

public class Permutation {
    public static int permute(String s){
        ArrayList<ArrayList<Character>> result=new ArrayList<>();
        permutation(new boolean[s.length()],s,new ArrayList<Character>(),result);
      
        return result.size();
    }
    public static void permutation(boolean[] nums,String s,ArrayList<Character> perms,ArrayList<ArrayList<Character>> result){
              if (nums.length==perms.size()) {
                System.out.println(perms);
                result.add(perms);   
                return;
              }
              for (int i = 0; i < s.length(); i++) {
                if(nums[i])
                    continue;
                perms.add(s.charAt(i));
                nums[i]=true;
                System.out.println(perms);
                permutation(nums, s, perms, result);
                perms.remove(perms.size()-1);
                nums[i]=false;
              }
    }
    public static void main(String[] args) {
        String s="kural";
        System.out.println(permute(s));
    }
}

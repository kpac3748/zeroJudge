package leetCode_easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character

 while preserving the order of characters. No two characters may map 
 
 to the same character, but a character may map to itself
 
 
 	Example 1:
	
	Input: s = "egg", t = "add"
	Output: true
	Example 2:
	
	Input: s = "foo", t = "bar"
	Output: false
	Example 3:
	
	Input: s = "paper", t = "title"
	Output: true
 * 
 * */
public class Q205_IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
//		char[] sm = new char[256];
//		System.out.println(sm['g']);
	}

	public static boolean isIsomorphic(String s, String t) {
//		boolean result = false;
//		
//		char[] sTotalArray = s.toCharArray();
//		char[] tTotalArray = t.toCharArray();
//		Set<Character> sSet = new LinkedHashSet<Character>();
//		Set<Character> tSet = new LinkedHashSet<Character>();
//		
//		Map<Character, Character> sMap = new HashMap<Character,Character>();
//		
//		for(int i = 0; i <sTotalArray.length; i++) {
//			sSet.add(sTotalArray[i]);
//		}
//		
//		for(int i = 0; i <tTotalArray.length; i++) {
//			tSet.add(tTotalArray[i]);
//		}
//		
//		Character[] sSetArray = new Character[sSet.size()];
//		Character[] tSetArray = new Character[tSet.size()];
//		
//		sSet.toArray(sSetArray);
//		tSet.toArray(tSetArray);
//		
//		if(sSet.size() == tSet.size()) {
//			for(int i = 0; i < sSet.size(); i++) {
//				sMap.put(sSetArray[i], tSetArray[i]);
//			}
//		}
//		
//		System.out.println("sMap = " + sMap);
//		System.out.println("s before = " + s);
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i < s.length(); i++) {
//			char charTemp = s.charAt(i);
//			System.out.println("s ing = " + s);
//			if(sMap.get(charTemp) !=null) {
//				sb.append(sMap.get(charTemp));
//			}
//		}
//		
//		System.out.println("sb after = " + sb.toString());
//		
//		if(sb.toString().equals(t))
//			result = true;
//		
//		return result;
		
		/*高手版本*/
		char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int n = sArray.length;

        char[] sm = new char[256];
        char[] tm = new char[256];
        
        for (int i = 0; i < n; i++) {
            char sc = sArray[i];
            char tc = tArray[i];
            
            System.out.println("sc = " + sc);
            System.out.println("sm[sc] = " + sm[sc]);
            System.out.println("sm[sc] ==0 " + (sm[sc] == 0));
            System.out.println("tc = " + tc);
            System.out.println("tm[tc] = " + tm[tc]);
            System.out.println("tm[tc] ==0 " + (tm[tc] == 0));
            System.out.println("==============");
            
            if (sm[sc] == 0 && tm[tc] == 0) {
                sm[sc] = tc;
                tm[tc] = sc;
                
                System.out.println("sm[sc] == 0 : " + sm[sc]);
                System.out.println("tm[tc] ==0 : " + tm[tc]);
                System.out.println("******************");
            } else {
                if (sm[sc] != tc || tm[tc] != sc) {
                    return false;
                }
            }
        }
        return true;
	}

}

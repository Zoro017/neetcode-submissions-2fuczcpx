class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()

        s1 = strs[0]
        s2 = strs[len(strs) -1]

        i = 0

        while i < len(s1) and i < len(s2):
            if s1[i] == s2[i]:
                i+=1
            else:
                break
        
        return s1[:i]
        
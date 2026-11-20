class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}

        for s in strs:
            s1 = ''.join(sorted(s))
            if s1 not in map:
                map[s1] = []
            map[s1].append(s)
        return list(map.values())
        
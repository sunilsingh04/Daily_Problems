# Last updated: 8/1/2025, 6:44:34 AM
class Solution:
    def appealSum(self, s: str) -> int:
        last = {}
        res = 0
        for i,c in enumerate(s):
            last[c] = i + 1
            res += sum(last.values())
        return res
                

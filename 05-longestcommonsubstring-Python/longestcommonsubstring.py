# longestCommonSubstring(s1, s2)[20 pts]
# Write the function, longestCommonSubstring(s1, s2), that takes two possibly-empty strings and returns the longest 
# string that occurs in both strings (and returns the empty string if either string is empty). For example:
# longestCommonSubstring("abcdef", "abqrcdest") returns "cde"
# longestCommonSubstring("abcdef", "ghi") returns "" (the empty string)
# If there are two or more longest common substrings, return the lexicographically smaller one (ie, just use "<" to 
# compare the strings). So, for example:
# longestCommonSubstring("abcABC", "zzabZZAB") returns "AB" and not "ab"

def longestcommonsubstring(s1, s2):
    # Yourcode goes here
    if len(s1) == 0 and len(s2) == 0:
        return ""
    if len(s1) > len(s2):
        short = s2
        longs = s1
    else:
        short = s1
        longs = s2
    result = []
    res = ""
    for i in range(1, len(short)):
        res = res + short[i]
        if res in longs:
            result.append(res)
        else:
            res = short[i]
    if len(result) == 0:
        return ""
    else:
        return max(result, key = len)

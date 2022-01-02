import re
from collections import Counter
def solution(s):
    dic = Counter(re.findall('\d+',s))
    return list(map(int,dict(sorted(dic.items(), key = lambda x:x[1], reverse = True))))

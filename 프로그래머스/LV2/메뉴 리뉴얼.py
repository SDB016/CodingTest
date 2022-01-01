from itertools import combinations
def solution(orders, course):
    answer = []
    for i in course:
        cnt = {}
        for o in orders:
            com = combinations(sorted(list(o)), i)
            for n in com:
                str_o = ''.join(n)
                if str_o in cnt:
                    cnt[str_o] += 1
                else:
                    cnt[str_o] = 1
        for key in cnt.keys():
            if max(cnt.values()) > 1 and cnt[key] == max(cnt.values()):
                answer.append(str(key))
    return sorted(answer)

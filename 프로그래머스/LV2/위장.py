def solution(clothes):
    answer = 1
    dic = dict()
    for i in clothes:
        if i[1] in dic.keys():
            dic[i[1]] += 1
        else:
            dic[i[1]] = 2
    for i in list(dic.values()):
        answer *= i
    return answer - 1

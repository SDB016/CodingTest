import math

def solution(left, right):
    answer = 0
    for num in range(left, right + 1):
        arr = set()
        for i in range(1, math.floor(num ** 0.5)+1):
            if (num % i == 0):
                arr.add(i)
                arr.add(num//i)
        if len(arr) % 2 == 0:
            answer += num
        else:
            answer -= num
    return answer

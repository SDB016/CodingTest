def solution(n,a,b):
    answer = 0
    while True:
        if a==b:
            return answer
        a = a%2 + a//2
        b = b%2 + b//2
        answer += 1

""" 다른 풀이
def solution(n,a,b):
    return ((a-1)^(b-1)).bit_length()
    """

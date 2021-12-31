def solution(n):
    st = ''
    while n:
        st += str(n % 3)
        n //= 3
    return int(st, 3) # int함수 기능(밑): int('11',2) == 3
        

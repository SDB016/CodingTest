def solution(brown, yellow):
    answer = []
    w, h = 0,0
    for i in range(1, brown + yellow):
        if (((brown+yellow) / i) - 2) * (i-2) == yellow:
            w = i
    h = (brown + yellow) / w
    return [w, h]
    

def solution(citations):
    citations.sort(reverse=True)
    answer = 0
    for idx, c in enumerate(citations):
        if idx+1 <= c:
            answer = idx + 1
        else: break
    return answer

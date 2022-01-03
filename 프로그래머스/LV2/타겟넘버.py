from collections import deque
def solution(numbers, target):
    answer = 0
    def dfs(num, level):
        nonlocal answer
        if level == len(numbers):
            if num == target:
                answer += 1
            return
        dfs(num + numbers[level], level + 1)
        dfs(num - numbers[level], level + 1)
    def bfs():
        nonlocal answer
        q = deque()
        q.append([numbers[0], 1])
        q.append([-numbers[0], 1])
        while q:
            num, level = q.popleft()
            if level == len(numbers):
                if num == target:
                    answer += 1
            else:
                q.append([num + numbers[level], level + 1])
                q.append([num - numbers[level], level + 1])
    #dfs(numbers[0], 1)
    #dfs(-numbers[0], 1)
    bfs()
    return answer

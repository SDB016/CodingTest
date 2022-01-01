from collections import deque
def solution(priorities, location):
    priorities = deque(priorities)
    answer = 0
    target = deque([False for _ in range(len(priorities))])
    target[location] = True       
    
    while len(priorities) > 0:
        m = max(priorities)
        left = priorities.popleft()
        if left < m:
            priorities.append(left)
            target.append(target.popleft())
        else:
            answer += 1
            if target.popleft():
                return answer

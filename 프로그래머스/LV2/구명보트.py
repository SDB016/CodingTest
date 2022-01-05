from collections import deque
def solution(people, limit):
    answer = 0
    people = deque(sorted(people, reverse=True))
    while people:
        front = people.popleft()
        if front <= limit//2:
            answer += len(people) // 2 + 1
            break
        else:
            answer += 1
            if people and front + people[-1] <= limit:
                people.pop()
    return answer

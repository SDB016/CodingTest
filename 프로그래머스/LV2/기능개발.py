def solution(progresses, speeds):
    answer = []
    day = []
    max_num = 0
    for i in range(len(progresses)):
        if (100 - progresses[i]) % speeds[i] == 0:
            day.append((100-progresses[i]) // speeds[i])
        else:
            day.append((100 - progresses[i]) // speeds[i] + 1)
    for d in day:
        if max_num < d:
            max_num = d
            answer.append(1)
        else:
            answer[-1] += 1
    return answer

def solution(answers):
    answer = []
    pattern = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]]
    grade = [0, 0, 0]
    for i in range(3):
        for idx, a in enumerate(answers):
            if pattern[i][idx%len(pattern[i])] == a:
                grade[i] += 1
    for i in range(3):
        if grade[i] == max(grade):
            answer.append(i+1)
    return answer

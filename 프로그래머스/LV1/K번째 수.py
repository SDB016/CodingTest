def solution(array, commands):
    answer = []
    for idx, com in enumerate(commands):
        if com[0] == com[1]:
            answer.append(array[com[0]-1])
        else:
            temp = array[com[0]-1: com[1]]
            temp.sort()
            answer.append(temp[com[2]-1])
    return answer

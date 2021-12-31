def solution(numbers):
    answer = set()
    for i in range(len(numbers) - 1):
        for j in range(i + 1, len(numbers)):
            answer.add(numbers[i] + numbers[j])
    return list(sorted(answer)) # list(answer) 은 hashSet 이기 때문에 정렬 보장 x

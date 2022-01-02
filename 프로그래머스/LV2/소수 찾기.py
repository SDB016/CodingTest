from itertools import permutations
def solution(numbers):
    numbers = list(numbers)
    per = set()
    for i in range(len(numbers)):
        for j in permutations(numbers, i + 1):
            per_num = int(''.join(j))
            if per_num not in [0,1]: per.add(per_num)
            for n in range(2, int(per_num ** 0.5) + 1):
                if per_num % n == 0:
                    per.remove(per_num)
                    break
    return len(per)

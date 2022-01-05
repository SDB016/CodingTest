from itertools import permutations
def solution(expression):
    answer = 0
    oper = list(permutations(['+','-','*'], 3))
    exlist = split(expression)
    for o in oper:
        temp = list(exlist)
        for i in o:
            while i in temp:
                idx = temp.index(i)
                num1 = temp.pop(idx - 1)
                temp.pop(idx-1)
                num2 = temp.pop(idx-1)
                temp.insert(idx-1, cal(num1, num2, i))
        answer = max(int(answer), abs(int(temp[0])))
    return answer
                

def split(expression):
    tmp_st = ""
    all_arr = []
    maxnum = 0
    for i in expression:
        if i.isdigit():
            tmp_st += i
        else:
            all_arr.append(tmp_st)
            all_arr.append(i)
            tmp_st = ""
    all_arr.append(tmp_st)
    return all_arr

def cal(num1, num2, exp):
    if exp == '+':
        return str(int(num1) + int(num2))
    elif exp == '*':
        return str(int(num1) * int(num2))
    elif exp == '-':
        return str(int(num1) - int(num2))

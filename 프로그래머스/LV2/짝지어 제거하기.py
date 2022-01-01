def solution(s):
    stack = []
    for st in s:
        if len(stack) != 0 and stack[-1] == st: stack.pop()
        else: stack.append(st)
    if len(stack) == 0: return 1
    else: return 0

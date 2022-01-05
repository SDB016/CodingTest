def solution(str1, str2):
    answer = 0
    arr1 = make_arr(str1.upper())
    arr2 = make_arr(str2.upper())
    if len(arr1) + len(arr2) == 0: answer = 1
    elif len(arr1) == 0 or len(arr2) == 0: return 0
    else:
        if len(arr1) < len(arr2):
            arr1, arr2 = arr2, arr1
            
        a_result = arr1.copy()
        a_temp = arr1.copy()
        for i in arr2:
            a_result.append(i) if i not in a_temp else a_temp.remove(i)
        
        b_result = 0
        for i in arr2:
            if i in arr1:
                arr1.remove(i)
                b_result += 1
                
        answer = float(b_result) / float(len(a_result))
    return int(65536 * answer)

def make_arr(st):
    arr = []
    for i in range(len(st)-1):
        if st[i].isalpha() and st[i+1].isalpha():
            arr.append(st[i]+st[i+1])
    return arr
            
    

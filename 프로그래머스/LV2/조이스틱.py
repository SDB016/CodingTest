def solution(name):
    answer = 0
    name = list(name)
    idx = 0
    while name != ['A'] * len(name):
        if name[idx] != 'A':
            name, cnt = change_alpha(name, idx)
            answer += cnt
        else:
            left_idx, right_idx = idx, idx
            while name[left_idx] == 'A' and name[right_idx] == 'A':
                left_idx -= 1
                right_idx += 1
            if name[right_idx] != 'A':
                answer += right_idx - idx
                idx = right_idx
            else:
                answer += idx - left_idx
                idx = left_idx
    return answer

def change_alpha(string, idx):
    min_cnt = min(ord(string[idx]) - ord('A'), ord('Z') - ord(string[idx]) + 1)
    string[idx] = 'A'
    return string, min_cnt

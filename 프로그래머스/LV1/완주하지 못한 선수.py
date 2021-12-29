def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    for idx, person in enumerate(completion):
        if person != participant[idx]:
            return participant[idx]
    return participant[-1]

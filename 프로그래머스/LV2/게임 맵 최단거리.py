def solution(maps):
    dx = [1,0,-1,0]
    dy = [0,1,0,-1]
    h, w = len(maps), len(maps[0])
    cnt = [[0 for _ in range(w)] for _ in range(h)]
    q = [(0,0)]
    cnt[0][0] = 1
    while q:
        y, x = q.pop(0)
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if 0<=nx<w and 0<=ny<h and maps[ny][nx] == 1:
                maps[ny][nx] = 0
                cnt[ny][nx] = cnt[y][x] + 1
                q.append((ny,nx))
    if cnt[h-1][w-1] == 0:
        return -1
    else:
        return cnt[h-1][w-1]

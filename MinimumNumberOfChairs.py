def minChairs(S, E):
    tuples = list(zip(S, E))
    tuples = sorted(tuples)
    cur = 0
    maxChairs = cur
    time = [0] * 10
    for arrive, leave in tuples:
        cur = cur - time[arrive]
        time[arrive] = 0;
        time[leave] = time[leave] + 1
        cur = cur + 1
        maxChairs = max(maxChairs, cur)
    maxChairs = max(maxChairs, cur)
    return maxChairs
    

S = [1, 2, 6, 5, 3]
E = [5, 5, 7, 6, 8]
print(minChairs(S, E))

def func(nums, target):
    target -= 30
    map = {}
    ans = [-1, -1]
    maximum = -1
    for i in range(len(nums)):
        if nums[i] not in map:
            map[target - nums[i]] = i
        else:
            if nums[i] > maximum or target - nums[i] > maximum:
                ans[0] = map[nums[i]]
                ans[1] = i
                maximum = max(nums[i], target - nums[i])

    if ans != [-1, -1]:
        return ans
    else:
        return []

print(func([20, 50, 40, 25, 30, 10], 90))
# Medium 442
# no buffer, O(1) space
def find_duplicates(nums):
    res = []
    for i in range(len(nums)):
        index = abs(nums[i]) - 1
        if nums[index] < 0:
            res.append(index + 1)
        else:
            nums[index] *= -1
    return res

# has buffer
def find_duplicates2(nums):
    seen = set()
    res = []

    for num in nums:
        if num in seen:
            res.append(num)
        else:
            seen.add(num)
    return res

nums = [4,3,2,7,8,2,3,1]
print(find_duplicates(nums))

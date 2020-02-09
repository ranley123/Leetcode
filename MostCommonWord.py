import re
    paragraph = paragraph.lower()
    for c in paragraph:
        s

    map = {}
    for word in words:
        if word in banned:
            continue
        if word in map:
            map[word] += 1
        else:
            map[word] = 1
    sorted_map = {k: v for k, v in sorted(map.items(), reverse = True, key=lambda item: item[1])}
    return list(sorted_map.keys())[0]


paragraph = "Bob. hIt, baLl"

banned = ["bob", "hit"]
print(func(paragraph, banned))
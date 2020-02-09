"""
 * @id 973
 * @author ranley
 * @level middle
 * @runtime 552ms faster than 91.38%
"""
def kClosest(self, points, K):
        """
        :type points: List[List[int]]
        :type K: int
        :rtype: List[List[int]]
        """
        points.sort(key = lambda P: P[0] ** 2 + P[1] ** 2)
        return points[0: K];

class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        if len(mat) * len(mat[0]) != r*c: 
            return mat
        result = []
        tempRow = []
        i = 0
        for row in mat:
            for element in row:
                tempRow.append(element)
                i+=1
                if i == c:
                    i=0
                    result.append(tempRow)
                    tempRow = []
        return result
        
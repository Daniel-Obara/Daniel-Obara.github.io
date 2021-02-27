n = int(input("Enter the number of students: "))
i=0
mScoreOne = 101
mScoreTwo = 101
mNameOne = ""
mNameTwo = ""

while i < n:
    print("Please enter student", i+1, "name:")
    nI = str(input())
    print("Please enter student", i+1, "score:")
    sI = int(input())

    if(sI < mScoreOne):
        mNameTwo = mNameOne
        mNameOne = nI

        mScoreTwo = mScoreOne
        mScoreOne = sI

    elif(sI < mScoreTwo):
        mScoreTwo = sI
        mNameTwo = nI

    i += 1

print("2nd lowest student is", mNameTwo, "with score", mScoreTwo)

        

import KNN
from numpy import array
import matplotlib
import matplotlib.pyplot as plt         #좌표를 비주얼로 표시해주는 모듈

#group, labels = KNN.file2matrix('movie.txt')
#group, labels = KNN.createDataSet()
#print(KNN.classify0([1,809000],group,labels,3))

group, labels = KNN.file2matrix('movie.txt')
normMat, ranges, minVals = KNN.autoNorm(group)
m2017 = [[935,16131607737],[576,2373916621],[1166,2105943900],[14,2097000],[20,845000],\
        [976,63734551526],[1501,18266747200],[1019,19535448687],[1310,43484355735],[767,362048400]]
for i in m2017:
    print(KNN.classify0(i,normMat,labels,3))

labelKeys = []
for i in labels :
    if i == '드라마' :
        labelKeys.append(1)
    else:
        labelKeys.append(2)
fig = plt.figure()                 # 피규어 생성         
ax = fig.add_subplot(111)           # 그래프 사이즈?, axes(도형 클래스) 리턴, 
ax.scatter(group[:, 0], group[:, 1],15*array(labelKeys),array(labelKeys))  #Make a scatter plot of x vs y, A[1] = A[1,:], [:,1] = 모든 열의 1행을 슬라이싱
plt.show()
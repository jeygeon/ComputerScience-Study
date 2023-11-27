# Array vs LinkedList
## 1. Array
배열은 메모리상에 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스를 부여해 놓은 자료 구조를 의미한다.

예를 들어 A1 ~ A4까지의 데이터를 배열로 만들면 아래 그림과 같이 생성된다.
![array](./image/array.png)

컴퓨터는 메모리에 저장된 위의 배열의 위치를 알고있기 때문에 내가 A3를 조회를하면, A1 $\rightarrow$ A2 $\rightarrow$ A3 이렇게 찾아가지 않고 3번째 인덱스를 조회하여 바로 데이터 확인이 가능하다. 그래서 배열에서 조회를 할 때의 시간 복잡도는 O(1)과 같다.

배열의 경우 최초 생성했을 때의 고정된 크기의 데이터로 생성되기 때문에 한번 생성된 배열의 삽입과 삭제가 불가능하다. 그래서 삽입과 삭제를 하기 위해서는 arrayList를 생성하거나, 새로운 배열을 만들어서 할당해서 마치 배열에 값이 추가된 것 처럼 소스코드로 구현해야 한다.

이러한 면에서 배열은 데이터의 삽입과 삭제가 빈번할 때 사용은 적합하지 않다.

## 2. LinkedList
연결리스트란 각 노드가 데이터와 포인터를 가지고 메모리 상에 분산되어 존재하며 존재하게 된다. 각 노드에 포함된 포인터는 다음 노드를 연결하게 된다.

그림으로는 아래와 같이 표현할 수 있다.

![LinkedList](./image/array%20vs%20LinkedList.png)

연결리스트는 **단일 연결 리스트**, **이중 연결 리스트**, **원형 연결 리스트** 이렇게 3가지 종류로 구분 할 수 있다.



<br/>
<br/>
<br/>

## _References_
- https://inpa.tistory.com/entry/JCF-%F0%9F%A7%B1-ArrayList-vs-LinkedList-%ED%8A%B9%EC%A7%95-%EC%84%B1%EB%8A%A5-%EB%B9%84%EA%B5%90
- https://myung-ho.tistory.com/m/113
- https://ko.wikipedia.org/wiki/%EC%97%B0%EA%B2%B0_%EB%A6%AC%EC%8A%A4%ED%8A%B8
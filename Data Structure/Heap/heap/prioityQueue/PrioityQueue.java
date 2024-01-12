package prioityQueue;

import java.util.ArrayList;
import java.util.List;

public class PrioityQueue<E> {

	private List<Student> heap;

	public String toString() {

		return this.heap.toString();
	}

	public PrioityQueue() {
		this.heap = new ArrayList<Student>();
		this.heap.add(null);
		System.out.println("Student PrioityQueue 생성 완료");
	}

	public void add(Student data) {

		this.heap.add(data);
		System.out.println("Student PrioityQueue 추가 완료 > " + data.toString());

		// 새로 추가된 데이터의 위치 정보
		int index = this.heap.size() - 1;

		// 우선순위 큐에 최초 데이터 추가할 때는 추가하고 종료
		if (index == 1) {
			return;
		}

		// 새로 추가된 데이터의 부모 데이터 위치 정보
		int parentIndex = index / 2;

		Student parentData = this.heap.get(parentIndex);
		int result;
		while (index >= 1) {
			result = parentData.compareTo(data);
			if (result <=0) {
				break;
			}

			if (result > 0) {
				this.heap.set(parentIndex, data);
				this.heap.set(index, parentData);
				index = index / 2;
				parentData = this.heap.get(index);
			}
			System.out.println("Student PrioityQueue 정렬 완료 > " + this.heap);
		}
	}

	public Student poll() {

		// 반환 대상 데이터 저장
		Student returnData = this.heap.get(1);
		if (this.heap.size() == 1 || returnData == null) {
			return null;
		}

		// 힙에서 마지막으로 추가된 데이터를 root 자리에 둔다
		Student lastAddData = this.heap.get(this.heap.size() - 1);
		this.heap.set(1, lastAddData);

		// 가장 마지막에 추가된 노드 자리에 데이터 삭제
		this.heap.remove(this.heap.size() - 1);

		// root자리에 둔 데이터를 자식 노드와 비교하면서 재정렬한다
		Student targetData;
		Student leftChildData;
		Student rightChildData;
		Student highPriorityData = null;
		boolean isLeftChildHigh = true;
		int index = 1;
		while (index < this.heap.size() - 1) {
			targetData = this.heap.get(index);
			
			// 우선순위를 비교할 왼쪽 자식 노드가 존재하지 않으면 while문 종료
			if (index * 2 > this.heap.size() - 1) {
				break;
			}
			leftChildData = this.heap.get(index * 2);
			
			// 우선순위를 비교할 오른쪽 자식 노드가 존재하지 않으면 왼쪽 자식 노드랑만 우선순위를 비교한다.
			if (index * 2 + 1 > this.heap.size() - 1) {
				highPriorityData = leftChildData;
				isLeftChildHigh = true;
			} else {
				rightChildData = this.heap.get(index * 2 + 1);

				// leftChildData와 rightChildData를 비교하여 더 높은 우선순위의 childData와 targetData를 비교
				// 우선순위가 같거나 왼쪽 자식노드의 우선순위가 높을 경우
				if (leftChildData.compareTo(rightChildData) <= 0) {
					highPriorityData = leftChildData;
					isLeftChildHigh = true;
				}

				// 오른쪽 자식노드의 우선순위가 높을 경우
				if (leftChildData.compareTo(rightChildData) > 0) {
					highPriorityData = rightChildData;
					isLeftChildHigh = false;
				}
			}

			// targetData가 highPriorityData보다 우선순위가 같거나 높으면 while문 종료
			if (targetData.compareTo(highPriorityData) <= 0) {
				break;
			}
			
			// leftChildData의 우선순위가 더 높을 경우 targetData와 leftChildData 교환
			if (isLeftChildHigh) {
				this.heap.set(index, highPriorityData);
				this.heap.set(index * 2, targetData);
				index = index * 2;
			}
			
			// rightChildData의 우선순위가 더 높을 경우 targetData와 rightChildData 교환
			if (!isLeftChildHigh) {
				this.heap.set(index, highPriorityData);
				this.heap.set(index * 2 + 1, targetData);
				index = index * 2 + 1;
			}
		}
		return returnData;
	}

}

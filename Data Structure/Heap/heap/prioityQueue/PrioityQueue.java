package prioityQueue;

import java.util.ArrayList;
import java.util.List;

public class PrioityQueue<E> {

	private List<Student> heap;

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
			if (result > 0) {
				this.heap.set(parentIndex, data);
				this.heap.set(index, parentData);
				index = index / 2;
				parentData = this.heap.get(index);
			}
		}
	}

}

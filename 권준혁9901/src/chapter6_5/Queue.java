package chapter6_5;

/**
 * 큐(Queue)
 * FIFO(First In First Out)
 * 데이터가 처음 들어간 것이 가장 먼저 나오는 자료 구조
 * 데이터의 추가 -> enQueue
 * 데이터의 삭제 -> deQueue
 */
public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getQueueSize();
}

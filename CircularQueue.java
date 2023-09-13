package adt.queue;

public class CircularQueue<T> implements Queue<T> {

	private T[] array;
	private int tail;
	private int head;
	private int elements;

	public CircularQueue(int size) {
		this.array = (T[]) new Object[size];
		this.head = -1;
		this.tail = -1;
		this.elements = 0;
	}

	@Override
	public void enqueue(T element) throws QueueOverflowException {
		if (this.isFull()) {
			throw new QueueOverflowException();

		}
		if (element != null) {

			if (this.isEmpty()) {
				this.head = 0;
				this.tail = 0;
				this.array[0] = element;
			} else {
				this.tail = (this.tail + 1) % this.array.length;
				this.array[this.tail] = element;
			}

			this.elements++;
		}

	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException();
    }

    T dequeued = array[head];
	if (head == tail) {
        head = -1;
        tail = -1;
    } else {
        head = (head + 1) % array.length;
    }
    elements--;

    return dequeued;
}


	@Override
	public T head() {
		if (!isEmpty()) {
			return array[head];
    }
    return null;
}


	@Override
	public boolean isEmpty() {
		return elements == 0;
	}

	@Override
	public boolean isFull() {
		return elements == array.length;
	}

}
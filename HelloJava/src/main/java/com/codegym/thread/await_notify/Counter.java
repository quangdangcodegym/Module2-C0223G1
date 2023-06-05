package com.codegym.thread.await_notify;

/**
public class Counter {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public synchronized void decrement() {
        count--;
    }
    public int getCount() {
        return count;
    }
}
    Trong ví dụ này, khi một thread gọi phương thức increment() hoặc decrement(),
 nó sẽ giữ khóa của đối tượng Counter và không cho phép các thread khác gọi phương thức đó
 trong khi nó đang thực thi. Điều này đảm bảo rằng chỉ có một thread được phép cập nhật biến count
 một cách an toàn và tránh các tình trạng đua nhau (race condition).
 Nếu chúng ta muốn sử dụng phương thức wait() và notify() để đợi và báo thức các thread khác,
 chúng ta cần gọi các phương thức này từ một phần mã được đồng bộ hóa với đối tượng Counter.
 Ví dụ, chúng ta có thể thêm phương thức waitForZero() và notifyNonZero()
 để đợi đến khi giá trị của count bằng 0 và thông báo khi giá trị khác 0:
 **/
public class Counter {
    private int count = 3;

    public synchronized void increment() {
        count++;
        notifyNonZero();
    }

    public synchronized void decrement() {
        count--;
        waitForZero();
    }

    public synchronized int getCount() {
        return count;
    }

    public synchronized void waitForZero() {
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                // Handle the exception
            }
        }
    }

    public synchronized void notifyNonZero() {
        if (count != 0) {
            notify();
        }
    }


}

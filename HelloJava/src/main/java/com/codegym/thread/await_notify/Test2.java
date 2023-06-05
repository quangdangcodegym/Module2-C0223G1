package com.codegym.thread.await_notify;

public class Test2 {
    /**
     Để kiểm tra việc sử dụng phương thức wait() và notify() trong ví dụ trên,
     chúng ta có thể tạo một ví dụ sử dụng các luồng (threads) riêng biệt để tăng và giảm giá trị của count
     và sử dụng wait() và notify() để đồng bộ hóa chúng.
     Dưới đây là một ví dụ đơn giản với hai luồng (thread): một luồng tăng count và một luồng giảm count.
     Luồng tăng sẽ gọi phương thức waitForZero() để đợi cho đến khi count bằng 0 trước khi tăng giá trị,
     trong khi luồng giảm sẽ gọi phương thức notifyNonZero() để thông báo cho luồng tăng khi count khác 0.

     Trong ví dụ này, chúng ta tạo hai luồng (incrementThread và decrementThread), mỗi luồng sẽ thực hiện
     các hành động tăng và giảm count. Để đảm bảo tính nhất quán, luồng tăng sử dụng waitForZero()
     để đợi cho đến khi count bằng 0 trước khi tăng giá trị, và luồng giảm sử dụng notifyNonZero()
     để thông báo cho luồng tăng khi count khác 0.

     Cuối cùng, chúng ta gọi start() để bắt đầu thực thi các luồng và join() để đợi cho đến khi
     các luồng hoàn thành. Kết quả cuối cùng sẽ được in ra màn hình.
     */
        public static void main(String[] args) {
            Counter counter = new Counter();

            Thread incrementThread = new Thread(() -> {
                counter.waitForZero();
                counter.increment();
            });

            Thread decrementThread = new Thread(() -> {
                counter.decrement();
                counter.notifyNonZero();
            });

            incrementThread.start();
            decrementThread.start();

            try {
                incrementThread.join();
                decrementThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Final Count: " + counter.getCount());
    }
}

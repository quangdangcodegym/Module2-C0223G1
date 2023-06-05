package com.codegym.thread.await_notify;

public class Test1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Tạo một thread để tăng giá trị count
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                System.out.println("Incremented count: " + counter.getCount());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Tạo một thread để giảm giá trị count
        Thread decrementThread = new Thread(() -> {
            counter.waitForZero();
            System.out.println("Count is zero. Decrementing...");

            for (int i = 0; i < 5; i++) {
                counter.decrement();
                System.out.println("Decremented count: " + counter.getCount());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        decrementThread.start(); // Bắt đầu thread decrement
        incrementThread.start(); // Bắt đầu thread increment

        /**
         Trong ví dụ này, chúng ta có hai thread đồng thời, một thread tăng giá trị của count và
         một thread giảm giá trị. Tuy nhiên, thread giảm giá trị chỉ được phép chạy khi count đạt giá trị 0
         hoặc ít hơn (bằng cách sử dụng phương thức waitForZero()).
         Khi chúng ta chạy ví dụ này, các thread sẽ tương tác với nhau. Thread tăng giá trị sẽ
         thực hiện việc tăng count và gửi thông báo bằng phương thức notifyNonZero() khi count không bằng 0.
         Trong khi đó, thread giảm giá trị sẽ chờ đợi thông báo từ thread tăng giá trị thông qua
         phương thức waitForZero(). Khi count bằng 0, thread giảm giá trị được báo thức và tiếp tục giảm count.

         Ví dụ trên chỉ là một minh họa đơn giản về cách sử dụng wait() và notify() trong môi trường đa luồng.
         */
    }
}

public class threadAbout {
    /**
     * 本代码写的是关于多线程的一些知识
     * 1,线程状态转换
     * 新建（New）
     * 创建后尚未启动。
     *
     * 可运行（Runnable）
     * 可能正在运行，也可能正在等待 CPU 时间片。
     *
     * 包含了操作系统线程状态中的 Running 和 Ready。
     *
     * 阻塞（Blocking）
     * 等待获取一个排它锁，如果其线程释放了锁就会结束此状态。
     *
     * 无限期等待（Waiting）
     * 等待其它线程显式地唤醒，否则不会被分配 CPU 时间片。
     * 进入方法	退出方法
     * 没有设置 Timeout 参数的 Object.wait() 方法	Object.notify() / Object.notifyAll()
     * 没有设置 Timeout 参数的 Thread.join() 方法	被调用的线程执行完毕
     * LockSupport.park() 方法	LockSupport.unpark(Thread)
     *
     * 无限等待（Timed Waiting）
     * 无限等待其他线程的唤醒，在一定的时间后被i系统自动的唤醒
     * 调用 Thread.sleep() 方法使线程进入限期等待状态时，常常用“使一个线程睡眠”进行描述。
     *
     * 调用 Object.wait() 方法使线程进入限期等待或者无限期等待时，常常用“挂起一个线程”进行描述。
     *
     * 睡眠和挂起是用来描述行为，而阻塞和等待用来描述状态。
     *
     * 阻塞和等待的区别在于，阻塞是被动的，它是在等待获取一个排它锁。而等待是主动的，通过调用 Thread.sleep() 和 Object.wait() 等方法进入。
     *
     * 进入方法	退出方法
     * Thread.sleep() 方法	时间结束
     * 设置了 Timeout 参数的 Object.wait() 方法	时间结束 / Object.notify() / Object.notifyAll()
     * 设置了 Timeout 参数的 Thread.join() 方法	时间结束 / 被调用的线程执行完毕
     * LockSupport.parkNanos() 方法	LockSupport.unpark(Thread)
     * LockSupport.parkUntil() 方法	LockSupport.unpark(Thread)
     * 死亡（Terminated）
     * 可以是线程结束任务之后自己结束，或者产生了异常而结束。
     *
     * 使用线程的方法
     * 1，实现Runnable接口
     * 2，实现Callable接口
     * 3，继承Thread类
     * 实现Runnable和Callable接口的类只能当做一个可以在线程中运行的任务，并不是真正的线程，因此最后还是需要调用Thread来调用。
     * 可以说任务是通过线程驱动而执行的
     */
    /**
     * 实现接口和继承Thread
     * java不支持多重继承，因此继承了Thread类就无法继承其他类，但是可以实现多个接口；
     * 类可能要求可执行就行，继承thread类开销过大。
     */

}

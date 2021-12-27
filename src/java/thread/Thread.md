

# Thread

### 1. Runnable 인터페이스와, Thread 클래스

```
implements Runnable / extends Thread
```

### 2. 쓰레드 수행 방법과 예제

- run() : 쓰레드 수행시 동작하는 메소드
- start() : 쓰레드를 시작하는 메소드

```
public class RunnableSample implements Runnable {

    @Override
    public void run() {
        System.out.println("This is RunnableSample's run() method.");
    }

}

public class ThreadSample extends Thread {

    public void run() {
        System.out.println("This is ThreadSample's run() method");
    }

}

public class RunThreads {

    public static void main(String[] args) {
        RunThreads runThreads = new RunThreads();
        runThreads.runBasic();
    }

    public void runBasic() {
        RunnableSample runnableSample = new RunnableSample();
        new Thread(runnableSample).start();

        ThreadSample threadSample = new ThreadSample();
        threadSample.start();
        System.out.println("RunThreads.runBasic() method is ended.");
    }

}
```


Runnable 인터페이스를 구현한 RunnableSample 클래스의 쓰레드로 바로 실행 할 수는 없다.
따라서, 이와 같이 Thread 클래스의 생성자에 해당 객체를 추가하여 시작해 주어야 한다.

Runnable interface를 구현했는지, Thread class를 상속받았는지에 따라서 사용 방법이 다음의 두가지 방법이 상이함.
```
RunnableSample runnableSample = new RunnableSample();
new Thread(runnableSample).start(); 

ThreadSample threadSample = new ThreadSample();
threadSample.start();
```

자바에서는 하나의 클래스만 확장할 수 있다. (extends)

만약 어떤 클래스가 다른 클래스를 extends를 사용해 확장해야 하는데, 쓰레드로 구현해야 한다.
하지만 그 부모 클래스는 Thread를 확장하지 않았다면, Runnable 인터페이스를 구현하는 방법을 사용한다.
 

##

start() 메소드를 통해 쓰레드가 시작되면, 프로세스가 아닌 JVM에 하나의 쓰레드를 추가하여 실행하는 것이다.

위 runBasic() 쓰레드를 기동시키는 메소드에서 runnableSample 이라는 객체를 Thread클래스의 start() 메소드로 시작한다.

이때 시작한 start() 메소드가 끝날 때까지 기다리지 않고, 다음 줄의 threadSample객체의 start() 메소드가 실행된다.

새로우 쓰레드를 시작하므로 run() 메소드가 종료될 때까지 기다리지 않고, 바로 다음 줄로 진행한다.

```
start() 메소드를 호출하면, 쓰레드 클래스의 run() 메소드의 내용의 완료 유무와 관계없이 다음줄의 코드를 실행함!
```

1. 생성한 쓰레드는 run() 메소드가 종료되면 끝난다.
2. run() 메소드가 끝나지 않으면 애플리케이션은 끝나지 않는다.
3. 위 두가지는 [데몬 쓰레드]의 경우 예외된다.
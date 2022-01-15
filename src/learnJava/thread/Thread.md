

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

##

Thread 클래스에는 deprecated된 메소드도 많고, static 메소드도 많이 있다.
Thread 클래스에 있는 static 메소드는 대부분 JVM에 있는 쓰레드를 관리하기 위한 용도로 사용한다고 한다.
물론 예외도 있는데 그 중 하나가 sleep() 메소드 이다.

데몬 쓰레드가 아닌 사용자 쓰레드는 JVM이 해당 쓰레드가 끝날 때까지 기다린다.
어던 쓰레드를 데몬 쓰레드로 지정하면, 그 쓰레드의 수행 여부와 상관없이, JVM이 종료 될 수 있다.

데몬 쓰레드는 해당 쓰레드가 종료되지 않아도 다른 실행중인 일반 쓰레드가 없으면 동작을 멈춘다.

모니터링하는 쓰레드를 별도로 띄워 모니터링하다가, 주요 쓰레드가 종료되면 관련된 모니터링 쓰레드가 종료되어야
프로세스가 종료될 수 있는데, 모니터링 쓰레드를 데몬 쓰레드로 만들지 않으면 프로세스가 종료될 수 없게 된다.
이렇게, 부가적인 작업을 수행하는 쓰레드를 선언할 때 데몬 쓰레드를 만든다.

##

Synchronized 예약어

Synchronized는 java의 예약어 중 하나다. 변수명이나, 클래스명으로 사용할 수 없으며 Thread와 밀접한 관계이다.
어떤 클래스나 메소드가 쓰레드에 안전하려면(Thread safe) synchronized 예약어를 사용해야 한다.
여러 쓰레드가 동일한 한 객체에 선언된 메소드에 접근하여 데이터를 처리하려고 할 때 동시에 연산을 수행하여
값이 예상했던 결과와 다르게 연산될 수 있다. (값이 꼬인다고 표현)

> 메소드에서 인스턴스 변수를 수정하려고 할 때에만 이러한 문제가 생긴다, 매개변수나 메소드에서만 사용하는
> 지역변수만 다루는 메소드는 synchronized 예약어를 사용하여 선언할 필요가 없다.
    
사용방법은 두가지
- 메소드 자체를 synchronized로 선언하는 방법 (synchronized methods)
```
public synchronized void plus(int value) {
    sum += value;
}
```

- 메소드 내의 특정 문장만 synchronized로 감싸는 방법 (synchronized statements)
```
Object lock = new Object();

public void plus(int value) {
    synchronized(lock) {
        sum += value;
    }
}
```
> 이렇게 하면 synchronized(this) 이후에 있는 중괄호 내에 있는 연산만 동시에 여러 쓰레드에서 처리하지 않겠다는 의미,
> 소괄호 안에 this가 있는 부분에는 잠금 처리를 하기위한 객체를 선언한다.

> synchronized 블록에 들어간 쓰레드가 일을 다 처리하고 나오면 다른 쓰레드에게 기회를 준다.

클래스 내에 두 개 이상의 변수를 처리할 때에 여러 쓰레드에서 접근을 하면 안되는 경우가 생길수 있다.
이럴 땐 두 개의 별도의 객체를 사용하면 보다 효율적인 프로그램이 된다.
```
private int amount;
private int interest;
private Object interestLock = new Object();
private Object amountLock = new Object();

public void addInterest(int value) {
    synchronized(interestLock) {
        interest += value;
    }
}

public void addAmount(int value) {
    synchronized(amountLock) {
        amount += value;
    }
}
```

#

메소드를 synchronized 할 때에는 이처럼 같은 객체를 참조할 때에만 유효.
```
Test test = new Test();
Test thread1 = new Test(test);
Test thread2 = new Test(test);
```

이와 같이 두 개의 쓰레드가 동일한 test가 아닌 서로 다른 객체를 참조한다면,
synchronized로 선언된 메소드는 같은 객체를 참조하는것이 아니므로, synchronized를 안쓰는 것과 동일.

```
Test thread1 = new Test(test);
Test thread2 = new Test(test);
```

synchronized는 여러 쓰레드에서 하나의 객체에 있는 인스턴스 변수를 동시에 처리할 때 발생할 수 있는 문제를
해결하기 위해서 필요한 것이다. 즉, 인스턴스 변수가 선언되어 있어도, 변수가 선언되어 있는 객체를
다른 쓰레드에서 공유할 일이 전혀 없다면 synchronized를 사용할 이유가 없는 것이다.

ex) 
- StringBuffer (Thread safe) 
- StringBuilder (Not Thread safe)

##

### 쓰레드를 통제하는 메소드들

|리턴 타입     | 메소드 이름 및 매개 변수 | 설명            |
|-------------|----------------------|---------------|
|Thread.State | getState()           |쓰레드의 상태 확인 |
|void|join()|수행중인 쓰레드가 중지할 때까지 대기|
|void|join(long millis, int nanos)|첫 번째 매개 변수에 지정된 시간(1/1,000초) 두 번째 매개 변수에 지정된 시간(1/1,000,000,000초) 만큼 대기한다.|
|void |interrupt()|수행중인 쓰레드에 중지 요청을 한다.|


### Thread.State ( 쓰레드 상태 )

|설명|의미|
|---|-----|
|NEW|쓰레드 객체는 생성되었지만, 아직 시작되지는 않은 상태|
|RUNNABLE|쓰레드가 실행중인 상태|
|BLOCKED|쓰레드가 실행 중지 상태, 모니터 락(monitor lock)이 풀리기를 기다리는 상태|
|WAITING|쓰레드가 대기중인 상태|
|TIME_WAITING|특정 시간만큼 쓰레드가 대기중인 상태|
|TERMINATED|쓰레드가 종료된 상태|

어떤 쓰레드이건 간에 NEW -> "상태" -> TERMINATED의 라이프 사이클을 가짐.

"상태" -> NEW, TERMINATED가 아닌 모든 다른 상태.

#

### 주요 static 메소드 목록

|리턴타입|메소드 이름 및 매개 변수|설명|
|----|----|----|
|static int|activeCount()|현재 쓰레드가 속한 쓰레드 그룹의 쓰레드 중 살아있는 쓰레드의 개수를 리턴한다.|
|static Thread|currentThread()|현재 수행중인 쓰레드의 객체를 리턴한다.|
|static void|dumpStack()|콘솔 창에 현재 쓰레드의 스택 정보를 출력한다.|

#

### Object 클래스에 선언된 쓰레드와 관련있는 메소드

|리턴타입|메소드 이름 및 매개 변수|설명|
|----|----|----|
|void|wait()|다른 쓰레드가 Object 객체에 대한 notify() 메소드나 notifyAll() 메소드를 호출할 때까지 현재 쓰레드가 대기하고 있도록 한다.|
|void|wait(long timeout)|wait() 메소드와 동일한 기능을 제공하며, 매개 변수에 지정한 시간만큼만 대기한다. 즉, 매개 변수 시간을 넘어 섰을 때에는 현재 쓰레드는 다시 깨어난다|
|void|wait(long timeout, int nanos)|wait() 메소드와 동일한 기능을 제공한다, 하지만, wait(timeout) 에서 밀리초 단위의 대기시간을 기다린다면, 여기서는 나노초 단위의 값도 입력 가능하다. ( 1 / 1,000,000,000초 )|
|void|notify()|Object 객체의 모니터에 대기하고 있는 단일 쓰레드를 깨운다.|
|void|notifyAll()|Object 객체의 모니터에 대기하고 있는 모든 쓰레드를 깨운다.|




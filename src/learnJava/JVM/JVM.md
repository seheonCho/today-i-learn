
# JVM

JVM(Java Virtual Machine)은 추상적인 기계이다. 자바 바이트코드를 실행할 수 있는 런타임 환경을 제공하는 사양입니다.

JVM 은 많은 하드웨어 및 소프트웨어 플랫폼에서 사용할 수 있습니다(즉, JVM 은 플랫폼에 의존한다).


## JVM Architecture

![스크린샷 2022-04-20 오후 8 12 11](https://user-images.githubusercontent.com/86992911/164218670-fbb6ed93-b25d-426e-9b70-2e1b122425c9.png)



### 1. ClassLoader

> 클래스로더는 클래스 파일을 로드하는 데 사용되는 JVM 의 하위 시스템이다. 자바 프로그램을 실행할 때마다,클래스로더에 의해 먼저 로드된다. 
자바에는 세 개의 내장 클래스로더가 있다, 아래의 세개의 클래스로더는 자바에서 제공하는 것이며, 확장 가능하다.

#### 1. Bootstrap ClassLoader
- 다음의 패키지 클래스등이 포함된 rt.jar 파일을 로드한다.
  - `Java.lang` , `java.net` , `java.util` , `java.io` , `java.sql`

#### 2. Extension ClassLoader
- `Bootstrap ClassLoader` 의 자식 클래스로더이며, `System ClassLoader`의 부모 클래스로더 이다.
- `$JAVA_HOME/jre/lib/ext` 디렉토리 안에 있는 `jar` 파일을 로드한다.

#### 3. System / Application ClassLoader
- `Extension ClassLoader` 의 자식 클래스로더이다. 클래스 경로에서 클래스 파일을 로드한다. 
- 클래스 경로를 변경할 수 있다.

### 2. JVM 에서 할당된 메모리 영역

1. Class (Method) Area
- 클래스 레벨의 정보가 저장된다.
- Thread 간 공유

2. Heap
- 모든 객체와, 배열이 저장되는 곳.
- GC (Garbage Collection) 의 대상
- Thread 간 공유

3. Stack
- 메서드에 관련된 정보가 스택 프레임의 형태로 저장된다.
- Thread 마다 생성

4. PC Register
- 현재 실행중인 Java 가상 머신 명령의 주소가 포함된다.
- Thread 마다 생성

5. Native Method Stack
- 응용프로그램에서 필요한 모든 `native` 메서드를 포함 
- Thread 마다 생성

### 3. 


### 4.
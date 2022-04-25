
# JVM

JVM(Java Virtual Machine)은 추상적인 기계이다. 자바 바이트코드를 실행할 수 있는 런타임 환경을 제공하는 사양입니다.

JVM 은 많은 하드웨어 및 소프트웨어 플랫폼에서 사용할 수 있습니다(즉, JVM 은 플랫폼에 의존한다).


## JVM Architecture

![스크린샷 2022-04-20 오후 8 12 11](https://user-images.githubusercontent.com/86992911/164218670-fbb6ed93-b25d-426e-9b70-2e1b122425c9.png)

## 1. ClassLoader

> 클래스로더는 클래스 파일을 로드하는 데 사용되는 JVM 의 하위 시스템이다. 자바 프로그램을 실행할 때마다,클래스로더에 의해 먼저 로드된다. 
자바에는 세 개의 내장 클래스로더가 있다, 아래의 세개의 클래스로더는 자바에서 제공하는 것이며, 확장 가능하다.

#### 1. Bootstrap ClassLoader
- 다음의 패키지 클래스등이 포함된 rt.jar 파일을 로드한다.
  - `Java.lang` , `java.net` , `java.util` , `java.io` , `java.sql`
  - 학습중 `rt.jar` 을 어디서 본듯해서 허겁지겁 찾아 올린 사진
<br>
<img width="245" alt="스크린샷 2022-04-22 오전 11 27 00" src="https://user-images.githubusercontent.com/86992911/164584247-7c5b5934-0b52-4434-9864-ff74b6b208e9.png">
<br>
<img width="442" alt="스크린샷 2022-04-22 오전 11 23 32" src="https://user-images.githubusercontent.com/86992911/164584076-447091cc-94b8-42be-9b12-b2e1716983e7.png">

#### 2. Extension ClassLoader
- `Bootstrap ClassLoader` 의 자식 클래스로더이며, `System ClassLoader`의 부모 클래스로더 이다.
- `$JAVA_HOME/jre/lib/ext` 디렉토리 안에 있는 `jar` 파일을 로드한다.

#### 3. System / Application ClassLoader
- `Extension ClassLoader` 의 자식 클래스로더이다. 클래스 경로에서 클래스 파일을 로드한다. 
- 클래스 경로를 변경할 수 있다.

## 2. Runtime Data Area
JVM 에서 할당된 메모리 영역.

#### 1. Class (Method) Area
- 클래스 레벨의 정보가 저장된다.
- Thread 간 공유

#### 2. Heap
- 모든 객체와, 배열이 저장되는 곳.
- GC (Garbage Collection) 의 대상
- Thread 간 공유

#### 3. Stack
- 메서드에 관련된 정보가 스택 프레임의 형태로 저장된다.
- Thread 마다 생성

#### 4. PC Register
- 현재 실행중인 Java 가상 머신 명령의 주소가 포함된다.
- Thread 마다 생성

#### 5. Native Method Stack
- 응용프로그램에서 필요한 모든 `native` 메서드를 포함 
- Thread 마다 생성

## 3. Execution Engine
- Runtime Data Area 에 할당된 Bytecode 를 실행

#### Execution Engine 의 명령어 단위로 읽고 번역하는 방식
1. Interpreter
   - OS 플랫폼에 맞는 인터프리터가 바이트 코드를 번역하는데, 한 씩 읽고 번역
2. JIT compiler (Just-In-Time compiler)
   - 자주 실행되는 바이트 코드 영역을 기계어로 변환시켜 저장해서 사

## 4. Garbage Collector
- Heap 메모리 영역에 생성된 객체들 중에 도달가능성이 낮은 객체를 탐색 후, 제거하는 역할

## Java Application 실행 순서

1. 작성된 자바 코드를 자바 바이트 코드로 변환하는 `javac compiler` 호출
   - `.java` 파일을 `.class` 파일로 변환한다.
2. `ClassLoader` 를 통해 JVM 내로 `.class` 파일들을 `Load` 한다.
3. Execution engine 을 통해 해석한다.
4. 해석된 후에 Runtime Data Area 에 배치되어 수행된다.

.class 파일을 읽은 다음에 ClassLoader 하고 난 뒤에 Runtime Data Area 에 들어온다.

출처

https://homoefficio.github.io/2019/01/31/Back-to-the-Essence-Java-컴파일에서-실행까지-2/

https://velog.io/@dion/백기선님-온라인-스터디-1주차-JVM은-무엇이며-자바-코드는-어떻게-실행하는-것인가

https://www.artima.com/insidejvm/ed2/jvm2.html


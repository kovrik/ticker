ticker
======

Ticker is a simple utility class to measure time intervals.

Usage
=====

See javadocs.


Example:
```java
Ticker ticker = new Ticker();
try {
    Thread.sleep(10000);
} catch (InterruptedException e) {
    // Restore the interrupted status
    Thread.currentThread().interrupt();
}
System.out.println(ticker.tick(TimeUnit.SECONDS)); // 10
```

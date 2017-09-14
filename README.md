# Java Logging Framework Benchmark
An application for performance testing different Java logging frameworks. By default, it tests the following frameworks:

* Log4j 2
* Logback
* java.util.logging

## Building the Project
This project uses [Gradle](https://gradle.org/). To build the project, navigate to the project folder and run `./gradlew build`.

## Running the Tests
Run the project using the following command:

`gradle run -Dexec.args="<iterations> <events per iteration> <framework> <appender> <sync>"`

The arguments take the following format:

* Iterations: The number of iterations (i.e. loops) to run over the course of the test (this does not include one additional iteration to warm up the JIT).
* Events per iteration: The number of events to generate per iteration.
* Framework: The logging framework to use. This can be `log4j2`, `logback`, or `java.util.logging` for the respective framework.
    * To use log4j2's asynchronous loggers, append `-async` after log4j2. If you also want to include location info, append `-async-location`.
* Appender: The Appender to use when logging. This can be `file`, `syslog-tcp`, `syslog-udp`, or `console`.
* Sync: Specify `sync` for synchronous Appenders, or `async` for asynchronous Appenders.

Information about the current test will be printed to the console.

### Creating new Tests
If you wish to add or change a configuration, add the configuration file to the `src/main/resources/sync` folder. Note that if you want to add an asynchronous test, create a copy with an asynchronous appender and move it to the `src/main/resources/async` folder. The file(s) must follow this naming convention:

`<framework>-<appender>.xml`

Re-run Gradle project and your new configuration should be picked up automatically.

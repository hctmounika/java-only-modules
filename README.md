Project Title: Concurrent File Processing & Analytics Engine


A Java-based system that:

Reads multiple CSV files
Processes records in parallel
Performs analytics (aggregations, filtering, grouping)
Exports summary reports
Includes custom utility library
Fully tested with JUnit

file-analytics-engine/
│
├── core/                    (Pure Java business logic)
│   ├── model/
│   │     Record.java
│   │     Report.java
│   ├── service/
│   │     FileProcessor.java
│   │     AnalyticsService.java
│   ├── concurrency/
│   │     AsyncProcessor.java
│   └── exception/
│         ProcessingException.java
│
├── util/                    (Core Java utility library)
│   ├── CsvParser.java
│   ├── FileUtils.java
│   ├── ValidationUtils.java
│
├── app/
│   └── Main.java
│
├── test/
│   ├── AnalyticsServiceTest.java
│   ├── CsvParserTest.java
│   └── AsyncProcessorTest.java
│
└── pom.xml (or build.gradle)

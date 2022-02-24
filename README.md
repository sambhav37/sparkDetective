# SparkDetective

### SparkDetective is a tool for performance troubleshooting of Apache Spark jobs
SparkDetective simplifies the collection and analysis of Spark performance metrics.  
Use sparkDetective for troubleshooting **interactive and batch** Spark workloads.  
Use it also to collect metrics for long-term retention or as part of a **CI/CD** pipeline.  
SparkDetective is also intended as a working example of how to use Spark Listeners for collecting Spark task metrics data.
* Main author and contact:
    * Kumar Sambhav
* For Spark 2.x and 3.x
    * Tested on Spark 2.4, 3.0, 3.1
    * Note for Spark 2.1 and 2.2 -> please use sparkDetective version 0.16

### Getting started with sparkDetective
* Note: sparkDetective is available on maven
* Spark 3.x and 2.4 with scala 2.12:
    - Scala: `bin/spark-shell --packages io.github.sambhav37:sparkDetective_2.12:0.17`
    - Python: `bin/pyspark --packages io.github.sambhav37:sparkDetective_2.12:0.17`
        - note: `pip install sparkmeasure` to get the Python wrapper API.
* Spark 2.x with Scala 2.11:
    - Scala: `bin/spark-shell --packages io.github.sambhav37:sparkDetective_2.11:0.17`
    - Python: `bin/pyspark --packages io.github.sambhav37:sparkDetective_2.11:0.17`
        - note: `pip install sparkmeasure` to get the Python wrapper API.
* Bleeding edge: build sparkDetective jar using sbt: `sbt +package` and use `--jars`
  with the jar just built instead of using `--packages`.
Spark Detective package: a tool for measuring Spark performance metrics and example code on how
   to use Spark Listeners to measure task metrics data. 

  Stage Metrics: collects and aggregates metrics at the end of each stage.  
  Task Metrics: collects data at task granularity.

Use modes:
  Interactive mode from the REPL.
  Code instrumentation.
  Flight recorder mode: records data and saves it for later processing.

Supported languages:
  The tool is written in Scala, but it can be used both from Scala and Python.

Example usage for stage metrics:
  ```
  val stageMetrics = io.github.sambhav37.StageMetrics(spark)
  stageMetrics.runAndMeasure(spark.sql("select count(*) from range(1000) cross join range(1000) cross join range(1000)").show)
  ```  
  for task metrics:
  ```
  val taskMetrics = io.github.sambhav37.TaskMetrics(spark)
  spark.sql("select count(*) from range(1000) cross join range(1000) cross join range(1000)").show()
  val df = taskMetrics.createTaskMetricsDF()
  ```  
 To use in flight recorder mode add:
   --conf spark.extraListeners=io.github.sambhav37.FlightRecorderStageMetrics
   or
   --conf spark.extraListeners=io.github.sambhav37.FlightRecorderTaskMetrics

 

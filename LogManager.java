package project;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class LogManager {

    private List<Log> logs;
    private final String basePath; // Base path for log files

    public LogManager(String basePath) {
        this.logs = new ArrayList<>();
        this.basePath = basePath;
    }

    public void ingestLog(Log log) throws IOException {
        logs.add(log);
        writeLogToFile(log);
    }

    private void writeLogToFile(Log log) throws IOException {
        // 1. Construct the complete log file path
        File logFile = new File(basePath, log.getSource() + ".log"); // Add ".log" extension

        // 2. Create the directory if it doesn't exist
        File logsDir = logFile.getParentFile(); // Get parent directory (logs/)
        if (!logsDir.exists()) {
            logsDir.mkdirs(); // Create the directory and subdirectories if needed
        }

        // 3. Write the log entry using FileWriter
        FileWriter writer = new FileWriter(logFile, true); // Append mode
        try (writer) { // Use try-with-resources for automatic closing
            writer.append(log.toString() + "\n");
        }
    }


    public List<Log> queryLogs(String level, String logString, String source) {
        List<Log> filteredLogs = new ArrayList<>();
        for (Log log : logs) {
            if (matchesCriteria(log, level, logString, source)) {
                filteredLogs.add(log);
            }
        }
        return filteredLogs;
    }

    private boolean matchesCriteria(Log log, String level, String logString, String source) {
        boolean matchLevel = level == null || level.equals(log.getLevel());
        boolean matchString = logString == null || log.getLogString().contains(logString);
        boolean matchSource = source == null || source.equals(log.getSource());
        return matchLevel && matchString && matchSource;
    }
}

//Logging Libraries:
//
//NLog (https://nlog-project.org/)
//Log4net (https://logging.apache.org/log4net/)
//Serilog (https://serilog.net/)
//Microsoft.Extensions.Logging (https://docs.microsoft.com/en-us/dotnet/api/microsoft.extensions.logging?view=dotnet-plat-ext-8.0)
//Database:
//
//Elasticsearch (https://www.elastic.co/) for storing and searching logs with high performance and scalability.
//Data Processing:
//
//Apache Kafka (https://kafka.apache.org/) for handling real-time data streaming and processing.
//Here's a sample implementation using NLog and Elasticsearch:
//
//Install the required NuGet packages:
//
//NLog
//NLog.Extensions.Logging
//NLog.Targets.ElasticSearch
//Configure NLog in your NLog.config file:
//
//xml
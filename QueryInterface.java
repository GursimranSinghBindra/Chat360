package project;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;



public class QueryInterface {

    private static final String LOG_BASE_PATH = "logs/"; // Base path for storing ingested logs
    private static final String QUERY_RESULT_LOG = "query_results.log";


    public static void main(String[] args) {
        LogManager logManager = new LogManager(LOG_BASE_PATH);
        Date date = new Date();

        // Sample log ingestion (replace with actual API integrations)
        try {
            logManager.ingestLog(new Log("error", "Database connection failed", date.toString(), "log1.log"));
            logManager.ingestLog(new Log("info", "User login successful", date.toString(), "log2.log"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sample query (modify as needed)
        List<Log> filteredLogs = logManager.queryLogs(null, "login", null);
        try {
            logQueryResult(filteredLogs);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving query results to file.");
        }



    }



    private static void logQueryResult(List<Log> filteredLogs) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(QUERY_RESULT_LOG, true));
        writer.append("Query Results:\n");
        for (Log log : filteredLogs) {
            writer.append(log.toString() + "\n");
        }
        writer.close();
        System.out.println("Query results saved to file: " + QUERY_RESULT_LOG);
    }
}

This project implements a basic log management system for quality control purposes. It allows ingesting logs (simulated using mock APIs in this example), storing them, and querying them based on specific criteria.

Running the Project:

1. Prerequisites:

Java 11 or later
A code editor or IDE (e.g., IntelliJ IDEA, Eclipse)
2. Building and Running:

Clone or download this project repository.
Open the project in your code editor/IDE.
No additional build steps are necessary for this basic implementation.
Run the QueryInterface class (e.g., right-click on the class QueryInterface and select "Run").
System Design:

The system consists of three main components:
Log Class: Represents a single log entry with properties like level, message, timestamp, and source.
LogManager Class: Handles log ingestion (simulated here), storage, and retrieval.
Query Interface: Provides a user interface (basic command-line in this example) for submitting queries and displaying results.
Features Implemented:

Mock Log Ingestion: Simulates log ingestion using a mock service that provides sample logs.
Log Storage: Logs are not stored in separate files based on source in this example (for simplicity).
Log Querying: Users can search logs based on level, message content (using contains), and source.
Query Result Storage: Filtered logs from queries are stored in a separate file (query_results.log).
Identified Issues:

Missing Real API Integration: The current implementation uses mock APIs. You'll need to replace this with actual API calls to ingest logs from various sources.
Limited Storage: Logs are not stored in separate files based on source (a basic implementation detail).
Basic Querying: The current filtering capabilities are basic. You can enhance them with features like regular expressions for more complex log message pattern matching.
No User Interface: This is a command-line based implementation. You can build a more user-friendly interface (e.g., web UI) for easier interaction.
Limited Error Handling: While some error handling is included, it can be further expanded for robustness.
Further Development:

Integrate with real APIs for log ingestion.
Implement more advanced log storage mechanisms (separate files based on source, etc.).
Enhance log querying with features like regular expressions.
Build a user-friendly web interface for querying logs.
Improve error handling for better user experience.
This is a foundational example that can be extended to create a more comprehensive log management system for quality control tasks.
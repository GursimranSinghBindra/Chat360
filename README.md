# Chat360
QLC helps manage logs for quality control. It simulates log ingestion &amp; allows querying based on level, message, &amp; source. Build upon this base to create a more comprehensive log mgmt system!  Features:  Mock log ingestion (replace with real APIs) Log storage &amp; querying Query result storage


Quality Log Control System
This project implements a basic log management system for quality control purposes. It allows ingesting logs, storing them, and querying them based on specific criteria. This is a foundational example that can be extended to create a more comprehensive system.

**Features**:

Simulates log ingestion using mock APIs (replace with real APIs for production)
Stores logs (not in separate source-based files in this example)
Queries logs based on level, message content (contains), and source
Stores filtered query results in a separate file
**How to Use:**

Clone or download the repository.
Open the project in a code editor/IDE (e.g., IntelliJ IDEA, Eclipse).
Run the QueryInterface class (right-click and select "Run").
**Identified Issues:**

Uses mock APIs, needs real API integration
Limited storage (no source-based separation)
Basic querying (can be enhanced with regular expressions)
Command-line interface (consider building a web UI)
Limited error handling
**Further Development:**

Integrate real APIs for log ingestion
Implement source-based log storage
Enhance log querying capabilities
Build a user-friendly web interface
Improve error handling
This project is intended as a starting point for building a more robust log management system.

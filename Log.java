package project;

import java.util.Collection;

public class Log {
    private String level;
    private String logString;
    private String timestamp;
    private String source;

    public Log(String level, String logString, String timestamp, String source) {
        this.level = level;
        this.logString = logString;
        this.timestamp = timestamp;
        this.source = source;
    }

    @Override
    public String toString() {
        return "{" +
                "level='" + level + '\'' +
                ", logString='" + logString + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    public String getSource() {
        return source;
    }

    public String getLevel() {
        return level;
    }

    public String getLogString() {
        return logString;
    }
}

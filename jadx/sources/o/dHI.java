package o;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* loaded from: classes5.dex */
public final class dHI extends Handler {
    public static final dHI e = new dHI();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    private dHI() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int d;
        C8632dsu.d(logRecord, "");
        dHL dhl = dHL.c;
        String loggerName = logRecord.getLoggerName();
        C8632dsu.b(loggerName, "");
        d = dHK.d(logRecord);
        String message = logRecord.getMessage();
        C8632dsu.b(message, "");
        dhl.c(loggerName, d, message, logRecord.getThrown());
    }
}

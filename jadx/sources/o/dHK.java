package o;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes5.dex */
public final class dHK {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(LogRecord logRecord) {
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}

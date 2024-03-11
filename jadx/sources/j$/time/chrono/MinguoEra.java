package j$.time.chrono;

import j$.time.DateTimeException;
import o.doC;

/* loaded from: classes6.dex */
public enum MinguoEra implements doC {
    BEFORE_ROC,
    ROC;

    public static MinguoEra a(int i) {
        if (i != 0) {
            if (i == 1) {
                return ROC;
            }
            throw new DateTimeException("Invalid era: " + i);
        }
        return BEFORE_ROC;
    }

    @Override // o.doC
    public int b() {
        return ordinal();
    }
}

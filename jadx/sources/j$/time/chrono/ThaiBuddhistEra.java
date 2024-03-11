package j$.time.chrono;

import j$.time.DateTimeException;
import o.doC;

/* loaded from: classes6.dex */
public enum ThaiBuddhistEra implements doC {
    BEFORE_BE,
    BE;

    public static ThaiBuddhistEra d(int i) {
        if (i != 0) {
            if (i == 1) {
                return BE;
            }
            throw new DateTimeException("Invalid era: " + i);
        }
        return BEFORE_BE;
    }

    @Override // o.doC
    public int b() {
        return ordinal();
    }
}

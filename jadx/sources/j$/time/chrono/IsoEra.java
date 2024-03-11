package j$.time.chrono;

import j$.time.DateTimeException;
import o.doC;

/* loaded from: classes5.dex */
public enum IsoEra implements doC {
    BCE,
    CE;

    public static IsoEra b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CE;
            }
            throw new DateTimeException("Invalid era: " + i);
        }
        return BCE;
    }

    @Override // o.doC
    public int b() {
        return ordinal();
    }
}

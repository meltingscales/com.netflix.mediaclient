package o;

import j$.time.DayOfWeek;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes5.dex */
public abstract class doV {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ doX a(int i, doX dox) {
        int b = dox.b(ChronoField.j);
        if (b == i) {
            return dox;
        }
        int i2 = i - b;
        return dox.e(i2 >= 0 ? 7 - i2 : -i2, ChronoUnit.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ doX a(doX dox) {
        ChronoField chronoField = ChronoField.h;
        return dox.d(chronoField, dox.d(chronoField).e());
    }

    public static doW b() {
        return new doW() { // from class: o.dpa
            @Override // o.doW
            public final doX e(doX dox) {
                return doV.a(dox);
            }
        };
    }

    public static doW b(DayOfWeek dayOfWeek) {
        final int a = dayOfWeek.a();
        return new doW() { // from class: o.dpd
            @Override // o.doW
            public final doX e(doX dox) {
                return doV.a(a, dox);
            }
        };
    }

    public static doW c(DayOfWeek dayOfWeek) {
        final int a = dayOfWeek.a();
        return new doW() { // from class: o.dpb
            @Override // o.doW
            public final doX e(doX dox) {
                return doV.d(a, dox);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ doX d(int i, doX dox) {
        int b = dox.b(ChronoField.j);
        if (b == i) {
            return dox;
        }
        int i2 = b - i;
        return dox.b(i2 >= 0 ? 7 - i2 : -i2, ChronoUnit.DAYS);
    }
}

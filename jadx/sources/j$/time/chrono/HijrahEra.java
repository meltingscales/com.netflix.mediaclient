package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import o.InterfaceC8535dpe;
import o.doC;

/* loaded from: classes6.dex */
public enum HijrahEra implements doC {
    AH;

    @Override // o.doC
    public int b() {
        return 1;
    }

    @Override // o.doC, o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe == ChronoField.m ? ValueRange.b(1L, 1L) : super.d(interfaceC8535dpe);
    }
}

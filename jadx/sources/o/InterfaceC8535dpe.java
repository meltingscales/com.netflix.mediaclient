package o;

import j$.time.format.ResolverStyle;
import j$.time.temporal.ValueRange;
import java.util.Map;

/* renamed from: o.dpe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8535dpe {
    ValueRange a();

    boolean a(doY doy);

    boolean b();

    default doY c(Map map, doY doy, ResolverStyle resolverStyle) {
        return null;
    }

    long d(doY doy);

    doX d(doX dox, long j);

    boolean d();

    ValueRange e(doY doy);
}

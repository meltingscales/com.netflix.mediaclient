package o;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: o.jB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9094jB {
    private static final InterfaceC8554dpx b;

    public static final long e() {
        return System.currentTimeMillis();
    }

    static {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<SimpleDateFormat>() { // from class: com.apollographql.apollo3.mpp.UtilsKt$simpleDateFormat$2
            @Override // o.drO
            /* renamed from: a */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
            }
        });
        b = b2;
    }
}

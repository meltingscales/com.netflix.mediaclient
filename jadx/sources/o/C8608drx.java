package o;

import java.io.Closeable;

/* renamed from: o.drx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8608drx {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C8553dpw.c(th, th2);
            }
        }
    }
}

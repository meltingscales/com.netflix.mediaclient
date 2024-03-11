package o;

import java.util.Arrays;

/* renamed from: o.fu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8927fu<T> extends AbstractC8918fl<T> {
    private final T a;
    private final Throwable d;

    public final Throwable b() {
        return this.d;
    }

    public String toString() {
        return "Fail(error=" + this.d + ", value=" + this.a + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8927fu(Throwable th, T t) {
        super(true, true, t, null);
        C8632dsu.c((Object) th, "");
        this.d = th;
        this.a = t;
    }

    public /* synthetic */ C8927fu(Throwable th, Object obj, int i, C8627dsp c8627dsp) {
        this(th, (i & 2) != 0 ? null : obj);
    }

    public boolean equals(Object obj) {
        Object y;
        Object y2;
        if (obj instanceof C8927fu) {
            Throwable th = ((C8927fu) obj).d;
            if (this.d.getClass() == th.getClass() && C8632dsu.c((Object) this.d.getMessage(), (Object) th.getMessage())) {
                StackTraceElement[] stackTrace = this.d.getStackTrace();
                C8632dsu.a(stackTrace, "");
                y = C8563dqf.y(stackTrace);
                StackTraceElement[] stackTrace2 = th.getStackTrace();
                C8632dsu.a(stackTrace2, "");
                y2 = C8563dqf.y(stackTrace2);
                return C8632dsu.c(y, y2);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Object y;
        InterfaceC8660dtv a = dsA.a(this.d.getClass());
        String message = this.d.getMessage();
        StackTraceElement[] stackTrace = this.d.getStackTrace();
        C8632dsu.a(stackTrace, "");
        y = C8563dqf.y(stackTrace);
        return Arrays.hashCode(new Object[]{a, message, y});
    }
}

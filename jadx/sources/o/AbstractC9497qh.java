package o;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

/* renamed from: o.qh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9497qh {
    private static final AbstractC9497qh d;

    public static AbstractC9497qh a() {
        return d;
    }

    public abstract Boolean a(AbstractC9509qt abstractC9509qt);

    public abstract Boolean c(AbstractC9509qt abstractC9509qt);

    public abstract PropertyName e(AnnotatedParameter annotatedParameter);

    static {
        AbstractC9497qh abstractC9497qh;
        try {
            abstractC9497qh = (AbstractC9497qh) C9537rU.b((Class<Object>) C9500qk.class, false);
        } catch (Throwable unused) {
            abstractC9497qh = null;
        }
        d = abstractC9497qh;
    }
}

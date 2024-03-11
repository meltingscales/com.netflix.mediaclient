package o;

import java.util.logging.Logger;

/* renamed from: o.qd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9493qd {
    private static final AbstractC9493qd d;

    public static AbstractC9493qd a() {
        return d;
    }

    public abstract AbstractC9453pq<?> c(Class<?> cls);

    public abstract AbstractC9452pp<?> d(Class<?> cls);

    static {
        AbstractC9493qd abstractC9493qd;
        try {
            abstractC9493qd = (AbstractC9493qd) C9537rU.b((Class<Object>) C9498qi.class, false);
        } catch (Throwable unused) {
            Logger.getLogger(AbstractC9493qd.class.getName()).warning("Unable to load JDK7 types (java.nio.file.Path): no Java7 type support added");
            abstractC9493qd = null;
        }
        d = abstractC9493qd;
    }
}

package o;

import com.fasterxml.jackson.core.Version;
import java.util.Collections;

/* renamed from: o.pu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9457pu {

    /* renamed from: o.pu$b */
    /* loaded from: classes5.dex */
    public interface b {
    }

    public abstract Version a();

    public abstract void b(b bVar);

    public abstract String e();

    public Object d() {
        return getClass().getName();
    }

    public Iterable<? extends AbstractC9457pu> c() {
        return Collections.emptyList();
    }
}

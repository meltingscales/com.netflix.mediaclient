package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class dGY {
    private final Set<C7828dGw> a = new LinkedHashSet();

    public final void b(C7828dGw c7828dGw) {
        synchronized (this) {
            C8632dsu.d(c7828dGw, "");
            this.a.add(c7828dGw);
        }
    }

    public final void a(C7828dGw c7828dGw) {
        synchronized (this) {
            C8632dsu.d(c7828dGw, "");
            this.a.remove(c7828dGw);
        }
    }

    public final boolean d(C7828dGw c7828dGw) {
        boolean contains;
        synchronized (this) {
            C8632dsu.d(c7828dGw, "");
            contains = this.a.contains(c7828dGw);
        }
        return contains;
    }
}

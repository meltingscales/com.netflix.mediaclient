package o;

import o.dqZ;

/* loaded from: classes6.dex */
public final class dAM implements dqZ.d<dAN<?>> {
    private final ThreadLocal<?> c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dAM) && C8632dsu.c(this.c, ((dAM) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.c + ')';
    }

    public dAM(ThreadLocal<?> threadLocal) {
        this.c = threadLocal;
    }
}

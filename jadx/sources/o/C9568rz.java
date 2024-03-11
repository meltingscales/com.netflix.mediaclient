package o;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.rz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9568rz {
    private final HashMap<C9593se, AbstractC9453pq<Object>> c = new HashMap<>(64);
    private final AtomicReference<C9524rH> e = new AtomicReference<>();

    public C9524rH a() {
        C9524rH c9524rH = this.e.get();
        return c9524rH != null ? c9524rH : e();
    }

    private final C9524rH e() {
        C9524rH c9524rH;
        synchronized (this) {
            c9524rH = this.e.get();
            if (c9524rH == null) {
                c9524rH = C9524rH.c(this.c);
                this.e.set(c9524rH);
            }
        }
        return c9524rH;
    }

    public AbstractC9453pq<Object> a(Class<?> cls) {
        AbstractC9453pq<Object> abstractC9453pq;
        synchronized (this) {
            abstractC9453pq = this.c.get(new C9593se(cls, false));
        }
        return abstractC9453pq;
    }

    public AbstractC9453pq<Object> c(JavaType javaType) {
        AbstractC9453pq<Object> abstractC9453pq;
        synchronized (this) {
            abstractC9453pq = this.c.get(new C9593se(javaType, false));
        }
        return abstractC9453pq;
    }

    public AbstractC9453pq<Object> e(JavaType javaType) {
        AbstractC9453pq<Object> abstractC9453pq;
        synchronized (this) {
            abstractC9453pq = this.c.get(new C9593se(javaType, true));
        }
        return abstractC9453pq;
    }

    public AbstractC9453pq<Object> b(Class<?> cls) {
        AbstractC9453pq<Object> abstractC9453pq;
        synchronized (this) {
            abstractC9453pq = this.c.get(new C9593se(cls, true));
        }
        return abstractC9453pq;
    }

    public void d(JavaType javaType, AbstractC9453pq<Object> abstractC9453pq) {
        synchronized (this) {
            if (this.c.put(new C9593se(javaType, true), abstractC9453pq) == null) {
                this.e.set(null);
            }
        }
    }

    public void e(Class<?> cls, AbstractC9453pq<Object> abstractC9453pq) {
        synchronized (this) {
            if (this.c.put(new C9593se(cls, true), abstractC9453pq) == null) {
                this.e.set(null);
            }
        }
    }

    public void a(JavaType javaType, AbstractC9453pq<Object> abstractC9453pq, AbstractC9459pw abstractC9459pw) {
        synchronized (this) {
            if (this.c.put(new C9593se(javaType, false), abstractC9453pq) == null) {
                this.e.set(null);
            }
            if (abstractC9453pq instanceof InterfaceC9517rA) {
                ((InterfaceC9517rA) abstractC9453pq).a(abstractC9459pw);
            }
        }
    }

    public void a(Class<?> cls, JavaType javaType, AbstractC9453pq<Object> abstractC9453pq, AbstractC9459pw abstractC9459pw) {
        synchronized (this) {
            AbstractC9453pq<Object> put = this.c.put(new C9593se(cls, false), abstractC9453pq);
            AbstractC9453pq<Object> put2 = this.c.put(new C9593se(javaType, false), abstractC9453pq);
            if (put == null || put2 == null) {
                this.e.set(null);
            }
            if (abstractC9453pq instanceof InterfaceC9517rA) {
                ((InterfaceC9517rA) abstractC9453pq).a(abstractC9459pw);
            }
        }
    }
}

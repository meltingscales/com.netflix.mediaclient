package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class IF extends AbstractC0941Im implements II {
    private final AtomicReference<InterfaceC8322diG> a = new AtomicReference<>();
    private C0949Iu<IF> d;
    private InterfaceC1242Ud e;

    public InterfaceC1242Ud b() {
        return this.e;
    }

    @Override // o.II
    public C0949Iu<IF> cm_() {
        return this.d;
    }

    @Override // o.II
    public void e(C0949Iu<IF> c0949Iu) {
        this.d = c0949Iu;
    }

    public IF() {
    }

    public IF(InterfaceC1242Ud interfaceC1242Ud) {
        this.e = interfaceC1242Ud;
    }

    public static IF b(InterfaceC8322diG interfaceC8322diG) {
        if (interfaceC8322diG instanceof IF) {
            return (IF) interfaceC8322diG;
        }
        return null;
    }

    public InterfaceC8322diG c() {
        return this.a.get();
    }

    public void d(InterfaceC1242Ud interfaceC1242Ud) {
        if (interfaceC1242Ud == null || !interfaceC1242Ud.equals(this.e)) {
            this.e = interfaceC1242Ud;
            this.a.set(null);
        }
    }

    public InterfaceC8322diG d(InterfaceC1240Ub<?> interfaceC1240Ub) {
        InterfaceC8322diG interfaceC8322diG = this.a.get();
        if (interfaceC8322diG != null) {
            return interfaceC8322diG;
        }
        InterfaceC1242Ud interfaceC1242Ud = this.e;
        if (interfaceC1242Ud == null || interfaceC1242Ud.g()) {
            return null;
        }
        InterfaceC8322diG b = interfaceC1240Ub.b(this.e);
        if (b instanceof II) {
            II ii = (II) b;
            ii.e(new C0949Iu<>(this, ii.cm_()));
            this.a.set(b);
        }
        return b;
    }

    public <T> T d(InterfaceC1240Ub<?> interfaceC1240Ub, Class<T> cls) {
        T t = (T) d(interfaceC1240Ub);
        while (t instanceof IF) {
            t = (T) ((IF) t).d(interfaceC1240Ub);
        }
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public String toString() {
        return String.format("Ref path: %s", b());
    }
}

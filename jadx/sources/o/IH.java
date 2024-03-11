package o;

/* loaded from: classes.dex */
public class IH<T> implements II, InterfaceC8321diF {
    private final T a;
    private C0949Iu<IF> b;
    private long c;
    private Long d;

    public T a() {
        return this.a;
    }

    @Override // o.II
    public C0949Iu<IF> cm_() {
        return this.b;
    }

    @Override // o.II
    public void e(C0949Iu<IF> c0949Iu) {
        this.b = c0949Iu;
    }

    @Override // o.InterfaceC8323diH
    public final long getTimestamp() {
        return this.c;
    }

    @Override // o.InterfaceC8321diF
    public final boolean needsRefresh(long j) {
        return false;
    }

    @Override // o.InterfaceC8321diF
    public void setExpires(Long l) {
        this.d = l;
    }

    @Override // o.InterfaceC8323diH
    public final void setTimestamp(long j) {
        this.c = j;
    }

    private IH(T t) {
        this.a = t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IH() {
        this.a = null;
        this.c = System.currentTimeMillis();
    }

    public static <T> IH<T> d(T t) {
        return new IH<>(t);
    }

    public String toString() {
        return "Sentinel [value=" + this.a + "]";
    }
}

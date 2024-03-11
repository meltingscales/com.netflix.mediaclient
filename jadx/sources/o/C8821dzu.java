package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: o.dzu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8821dzu<T> extends dzI<dzA> implements InterfaceC8812dzl<T>, dyP<T>, dzU<T> {
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C8821dzu.class, Object.class, "_state");
    private volatile Object _state;
    private int e;

    public C8821dzu(Object obj) {
        this._state = obj;
    }

    @Override // o.InterfaceC8812dzl, o.InterfaceC8822dzv
    public T b() {
        dAH dah = dzT.b;
        T t = (T) c.get(this);
        if (t == dah) {
            return null;
        }
        return t;
    }

    @Override // o.InterfaceC8812dzl
    public void d(T t) {
        if (t == null) {
            t = (T) dzT.b;
        }
        d(null, t);
    }

    @Override // o.InterfaceC8812dzl
    public boolean e(T t, T t2) {
        if (t == null) {
            t = (T) dzT.b;
        }
        if (t2 == null) {
            t2 = (T) dzT.b;
        }
        return d(t, t2);
    }

    @Override // o.InterfaceC8810dzj
    public boolean a(T t) {
        d((C8821dzu<T>) t);
        return true;
    }

    @Override // o.InterfaceC8810dzj, o.dyQ
    public Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        d((C8821dzu<T>) t);
        return dpR.c;
    }

    @Override // o.InterfaceC8810dzj
    public void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (o.C8632dsu.c(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d8 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ea -> B:34:0x00a6). Please submit an issue!!! */
    @Override // o.InterfaceC8814dzn, o.dyS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(o.dyQ<? super T> r11, o.InterfaceC8585dra<?> r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8821dzu.collect(o.dyQ, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzI
    /* renamed from: d */
    public dzA c() {
        return new dzA();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzI
    /* renamed from: a */
    public dzA[] b(int i) {
        return new dzA[i];
    }

    @Override // o.dzU
    public dyS<T> a(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return dzB.e(this, dqz, i, bufferOverflow);
    }

    private final boolean d(Object obj, Object obj2) {
        int i;
        dzA[] i2;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !C8632dsu.c(obj3, obj)) {
                return false;
            }
            if (C8632dsu.c(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.e;
            if ((i3 & 1) != 0) {
                this.e = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.e = i4;
            dzA[] i5 = i();
            dpR dpr = dpR.c;
            while (true) {
                dzA[] dzaArr = i5;
                if (dzaArr != null) {
                    for (dzA dza : dzaArr) {
                        if (dza != null) {
                            dza.e();
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i4) {
                        this.e = i4 + 1;
                        return true;
                    }
                    i2 = i();
                    dpR dpr2 = dpR.c;
                }
                i5 = i2;
                i4 = i;
            }
        }
    }
}

package o;

import com.fasterxml.jackson.core.JsonFactory;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: o.dwk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8730dwk<T> extends dxM implements InterfaceC8585dra<T>, dwU {
    private final dqZ a;

    protected void a(T t) {
    }

    protected void b(Throwable th, boolean z) {
    }

    @Override // o.InterfaceC8585dra
    public final dqZ getContext() {
        return this.a;
    }

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.a;
    }

    public AbstractC8730dwk(dqZ dqz, boolean z, boolean z2) {
        super(z2);
        if (z) {
            a((dxD) dqz.get(dxD.b));
        }
        this.a = dqz.plus(this);
    }

    @Override // o.dxM, o.dxD
    public boolean cu_() {
        return super.cu_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dxM
    public String a() {
        return dwW.c(this) + " was cancelled";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dxM
    protected final void e(Object obj) {
        if (obj instanceof dwO) {
            dwO dwo = (dwO) obj;
            b(dwo.a, dwo.d());
            return;
        }
        a((AbstractC8730dwk<T>) obj);
    }

    @Override // o.InterfaceC8585dra
    public final void resumeWith(Object obj) {
        Object h = h(dwN.d(obj, null, 1, null));
        if (h == dxJ.c) {
            return;
        }
        a_(h);
    }

    protected void a_(Object obj) {
        b(obj);
    }

    @Override // o.dxM
    public final void e(Throwable th) {
        dwS.a(this.a, th);
    }

    @Override // o.dxM
    public String c() {
        String b = dwP.b(this.a);
        if (b == null) {
            return super.c();
        }
        return JsonFactory.DEFAULT_QUOTE_CHAR + b + "\":" + super.c();
    }

    public final <R> void e(CoroutineStart coroutineStart, R r, drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        coroutineStart.e(drx, r, this);
    }
}

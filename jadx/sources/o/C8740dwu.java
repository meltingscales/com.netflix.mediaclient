package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: o.dwu */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8740dwu {
    public static /* synthetic */ Object b(dqZ dqz, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        return C8738dws.e(dqz, drx);
    }

    public static final <T> T b(dqZ dqz, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        AbstractC8765dxs b;
        dqZ a;
        Thread currentThread = Thread.currentThread();
        dqY dqy = (dqY) dqz.get(dqY.d);
        if (dqy == null) {
            b = C8776dyc.a.c();
            a = dwP.a(C8769dxw.e, dqz.plus(b));
        } else {
            AbstractC8765dxs abstractC8765dxs = dqy instanceof AbstractC8765dxs ? (AbstractC8765dxs) dqy : null;
            if (abstractC8765dxs != null) {
                AbstractC8765dxs abstractC8765dxs2 = abstractC8765dxs.f() ? abstractC8765dxs : null;
                if (abstractC8765dxs2 != null) {
                    b = abstractC8765dxs2;
                    a = dwP.a(C8769dxw.e, dqz);
                }
            }
            b = C8776dyc.a.b();
            a = dwP.a(C8769dxw.e, dqz);
        }
        C8731dwl c8731dwl = new C8731dwl(a, currentThread, b);
        c8731dwl.e(CoroutineStart.DEFAULT, (CoroutineStart) c8731dwl, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
        return (T) c8731dwl.e();
    }
}

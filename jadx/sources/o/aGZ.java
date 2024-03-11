package o;

import com.netflix.mediaclient.localdiscovery.impl.LocalDiscoveryUsers$onLocalDiscoveryStateChanged$1;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class aGZ {
    public static final e c = new e(null);
    private final CoroutineExceptionHandler a;
    private final aGW b;
    private final List<aGS> e;

    public aGZ(aGW agw) {
        C8632dsu.c((Object) agw, "");
        this.b = agw;
        this.e = new ArrayList();
        this.a = new c(CoroutineExceptionHandler.Key);
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_local_discovery");
        }
    }

    public final void e(aGS ags) {
        synchronized (this) {
            C8632dsu.c((Object) ags, "");
            if (!this.e.contains(ags)) {
                this.e.add(ags);
            }
        }
    }

    public final void c(aGS ags) {
        synchronized (this) {
            C8632dsu.c((Object) ags, "");
            if (this.e.contains(ags)) {
                this.e.remove(ags);
            }
        }
    }

    public static /* synthetic */ void b(aGZ agz, boolean z, dwQ dwq, int i, Object obj) {
        if ((i & 2) != 0) {
            dwq = C8752dxf.b();
        }
        agz.d(z, dwq);
    }

    public final void d(boolean z, dwQ dwq) {
        synchronized (this) {
            C8632dsu.c((Object) dwq, "");
            dwU c2 = dwY.c(dwq);
            for (aGS ags : this.e) {
                C8737dwr.c(c2, this.a, null, new LocalDiscoveryUsers$onLocalDiscoveryStateChanged$1(this, ags, z, null), 2, null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends dqT implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C1044Mm.b("LocalDiscoveryErrorHandler", th, "Exception in listener!", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(aGS ags, boolean z, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        ags.a(z);
        return dpR.c;
    }
}

package o;

import com.netflix.mediaclient.playintegrity.impl.AttestationStatusListenerHolder$alert$2;
import com.netflix.mediaclient.playintegrity.impl.AttestationStatusListenerHolder$alertListener$1;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: o.aKp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1689aKp {
    public static final a b = new a(null);
    private final List<InterfaceC1687aKn> a;
    private final C1691aKr c;
    private final dwQ d;
    private final CoroutineExceptionHandler e;

    public C1689aKp(C1691aKr c1691aKr, dwQ dwq) {
        C8632dsu.c((Object) c1691aKr, "");
        C8632dsu.c((Object) dwq, "");
        this.c = c1691aKr;
        this.d = dwq;
        this.a = new ArrayList();
        this.e = new b(CoroutineExceptionHandler.Key);
    }

    public /* synthetic */ C1689aKp(C1691aKr c1691aKr, dwQ dwq, int i, C8627dsp c8627dsp) {
        this(c1691aKr, (i & 2) != 0 ? C8752dxf.b() : dwq);
    }

    /* renamed from: o.aKp$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PlayIntegrityImpl_listeners");
        }
    }

    /* renamed from: o.aKp$b */
    /* loaded from: classes3.dex */
    public static final class b extends dqT implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            a aVar = C1689aKp.b;
        }
    }

    public final void b(boolean z, C1683aKj c1683aKj) {
        for (InterfaceC1687aKn interfaceC1687aKn : this.a) {
            c(interfaceC1687aKn, c1683aKj, z);
        }
    }

    private final void c(InterfaceC1687aKn interfaceC1687aKn, C1683aKj c1683aKj, boolean z) {
        C8737dwr.c(dwY.c(this.d), this.e, null, new AttestationStatusListenerHolder$alertListener$1(this, interfaceC1687aKn, c1683aKj, z, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(InterfaceC1687aKn interfaceC1687aKn, C1683aKj c1683aKj, boolean z, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object c = C8738dws.c(this.d, new AttestationStatusListenerHolder$alert$2(interfaceC1687aKn, z, c1683aKj, null), interfaceC8585dra);
        e = C8586drb.e();
        return c == e ? c : dpR.c;
    }
}

package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NetworkProbing;
import com.netflix.mediaclient.service.logging.proxy.NetworkProbing$startDebugProbing$1;
import com.netflix.mediaclient.service.logging.proxy.NetworkProbing$startProbing$1;
import com.netflix.mediaclient.service.logging.proxy.NetworkProbing$startProbing$2;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class aVC {
    public static final b b = new b(null);
    private final dwU a;
    private final aMF d;

    public aVC(dwU dwu, aMF amf) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) amf, "");
        this.a = dwu;
        this.d = amf;
    }

    public final void a() {
        Context context = this.d.getContext();
        C8632dsu.a(context, "");
        IClientLogging loggingAgent = this.d.getLoggingAgent();
        InterfaceC5090bsG e2 = loggingAgent != null ? loggingAgent.e() : null;
        if (e2 == null || !ConnectivityUtils.l(context)) {
            return;
        }
        a aVar = new a(CoroutineExceptionHandler.Key);
        if (C8054ddD.f() && Config_FastProperty_NetworkProbing.Companion.a()) {
            C8737dwr.c(this.a, aVar, null, new NetworkProbing$startProbing$1(e2, context, null), 2, null);
        }
        if (Config_FastProperty_NetworkProbing.Companion.c()) {
            C8737dwr.c(this.a, aVar, null, new NetworkProbing$startProbing$2(e2, this, null), 2, null);
        }
    }

    public final void e(Context context) {
        C8632dsu.c((Object) context, "");
        if (ConnectivityUtils.l(context)) {
            e eVar = new e(CoroutineExceptionHandler.Key);
            if (C8054ddD.f() && Config_FastProperty_NetworkProbing.Companion.a()) {
                C8737dwr.c(this.a, eVar, null, new NetworkProbing$startDebugProbing$1(context, null), 2, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends dqT implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            b bVar = aVC.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends dqT implements CoroutineExceptionHandler {
        public e(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            b bVar = aVC.b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("NetworkProbe");
        }
    }
}

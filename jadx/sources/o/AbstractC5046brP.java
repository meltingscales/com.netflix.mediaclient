package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import io.reactivex.subjects.PublishSubject;

/* renamed from: o.brP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5046brP extends aMF implements ZuulAgent {
    private final C5117bsh d;
    private final InterfaceC5050brT e;

    public final InterfaceC5050brT a() {
        return this.e;
    }

    public AbstractC5046brP(aOV aov, UserAgent userAgent, PublishSubject<dpR> publishSubject) {
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) publishSubject, "");
        C5117bsh c5117bsh = new C5117bsh();
        this.d = c5117bsh;
        C5053brW c5053brW = C5053brW.d;
        Context d = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d, "");
        Handler mainHandler = getMainHandler();
        C8632dsu.a(mainHandler, "");
        NC o2 = AbstractApplicationC1040Mh.getInstance().o();
        C8632dsu.a(o2, "");
        C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        C8632dsu.a(i, "");
        this.e = c5053brW.e(d, mainHandler, o2, i, c5117bsh, publishSubject);
    }

    @Override // com.netflix.mediaclient.servicemgr.ZuulAgent
    public ZuulAgent.ConnectionStatus e() {
        return this.e.c();
    }

    @Override // com.netflix.mediaclient.servicemgr.ZuulAgent
    public int b() {
        return this.e.a();
    }

    @Override // com.netflix.mediaclient.servicemgr.ZuulAgent
    public boolean b(String str) {
        C8632dsu.c((Object) str, "");
        return this.e.a(str);
    }

    @Override // com.netflix.mediaclient.servicemgr.ZuulAgent
    public void d(InterfaceC5171bti interfaceC5171bti) {
        C8632dsu.c((Object) interfaceC5171bti, "");
        this.d.b(interfaceC5171bti);
    }

    @Override // com.netflix.mediaclient.servicemgr.ZuulAgent
    public void c(InterfaceC5171bti interfaceC5171bti) {
        C8632dsu.c((Object) interfaceC5171bti, "");
        this.d.a(interfaceC5171bti);
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.ZUUL_LOADED;
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.Z;
        C8632dsu.a(netflixImmutableStatus, "");
        return netflixImmutableStatus;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_ZUUL;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_ZUUL;
    }
}

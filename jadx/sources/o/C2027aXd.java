package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.CastState;
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Mdx;
import com.netflix.mediaclient.service.mdx.MdxErrorCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSuffix;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import io.reactivex.subjects.CompletableSubject;
import java.util.Iterator;
import java.util.concurrent.Executors;
import o.C2066aYp;
import o.aVX;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aXd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2027aXd extends aWW implements InterfaceC2018aWv, InterfaceC2014aWr, CastStateListener {
    private final String f;
    private C2016aWt g;
    private C2017aWu i;
    private CastContext j;
    private final Handler k;
    private boolean m;
    private final Handler n;

    public C2027aXd(Context context, C2012aWp c2012aWp, InterfaceC5129bst interfaceC5129bst, final CompletableSubject completableSubject) {
        super(context, c2012aWp, interfaceC5129bst);
        C1044Mm.e("MdxStackCaf", "Initializing MdxStackCaf...");
        this.n = new Handler(c2012aWp.h());
        Handler i = c2012aWp.i();
        this.k = i;
        this.f = c2012aWp.j();
        i.post(new Runnable() { // from class: o.aXh
            @Override // java.lang.Runnable
            public final void run() {
                C2027aXd.this.b(completableSubject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final CompletableSubject completableSubject) {
        try {
            C1044Mm.e("MdxStackCaf", "Initializing CastContext and getting MediaRouter...");
            Task<CastContext> sharedInstance = CastContext.getSharedInstance(this.a, Executors.newSingleThreadExecutor());
            sharedInstance.addOnSuccessListener(new OnSuccessListener() { // from class: o.aXj
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C2027aXd.this.d(completableSubject, (CastContext) obj);
                }
            });
            sharedInstance.addOnFailureListener(new OnFailureListener() { // from class: o.aXf
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C2027aXd.this.c(completableSubject, exc);
                }
            });
        } catch (Throwable th) {
            C1044Mm.e("MdxStackCaf", "Failed to init - error: %s", th.getMessage());
            completableSubject.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void c(Exception exc, CompletableSubject completableSubject) {
        C1044Mm.b("MdxStackCaf", exc, "Failed to init - error", new Object[0]);
        InterfaceC1598aHf.a(new C1596aHd("Failed to initialize cast framework").d(exc).b(false).b(ErrorType.d));
        completableSubject.onError(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void d(CastContext castContext, CompletableSubject completableSubject) {
        this.j = castContext;
        castContext.addCastStateListener(this);
        this.i = new C2017aWu(this.a, this.j, this);
        this.g = new C2016aWt(this.j, this.k, this.f, this.c, this);
        this.m = true;
        C1044Mm.a("MdxStackCaf", "Successfully initialized CAF");
        completableSubject.onComplete();
    }

    @Override // o.aWW
    public Looper l() {
        return this.n.getLooper();
    }

    public void b(String str, final boolean z, String str2, String str3) {
        C1044Mm.c("MdxStackCaf", "setMdxNetworkInterface - name: %s, connected: %b", str, Boolean.valueOf(z));
        this.n.post(new Runnable() { // from class: o.aXa
            @Override // java.lang.Runnable
            public final void run() {
                C2027aXd.this.e(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z) {
        C1044Mm.e("MdxStackCaf", "setMdxNetworkInterface - disabling stack");
        q();
        c(true);
        this.e.b();
        if (z) {
            C1044Mm.a("MdxStackCaf", "setMdxNetworkInterface - enabling stack");
            p();
        }
    }

    public void p() {
        C1044Mm.e("MdxStackCaf", "enable - enabling Cast CAF stack");
        this.k.post(new Runnable() { // from class: o.aXg
            @Override // java.lang.Runnable
            public final void run() {
                C2027aXd.this.u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (!this.m) {
            C1044Mm.j("MdxStackCaf", "enable - haven't finished init yet - unable to enable");
            return;
        }
        this.i.b();
        this.g.e();
    }

    public void q() {
        C1044Mm.e("MdxStackCaf", "disable - disabling Cast CAF stack");
        this.k.post(new Runnable() { // from class: o.aXi
            @Override // java.lang.Runnable
            public final void run() {
                C2027aXd.this.y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        if (!this.m) {
            C1044Mm.j("MdxStackCaf", "disable - haven't finished init yet - unable to disable");
            return;
        }
        this.g.a();
        this.i.c();
    }

    public void w() {
        C1044Mm.e("MdxStackCaf", "restartDiscovery");
        this.n.post(new Runnable() { // from class: o.aXe
            @Override // java.lang.Runnable
            public final void run() {
                C2027aXd.this.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        C1044Mm.e("MdxStackCaf", "restartDiscovery - disabling then enabling");
        q();
        p();
    }

    public void c(final String str) {
        C1044Mm.a("MdxStackCaf", "launchNetflix - uuid: %s", str);
        this.k.post(new Runnable() { // from class: o.aXb
            @Override // java.lang.Runnable
            public final void run() {
                C2027aXd.this.e(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        if (!this.m) {
            C1044Mm.j("MdxStackCaf", "launchNetflix - haven't finished init yet - unable to launch Netflix");
            return;
        }
        MediaRouter.RouteInfo e = this.i.e(str);
        if (e == null) {
            C1044Mm.e("MdxStackCaf", "launchNetflix - ERROR - can't find RouteInfo for uuid: %s", str);
            return;
        }
        CastSession currentCastSession = this.j.getSessionManager().getCurrentCastSession();
        if (currentCastSession != null && currentCastSession.isConnected()) {
            C1044Mm.d("MdxStackCaf", "MdxStackCaf launchNetflix - session already connected");
            x();
            return;
        }
        d(e);
    }

    private void d(MediaRouter.RouteInfo routeInfo) {
        int maximalNumberOfRetriesForCastSelectRoute = Config_FastProperty_Mdx.getMaximalNumberOfRetriesForCastSelectRoute();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < maximalNumberOfRetriesForCastSelectRoute; i++) {
            z2 = b(routeInfo);
            z = !z2 || z;
            if (z2) {
                break;
            }
        }
        if (z2) {
            C1044Mm.a("MdxStackCaf", "Route selected (at least one failure %b)", Boolean.valueOf(z));
            if (z) {
                InterfaceC1598aHf.a(new C1596aHd("CAST: Route selection success in retry.").b(false));
                return;
            }
            return;
        }
        String str = "CAST: Route selection failed after " + maximalNumberOfRetriesForCastSelectRoute + " retries";
        C1044Mm.d("MdxStackCaf", str);
        InterfaceC1598aHf.a(new C1596aHd(str).b(false));
        e("Select route failed", MdxErrorSubCode.Exception, 0);
    }

    private boolean b(MediaRouter.RouteInfo routeInfo) {
        try {
            routeInfo.select();
            return true;
        } catch (Throwable th) {
            C1044Mm.b("MdxStackCaf", th, "Failed to select route %s", routeInfo);
            InterfaceC1598aHf.a(new C1596aHd("CAST: Route selection success in retry.").d(th).b(false));
            return false;
        }
    }

    @Override // o.aWW
    public void b(String str, String str2, String str3) {
        C1044Mm.a("MdxStackCaf", "sendMessage - uuid: %s, url: %s, message: %s", str3, str2, str);
        if (!this.m) {
            C1044Mm.j("MdxStackCaf", "sendMessage - haven't finished init yet - unable to sendMessage");
        } else {
            this.g.c(str);
        }
    }

    public void s() {
        if (!this.m) {
            C1044Mm.j("MdxStackCaf", "disconnect - haven't finished init yet - unable to disconnect");
        } else {
            this.j.getSessionManager().endCurrentSession(true);
        }
    }

    private void i(String str) {
        AbstractC2065aYo<?> d = d(str);
        C2012aWp c2012aWp = this.h;
        boolean z = c2012aWp != null && c2012aWp.n().a(d);
        if (d instanceof C2066aYp) {
            C2066aYp c2066aYp = (C2066aYp) d;
            if (z) {
                c2066aYp.j();
            } else {
                aVX.d b = new aVX.d(MdxErrorCode.ConnectFailed).b(MdxErrorSubCode.LaunchFailed).b(MdxErrorSuffix.GoogleCast);
                c2066aYp.e(b.d("failed to launch target: " + c2066aYp.k()).d());
                s();
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = z ? "success" : "failed";
        C1044Mm.c("MdxStackCaf", "launch %s %s", objArr);
    }

    private void x() {
        C1044Mm.e("MdxStackCaf", "onLaunched");
        if (!this.m) {
            C1044Mm.j("MdxStackCaf", "onLaunched - haven't finished init yet - unable to handle callback");
            return;
        }
        String i = i();
        MediaRouter.RouteInfo e = this.i.e(i);
        if (e != null) {
            this.g.e(i, e.getName());
        } else {
            C1044Mm.e("MdxStackCaf", "onLaunched, no selected route");
        }
    }

    public void d(String str, String str2, String str3) {
        AbstractC2065aYo<?> d = d(str2);
        if (d == null) {
            C1044Mm.c("MdxStackCaf", "onMessageReceived, no target to handle message. %s", str2);
            return;
        }
        SessionMdxTarget c = d.c();
        if (c == null) {
            C1044Mm.c("MdxStackCaf", "onMessageReceived, no target to handle message. %s %s", str2, str3);
            return;
        }
        try {
            JSONObject a = C2069aYs.a(str);
            if (!"/pairingresponse".equals(str3) && !"/regpairreply".equals(str3) && !"/regpairerror".equals(str3)) {
                if ("/session".equals(str3)) {
                    c.b(a);
                } else if ("/broadcast".equals(str3)) {
                    C1044Mm.a("MdxStackCaf", "onMessageReceived, CAST not handle broadcast message");
                } else if ("/error".equals(str3)) {
                    c.a(a);
                } else {
                    C1044Mm.c("MdxStackCaf", "onMessageReceived, not handling %s", str3);
                }
            }
            c.d(a);
        } catch (JSONException e) {
            C1044Mm.c("MdxStackCaf", "handleIncommingMdxMessage, JSONException %s", e);
        }
    }

    @Override // com.google.android.gms.cast.framework.CastStateListener
    public void onCastStateChanged(int i) {
        C1044Mm.a("MdxStackCaf", "onCastStateChanged - newState: %s", CastState.toString(i));
    }

    @Override // o.InterfaceC2018aWv
    public void a(String str, String str2, String str3, boolean z) {
        if (!this.m) {
            C1044Mm.j("MdxStackCaf", "onRouteAdded - haven't finished init yet - unable to handle callback");
            return;
        }
        AbstractC2065aYo<?> d = d(str);
        synchronized (this.b) {
            CastSession currentCastSession = this.j.getSessionManager().getCurrentCastSession();
            if (d == null) {
                C1044Mm.a("MdxStackCaf", "MdxStackCaf onRouteAdded - new target - uuid: %s, name: %s", str, str2);
                d = new C2066aYp.b(str, str2, str3, this).d();
                this.b.add(d);
                this.e.b();
                aWP awp = this.c;
                awp.e("uuid=" + str);
                C8264dhB.c(this.a, str, str3, str2);
            } else {
                C1044Mm.a("MdxStackCaf", "MdxStackCaf onRouteAdded - existing target - uuid: %s, name: %s", str, str2);
                CastDevice castDevice = currentCastSession != null ? currentCastSession.getCastDevice() : null;
                if (castDevice != null) {
                    d.a(str3, str2, "Google", castDevice.getModelName(), null);
                } else {
                    d.a(str3, str2, "Google", null, null);
                }
            }
            if (z) {
                C1044Mm.e("MdxStackCaf", "MdxStackCaf onRouteAdded - route isSelected");
                if (currentCastSession != null && currentCastSession.isConnected()) {
                    C1044Mm.e("MdxStackCaf", "MdxStackCaf onRouteAdded - session is connected");
                    this.h.n().d(d);
                }
            }
        }
    }

    @Override // o.InterfaceC2018aWv
    public void a(String str) {
        AbstractC2065aYo<?> d = d(str);
        if (d instanceof C2066aYp) {
            C1044Mm.a("MdxStackCaf", "MdxStackCaf onRouteRemoved - target found, notifying - uuid: %s", str);
            ((C2066aYp) d).g();
        }
        AbstractC2065aYo<?> h = h();
        synchronized (this.b) {
            Iterator<AbstractC2065aYo<?>> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2065aYo<?> next = it.next();
                if (next.a(d)) {
                    if (next.a(h)) {
                        C1044Mm.e("MdxStackCaf", "MdxStackCaf onRouteRemoved - removed route is the currently selected target - uuid: %s", str);
                        this.e.b(str, MdxErrorSubCode.DeviceIsLost.d(), next.k());
                    }
                    C1044Mm.a("MdxStackCaf", "MdxStackCaf onRouteRemoved - found target in device list, removing - uuid: %s", str);
                    it.remove();
                    this.e.b();
                    aWP awp = this.c;
                    awp.b("uuid=" + str);
                }
            }
        }
    }

    @Override // o.InterfaceC2014aWr
    public void a() {
        C1044Mm.e("MdxStackCaf", "MdxStackCaf onSessionStarted");
        x();
    }

    @Override // o.InterfaceC2014aWr
    public void c(String str, int i) {
        C1044Mm.e("MdxStackCaf", "MdxStackCaf onSessionStartFailed");
        e(str, MdxErrorSubCode.SessionStartFailed, i);
    }

    @Override // o.InterfaceC2014aWr
    public void d() {
        C1044Mm.e("MdxStackCaf", "MdxStackCaf onSessionEnded");
        AbstractC2065aYo<?> h = h();
        if (h != null) {
            h.a(true);
            this.e.d(h.t(), (String) null, false);
            return;
        }
        C1044Mm.e("MdxStackCaf", "MdxStackCaf onSessionEnded - target is null");
    }

    @Override // o.InterfaceC2014aWr
    public void c() {
        C1044Mm.e("MdxStackCaf", "MdxStackCaf onSessionResumed");
        x();
    }

    @Override // o.InterfaceC2014aWr
    public void b(String str, int i) {
        C1044Mm.e("MdxStackCaf", "MdxStackCaf onSessionResumeFailed");
        e(str, MdxErrorSubCode.SessionResumeFailed, i);
    }

    @Override // o.InterfaceC2014aWr
    public void c(Integer num) {
        C1044Mm.e("MdxStackCaf", "MdxStackCaf onSendMessageResult");
        AbstractC2065aYo<?> h = h();
        if (h == null) {
            C1044Mm.a("MdxStackCaf", "onSendMessageResult, no target to handle message.");
            return;
        }
        SessionMdxTarget c = h.c();
        if (c == null) {
            C1044Mm.c("MdxStackCaf", "onSendMessageResult, no session target to handle message. %s", h.t());
        } else if (num == null) {
            c.A();
        } else {
            c.c(num.intValue());
        }
    }

    @Override // o.InterfaceC2014aWr
    public void c(String str, String str2, String str3) {
        String i = i();
        if (str.equals("castHandShakeAck")) {
            i(i);
        } else if (str.equals("castHandShakeRequest")) {
            C1044Mm.e("MdxStackCaf", "onMessageReceived castHandShakeRequest");
            x();
        } else if (i != null) {
            d(str3, i, str2);
        } else {
            C1044Mm.e("MdxStackCaf", "onMessageReceived, no selected route");
        }
    }

    private void e(String str, MdxErrorSubCode mdxErrorSubCode, int i) {
        AbstractC2065aYo<?> h = h();
        aVX d = new aVX.d(MdxConnectionLogblobLogger.b() ? MdxErrorCode.ReconnectFailed : MdxErrorCode.ConnectFailed).b(MdxErrorSuffix.GoogleCast).b(mdxErrorSubCode).c(i).d(str).d();
        if (h instanceof C2066aYp) {
            ((C2066aYp) h).e(d);
            if (mdxErrorSubCode == MdxErrorSubCode.SessionResumeFailed && i == 2005) {
                return;
            }
            if (!MdxConnectionLogblobLogger.b()) {
                this.c.e().c(MdxTargetType.Cast, h.n(), h.t(), h.k(), false, h.d(), h.e(), h.b(), d, null, false, false, false);
                return;
            } else {
                this.c.e().b(MdxTargetType.Cast, h.n(), h.t(), h.k(), false, h.d(), h.e(), h.b(), d, null);
                return;
            }
        }
        C1044Mm.d("MdxStackCaf", "handleSessionFailure - can't notify target launch failed because target not found");
    }

    @Override // o.aWW
    public void b() {
        C2017aWu c2017aWu = this.i;
        if (c2017aWu != null) {
            c2017aWu.a();
        }
    }

    @Override // o.aWW
    public void g() {
        C2017aWu c2017aWu = this.i;
        if (c2017aWu != null) {
            c2017aWu.e();
        }
    }
}

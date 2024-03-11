package o;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.arch.core.util.Function;
import com.netflix.dial.DialDevice;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxOnlyDeviceEsnPrefixes;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxPinLogin;
import com.netflix.mediaclient.service.mdx.MdxErrorCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSuffix;
import com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.ssdp.SsdpDevice;
import com.netflix.upnp.UpnpDevice;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import o.C2038aXo;
import o.C2067aYq;
import o.C8450dma;
import o.GM;
import o.InterfaceC8457dmh;
import o.aVX;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aXo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2038aXo extends aWW {
    private boolean f;
    private final aWC g;
    private long i;
    private boolean j;
    private final GM k;
    private final Handler l;
    private final C2009aWm m;
    private final Map<String, DialDevice> n;

    /* renamed from: o  reason: collision with root package name */
    private GM.a f13454o;
    private final C8450dma p;
    private final C2002aWf r;
    private C8450dma.c s;
    private final HandlerThread t;

    public C2038aXo(Context context, aVM avm, C2012aWp c2012aWp, InterfaceC5129bst interfaceC5129bst, aHJ ahj) {
        super(context, c2012aWp, interfaceC5129bst);
        this.j = false;
        this.f = true;
        this.n = new HashMap();
        this.f13454o = new GM.a() { // from class: o.aXo.9
            @Override // o.GM.a
            public void c(DialDevice dialDevice) {
                C1044Mm.c("MdxStackDial", "Device found: %s", dialDevice.toString());
                C2067aYq e = new C2067aYq.e(dialDevice, C2038aXo.this).e();
                boolean z = ConfigFastPropertyFeatureControlConfig.Companion.I() || C8159dfC.b();
                synchronized (C2038aXo.this.b) {
                    if (dialDevice.g() || z) {
                        C2038aXo.this.c(dialDevice);
                    }
                    C2067aYq c2067aYq = (C2067aYq) C2038aXo.this.d(e.t());
                    if (c2067aYq != null) {
                        c2067aYq.c(dialDevice);
                        return;
                    }
                    C2038aXo.this.b.add(e);
                    UpnpDevice h = dialDevice.h();
                    SessionMdxTarget c = e.c();
                    String t = e.t();
                    if (c != null) {
                        if (C2038aXo.this.h.n().a(e) && (!e.i() || c.N())) {
                            if (c.d(EnumSet.of(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget)) && !c.G()) {
                                c.b(c.N());
                            } else {
                                C1044Mm.a("MdxStackDial", "Device is current target, so reconnecting to it");
                                c.b(false);
                            }
                        }
                        t = c.t();
                    }
                    C8264dhB.b(t, h.i(), h.g(), h.c());
                    C2038aXo.this.e.b();
                }
            }

            @Override // o.GM.a
            public void d(DialDevice dialDevice) {
                C2067aYq c2067aYq = (C2067aYq) C2038aXo.this.d(dialDevice.h().k().i());
                if (c2067aYq != null) {
                    synchronized (C2038aXo.this.b) {
                        SessionMdxTarget c = c2067aYq.c();
                        if (c == null || !c.N()) {
                            C1044Mm.c("MdxStackDial", "Device lost: %s", dialDevice.toString());
                            c2067aYq.g();
                            C2038aXo.this.b.remove(c2067aYq);
                            if (c2067aYq.a(C2038aXo.this.h())) {
                                C2038aXo.this.e.b(c2067aYq.t(), MdxErrorSubCode.DeviceIsLost.d(), c2067aYq.k());
                            }
                            C2038aXo.this.e.b();
                        }
                    }
                }
            }

            @Override // o.GM.a
            public void d(DialDevice dialDevice, DialDevice dialDevice2) {
                C1044Mm.c("MdxStackDial", "Device updated - old: %s, new: %s", dialDevice.toString(), dialDevice2.toString());
                synchronized (C2038aXo.this.b) {
                    C2067aYq c2067aYq = (C2067aYq) C2038aXo.this.d(dialDevice.h().k().i());
                    if (c2067aYq != null) {
                        c2067aYq.c(dialDevice2);
                        C2038aXo.this.e.b();
                    }
                }
            }

            @Override // o.GM.a
            public void d(Exception exc) {
                C1044Mm.e("MdxStackDial", "DIAL Discovery failed", exc);
            }
        };
        this.s = new C8450dma.c() { // from class: o.aXo.8
            @Override // o.C8450dma.c
            public void b(SsdpDevice ssdpDevice) {
                C1044Mm.c("MdxStackDial", "Found MDX Device: %s", ssdpDevice.toString());
                synchronized (C2038aXo.this.b) {
                    Iterator<AbstractC2065aYo<?>> it = C2038aXo.this.b.iterator();
                    while (it.hasNext()) {
                        AbstractC2065aYo<?> next = it.next();
                        if (next instanceof C2067aYq) {
                            C2067aYq c2067aYq = (C2067aYq) next;
                            C1044Mm.a("MdxStackDial", "Checking if DIAL target matches - target: %s", c2067aYq.n());
                            if (c2067aYq.n().equals(ssdpDevice.e())) {
                                SessionMdxTarget c = c2067aYq.c();
                                if (c == null) {
                                    C1044Mm.a("MdxStackDial", "Found matching DIAL target for MDX device.  Creating SessionMdxTarget");
                                    c = C2038aXo.this.a(c2067aYq, ssdpDevice);
                                    c2067aYq.e(c);
                                }
                                C1044Mm.a("MdxStackDial", "Checking if this is the current target.  Current: %s, MDX: %s", C2038aXo.this.h.n().b(), c2067aYq.t());
                                if (C2038aXo.this.h.n().a(c2067aYq) && (!c2067aYq.i() || c.N())) {
                                    boolean d = c.d(EnumSet.of(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget));
                                    if (!c.G() && d) {
                                        c.b(c.N());
                                    } else {
                                        C1044Mm.a("MdxStackDial", "Device is current target, so reconnecting to it");
                                        c.b(false);
                                    }
                                } else if (!c2067aYq.i() && !c2067aYq.a() && !c.N() && c.I() && Config_FastProperty_MdxPinLogin.Companion.d()) {
                                    C2038aXo.this.e.c(c.t(), MdxLoginPolicyEnum.LoginOnlyRequestedByTarget, c.k(), c.g("X-MDX-Remote-Login-Witcher-Session-Uuid"));
                                }
                                return;
                            }
                        }
                    }
                    String[] mdxOnlyDeviceEsnPrefixes = Config_FastProperty_MdxOnlyDeviceEsnPrefixes.getMdxOnlyDeviceEsnPrefixes();
                    String i = ssdpDevice.i();
                    String str = "";
                    if (i != null && i.length() >= 15) {
                        str = i.substring(0, 15).toLowerCase(Locale.US);
                    } else if (i != null) {
                        str = i;
                    }
                    C1044Mm.a("MdxStackDial", "Checking if device ESN matches MDX only device list - ESN: %s, MDX Only ESN Prefixes: %s", i, Arrays.toString(mdxOnlyDeviceEsnPrefixes));
                    SessionMdxTarget sessionMdxTarget = null;
                    for (String str2 : mdxOnlyDeviceEsnPrefixes) {
                        if (sessionMdxTarget != null) {
                            break;
                        }
                        C1044Mm.e("MdxStackDial", "Checking against MDX only prefix: " + str2);
                        if (str.contains(str2.toLowerCase(Locale.US))) {
                            Iterator<AbstractC2065aYo<?>> it2 = C2038aXo.this.b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                AbstractC2065aYo<?> next2 = it2.next();
                                if (!(next2 instanceof C2067aYq)) {
                                    C1044Mm.a("MdxStackDial", "Checking if MDX target matches - target: %s", next2.n());
                                    if (next2.n().equals(ssdpDevice.e())) {
                                        SessionMdxTarget sessionMdxTarget2 = (SessionMdxTarget) next2;
                                        if (sessionMdxTarget2.N()) {
                                            C1044Mm.c("MdxStackDial", "Remote login is now completed: %s", sessionMdxTarget2.k());
                                            sessionMdxTarget = sessionMdxTarget2;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (sessionMdxTarget == null) {
                                C1044Mm.a("MdxStackDial", "Device is MDX only, so creating target for it");
                                sessionMdxTarget = C2038aXo.this.b(ssdpDevice);
                                C2038aXo.this.b.add(sessionMdxTarget);
                                C2038aXo.this.e.b();
                            }
                            C8264dhB.b(sessionMdxTarget.t(), sessionMdxTarget.d(), sessionMdxTarget.e(), sessionMdxTarget.k());
                            if (C2038aXo.this.h.n().a(sessionMdxTarget) && (!sessionMdxTarget.i() || sessionMdxTarget.N())) {
                                boolean d2 = sessionMdxTarget.d(EnumSet.of(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget));
                                if (!sessionMdxTarget.G() && d2) {
                                    sessionMdxTarget.b(sessionMdxTarget.N());
                                } else {
                                    C1044Mm.a("MdxStackDial", "Device is current target, so reconnecting to it");
                                    sessionMdxTarget.b(false);
                                }
                            } else if (!sessionMdxTarget.i() && !sessionMdxTarget.a() && !sessionMdxTarget.N() && sessionMdxTarget.I() && Config_FastProperty_MdxPinLogin.Companion.d()) {
                                C2038aXo.this.e.c(sessionMdxTarget.t(), MdxLoginPolicyEnum.LoginOnlyRequestedByTarget, sessionMdxTarget.k(), sessionMdxTarget.g("X-MDX-Remote-Login-Witcher-Session-Uuid"));
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:38:0x011f, code lost:
                r7.d.e.b();
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
                return;
             */
            @Override // o.C8450dma.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void d(com.netflix.ssdp.SsdpDevice r8, java.lang.Exception r9) {
                /*
                    Method dump skipped, instructions count: 299
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C2038aXo.AnonymousClass8.d(com.netflix.ssdp.SsdpDevice, java.lang.Exception):void");
            }

            @Override // o.C8450dma.c
            public void a(SsdpDevice ssdpDevice, SsdpDevice ssdpDevice2) {
                SessionMdxTarget sessionMdxTarget;
                C1044Mm.c("MdxStackDial", "Updated MDX Device - Old: %s, New: %s", ssdpDevice.toString(), ssdpDevice2.toString());
                synchronized (C2038aXo.this.b) {
                    Iterator<AbstractC2065aYo<?>> it = C2038aXo.this.b.iterator();
                    while (it.hasNext()) {
                        AbstractC2065aYo<?> next = it.next();
                        if (next.n().equals(ssdpDevice.e())) {
                            if (next instanceof C2067aYq) {
                                sessionMdxTarget = ((C2067aYq) next).c();
                                if (sessionMdxTarget != null) {
                                    sessionMdxTarget.d(ssdpDevice2);
                                }
                            } else if (next instanceof SessionMdxTarget) {
                                sessionMdxTarget = (SessionMdxTarget) next;
                                sessionMdxTarget.d(ssdpDevice2);
                            } else {
                                sessionMdxTarget = null;
                            }
                            C2038aXo.this.e.b();
                            if (sessionMdxTarget != null && !sessionMdxTarget.i() && !sessionMdxTarget.a() && !sessionMdxTarget.N() && sessionMdxTarget.I() && Config_FastProperty_MdxPinLogin.Companion.d()) {
                                C2038aXo.this.e.c(sessionMdxTarget.t(), MdxLoginPolicyEnum.LoginOnlyRequestedByTarget, sessionMdxTarget.k(), sessionMdxTarget.g("X-MDX-Remote-Login-Witcher-Session-Uuid"));
                            }
                            return;
                        }
                    }
                }
            }

            @Override // o.C8450dma.c
            public void d(Exception exc) {
                C1044Mm.e("MdxStackDial", "MDX Discovery Failed", exc);
            }
        };
        C1044Mm.a("MdxStackDial", "Starting MdxStackDial");
        C1044Mm.a("MdxStackDial", "Creating MDX HTTP Server");
        this.r = new C2002aWf(this);
        boolean C = C();
        C1044Mm.a("MdxStackDial", "Creating Volley HTTP Client");
        C2009aWm c2009aWm = new C2009aWm(ahj);
        this.m = c2009aWm;
        HandlerThread handlerThread = new HandlerThread("MdxStackDialThread");
        this.t = handlerThread;
        handlerThread.start();
        this.k = new GM(c2009aWm, new Handler(handlerThread.getLooper()));
        this.p = new C8450dma(C8454dme.b);
        this.l = new Handler(handlerThread.getLooper());
        this.g = aWB.d.d(avm.agentContext.p(), avm.agentContext.l(), new aWA() { // from class: o.aXo.4
            @Override // o.aWA
            public void d(C2022aWz c2022aWz) {
                C2038aXo.this.b(c2022aWz);
            }

            @Override // o.aWA
            public void e(C2021aWy c2021aWy) {
                C2038aXo.this.b(c2021aWy);
            }
        }, C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final C2021aWy c2021aWy) {
        C1044Mm.a("MdxStackDial", "doSendAssociateResponse");
        this.l.post(new Runnable() { // from class: o.aXo.2
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.a("MdxStackDial", "doSendAssociateResponse sending now.");
                String b = c2021aWy.b();
                try {
                    C2038aXo.this.b(C2069aYs.b(c2021aWy), b, (String) null);
                } catch (UnsupportedEncodingException e) {
                    C1044Mm.b("MdxStackDial", e, "doSendAssociateResponse error", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final C2022aWz c2022aWz) {
        C1044Mm.a("MdxStackDial", "doSendAssociateRequest");
        this.l.post(new Runnable() { // from class: o.aXo.5
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.a("MdxStackDial", "doSendAssociateRequest sending now.");
                String e = c2022aWz.e();
                try {
                    C2038aXo.this.b(C2069aYs.a(c2022aWz), e, (String) null);
                } catch (UnsupportedEncodingException e2) {
                    C1044Mm.b("MdxStackDial", e2, "doSendAssociateRequest error", new Object[0]);
                }
            }
        });
    }

    public void a() {
        C1044Mm.a("MdxStackDial", "Enabling DIAL");
        this.l.post(new Runnable() { // from class: o.aXt
            @Override // java.lang.Runnable
            public final void run() {
                C2038aXo.this.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.k.b("Netflix", this.f13454o);
        this.p.d("urn:mdx-netflix-com:service:target:1", this.s);
    }

    public void c() {
        C1044Mm.a("MdxStackDial", "Disabling DIAL");
        this.l.post(new Runnable() { // from class: o.aXx
            @Override // java.lang.Runnable
            public final void run() {
                C2038aXo.this.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.k.b();
        this.p.e();
    }

    private void d(C8454dme c8454dme) {
        C1044Mm.c("MdxStackDial", "startDiscovery - onWifi: %b, inForeground: %b", Boolean.valueOf(this.f), Boolean.valueOf(this.j));
        if (this.f && this.j) {
            this.k.b("Netflix", this.f13454o, c8454dme);
            this.p.e("urn:mdx-netflix-com:service:target:1", this.s, c8454dme);
            C1044Mm.a("MdxStackDial", "Discovery Started");
        }
    }

    private void B() {
        d((C8454dme) null);
    }

    public void s() {
        c(false, (C8454dme) null);
    }

    public void c(final boolean z, final C8454dme c8454dme) {
        if (this.p.d()) {
            this.l.post(new Runnable() { // from class: o.aXl
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.this.b(z, c8454dme);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, C8454dme c8454dme) {
        C1044Mm.e("MdxStackDial", "restartMdxDiscovery - disabling then enabling");
        this.p.e();
        if (z) {
            a(true, new Function() { // from class: o.aXn
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Boolean e;
                    e = C2038aXo.this.e((AbstractC2065aYo) obj);
                    return e;
                }
            });
            this.p.b();
        }
        this.p.e("urn:mdx-netflix-com:service:target:1", this.s, c8454dme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean e(AbstractC2065aYo abstractC2065aYo) {
        for (SsdpDevice ssdpDevice : this.p.a()) {
            if (abstractC2065aYo != null && ssdpDevice != null && abstractC2065aYo.a(ssdpDevice.i())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void e(final boolean z, final C8454dme c8454dme) {
        if (this.k.a()) {
            this.l.post(new Runnable() { // from class: o.aXq
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.this.d(z, c8454dme);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z, C8454dme c8454dme) {
        C1044Mm.e("MdxStackDial", "restartDialDiscovery - disabling then enabling");
        this.k.b();
        if (z) {
            a(true, new Function() { // from class: o.aXm
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Boolean a;
                    a = C2038aXo.this.a((AbstractC2065aYo) obj);
                    return a;
                }
            });
            this.k.d();
        }
        this.k.b("Netflix", this.f13454o, c8454dme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean a(AbstractC2065aYo abstractC2065aYo) {
        for (DialDevice dialDevice : this.k.c()) {
            SsdpDevice k = dialDevice.h().k();
            if (abstractC2065aYo != null && k != null && abstractC2065aYo.a(k.i())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void a(boolean z, C8454dme c8454dme) {
        e(z, c8454dme);
        c(z, c8454dme);
    }

    public void p() {
        a(false, (C8454dme) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.p.b();
    }

    public void d() {
        this.l.post(new Runnable() { // from class: o.aXp
            @Override // java.lang.Runnable
            public final void run() {
                C2038aXo.this.q();
            }
        });
    }

    public void e(final String str, final boolean z, String str2, String str3) {
        C1044Mm.c("MdxStackDial", "Setting MDX network interface - name: %s, connected: %b", str, Boolean.valueOf(z));
        this.l.post(new Runnable() { // from class: o.aXk
            @Override // java.lang.Runnable
            public final void run() {
                C2038aXo.this.a(z, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, String str) {
        C1044Mm.e("MdxStackDial", "Resetting all device state, and forcing discovery");
        this.f = z && "WIFI".equals(str);
        this.k.b();
        this.k.d();
        this.p.e();
        this.p.b();
        c(true);
        B();
        if (z) {
            y();
        }
        this.e.b();
    }

    public void e(String str) {
        final C2067aYq c2067aYq = (C2067aYq) d(str);
        if (c2067aYq == null) {
            C1044Mm.e("MdxStackDial", "Failed to launch target.  No DIAL target exists with UUID: %s", str);
        } else {
            this.l.post(new Runnable() { // from class: o.aXs
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.this.e(c2067aYq);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(C2067aYq c2067aYq) {
        if (c2067aYq.p().g()) {
            this.i = SystemClock.elapsedRealtime() + (c2067aYq.p().i() * 2000);
            if (c2067aYq.p().d() == DialDevice.AppState.Unknown) {
                this.p.b(c2067aYq.p().h().k());
                c2067aYq.r();
            }
        }
        b(c2067aYq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aXo$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements GM.b {
        final /* synthetic */ C2067aYq a;

        AnonymousClass3(C2067aYq c2067aYq) {
            this.a = c2067aYq;
        }

        @Override // o.GM.b
        public void b(final DialDevice dialDevice) {
            C1044Mm.c("MdxStackDial", "Successfully got device state.  State: %s", dialDevice.d().e());
            Handler handler = C2038aXo.this.l;
            final C2067aYq c2067aYq = this.a;
            handler.post(new Runnable() { // from class: o.aXv
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.AnonymousClass3.this.b(dialDevice, c2067aYq);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(DialDevice dialDevice, C2067aYq c2067aYq) {
            if (dialDevice.d() != DialDevice.AppState.Running) {
                C1044Mm.a("MdxStackDial", "Target not running, so launching");
                C2038aXo.this.d(c2067aYq);
                return;
            }
            C1044Mm.a("MdxStackDial", "Target says it's already running - checking for MDX target");
            if (C2038aXo.this.d(c2067aYq, 5)) {
                C1044Mm.a("MdxStackDial", "Found MDX target, so launch was successful");
                c2067aYq.j();
                C2038aXo.this.e.b();
                return;
            }
            C1044Mm.a("MdxStackDial", "Didn't find MDX target, so launching target instead");
            C2038aXo.this.d(c2067aYq);
        }

        @Override // o.GM.b
        public void d(Exception exc) {
            if (this.a.p().g() && SystemClock.elapsedRealtime() < C2038aXo.this.i) {
                Handler handler = C2038aXo.this.l;
                final C2067aYq c2067aYq = this.a;
                handler.post(new Runnable() { // from class: o.aXy
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2038aXo.AnonymousClass3.this.b(c2067aYq);
                    }
                });
                return;
            }
            C1044Mm.e("MdxStackDial", "Failed to get device state prior to launch", exc);
            aVX.d b = new aVX.d(MdxErrorCode.ConnectFailed).b(MdxErrorSuffix.NRDP).b(MdxErrorSubCode.LaunchFailed);
            this.a.e(b.d("Failed to launch target: " + this.a.k()).d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(C2067aYq c2067aYq) {
            C2038aXo.this.p.b(c2067aYq.p().h().k());
            c2067aYq.r();
            C2038aXo.this.b(c2067aYq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C2067aYq c2067aYq) {
        this.k.d(c2067aYq.p().h(), "Netflix", new AnonymousClass3(c2067aYq));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aXo$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements GM.c {
        final /* synthetic */ C2067aYq a;

        AnonymousClass1(C2067aYq c2067aYq) {
            this.a = c2067aYq;
        }

        @Override // o.GM.c
        public void c() {
            C1044Mm.c("MdxStackDial", "Successfully sent launch request to target with UUID: %s", this.a.t());
            Handler handler = C2038aXo.this.l;
            final C2067aYq c2067aYq = this.a;
            handler.post(new Runnable() { // from class: o.aXu
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.AnonymousClass1.this.d(c2067aYq);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(C2067aYq c2067aYq) {
            C1044Mm.a("MdxStackDial", "Waiting to find MDX target");
            if (C2038aXo.this.d(c2067aYq, 30)) {
                C1044Mm.a("MdxStackDial", "MDX target found, so launch was successful");
                c2067aYq.j();
                C2038aXo.this.e.b();
                return;
            }
            C1044Mm.d("MdxStackDial", "Failed to find MDX device after launch");
            aVX.d b = new aVX.d(MdxErrorCode.ConnectFailed).b(MdxErrorSuffix.NRDP).b(MdxErrorSubCode.LaunchFailed);
            c2067aYq.e(b.d("Failed to find MDX device after launch for target: " + c2067aYq.k()).d());
        }

        @Override // o.GM.c
        public void e(final Exception exc) {
            C1044Mm.e("MdxStackDial", "Failed to launch target with UUID: " + this.a.t(), exc);
            Handler handler = C2038aXo.this.l;
            final C2067aYq c2067aYq = this.a;
            handler.post(new Runnable() { // from class: o.aXw
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.AnonymousClass1.d(C2067aYq.this, exc);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(C2067aYq c2067aYq, Exception exc) {
            c2067aYq.e(new aVX.d(MdxErrorCode.ConnectFailed).b(MdxErrorSuffix.NRDP).b(MdxErrorSubCode.LaunchFailed).d(String.format("Failed to launch target: %s.  Error: %s", c2067aYq.k(), exc.getMessage())).d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(C2067aYq c2067aYq) {
        this.k.c(c2067aYq.p().e(), "Netflix", new AnonymousClass1(c2067aYq));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(C2067aYq c2067aYq, int i) {
        if (c2067aYq.c() != null) {
            return true;
        }
        String e = c2067aYq.p().h().k().e();
        for (int i2 = 0; i2 < i; i2++) {
            try {
                for (SsdpDevice ssdpDevice : Collections.unmodifiableList(this.p.a("urn:mdx-netflix-com:service:target:1", this.s))) {
                    if (ssdpDevice.e().equals(e)) {
                        C1044Mm.a("MdxStackDial", "Found MDX device: %s", ssdpDevice);
                        if (c2067aYq.c() == null) {
                            c2067aYq.e(a(c2067aYq, ssdpDevice));
                        }
                        return true;
                    }
                }
            } catch (IOException unused) {
                C1044Mm.e("MdxStackDial", "Failed to get MDX device at hostname: %s", e);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SessionMdxTarget<?> a(C2067aYq c2067aYq, SsdpDevice ssdpDevice) {
        UpnpDevice h = c2067aYq.p().h();
        String d = d(ssdpDevice);
        String e = e(ssdpDevice);
        String i = ssdpDevice.i();
        SessionMdxTarget.PairingScheme c = c(ssdpDevice);
        C1044Mm.c("MdxStackDial", "Creating SessionMdxTarget with host: %s, port: %s, esn: %s, pairingScheme: %s", d, e, i, c);
        return ((SessionMdxTarget.b) ((SessionMdxTarget.b) ((SessionMdxTarget.b) new SessionMdxTarget.b(i, c2067aYq.k(), d, this, SessionMdxTarget.MsgTransportType.HTTP).a(e).c(c).d(h.i())).b(h.g())).e(h.f())).e(c2067aYq.p().g()).d(c2067aYq.s()).d(ssdpDevice.c()).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SessionMdxTarget<?> b(SsdpDevice ssdpDevice) {
        String d = d(ssdpDevice);
        String e = e(ssdpDevice);
        String i = ssdpDevice.i();
        SessionMdxTarget.PairingScheme c = c(ssdpDevice);
        String str = "";
        try {
            String str2 = ssdpDevice.c().get("X-Friendly-Name");
            try {
                if (C8168dfL.h(str2)) {
                    str = new String(C8071ddU.d(str2), StandardCharsets.UTF_8);
                }
            } catch (IOException e2) {
                e = e2;
                str = str2;
                C1044Mm.b("MdxStackDial", e, "Failed to Base64 decode friendly name - friendly name: " + str, new Object[0]);
                String str3 = str;
                C1044Mm.c("MdxStackDial", "Creating MDX only SessionMdxTarget with host: %s, port: %s, esn: %s, pairingScheme: %s", d, e, i, c);
                return new SessionMdxTarget.b(i, str3, d, this, SessionMdxTarget.MsgTransportType.HTTP).a(e).c(c).d(ssdpDevice.c()).c();
            }
        } catch (IOException e3) {
            e = e3;
        }
        String str32 = str;
        C1044Mm.c("MdxStackDial", "Creating MDX only SessionMdxTarget with host: %s, port: %s, esn: %s, pairingScheme: %s", d, e, i, c);
        return new SessionMdxTarget.b(i, str32, d, this, SessionMdxTarget.MsgTransportType.HTTP).a(e).c(c).d(ssdpDevice.c()).c();
    }

    private String d(SsdpDevice ssdpDevice) {
        return Uri.parse(ssdpDevice.b()).getHost();
    }

    private String e(SsdpDevice ssdpDevice) {
        return String.valueOf(Uri.parse(ssdpDevice.b()).getPort());
    }

    private SessionMdxTarget.PairingScheme a(String str) {
        int i;
        if (C8168dfL.i(str)) {
            i = Integer.parseInt(str);
        } else {
            C1044Mm.e("MdxStackDial", "registration acceptance header is not numeric: %s", str);
            i = 0;
        }
        if (i == 1) {
            return SessionMdxTarget.PairingScheme.REGPAIR;
        }
        if (i == 2 || i == 3) {
            return SessionMdxTarget.PairingScheme.REGPAIR_V2;
        }
        return SessionMdxTarget.PairingScheme.PAIRING;
    }

    private SessionMdxTarget.PairingScheme c(SsdpDevice ssdpDevice) {
        return a(ssdpDevice.c().get("X-Accepts-Registration"));
    }

    @Override // o.aWW
    public void b(String str, String str2, String str3) {
        C1044Mm.a("MdxStackDial", "sendMessage message=%s url=%s uuid=%s", str, str2, str3);
        this.m.a(str2, str, new AnonymousClass7(str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aXo$7  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass7 implements InterfaceC8457dmh.e {
        final /* synthetic */ String d;

        AnonymousClass7(String str) {
            this.d = str;
        }

        @Override // o.InterfaceC8457dmh.e
        public void c(final int i, Map<String, String> map, String str) {
            Handler handler = C2038aXo.this.l;
            final String str2 = this.d;
            handler.post(new Runnable() { // from class: o.aXD
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.AnonymousClass7.this.b(i, str2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, String str) {
            C1044Mm.d("MdxStackDial", "onSuccess:: statusCode=" + i);
            SessionMdxTarget<?> b = C2038aXo.this.b(str);
            if (b != null) {
                if (i < 200 || i >= 300) {
                    b.c(i);
                } else {
                    b.A();
                }
            }
        }

        @Override // o.InterfaceC8457dmh.e
        public void a(final Exception exc) {
            Handler handler = C2038aXo.this.l;
            final String str = this.d;
            handler.post(new Runnable() { // from class: o.aXB
                @Override // java.lang.Runnable
                public final void run() {
                    C2038aXo.AnonymousClass7.this.b(exc, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Exception exc, String str) {
            C1044Mm.d("MdxStackDial", "onError:: error=" + exc);
            SessionMdxTarget<?> b = C2038aXo.this.b(str);
            if (b != null) {
                b.c(500);
            }
        }
    }

    @Override // o.aWW
    public Looper l() {
        return this.l.getLooper();
    }

    @Override // o.aWW
    public void e() {
        this.l.post(new Runnable() { // from class: o.aXr
            @Override // java.lang.Runnable
            public final void run() {
                C2038aXo.this.u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.k.b();
        this.p.e();
        this.t.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DialDevice dialDevice) {
        this.n.put(dialDevice.h().r(), dialDevice);
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w() {
        /*
            r9 = this;
            java.lang.String r0 = "Error closing ObjectOutputStream"
            java.lang.String r1 = "Error closing FileOutputStream"
            java.lang.String r2 = "MdxStackDial"
            r3 = 0
            android.content.Context r4 = o.AbstractApplicationC1040Mh.d()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5e
            java.lang.String r5 = "dialDevices"
            r6 = 0
            java.io.FileOutputStream r4 = r4.openFileOutput(r5, r6)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5e
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L53
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L53
            java.util.Map<java.lang.String, com.netflix.dial.DialDevice> r3 = r9.n     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
        L21:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            com.netflix.dial.DialDevice r6 = (com.netflix.dial.DialDevice) r6     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.lang.Boolean r7 = r6.f()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            if (r7 != 0) goto L21
            r5.writeObject(r6)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            goto L21
        L3b:
            if (r4 == 0) goto L71
            r4.close()     // Catch: java.io.IOException -> L41
            goto L71
        L41:
            r3 = move-exception
            o.C1044Mm.e(r2, r1, r3)
            goto L71
        L46:
            r3 = move-exception
            goto L7e
        L48:
            r3 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L60
        L4d:
            r5 = move-exception
            r8 = r5
            r5 = r3
            r3 = r4
            r4 = r8
            goto L81
        L53:
            r5 = move-exception
            r8 = r5
            r5 = r3
            r3 = r4
            r4 = r8
            goto L60
        L59:
            r4 = move-exception
            r5 = r4
            r4 = r5
            r5 = r3
            goto L81
        L5e:
            r4 = move-exception
            r5 = r3
        L60:
            java.lang.String r6 = "Error storing Persistent Devices"
            o.C1044Mm.e(r2, r6, r4)     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L6f
            r3.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r3 = move-exception
            o.C1044Mm.e(r2, r1, r3)
        L6f:
            if (r5 == 0) goto L79
        L71:
            r5.close()     // Catch: java.io.IOException -> L75
            goto L79
        L75:
            r1 = move-exception
            o.C1044Mm.e(r2, r0, r1)
        L79:
            return
        L7a:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L7e:
            r8 = r4
            r4 = r3
            r3 = r8
        L81:
            if (r3 == 0) goto L8b
            r3.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r3 = move-exception
            o.C1044Mm.e(r2, r1, r3)
        L8b:
            if (r5 == 0) goto L95
            r5.close()     // Catch: java.io.IOException -> L91
            goto L95
        L91:
            r1 = move-exception
            o.C1044Mm.e(r2, r0, r1)
        L95:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2038aXo.w():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x00ed -> B:77:0x00f4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2038aXo.y():void");
    }

    public boolean c(String str) {
        AbstractC2065aYo<?> d = d(str);
        return (d instanceof C2067aYq) && ((C2067aYq) d).p().d() == DialDevice.AppState.Unknown;
    }

    private boolean C() {
        try {
            this.r.b();
            C1044Mm.a("MdxStackDial", "Started MDX HTTP Server");
            return true;
        } catch (IOException e) {
            String str = "Failed to start MDX HTTP Server on port: " + C2002aWf.e;
            C1044Mm.b("MdxStackDial", e, str, new Object[0]);
            this.c.c(e.getMessage());
            InterfaceC1598aHf.a(new C1596aHd(str).d(e).b(false).b(ErrorType.k));
            return false;
        }
    }

    public void a(JSONObject jSONObject) {
        char c;
        try {
            C1044Mm.e("MdxStackDial", "handleIncomingMdxMessage");
            if (this.g.c(jSONObject)) {
                C1044Mm.e("MdxStackDial", "handleIncomingMdxMessage was processed as ddr.");
                return;
            }
            String string = jSONObject.getString(SignupConstants.Error.DEBUG_INFO_ACTION);
            AbstractC2065aYo<?> h = h();
            SessionMdxTarget c2 = h != null ? h.c() : null;
            String optString = jSONObject.optString("targetuuid", jSONObject.optString("fromuuid"));
            if (c2 != null && c2.t().equals(optString)) {
                switch (string.hashCode()) {
                    case -1618876223:
                        if (string.equals("broadcast")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1032004855:
                        if (string.equals("pairingresponse")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -95157325:
                        if (string.equals("pingresponse")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 96784904:
                        if (string.equals(UmaAlert.ICON_ERROR)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 702600538:
                        if (string.equals("regpairerror")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 714217020:
                        if (string.equals("regpairreply")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1984987798:
                        if (string.equals("session")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                        c2.d(jSONObject);
                        return;
                    case 3:
                        c2.e(jSONObject);
                        return;
                    case 4:
                        c2.b(jSONObject);
                        return;
                    case 5:
                        c2.c(jSONObject);
                        return;
                    case 6:
                        c2.a(jSONObject);
                        return;
                    default:
                        C1044Mm.j("MdxStackDial", "handleIncomingMdxMessage, unknown message action: %s", string);
                        return;
                }
            } else if ("pingresponse".equals(string)) {
                C2067aYq c2067aYq = (C2067aYq) d(jSONObject.optString(SignupConstants.Field.LANG_ID));
                if (c2067aYq == null || c2067aYq.c() != null) {
                    return;
                }
                String optString2 = jSONObject.optString("responseheaders.X-Accepts-Registration", "3");
                UpnpDevice h2 = c2067aYq.p().h();
                c2067aYq.e(((SessionMdxTarget.b) ((SessionMdxTarget.b) ((SessionMdxTarget.b) new SessionMdxTarget.b(jSONObject.getString("fromuuid"), c2067aYq.k(), c2067aYq.n(), this, SessionMdxTarget.MsgTransportType.HTTP).a(String.valueOf(9080)).c(a(optString2)).d(h2.i())).b(h2.g())).e(h2.f())).e(c2067aYq.p().g()).d(c2067aYq.s()).d(h2.k().c()).c());
            } else {
                C1044Mm.j("MdxStackDial", "handleIncomingMdxMessage, no device to handle %s message", string);
            }
        } catch (JSONException e) {
            C1044Mm.e("MdxStackDial", "handleIncomingMdxMessage, JSONException %s", e);
        }
    }
}

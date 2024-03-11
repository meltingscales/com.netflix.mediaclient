package com.netflix.mediaclient.service.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.core.content.ContextCompat;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.cs.Call;
import com.netflix.cl.model.event.session.cs.CallEnded;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.voip.BaseVoipEngine;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipCallConfigData;
import com.netflix.mediaclient.servicemgr.CustomerServiceLogging;
import com.netflix.mediaclient.servicemgr.IVoip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC5079brw;
import o.C1044Mm;
import o.C5071bro;
import o.C5080brx;
import o.C8168dfL;
import o.InterfaceC1898aSi;
import o.InterfaceC5074brr;
import o.InterfaceC5098bsO;
import o.InterfaceC8098ddv;
import o.aMF;
import o.aOV;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class BaseVoipEngine implements IVoip {
    private static final ThreadFactory D = new ThreadFactory() { // from class: com.netflix.mediaclient.service.voip.BaseVoipEngine.2
        private final AtomicInteger b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "VoipTask #" + this.b.getAndIncrement());
        }
    };
    public Long a;
    public VoipCallConfigData b;
    public AudioManager c;
    public C5071bro d;
    protected aOV f;
    public AbstractC5079brw i;
    public Context j;
    public C5080brx n;
    public InterfaceC5098bsO q;
    public InterfaceC5074brr s;
    protected UserAgent u;
    public long v;
    public UUID w;
    public BroadcastReceiver x;
    public InterfaceC1898aSi y;

    /* renamed from: o  reason: collision with root package name */
    public List<IVoip.d> f13231o = Collections.synchronizedList(new ArrayList());
    protected IVoip.ConnectivityState h = IVoip.ConnectivityState.NO_CONNECTION;
    public ServiceState r = ServiceState.NOT_STARTED;
    public IVoip.b k = null;
    protected AtomicBoolean e = new AtomicBoolean(false);
    public AtomicBoolean l = new AtomicBoolean(false);
    public AtomicBoolean t = new AtomicBoolean(false);
    public Handler m = new Handler(Looper.getMainLooper());
    protected AudioManager.OnAudioFocusChangeListener p = new AudioManager.OnAudioFocusChangeListener() { // from class: com.netflix.mediaclient.service.voip.BaseVoipEngine.1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    };
    public Runnable g = new Runnable() { // from class: o.brm
        @Override // java.lang.Runnable
        public final void run() {
            BaseVoipEngine.this.s();
        }
    };

    /* loaded from: classes4.dex */
    public enum ServiceState {
        NOT_STARTED,
        STARTING,
        STARTED,
        STOPPING,
        STOPPED
    }

    public void a(VoipCallConfigData voipCallConfigData) {
        this.b = voipCallConfigData;
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public long c() {
        return this.v;
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean f() {
        return false;
    }

    protected abstract BroadcastReceiver i();

    public BaseVoipEngine(Context context, InterfaceC1898aSi interfaceC1898aSi, InterfaceC5098bsO interfaceC5098bsO, UserAgent userAgent, aOV aov, VoipCallConfigData voipCallConfigData) {
        this.j = context;
        this.y = interfaceC1898aSi;
        this.q = interfaceC5098bsO;
        this.u = userAgent;
        this.f = aov;
        this.b = voipCallConfigData;
        this.n = new C5080brx(context, (aMF) interfaceC1898aSi);
        this.s = InterfaceC8098ddv.c(context).a(context);
        this.c = (AudioManager) context.getSystemService("audio");
    }

    public boolean h() {
        aOV aov = this.f;
        if (aov == null || !((aMF) aov).isReady()) {
            return true;
        }
        return !this.f.aA();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public void e(IVoip.d dVar) {
        synchronized (this) {
            if (this.f13231o.contains(dVar)) {
                C1044Mm.j("nf_voip", "Listener is already added!");
            } else {
                this.f13231o.add(dVar);
            }
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean b(IVoip.d dVar) {
        boolean remove;
        synchronized (this) {
            remove = this.f13231o.remove(dVar);
        }
        return remove;
    }

    public void d() {
        synchronized (this) {
            C1044Mm.e("nf_voip", "--- DESTROY VOIP engine");
            this.p = null;
            this.g = null;
            this.x = null;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean g() {
        return this.l.get();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean j() {
        return this.h != IVoip.ConnectivityState.NO_CONNECTION && h();
    }

    public String V_() {
        return "sip:" + this.b.getCallAttributes().getDesinationNumber() + "@" + this.b.getCallAttributes().getDestinationAddress() + ":" + this.b.getCallAttributes().getDestinationPORT();
    }

    public void m() {
        C1044Mm.e("nf_voip", "Registering VOIP receiver...");
        Context context = this.j;
        if (context == null) {
            C1044Mm.e("nf_voip", "Context is null, nothing to register.");
            return;
        }
        ContextCompat.registerReceiver(context, i(), b(), 4);
        C1044Mm.e("nf_voip", "Registered VOIP receiver");
    }

    public static IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.netflix.mediaclient.intent.action.CALL_CANCEL");
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.VOIP");
        intentFilter.setPriority(999);
        return intentFilter;
    }

    public static boolean a(String str) {
        return "com.netflix.mediaclient.intent.action.CALL_CANCEL".equalsIgnoreCase(str);
    }

    public void q() {
        if (this.j == null) {
            C1044Mm.e("nf_voip", "Context is null, nothing to unregister.");
            return;
        }
        try {
            C1044Mm.e("nf_voip", "Unregistering VOIP receiver...");
            this.j.unregisterReceiver(i());
            C1044Mm.e("nf_voip", "Unregistered VOIP receiver");
        } catch (Exception e) {
            C1044Mm.e("nf_voip", "unregister VOIP receiver  " + e);
        }
    }

    public void t() {
        AudioManager audioManager = this.c;
        if (audioManager != null) {
            if (audioManager.getMode() == 3) {
                C1044Mm.e("nf_voip", "[AudioManager] already in MODE_IN_COMMUNICATION, skipping...");
                return;
            }
            C1044Mm.e("nf_voip", "[AudioManager] Mode: MODE_IN_COMMUNICATION");
            this.c.setMode(3);
        }
    }

    public void r() {
        if (this.e.getAndSet(true)) {
            C1044Mm.j("nf_voip", "Already asked for audio focus...");
            return;
        }
        AudioManager audioManager = (AudioManager) this.j.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.requestAudioFocus(this.p, 0, 1);
            } catch (Throwable th) {
                C1044Mm.e("nf_voip", "Failed to request audio focus", th);
            }
        }
    }

    public void l() {
        if (this.e.getAndSet(false)) {
            C1044Mm.e("nf_voip", "We had audio focus, release it.");
            AudioManager audioManager = (AudioManager) this.j.getSystemService("audio");
            if (audioManager != null) {
                try {
                    audioManager.abandonAudioFocus(this.p);
                } catch (Throwable th) {
                    C1044Mm.e("nf_voip", "Failed to request audio focus release", th);
                }
            }
        }
    }

    public void k() {
        this.h = IVoip.ConnectivityState.GREEN;
        this.s.c(this.q, this.m);
    }

    public void p() {
        CustomerServiceLogging.TerminationReason terminationReason;
        if (this.h != IVoip.ConnectivityState.NO_CONNECTION) {
            terminationReason = CustomerServiceLogging.TerminationReason.failedAfterConnected;
        } else {
            terminationReason = CustomerServiceLogging.TerminationReason.failedBeforeConnected;
        }
        ExtLogger.INSTANCE.endCommand("cs.CallCommand");
        Logger.INSTANCE.endSession(Action.createActionFailedEvent(this.a, e(terminationReason, null, "networkFailed")));
    }

    public void n() {
        CustomerServiceLogging.TerminationReason terminationReason;
        ExtLogger.INSTANCE.endCommand("cs.CallCommand");
        IVoip.ConnectivityState connectivityState = this.h;
        IVoip.ConnectivityState connectivityState2 = IVoip.ConnectivityState.NO_CONNECTION;
        if (connectivityState != connectivityState2) {
            terminationReason = CustomerServiceLogging.TerminationReason.canceledByUserAfterConnected;
        } else {
            terminationReason = CustomerServiceLogging.TerminationReason.canceledByUserBeforeConnected;
        }
        JSONObject d = d(terminationReason);
        Logger logger = Logger.INSTANCE;
        Session session = logger.getSession(this.a);
        if (session instanceof Call) {
            logger.endSession(new CallEnded((Call) session, d));
        }
        this.h = connectivityState2;
    }

    private JSONObject d(CustomerServiceLogging.TerminationReason terminationReason) {
        JSONObject jSONObject = null;
        if (this.i != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(this.i.x());
                if (terminationReason != null) {
                    try {
                        jSONObject2.put("terminationReason", terminationReason.name());
                        return jSONObject2;
                    } catch (JSONException e) {
                        e = e;
                        jSONObject = jSONObject2;
                        C1044Mm.b("nf_voip", e, "Failed to create call stats JSON!", new Object[0]);
                        return jSONObject;
                    }
                }
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
            }
        } else {
            try {
                JSONObject jSONObject3 = new JSONObject();
                if (terminationReason != null) {
                    try {
                        jSONObject3.put("terminationReason", terminationReason.name());
                        return jSONObject3;
                    } catch (JSONException e3) {
                        e = e3;
                        jSONObject = jSONObject3;
                        C1044Mm.b("nf_voip", e, "Failed to create call stats JSON!", new Object[0]);
                        return jSONObject;
                    }
                }
                return jSONObject3;
            } catch (JSONException e4) {
                e = e4;
            }
        }
        return jSONObject;
    }

    public void o() {
        InterfaceC1898aSi interfaceC1898aSi = this.y;
        if (interfaceC1898aSi != null) {
            interfaceC1898aSi.e(this.b.getUserToken(), this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        C1044Mm.e("nf_voip", "Back to landing page!");
        this.l.set(false);
        List<IVoip.d> list = this.f13231o;
        if (list != null) {
            for (IVoip.d dVar : list) {
                dVar.a(this.k);
            }
        }
    }

    public static void e() {
        Process.setThreadPriority(10);
        Process.setThreadPriority(-19);
    }

    public static boolean e(VoipCallConfigData voipCallConfigData) {
        return voipCallConfigData != null && voipCallConfigData.getCallAttributes() != null && C8168dfL.h(voipCallConfigData.getCallAttributes().getDesinationNumber()) && C8168dfL.h(voipCallConfigData.getCallAttributes().getDestinationPORT()) && C8168dfL.h(voipCallConfigData.getCallAttributes().getDestinationAddress());
    }

    protected static String e(CustomerServiceLogging.TerminationReason terminationReason, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sipCode", str);
            if (C8168dfL.h(str2)) {
                jSONObject.put("reason", str2);
            }
            return new Error(str2, null, jSONObject).toJSONObject().toString();
        } catch (JSONException e) {
            C1044Mm.b("nf_voip", e, "Failed on JSON", new Object[0]);
            return null;
        }
    }
}

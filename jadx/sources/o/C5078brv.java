package o;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SmartDisplay;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgentImpl;
import com.netflix.mediaclient.service.voip.BaseVoipEngine;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipCallAttributes;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipCallConfigData;
import com.netflix.mediaclient.servicemgr.IVoip;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.brv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5078brv extends aMF implements InterfaceC1898aSi {
    private final C1890aSa c;
    private final aOV e;
    private final UserAgentImpl j;
    private BaseVoipEngine f = null;
    private VoipCallAttributes.SDKTypes b = null;
    private AtomicBoolean d = new AtomicBoolean(!C8054ddD.j());
    private final PhoneStateListener a = new PhoneStateListener() { // from class: o.brv.2
        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            if (i == 0) {
                C1044Mm.a("nf_voip_agent", "onCallStateChanged: CALL_STATE_IDLE");
            } else if (i == 1) {
                C1044Mm.a("nf_voip_agent", "onCallStateChanged: CALL_STATE_RINGING");
            } else if (i == 2) {
                if (C5078brv.this.f == null || !C5078brv.this.f.g()) {
                    return;
                }
                C1044Mm.e("nf_voip_agent", "Incoming PSTN call answered, disconnecting VoIP");
                C5078brv.this.f.A();
            } else {
                C1044Mm.a("nf_voip_agent", "UNKNOWN_STATE: " + i);
            }
        }
    };

    @Override // o.aMF
    public String agentName() {
        return "voip";
    }

    public IVoip c() {
        return this.f;
    }

    public C5078brv(C1812aPd c1812aPd, UserAgentImpl userAgentImpl) {
        this.e = c1812aPd;
        this.j = userAgentImpl;
        this.c = new C1890aSa(getContext(), c1812aPd);
    }

    @Override // o.InterfaceC1898aSi
    public void e(boolean z) {
        this.d.set(z);
    }

    @Override // o.InterfaceC1898aSi
    public boolean b() {
        return getConfigurationAgent() != null && getConfigurationAgent().ac() != null && getConfigurationAgent().ac().isEnableVoip() && f();
    }

    private boolean f() {
        return !C8150deu.f() || (C8150deu.f() && Config_FastProperty_SmartDisplay.Companion.c());
    }

    @Override // o.InterfaceC1898aSi
    public boolean e() {
        if (!C8054ddD.j()) {
            return ((TelephonyManager) getContext().getSystemService("phone")).getCallState() == 0;
        }
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        return (audioManager == null || audioManager.getMode() == 2) ? false : true;
    }

    @Override // o.InterfaceC1898aSi
    public void c(final InterfaceC1832aPx interfaceC1832aPx) {
        InterfaceC1832aPx interfaceC1832aPx2 = new InterfaceC1832aPx() { // from class: o.brv.3
            @Override // o.InterfaceC1832aPx
            public void c(VoipCallConfigData voipCallConfigData, Status status) {
                InterfaceC1832aPx interfaceC1832aPx3 = interfaceC1832aPx;
                if (interfaceC1832aPx3 != null) {
                    interfaceC1832aPx3.c(voipCallConfigData, status);
                }
            }
        };
        TQ netflixPlatform = getNetflixPlatform();
        C1890aSa c1890aSa = this.c;
        List<String> e = aRZ.e();
        UserAgentImpl userAgentImpl = this.j;
        netflixPlatform.c(c1890aSa.a(e, interfaceC1832aPx2, userAgentImpl != null && userAgentImpl.v()));
    }

    @Override // o.InterfaceC1898aSi
    public void e(String str, AbstractC5079brw abstractC5079brw) {
        getNetflixPlatform().c(this.c.b(str, abstractC5079brw));
    }

    @Override // o.InterfaceC1898aSi
    public boolean d() {
        return this.d.get();
    }

    @Override // o.InterfaceC1898aSi
    public IVoip a(VoipCallConfigData voipCallConfigData) {
        BaseVoipEngine baseVoipEngine;
        if (!BaseVoipEngine.e(voipCallConfigData)) {
            C1044Mm.d("nf_voip_agent", "Invalid call config data");
            return null;
        }
        VoipCallAttributes.SDKTypes sdkType = voipCallConfigData.getCallAttributes().getSdkType();
        VoipCallAttributes.SDKTypes sDKTypes = this.b;
        if (sDKTypes != null && sDKTypes.equals(sdkType) && (baseVoipEngine = this.f) != null) {
            baseVoipEngine.a(voipCallConfigData);
            return this.f;
        }
        h();
        this.f = new C5076brt(getContext(), this, getServiceNotificationHelper(), this.j, this.e, voipCallConfigData, getErrorHandler());
        C1044Mm.e("nf_voip_agent", "Instantiating Linphone VoIP engine");
        try {
            ((TelephonyManager) getContext().getSystemService("phone")).listen(this.a, 32);
        } catch (Exception e) {
            C1044Mm.d("nf_voip_agent", e.getMessage());
        }
        this.b = sdkType;
        this.f.m();
        return this.f;
    }

    @Override // o.InterfaceC1898aSi
    public void a() {
        h();
        ((TelephonyManager) getContext().getSystemService("phone")).listen(this.a, 0);
    }

    private void h() {
        if (this.f != null) {
            C1044Mm.e("nf_voip_agent", "--- VOIPAGENT destroyVoipEngineIfExist");
            this.f.q();
            this.f.B();
            this.f.d();
            this.f = null;
            this.b = null;
        }
    }

    @Override // o.aMF
    public void doInit() {
        initCompleted(InterfaceC1078Nw.aJ);
    }

    @Override // o.aMF, o.aMG
    public boolean isReady() {
        boolean z;
        synchronized (this) {
            BaseVoipEngine baseVoipEngine = this.f;
            if (baseVoipEngine != null) {
                z = baseVoipEngine.y();
            }
        }
        return z;
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.VOIP_AGENT_LOADED;
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.ab;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_VOIP;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_VOIP;
    }

    @Override // o.aMF
    public void destroy() {
        h();
    }
}

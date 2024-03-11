package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.cs.Call;
import com.netflix.cl.model.event.session.command.MuteCommand;
import com.netflix.cl.model.event.session.command.UnmuteCommand;
import com.netflix.cl.model.event.session.command.cs.CallCommand;
import com.netflix.cl.model.event.session.cs.CallEnded;
import com.netflix.mediaclient.service.net.LogMobileType;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.voip.BaseVoipEngine;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipCallConfigData;
import com.netflix.mediaclient.servicemgr.IVoip;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C5071bro;
import o.aJN;
import org.json.JSONObject;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAuthInfo;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListener;
import org.linphone.core.LinphoneEvent;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneFriendList;
import org.linphone.core.LinphoneInfoMessage;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.PayloadType;
import org.linphone.core.PublishState;
import org.linphone.core.SubscriptionState;
import org.linphone.mediastream.Version;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.brt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5076brt extends BaseVoipEngine implements LinphoneCoreListener, C5071bro.b {
    private static final Handler C = new Handler(Looper.getMainLooper());
    private static final AtomicBoolean z = new AtomicBoolean(false);
    private LinphoneAddress A;
    private final InterfaceC5128bss B;
    private final AtomicBoolean D;
    private Timer E;
    private final String F;
    private LinphoneCore G;
    private final String H;
    private final String I;

    @Override // org.linphone.core.LinphoneCoreListener
    public void authInfoRequested(LinphoneCore linphoneCore, String str, String str2, String str3) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void authenticationRequested(LinphoneCore linphoneCore, LinphoneAuthInfo linphoneAuthInfo, LinphoneCore.AuthMethod authMethod) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void callEncryptionChanged(LinphoneCore linphoneCore, LinphoneCall linphoneCall, boolean z2, String str) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void configuringStatus(LinphoneCore linphoneCore, LinphoneCore.RemoteProvisioningState remoteProvisioningState, String str) {
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public void d(double d) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void displayMessage(LinphoneCore linphoneCore, String str) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void displayStatus(LinphoneCore linphoneCore, String str) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void displayWarning(LinphoneCore linphoneCore, String str) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void dtmfReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, int i) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void ecCalibrationStatus(LinphoneCore linphoneCore, LinphoneCore.EcCalibratorStatus ecCalibratorStatus, int i, Object obj) {
    }

    @Override // com.netflix.mediaclient.service.voip.BaseVoipEngine, com.netflix.mediaclient.servicemgr.IVoip
    public boolean f() {
        return false;
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void fileTransferProgressIndication(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void fileTransferRecv(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, byte[] bArr, int i) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public int fileTransferSend(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, ByteBuffer byteBuffer, int i) {
        return 0;
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void friendListCreated(LinphoneCore linphoneCore, LinphoneFriendList linphoneFriendList) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void friendListRemoved(LinphoneCore linphoneCore, LinphoneFriendList linphoneFriendList) {
    }

    @Override // com.netflix.mediaclient.service.voip.BaseVoipEngine
    public BroadcastReceiver i() {
        return this.x;
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void infoReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneInfoMessage linphoneInfoMessage) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void isComposingReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void messageReceivedUnableToDecrypted(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void networkReachableChanged(LinphoneCore linphoneCore, boolean z2) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, LinphoneCore.RegistrationState registrationState, String str) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void show(LinphoneCore linphoneCore) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void subscriptionStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, SubscriptionState subscriptionState) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void transferState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2) {
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void uploadStateChanged(LinphoneCore linphoneCore, LinphoneCore.LogCollectionUploadState logCollectionUploadState, String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5076brt(Context context, C5078brv c5078brv, InterfaceC5098bsO interfaceC5098bsO, UserAgent userAgent, aOV aov, VoipCallConfigData voipCallConfigData, InterfaceC5128bss interfaceC5128bss) {
        super(context, c5078brv, interfaceC5098bsO, userAgent, aov, voipCallConfigData);
        this.A = null;
        this.D = new AtomicBoolean(false);
        this.G = null;
        this.I = context.getFilesDir().getAbsolutePath() + "/.linphonerc";
        this.H = context.getFilesDir().getAbsolutePath() + "/linphonerc";
        this.F = context.getFilesDir().getAbsolutePath() + "/rootca.pem";
        this.B = interfaceC5128bss;
        this.x = new BroadcastReceiver() { // from class: o.brt.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String action = intent.getAction();
                if (intent.hasCategory("com.netflix.mediaclient.intent.category.VOIP")) {
                    if (BaseVoipEngine.a(action)) {
                        C1044Mm.e("nf_voip_linphone", "Intent to cancel call received");
                        C5076brt.this.A();
                        return;
                    }
                    C1044Mm.b("nf_voip_linphone", "Uknown VOIP action!", intent);
                    return;
                }
                C1044Mm.b("nf_voip_linphone", "Received intent with uknown category!", intent);
            }
        };
    }

    @Override // o.C5071bro.b
    public void a() {
        C1044Mm.e("nf_voip_linphone", "Routing audio to earpiece, disabling bluetooth audio route");
        if (this.d != null && this.y.d()) {
            this.d.a();
        }
        LinphoneCore linphoneCore = this.G;
        if (linphoneCore != null) {
            linphoneCore.enableSpeaker(false);
        }
    }

    public boolean z() {
        C5071bro c5071bro;
        if (this.y.d() && (c5071bro = this.d) != null && c5071bro.e()) {
            return this.d.i();
        }
        return false;
    }

    public boolean C() {
        if (this.t.get()) {
            return true;
        }
        if (!h()) {
            C1044Mm.e("nf_voip_linphone", "VOIP service is NOT enabled, no need to start it.");
            return true;
        }
        return N();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public void B() {
        C1044Mm.e("nf_voip_linphone", "stop() called");
        L();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean y() {
        boolean z2;
        synchronized (this) {
            if (this.t.get()) {
                z2 = this.G != null;
            }
        }
        return z2;
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean u() {
        synchronized (this) {
            if (this.l.get()) {
                C1044Mm.e("nf_voip_linphone", "Request for dial is already in progress!");
                return true;
            }
            UUID c2 = AbstractC8266dhD.c();
            this.w = c2;
            Logger logger = Logger.INSTANCE;
            this.a = logger.startSession(new Call("", null, null, c2.toString(), null, null));
            logger.startSession(new CallCommand());
            this.l.set(true);
            final Runnable runnable = new Runnable() { // from class: o.brp
                @Override // java.lang.Runnable
                public final void run() {
                    C5076brt.this.J();
                }
            };
            new Thread(new Runnable() { // from class: o.brs
                @Override // java.lang.Runnable
                public final void run() {
                    C5076brt.this.b(runnable);
                }
            }).start();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        if (!this.t.get()) {
            C1044Mm.e("nf_voip_linphone", "Wait to start dial when callback that VOIP service is started returns!");
            this.D.set(true);
            return;
        }
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        C1044Mm.e("nf_voip_linphone", "start");
        C();
        C8187dfe.c(runnable);
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean A() {
        synchronized (this) {
            C1044Mm.e("nf_voip_linphone", "--- TERMINATE Call");
            LinphoneCore linphoneCore = this.G;
            if (linphoneCore == null) {
                C1044Mm.d("nf_voip_linphone", "Engine is null, unable to terminate call!");
                return false;
            }
            if (this.k == null) {
                C1044Mm.d("nf_voip_linphone", "Current call is null, unable to terminate call!");
            } else if (linphoneCore.isIncall()) {
                n();
                this.G.terminateCall(((c) this.k).c());
            }
            return true;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public void e(boolean z2) {
        LinphoneCore linphoneCore = this.G;
        if (linphoneCore != null) {
            linphoneCore.muteMic(z2);
            if (z2) {
                Logger.INSTANCE.startSession(new MuteCommand());
                ExtLogger.INSTANCE.endCommand("MuteCommand");
                return;
            }
            Logger.INSTANCE.startSession(new UnmuteCommand());
            ExtLogger.INSTANCE.endCommand("UnmuteCommand");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public void a(boolean z2) {
        if (this.G != null) {
            if (z2 || (!z2 && !z())) {
                this.G.enableSpeaker(z2);
            }
            this.n.b(z2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("speakerOnEvent", z2);
                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
            } catch (Exception e) {
                C1044Mm.b("nf_voip_linphone", e, "Failed to log event!", new Object[0]);
            }
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean w() {
        LinphoneCore linphoneCore = this.G;
        if (linphoneCore != null) {
            return linphoneCore.isMicMuted();
        }
        AudioManager audioManager = this.c;
        return audioManager != null && audioManager.isMicrophoneMute();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public boolean v() {
        if (this.G == null) {
            AudioManager audioManager = this.c;
            return audioManager != null && audioManager.isSpeakerphoneOn();
        } else if (this.d != null && !this.y.d()) {
            return this.G.isSpeakerEnabled();
        } else {
            if (this.y.d() && I()) {
                return !this.d.d();
            }
            return this.G.isSpeakerEnabled();
        }
    }

    private boolean I() {
        C5071bro c5071bro = this.d;
        if (c5071bro == null) {
            return false;
        }
        try {
            return c5071bro.e();
        } catch (Throwable th) {
            C1044Mm.b("nf_voip_linphone", th, "This should not happen, report!", new Object[0]);
            InterfaceC1597aHe.c("VOIP: check if bluetooth headset is available fails! Android OS version: " + C8054ddD.c(), th);
            return false;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public void e(char c2) {
        if (this.G != null) {
            C1044Mm.a("nf_voip_linphone", "Sending DTMF code %s", Character.valueOf(c2));
            this.G.sendDtmf(c2);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip
    public void D() {
        LinphoneCore linphoneCore = this.G;
        if (linphoneCore != null) {
            linphoneCore.stopDtmf();
        }
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void globalState(LinphoneCore linphoneCore, LinphoneCore.GlobalState globalState, String str) {
        synchronized (this) {
            C1044Mm.a("nf_voip_linphone", "globalState %s", globalState.toString());
            if (globalState == LinphoneCore.GlobalState.GlobalOn) {
                c(linphoneCore);
                this.r = BaseVoipEngine.ServiceState.STARTED;
                for (IVoip.d dVar : this.f13231o) {
                    dVar.c(true);
                }
                if (this.D.get()) {
                    this.D.set(false);
                    H();
                }
            } else if (globalState == LinphoneCore.GlobalState.GlobalShutdown) {
                this.r = BaseVoipEngine.ServiceState.STOPPING;
            } else if (globalState == LinphoneCore.GlobalState.GlobalOff) {
                this.r = BaseVoipEngine.ServiceState.STOPPED;
            }
        }
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCall.State state, String str) {
        C1044Mm.a("nf_voip_linphone", "Call state: %s (%s)", state, str);
        if (state == LinphoneCall.State.OutgoingInit) {
            d(linphoneCall);
        } else if (state == LinphoneCall.State.OutgoingRinging && this.k != null) {
            e(linphoneCall);
        } else if (state == LinphoneCall.State.Connected) {
            b(linphoneCall);
        } else if (state == LinphoneCall.State.StreamsRunning) {
            c(linphoneCall);
        } else if (state == LinphoneCall.State.CallEnd) {
            a(linphoneCall);
        } else if (state == LinphoneCall.State.CallReleased) {
            M();
        } else if (state == LinphoneCall.State.Error) {
            d(linphoneCall, str);
        }
    }

    @Override // org.linphone.core.LinphoneCoreListener
    public void callStatsUpdated(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCallStats linphoneCallStats) {
        if (linphoneCall == null || linphoneCall.getAudioStats() == null) {
            return;
        }
        AbstractC5079brw abstractC5079brw = this.i;
        if (abstractC5079brw == null) {
            this.i = AbstractC5079brw.y().c("linphone").a(((c) this.k).a()).c(((c) this.k).b()).a(linphoneCall.getAudioStats().getDownloadBandwidth()).n(linphoneCall.getAudioStats().getUploadBandwidth()).h(linphoneCall.getAudioStats().getNumberPacketsSent()).a(linphoneCall.getAudioStats().getNumberPacketsReceived()).c(linphoneCall.getAudioStats().getLatePacketsCumulativeNumber()).d(linphoneCall.getAudioStats().getCumulativePacketsLost()).b(linphoneCall.getAudioStats().getNumberBytesSent()).e(linphoneCall.getAudioStats().getNumberBytesReceived()).o(linphoneCall.getAudioStats().getReceiverLossRate()).l(linphoneCall.getAudioStats().getSenderLossRate()).i(linphoneCall.getAudioStats().getSenderInterarrivalJitter()).f(linphoneCall.getAudioStats().getSenderInterarrivalJitter()).c(linphoneCall.getAudioStats().getSenderInterarrivalJitter()).j(linphoneCall.getAudioStats().getReceiverInterarrivalJitter()).d(linphoneCall.getAudioStats().getReceiverInterarrivalJitter()).b(linphoneCall.getAudioStats().getReceiverInterarrivalJitter()).h(linphoneCall.getAudioStats().getRoundTripDelay()).g(linphoneCall.getAudioStats().getRoundTripDelay()).e(linphoneCall.getAudioStats().getRoundTripDelay()).d();
        } else {
            float downloadBandwidth = linphoneCall.getAudioStats().getDownloadBandwidth();
            float uploadBandwidth = linphoneCall.getAudioStats().getUploadBandwidth();
            long numberBytesSent = linphoneCall.getAudioStats().getNumberBytesSent();
            long numberBytesReceived = linphoneCall.getAudioStats().getNumberBytesReceived();
            long numberPacketsSent = linphoneCall.getAudioStats().getNumberPacketsSent();
            long numberPacketsReceived = linphoneCall.getAudioStats().getNumberPacketsReceived();
            long latePacketsCumulativeNumber = linphoneCall.getAudioStats().getLatePacketsCumulativeNumber();
            long cumulativePacketsLost = linphoneCall.getAudioStats().getCumulativePacketsLost();
            float senderLossRate = linphoneCall.getAudioStats().getSenderLossRate();
            float receiverLossRate = linphoneCall.getAudioStats().getReceiverLossRate();
            float senderInterarrivalJitter = linphoneCall.getAudioStats().getSenderInterarrivalJitter();
            float receiverInterarrivalJitter = linphoneCall.getAudioStats().getReceiverInterarrivalJitter();
            this.i = abstractC5079brw.c(downloadBandwidth, uploadBandwidth, numberBytesSent, numberBytesReceived, numberPacketsSent, numberPacketsReceived, latePacketsCumulativeNumber, cumulativePacketsLost, senderLossRate, receiverLossRate, senderInterarrivalJitter * 1000.0f, receiverInterarrivalJitter * 1000.0f, linphoneCall.getAudioStats().getRoundTripDelay());
        }
        C1044Mm.e("nf_voip_linphone", "================== CALL STATISTICS ========================");
        C1044Mm.a("nf_voip_linphone", "        CODEC:                  %s/%s", this.i.g(), Integer.valueOf(this.i.p()));
        C1044Mm.a("nf_voip_linphone", "        Download bandwidth:     %.2f kbits/sec", Float.valueOf(this.i.f()));
        C1044Mm.a("nf_voip_linphone", "        Upload bandwidth:       %.2f kbits/sec", Float.valueOf(this.i.u()));
        C1044Mm.a("nf_voip_linphone", "        Sender loss rate:       %.2f", Float.valueOf(this.i.v()));
        C1044Mm.a("nf_voip_linphone", "        Receiver loss rate:     %.2f", Float.valueOf(this.i.s()));
        C1044Mm.a("nf_voip_linphone", "        Packets/Bytes sent:     %d packets / %d bytes", Long.valueOf(this.i.t()), Long.valueOf(this.i.a()));
        C1044Mm.a("nf_voip_linphone", "        Packets/Bytes received: %d packets / %d bytes", Long.valueOf(this.i.r()), Long.valueOf(this.i.d()));
        C1044Mm.a("nf_voip_linphone", "        Lost cumlative packets: %d", Long.valueOf(this.i.i()));
        C1044Mm.a("nf_voip_linphone", "        Late cumlative packets: %d", Long.valueOf(this.i.j()));
        C1044Mm.a("nf_voip_linphone", "        Remote RX Jitter :      %.2f ms average, MIN: %.2f ms, MAX: %.2f ms", Float.valueOf(this.i.b()), Float.valueOf(this.i.m()), Float.valueOf(this.i.h()));
        C1044Mm.a("nf_voip_linphone", "        Local TX  Jitter :      %.2f ms average, MIN: %.2f ms, MAX: %.2f ms", Float.valueOf(this.i.c()), Float.valueOf(this.i.k()), Float.valueOf(this.i.l()));
        C1044Mm.a("nf_voip_linphone", "        Jitter buffer size:     %.2f ms", Float.valueOf(linphoneCall.getAudioStats().getJitterBufferSize()));
        C1044Mm.a("nf_voip_linphone", "        Roundtrip delay:        %.2f ms average, MIN: %.2f ms, MAX: %.2f ms", Float.valueOf(this.i.e()), Float.valueOf(this.i.n()), Float.valueOf(this.i.o()));
        C1044Mm.e("nf_voip_linphone", "===========================================================");
    }

    private void b(int i, String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        e(i, file.getName());
    }

    private void e(int i, String str) {
        try {
            FileOutputStream openFileOutput = this.j.openFileOutput(str, 0);
            InputStream openRawResource = this.j.getResources().openRawResource(i);
            byte[] bArr = new byte[8048];
            while (true) {
                int read = openRawResource.read(bArr);
                if (read != -1) {
                    openFileOutput.write(bArr, 0, read);
                } else {
                    openFileOutput.flush();
                    openFileOutput.close();
                    openRawResource.close();
                    return;
                }
            }
        } catch (IOException e) {
            C1044Mm.e("nf_voip_linphone", "Cannot copy config from package with id %d to file %s, message:%s", Integer.valueOf(i), str, e.getMessage());
        }
    }

    private boolean N() {
        synchronized (this) {
            C1044Mm.a("nf_voip_linphone", "startLinphoneCore");
            if (K()) {
                if (this.G != null && this.r == BaseVoipEngine.ServiceState.STARTED) {
                    C1044Mm.e("nf_voip_linphone", "Linphone engine already started");
                    return true;
                }
                if (this.d == null) {
                    this.d = new C5071bro(this.j, this);
                }
                try {
                    b(aJN.c.e, this.I);
                    e(aJN.c.a, new File(this.H).getName());
                    e(aJN.c.d, new File(this.F).getName());
                    LinphoneCore createLinphoneCore = LinphoneCoreFactory.instance().createLinphoneCore(this, this.I, this.H, null, this.j);
                    this.G = createLinphoneCore;
                    final b bVar = new b(createLinphoneCore, this.r);
                    TimerTask timerTask = new TimerTask() { // from class: o.brt.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            if (C5076brt.this.G != null) {
                                C5076brt.C.post(bVar);
                            }
                        }
                    };
                    Timer timer = new Timer("LinphoneVoipEngine scheduler");
                    this.E = timer;
                    timer.schedule(timerTask, 0L, 100L);
                    this.r = BaseVoipEngine.ServiceState.STARTING;
                    return true;
                } catch (LinphoneCoreException e) {
                    C1044Mm.e("nf_voip_linphone", "Could not create LinphoneCore instance, %s", e.getMessage());
                    return false;
                }
            }
            return false;
        }
    }

    private boolean K() {
        C1044Mm.a("nf_voip_linphone", "loadLinphoneLibs");
        Context b2 = C8054ddD.b(this.j);
        if (b2 != null) {
            try {
                SplitInstallHelper.loadLibrary(b2, "c++_shared");
                SplitInstallHelper.loadLibrary(b2, "bctoolbox");
                SplitInstallHelper.loadLibrary(b2, "ortp");
                SplitInstallHelper.loadLibrary(b2, "mediastreamer_base");
                SplitInstallHelper.loadLibrary(b2, "mediastreamer_voip");
                SplitInstallHelper.loadLibrary(b2, "linphone");
                Version.dumpCapabilities();
                return true;
            } catch (UnsatisfiedLinkError e) {
                InterfaceC1597aHe.c("SPY-35111 - UnsatisfiedLinkError for voip", e);
                return false;
            } catch (Throwable th) {
                InterfaceC1597aHe.c("SPY-35111 - Other error for voip", th);
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.brt$b */
    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        private final WeakReference<BaseVoipEngine.ServiceState> a;
        private final WeakReference<LinphoneCore> c;

        protected b(LinphoneCore linphoneCore, BaseVoipEngine.ServiceState serviceState) {
            this.c = new WeakReference<>(linphoneCore);
            this.a = new WeakReference<>(serviceState);
        }

        @Override // java.lang.Runnable
        public void run() {
            LinphoneCore linphoneCore = this.c.get();
            BaseVoipEngine.ServiceState serviceState = this.a.get();
            if (linphoneCore == null || serviceState == null || serviceState != BaseVoipEngine.ServiceState.STARTED || C5076brt.z.get()) {
                return;
            }
            linphoneCore.iterate();
        }
    }

    private boolean d(List<String> list, String str) {
        for (String str2 : list) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void c(LinphoneCore linphoneCore) {
        PayloadType[] audioCodecs;
        LinphoneCore linphoneCore2;
        boolean z2;
        synchronized (this) {
            try {
                try {
                    C1044Mm.e("nf_voip_linphone", "--- INIT VOIP engine");
                } catch (PackageManager.NameNotFoundException e) {
                    C1044Mm.e("nf_voip_linphone", "Cannot get version name, %s", e.getMessage());
                }
            } catch (LinphoneCoreException e2) {
                C1044Mm.e("nf_voip_linphone", "Could not create LinphoneCore instance, %s", e2.getMessage());
            }
            if (z.get()) {
                C1044Mm.j("nf_voip_linphone", "Currently Stopping, cannot init!");
                return;
            }
            this.G = linphoneCore;
            linphoneCore.setRootCA(this.F);
            this.G.setCpuCount(Runtime.getRuntime().availableProcessors());
            this.G.enableVideo(false, false);
            this.G.setNetworkReachable(true);
            this.G.setMediaEncryption(LinphoneCore.MediaEncryption.SRTP);
            this.G.enableEchoCancellation(true);
            this.G.enableAdaptiveRateControl(true);
            this.G.setUseRfc2833ForDtmfs(true);
            if (this.b.getCallAttributes().getCodecs() != null && !this.b.getCallAttributes().getCodecs().isEmpty()) {
                for (PayloadType payloadType : this.G.getAudioCodecs()) {
                    try {
                        linphoneCore2 = this.G;
                    } catch (LinphoneCoreException e3) {
                        C1044Mm.e("nf_voip_linphone", "ERROR while configuring audio codecs, %s", e3.toString());
                    }
                    if (!d(this.b.getCallAttributes().getCodecs(), payloadType.getMime()) && !payloadType.getMime().equals("G722")) {
                        z2 = false;
                        linphoneCore2.enablePayloadType(payloadType, z2);
                    }
                    z2 = true;
                    linphoneCore2.enablePayloadType(payloadType, z2);
                }
            }
            String str = this.j.getPackageManager().getPackageInfo(this.j.getPackageName(), 0).versionName;
            if (str == null) {
                str = String.valueOf(this.j.getPackageManager().getPackageInfo(this.j.getPackageName(), 0).versionCode);
            }
            this.G.setUserAgent("LinphoneAndroid", str);
            LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(V_());
            this.A = createLinphoneAddress;
            createLinphoneAddress.setTransport(LinphoneAddress.TransportType.LinphoneTransportTls);
            C5071bro c5071bro = this.d;
            if (c5071bro != null) {
                c5071bro.c();
            }
            this.t.set(true);
            C1044Mm.e("nf_voip_linphone", "VOIP engine is now ready");
        }
    }

    private void H() {
        if (!this.l.get()) {
            C1044Mm.e("nf_voip_linphone", "No dial request, no need to start engine");
        } else if (!this.t.get()) {
            C1044Mm.e("nf_voip_linphone", "VOIP is not ready");
        } else {
            E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void L() {
        synchronized (this) {
            z.set(true);
            if (this.G != null && this.t.get()) {
                this.t.set(false);
                C1044Mm.e("nf_voip_linphone", "--- STOPPING VOIP engine");
                try {
                    C5071bro c5071bro = this.d;
                    if (c5071bro != null) {
                        c5071bro.b();
                    }
                    this.E.cancel();
                    this.G.destroy();
                    this.G = null;
                } catch (RuntimeException e) {
                    C1044Mm.e("nf_voip_linphone", "stopEngine exception %s", e.getMessage());
                    this.G = null;
                }
                this.d = null;
            } else {
                C1044Mm.j("nf_voip_linphone", "  --> Engine already stopped!");
            }
            C1044Mm.e("nf_voip_linphone", "--- STOP COMPLETE, voip engine is now ready for new call");
            List<IVoip.d> list = this.f13231o;
            if (list != null) {
                for (IVoip.d dVar : list) {
                    dVar.c(true);
                }
            }
            z.set(false);
        }
    }

    private void F() {
        C1044Mm.e("nf_voip_linphone", "--- Calling CALL CLEANUP");
        l();
        this.n.e();
        if (this.d != null && this.y.d()) {
            this.d.a();
        }
        if (e(this.j)) {
            AudioManager audioManager = this.c;
            if (audioManager != null) {
                audioManager.setMode(0);
            }
            LinphoneCore linphoneCore = this.G;
            if (linphoneCore != null) {
                linphoneCore.enableSpeaker(false);
            }
            this.n.b(false);
            C1044Mm.e("nf_voip_linphone", "All call terminated, AudioManager: back to MODE_NORMAL and routing back to earpiece");
        }
        InterfaceC5074brr interfaceC5074brr = this.s;
        if (interfaceC5074brr != null) {
            interfaceC5074brr.e(this.q, C);
        }
        this.v = 0L;
        this.l.set(false);
        this.k = null;
    }

    private void E() {
        LinphoneCall inviteAddressWithParams;
        synchronized (this) {
            BaseVoipEngine.e();
            if (this.G == null) {
                C1044Mm.d("nf_voip_linphone", "engine is null!");
            } else if (this.A == null) {
                C1044Mm.d("nf_voip_linphone", "invite address is null!");
            } else if (!this.l.get()) {
                C1044Mm.e("nf_voip_linphone", "No dial request, no need to dial");
            } else if (this.k != null) {
                this.l.set(false);
                C1044Mm.d("nf_voip_linphone", "Call is already in progress! Terminate it first!");
            } else {
                try {
                    LinphoneCallParams createCallParams = this.G.createCallParams(null);
                    createCallParams.setVideoEnabled(false);
                    if (ConnectivityUtils.d(this.j) == LogMobileType._2G) {
                        createCallParams.enableLowBandwidth(true);
                    }
                    if (f()) {
                        createCallParams.setRecordFile(G());
                    }
                    inviteAddressWithParams = this.G.inviteAddressWithParams(this.A, createCallParams);
                } catch (LinphoneCoreException e) {
                    e.printStackTrace();
                }
                if (inviteAddressWithParams == null) {
                    C1044Mm.e("nf_voip_linphone", "Could not place call to %s", V_());
                    return;
                }
                inviteAddressWithParams.enableEchoCancellation(true);
                this.k = new c(this.b.getCallAttributes().getCallId(), inviteAddressWithParams);
                this.n.d();
                LocalBroadcastManager.getInstance(this.j).sendBroadcast(new Intent("com.netflix.mediaclient.ui.cs.ACTION_CALL_STARTED"));
                this.s.a(this.q, C);
            }
        }
    }

    private void d(LinphoneCall linphoneCall) {
        C1044Mm.e("nf_voip_linphone", "Outbound call invite outgoing");
        t();
        r();
    }

    private void e(LinphoneCall linphoneCall) {
        C1044Mm.a("nf_voip_linphone", "Outbound call ringing on line %s", linphoneCall.getCallLog().getCallId());
        if (this.G == null) {
            C1044Mm.d("nf_voip_linphone", "Engine is null and we received call ringing! Should not happen!");
        } else if (this.k == null) {
            C1044Mm.j("nf_voip_linphone", "Call was NOT in progress and we received call ringing on line %s", linphoneCall.getCallLog().getCallId());
        } else {
            for (IVoip.d dVar : this.f13231o) {
                dVar.b(this.k);
            }
        }
    }

    private void b(LinphoneCall linphoneCall) {
        ((c) this.k).d(linphoneCall.getCurrentParamsCopy());
        if (z()) {
            C1044Mm.e("nf_voip_linphone", "Audio is routed through Bluetooth Sco");
        }
        Object[] objArr = new Object[1];
        objArr[0] = linphoneCall.getCallLog() != null ? linphoneCall.getCallLog().getCallId() : "";
        C1044Mm.a("nf_voip_linphone", "Call connected on line %s", objArr);
        if (this.G == null) {
            C1044Mm.d("nf_voip_linphone", "SDK is null and we received call connected! Should not happen!");
        } else if (this.k == null) {
            C1044Mm.j("nf_voip_linphone", "Call was NOT in progress and we received connected on line %s", linphoneCall.getCallLog().getCallId());
        } else {
            for (IVoip.d dVar : this.f13231o) {
                dVar.d(this.k);
            }
        }
        k();
        this.v = System.currentTimeMillis();
    }

    private void c(LinphoneCall linphoneCall) {
        if (linphoneCall != null) {
            if (f()) {
                linphoneCall.startRecording();
            }
            if (this.k == null || linphoneCall.getCurrentParamsCopy() == null || linphoneCall.getCurrentParamsCopy().getUsedAudioCodec() == null) {
                return;
            }
            ((c) this.k).d(linphoneCall.getCurrentParamsCopy().getUsedAudioCodec().getMime(), linphoneCall.getCurrentParamsCopy().getUsedAudioCodec().getRate());
        }
    }

    private void d(LinphoneCall linphoneCall, String str) {
        C1044Mm.a("nf_voip_linphone", "Call failure for line %s with message %s", linphoneCall.getCallLog().getCallId(), str);
        F();
        this.B.b(InterfaceC8098ddv.c(this.j).a(this.j, this.g));
        p();
        for (IVoip.d dVar : this.f13231o) {
            dVar.e(null);
        }
    }

    private void a(LinphoneCall linphoneCall) {
        C1044Mm.a("nf_voip_linphone", "Outbound call disconnected on line %s", linphoneCall.getCallLog().getCallId());
        if (f()) {
            linphoneCall.stopRecording();
        }
        IVoip.b bVar = this.k;
        if (bVar != null && !((c) bVar).d()) {
            ((c) this.k).e();
            if (this.i == null) {
                this.i = AbstractC5079brw.y().c("linphone").a(((c) this.k).a()).c(((c) this.k).b()).a((int) linphoneCall.getAudioStats().getDownloadBandwidth()).n((int) linphoneCall.getAudioStats().getUploadBandwidth()).h(linphoneCall.getAudioStats().getNumberPacketsSent()).a(linphoneCall.getAudioStats().getNumberPacketsReceived()).b(linphoneCall.getAudioStats().getNumberBytesSent()).e(linphoneCall.getAudioStats().getNumberBytesReceived()).c(linphoneCall.getAudioStats().getLatePacketsCumulativeNumber()).d(linphoneCall.getAudioStats().getCumulativePacketsLost()).o(linphoneCall.getAudioStats().getReceiverLossRate()).l(linphoneCall.getAudioStats().getSenderLossRate()).i(linphoneCall.getAudioStats().getSenderInterarrivalJitter()).f(linphoneCall.getAudioStats().getSenderInterarrivalJitter()).c(linphoneCall.getAudioStats().getSenderInterarrivalJitter()).j(linphoneCall.getAudioStats().getReceiverInterarrivalJitter()).d(linphoneCall.getAudioStats().getReceiverInterarrivalJitter()).b(linphoneCall.getAudioStats().getReceiverInterarrivalJitter()).h(linphoneCall.getAudioStats().getRoundTripDelay()).g(linphoneCall.getAudioStats().getRoundTripDelay()).e(linphoneCall.getAudioStats().getRoundTripDelay()).d();
            }
            o();
        }
        F();
        if (this.G != null) {
            for (IVoip.d dVar : this.f13231o) {
                dVar.c(this.k);
                dVar.c(false);
            }
        } else {
            C1044Mm.d("nf_voip_linphone", "Engine is null and we received call disconnect! Should not happen!");
        }
        ExtLogger.INSTANCE.endCommand("cs.CallCommand");
        Logger logger = Logger.INSTANCE;
        Session session = logger.getSession(this.a);
        if (session instanceof Call) {
            logger.endSession(new CallEnded((Call) session, new JSONObject()));
        }
        LocalBroadcastManager.getInstance(this.j).sendBroadcast(new Intent("com.netflix.mediaclient.ui.cs.ACTION_CALL_ENDED"));
    }

    private void M() {
        C1044Mm.e("nf_voip_linphone", "Call released, stopping engine");
        this.m.post(new Runnable() { // from class: o.brq
            @Override // java.lang.Runnable
            public final void run() {
                C5076brt.this.L();
            }
        });
    }

    private String G() {
        String str = "";
        if (f()) {
            try {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                str = externalStorageDirectory.getAbsolutePath() + "/record.wav";
                File file = new File(str);
                file.getParentFile().mkdirs();
                file.createNewFile();
                return str;
            } catch (IOException e) {
                C1044Mm.a("nf_voip_linphone", e);
                return str;
            }
        }
        return "";
    }

    private static boolean e(Context context) {
        if (!C8054ddD.j()) {
            return ((TelephonyManager) context.getSystemService("phone")).getCallState() == 0;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return (audioManager == null || audioManager.getMode() == 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.brt$c */
    /* loaded from: classes4.dex */
    public static class c implements IVoip.b {
        String a;
        LinphoneCallParams b;
        String c;
        LinphoneCall e;
        int i;
        private final IVoip.CallState g = IVoip.CallState.CONNECTING;
        boolean d = false;

        public String a() {
            return this.a;
        }

        public int b() {
            return this.i;
        }

        LinphoneCall c() {
            return this.e;
        }

        public void d(String str, int i) {
            this.a = str;
            this.i = i;
        }

        public void d(LinphoneCallParams linphoneCallParams) {
            this.b = linphoneCallParams;
        }

        public boolean d() {
            return this.d;
        }

        public void e() {
            this.d = true;
        }

        c(String str, LinphoneCall linphoneCall) {
            this.c = str;
            this.e = linphoneCall;
        }
    }
}

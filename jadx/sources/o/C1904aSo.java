package o;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Objects;

/* renamed from: o.aSo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1904aSo extends aMF implements InterfaceC5128bss {
    private InterfaceC1905aSp d;

    @Override // o.aMF
    public String agentName() {
        return UmaAlert.ICON_ERROR;
    }

    @Override // o.InterfaceC5128bss
    public InterfaceC1905aSp b() {
        return this.d;
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.ERROR_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        C1044Mm.e("ErrorAgent", "ErrorAgent::init done ");
        initCompleted(InterfaceC1078Nw.aJ);
        C1044Mm.e("ErrorAgent", "ErrorAgent::init done ");
    }

    @Override // o.InterfaceC5128bss
    public void e(InterfaceC1905aSp interfaceC1905aSp) {
        synchronized (this) {
            if (this.d == interfaceC1905aSp) {
                C1044Mm.e("ErrorAgent", "Current error is reported to user by UI!");
                this.d = null;
            } else {
                C1044Mm.d("ErrorAgent", "Current error is not one that UI just handled!");
            }
        }
    }

    private void d(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.ui.error.ACTION_DISPLAY_ERROR"));
    }

    @Override // o.InterfaceC5128bss
    public boolean b(InterfaceC1905aSp interfaceC1905aSp) {
        if (interfaceC1905aSp == null) {
            return false;
        }
        d(interfaceC1905aSp);
        InterfaceC1905aSp interfaceC1905aSp2 = this.d;
        if (interfaceC1905aSp2 != null) {
            if (interfaceC1905aSp2.d() >= interfaceC1905aSp.d()) {
                return false;
            }
            this.d = interfaceC1905aSp;
            d(getContext());
            return true;
        }
        C1044Mm.e("ErrorAgent", "No previous errors, display this one");
        this.d = interfaceC1905aSp;
        d(getContext());
        return true;
    }

    private void d(InterfaceC1905aSp interfaceC1905aSp) {
        if (interfaceC1905aSp == null || interfaceC1905aSp.c() == null) {
            return;
        }
        C1044Mm.e("ErrorAgent", "Execute background task!!!");
        C1071Np c1071Np = new C1071Np();
        Runnable c = interfaceC1905aSp.c();
        Objects.requireNonNull(c);
        c1071Np.d(new ID(c));
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.G;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_ERROR;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_ERROR;
    }

    @Override // o.InterfaceC5128bss
    public void e() {
        synchronized (this) {
            this.d = null;
        }
    }
}

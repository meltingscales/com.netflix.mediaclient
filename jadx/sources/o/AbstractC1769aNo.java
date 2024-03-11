package o;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;

/* renamed from: o.aNo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1769aNo extends aMF {
    public static final b c = new b(null);

    @Override // o.aMF
    public String agentName() {
        return "cdx";
    }

    public AbstractC1769aNo() {
        c.getLogTag();
    }

    /* renamed from: o.aNo$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx");
        }
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.CDX_LOADED;
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.C;
        C8632dsu.a(netflixImmutableStatus, "");
        return netflixImmutableStatus;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_CDX;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_CDX;
    }
}

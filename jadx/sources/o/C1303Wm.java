package o;

import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.commanderinfra.impl.MediaNotificationInfraImpl$cleanupMediaControlNotification$1;
import com.netflix.mediaclient.commanderinfra.impl.MediaNotificationInfraImpl$removeMediaControlNotification$1;
import com.netflix.mediaclient.commanderinfra.impl.MediaNotificationInfraImpl$showMediaControlNotification$1;
import com.netflix.mediaclient.commanderinfra.impl.MediaNotificationInfraImpl$updateNotificationVideoMetadata$1;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.Wm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1303Wm implements VA {
    public static final a b = new a(null);
    private WT c;
    private final dwU d;
    private final dwQ e;

    @Inject
    public C1303Wm(dwQ dwq, dwU dwu) {
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwu, "");
        this.e = dwq;
        this.d = dwu;
    }

    /* renamed from: o.Wm$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("MediaNotificationInfraImpl");
        }
    }

    @Override // o.VA
    public void d() {
        this.c = new WS();
        C8737dwr.c(this.d, this.e, null, new MediaNotificationInfraImpl$showMediaControlNotification$1(this, null), 2, null);
    }

    @Override // o.VA
    public void b() {
        C8737dwr.c(this.d, this.e, null, new MediaNotificationInfraImpl$updateNotificationVideoMetadata$1(this, null), 2, null);
    }

    @Override // o.VA
    public void e() {
        VU c;
        WT wt;
        C1317Xa c1317Xa = C1317Xa.e;
        VX b2 = c1317Xa.d().b();
        if ((b2 != null ? b2.a() : null) == TargetDeviceUiState.d) {
            b.getLogTag();
            VX b3 = c1317Xa.d().b();
            if (b3 == null || (c = b3.c()) == null || (wt = this.c) == null) {
                return;
            }
            wt.e(c);
        }
    }

    @Override // o.VA
    public void c() {
        C8737dwr.c(this.d, this.e, null, new MediaNotificationInfraImpl$removeMediaControlNotification$1(this, null), 2, null);
    }

    @Override // o.VA
    public void a() {
        C8737dwr.c(this.d, this.e, null, new MediaNotificationInfraImpl$cleanupMediaControlNotification$1(this, null), 2, null);
    }
}

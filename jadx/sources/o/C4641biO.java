package o;

import android.os.Handler;
import androidx.media3.datasource.HttpDataSource;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.ManifestLoadException;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.io.IOException;
import o.C4642biP;

/* renamed from: o.biO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4641biO {
    public static final c c = new c(null);
    private final Handler b;
    private final C4886boO d;
    private final C4588bhO e;

    public C4641biO(C4588bhO c4588bhO, Handler handler, C4886boO c4886boO) {
        C8632dsu.c((Object) c4588bhO, "");
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) c4886boO, "");
        this.e = c4588bhO;
        this.b = handler;
        this.d = c4886boO;
    }

    public final String e(final String str, final C4651biY c4651biY, IOException iOException, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4651biY, "");
        C8632dsu.c((Object) iOException, "");
        if (((C5273bve) c4651biY).g != SegmentType.c) {
            return null;
        }
        String d = d(iOException);
        if (z) {
            c4651biY.c();
            if (c4651biY.c() != null && !c4651biY.c().i()) {
                C4642biP.e c2 = c4651biY.c();
                if (c2 != null) {
                    c2.e(d);
                }
                C8632dsu.d((Object) d);
                a(str, c4651biY, d);
                this.b.post(new Runnable() { // from class: o.biV
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4641biO.e(C4641biO.this, c4651biY, str);
                    }
                });
                return d;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4641biO c4641biO, C4651biY c4651biY, String str) {
        C8632dsu.c((Object) c4641biO, "");
        C8632dsu.c((Object) c4651biY, "");
        C8632dsu.c((Object) str, "");
        PlaylistTimestamp j = c4641biO.e.j();
        String a = c4651biY.a();
        if (!C8632dsu.c((Object) str, (Object) (j != null ? j.a : null)) || a == null) {
            PlaylistMap o2 = c4641biO.e.o();
            c.getLogTag();
            String h = c4651biY.h();
            if (h != null) {
                C5209buT a2 = o2 != null ? o2.a(h) : null;
                C5209buT a3 = o2 != null ? o2.a(a) : null;
                if ((a2 instanceof C4651biY) && (a3 instanceof C4651biY)) {
                    ((C4651biY) a2).e(a);
                    ((C4651biY) a3).c(h);
                    return;
                }
                return;
            }
            return;
        }
        c.getLogTag();
        C4588bhO c4588bhO = c4641biO.e;
        C8632dsu.d(j);
        c4588bhO.c(new PlaylistTimestamp(j.c, a, 0L));
    }

    public final void a(C4642biP.e eVar, long j) {
        C8632dsu.c((Object) eVar, "");
        this.d.a(eVar, j);
        c.getLogTag();
    }

    private final String d(IOException iOException) {
        if (iOException instanceof HttpDataSource.HttpDataSourceException) {
            C4974bpx c4974bpx = new C4974bpx();
            ErrorCodeUtils.b(c4974bpx, iOException);
            String c2 = c4974bpx.c();
            return "network_error (" + c2 + ")";
        }
        if (iOException instanceof ManifestLoadException) {
            Status a = ((ManifestLoadException) iOException).a();
            StatusCode c3 = a != null ? a.c() : null;
            return "incomplete_manifest (" + c3 + ")";
        }
        return null;
    }

    /* renamed from: o.biO$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("AdsErrorHandler");
        }
    }

    private final void a(String str, C4651biY c4651biY, String str2) {
        c.getLogTag();
        this.d.e(str, c4651biY, str2);
    }
}

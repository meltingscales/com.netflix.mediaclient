package o;

import android.content.Context;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.MediaDrmConsumer;
import com.netflix.mediaclient.service.player.drm.NfDrmException;
import o.InterfaceC4424beJ;

/* renamed from: o.beK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4425beK implements InterfaceC4421beG {
    private final aTX a;
    private final InterfaceC4348bcn b;
    private final InterfaceC1843aQh c;
    private final InterfaceC4333bcY d;
    private final Context e;
    private final LongSparseArray<InterfaceC4420beF> h = new LongSparseArray<>();
    private final Handler i;

    @Override // o.InterfaceC4422beH
    public C4419beE a(boolean z) {
        return null;
    }

    @Override // o.InterfaceC4423beI
    public FrameworkCryptoConfig c(long j) {
        return null;
    }

    public C4425beK(Context context, Handler handler, InterfaceC4333bcY interfaceC4333bcY, InterfaceC4348bcn interfaceC4348bcn, aTX atx, InterfaceC1843aQh interfaceC1843aQh) {
        this.e = context;
        this.i = handler;
        this.d = interfaceC4333bcY;
        this.a = atx;
        this.c = interfaceC1843aQh;
        this.b = interfaceC4348bcn;
    }

    @Override // o.InterfaceC4423beI
    /* renamed from: c */
    public InterfaceC4420beF e(Long l, InterfaceC4416beB interfaceC4416beB, InterfaceC4424beJ.c cVar) {
        InterfaceC4420beF interfaceC4420beF = this.h.get(l.longValue());
        if (interfaceC4420beF != null) {
            return interfaceC4420beF;
        }
        C4429beO c4429beO = new C4429beO(this.b, this.e, this.i, this.d, this.a, d(l), interfaceC4416beB, l, cVar);
        this.h.put(l.longValue(), c4429beO);
        return c4429beO;
    }

    private NetflixMediaDrm d(Long l) {
        try {
            return C8189dfg.e(MediaDrmConsumer.OFFLINE, (NetflixMediaDrm.OnEventListener) null, l);
        } catch (UnsupportedSchemeException e) {
            C1044Mm.b("NfOfflineDrmManager", e, "unable to create offline DRM", new Object[0]);
            throw new NfDrmException(e);
        }
    }

    @Override // o.InterfaceC4423beI
    public Looper c() {
        return Looper.myLooper();
    }

    @Override // o.InterfaceC4423beI
    public void d() {
        for (int i = 0; i < this.h.size(); i++) {
            LongSparseArray<InterfaceC4420beF> longSparseArray = this.h;
            ((C4429beO) longSparseArray.get(longSparseArray.keyAt(i))).l();
        }
    }

    @Override // o.InterfaceC4423beI
    public void e(Long l) {
        this.h.remove(l.longValue());
    }
}

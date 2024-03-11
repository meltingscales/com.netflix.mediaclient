package o;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* renamed from: o.bcg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4341bcg {
    private static String d = "DelayedBifDownloader";
    private final BandwidthMeter a;
    private a b;
    private InterfaceC4326bcR c;
    private final InterfaceC4325bcQ e;
    private boolean g;
    private final Handler h;
    private long j;

    public InterfaceC4326bcR b() {
        return this.c;
    }

    public C4341bcg(Handler handler, BandwidthMeter bandwidthMeter, InterfaceC4325bcQ interfaceC4325bcQ) {
        this.h = handler;
        this.a = bandwidthMeter;
        this.e = interfaceC4325bcQ;
    }

    public void d(Context context, InterfaceC4942bpR interfaceC4942bpR, long j, C4540bgT[] c4540bgTArr, boolean z) {
        if (c4540bgTArr == null || c4540bgTArr.length == 0) {
            C1044Mm.j(d, " bif url is not valid");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.j = currentTimeMillis;
        C1044Mm.a(d, "DelayedBifHandler - mStartTimeInMs :%d", Long.valueOf(currentTimeMillis));
        String b = b(c4540bgTArr);
        if (b != null) {
            this.c = new C4328bcT(b);
            InterfaceC4325bcQ interfaceC4325bcQ = this.e;
            if (interfaceC4325bcQ != null) {
                interfaceC4325bcQ.d(j, 0L);
            }
        } else if (this.b == null) {
            a aVar = new a(context, interfaceC4942bpR, j, c4540bgTArr, this.e);
            this.b = aVar;
            this.h.postDelayed(aVar, z ? 5000L : 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i) {
        return i >= 500 || System.currentTimeMillis() >= this.j + 30000;
    }

    public void d() {
        this.g = true;
        InterfaceC4326bcR interfaceC4326bcR = this.c;
        if (interfaceC4326bcR != null) {
            interfaceC4326bcR.d();
            this.c = null;
        }
        a aVar = this.b;
        if (aVar != null) {
            this.h.removeCallbacks(aVar);
            this.b = null;
        }
    }

    /* renamed from: o.bcg$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        private final InterfaceC4325bcQ b;
        private final InterfaceC4942bpR c;
        private final Context d;
        private final C4540bgT[] e;
        private final long h;

        public a(Context context, InterfaceC4942bpR interfaceC4942bpR, long j, C4540bgT[] c4540bgTArr, InterfaceC4325bcQ interfaceC4325bcQ) {
            this.d = context;
            this.c = interfaceC4942bpR;
            this.e = c4540bgTArr;
            this.h = j;
            this.b = interfaceC4325bcQ;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4341bcg.this.g) {
                return;
            }
            int bitrateEstimate = C4341bcg.this.a == null ? 0 : (int) (C4341bcg.this.a.getBitrateEstimate() / 1000);
            if (C4341bcg.this.b(bitrateEstimate)) {
                C1044Mm.a(C4341bcg.d, "availableBandwidth: %d, downloading bif ...", Integer.valueOf(bitrateEstimate));
                C4341bcg.this.c = new C4332bcX(this.h, this.c, this.e, this.b);
            }
            if (C4341bcg.this.c == null) {
                C4341bcg.this.h.postDelayed(this, 5000L);
            }
        }
    }

    private static String b(C4540bgT[] c4540bgTArr) {
        String[] b;
        if (c4540bgTArr == null || c4540bgTArr.length == 0) {
            return null;
        }
        for (C4540bgT c4540bgT : c4540bgTArr) {
            if (c4540bgT.b() != null) {
                for (String str : c4540bgT.b()) {
                    if (str != null && str.startsWith("file://")) {
                        return str;
                    }
                }
                continue;
            }
        }
        return null;
    }
}

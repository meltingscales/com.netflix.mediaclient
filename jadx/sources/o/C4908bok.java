package o;

import android.content.Context;
import android.os.Handler;
import android.util.LongSparseArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* renamed from: o.bok  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4908bok {
    private final Context a;
    private final InterfaceC4942bpR b;
    private final LongSparseArray<C4341bcg> c = new LongSparseArray<>();
    private BandwidthMeter d;
    private final InterfaceC4325bcQ e;
    private final Handler g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(BandwidthMeter bandwidthMeter) {
        this.d = bandwidthMeter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4908bok(Context context, Handler handler, InterfaceC4942bpR interfaceC4942bpR, InterfaceC4325bcQ interfaceC4325bcQ) {
        this.g = handler;
        this.a = context;
        this.b = interfaceC4942bpR;
        this.e = interfaceC4325bcQ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j, C4540bgT[] c4540bgTArr, boolean z) {
        if (this.c.get(j) == null) {
            C4341bcg c4341bcg = new C4341bcg(this.g, this.d, this.e);
            c4341bcg.d(this.a, this.b, j, c4540bgTArr, z);
            this.c.put(j, c4341bcg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC4326bcR c(long j) {
        C4341bcg c4341bcg = this.c.get(j);
        if (c4341bcg != null) {
            return c4341bcg.b();
        }
        return null;
    }

    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.valueAt(i).d();
        }
        this.c.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(long j) {
        return this.c.get(j) != null;
    }
}

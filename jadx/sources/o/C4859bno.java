package o;

import android.os.Handler;
import android.os.SystemClock;
import android.util.LongSparseArray;
import androidx.media3.datasource.DataSpec;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixNetworkError;
import java.util.Iterator;
import o.InterfaceC4834bnP;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: o.bno  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4859bno implements InterfaceC4834bnP {
    private final Handler a;
    private final LongSparseArray<C4839bnU> b = new LongSparseArray<>();
    private final LongSparseArray<Boolean> c = new LongSparseArray<>();
    private boolean d;
    private final C4911bon e;

    public C4859bno(Handler handler, C4911bon c4911bon) {
        this.a = handler;
        this.e = c4911bon;
    }

    public C4839bnU a(final long j, InterfaceC4834bnP.a aVar) {
        final C4839bnU c4839bnU = new C4839bnU(j, aVar);
        this.a.post(new Runnable() { // from class: o.bnt
            @Override // java.lang.Runnable
            public final void run() {
                C4859bno.this.c(j, c4839bnU);
            }
        });
        return c4839bnU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j, C4839bnU c4839bnU) {
        this.b.put(j, c4839bnU);
    }

    public void d(final long j) {
        this.a.post(new Runnable() { // from class: o.bnu
            @Override // java.lang.Runnable
            public final void run() {
                C4859bno.this.b(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j) {
        this.b.remove(j);
        this.c.remove(j);
        this.d = this.c.size() > 0;
    }

    public void c(final long j) {
        this.a.post(new Runnable() { // from class: o.bnv
            @Override // java.lang.Runnable
            public final void run() {
                C4859bno.this.a(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j) {
        this.c.put(j, Boolean.TRUE);
        this.d = true;
        C4839bnU c4839bnU = this.b.get(j);
        if (c4839bnU != null) {
            c4839bnU.e();
        }
    }

    @Override // o.InterfaceC4834bnP
    public void c(final DataSpec dataSpec) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a.post(new Runnable() { // from class: o.bnw
            @Override // java.lang.Runnable
            public final void run() {
                C4859bno.this.b(dataSpec, elapsedRealtime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DataSpec dataSpec, long j) {
        C4839bnU e;
        if (this.d && (e = e(dataSpec)) != null) {
            e.b(dataSpec, j);
        }
    }

    @Override // o.InterfaceC4834bnP
    public void a(final DataSpec dataSpec, final long j) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a.post(new Runnable() { // from class: o.bns
            @Override // java.lang.Runnable
            public final void run() {
                C4859bno.this.a(dataSpec, j, elapsedRealtime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DataSpec dataSpec, long j, long j2) {
        C4839bnU e;
        if (this.d && (e = e(dataSpec)) != null) {
            e.e(dataSpec, j, j2);
        }
    }

    @Override // o.InterfaceC4834bnP
    public void c(final DataSpec dataSpec, final NetflixNetworkError netflixNetworkError) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a.post(new Runnable() { // from class: o.bnA
            @Override // java.lang.Runnable
            public final void run() {
                C4859bno.this.c(dataSpec, netflixNetworkError, elapsedRealtime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DataSpec dataSpec, NetflixNetworkError netflixNetworkError, long j) {
        C4839bnU e;
        if (this.d && (e = e(dataSpec)) != null) {
            e.c(dataSpec, netflixNetworkError, j);
        }
    }

    @Override // o.InterfaceC4834bnP
    public void c(final RequestFinishedInfo requestFinishedInfo) {
        this.a.post(new Runnable() { // from class: o.bnp
            @Override // java.lang.Runnable
            public final void run() {
                C4859bno.this.d(requestFinishedInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(RequestFinishedInfo requestFinishedInfo) {
        DataSpec dataSpec;
        Iterator<Object> it = requestFinishedInfo.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                dataSpec = null;
                break;
            }
            Object next = it.next();
            if (next instanceof DataSpec) {
                dataSpec = (DataSpec) next;
                break;
            }
        }
        if (dataSpec == null) {
            C1044Mm.e("nf_playreport", "unable to find dataspec for %s", requestFinishedInfo.getUrl());
            return;
        }
        Object obj = dataSpec.customData;
        if (obj instanceof C4794bmc) {
            C4794bmc c4794bmc = (C4794bmc) obj;
            this.e.c(c4794bmc.b(), c4794bmc.c().c());
            C4839bnU e = e(c4794bmc);
            if (e != null) {
                e.e(new C4789bmX(requestFinishedInfo), dataSpec);
            }
        }
    }

    private C4839bnU e(DataSpec dataSpec) {
        Object obj = dataSpec.customData;
        if (!(obj instanceof C4794bmc)) {
            C1044Mm.e("nf_playreport", "unable to find info from NetflixDataSpec for %s", dataSpec.uri);
            return null;
        }
        return e((C4794bmc) obj);
    }

    private C4839bnU e(C4794bmc c4794bmc) {
        return this.b.get(c4794bmc.d());
    }
}

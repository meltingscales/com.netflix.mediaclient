package o;

import android.content.Context;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import o.C1079Nx;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.baY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4227baY {
    private final long a = System.currentTimeMillis();
    private final C4283bbb b;
    private long c;
    private Context d;
    private C4223baU e;
    private final long f;
    private final InterfaceC5090bsG g;
    private final File h;
    private long j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4227baY(Context context, C4283bbb c4283bbb, IClientLogging iClientLogging, File file) {
        this.d = context;
        this.b = c4283bbb;
        this.g = iClientLogging.e();
        this.h = file;
        this.f = file.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(C4223baU c4223baU, long j) {
        this.e = c4223baU;
        this.j = System.currentTimeMillis();
        this.c = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j) {
        if (this.e == null) {
            C1044Mm.a("nf_cdnUrlDownloadEvent", "onDownloadStop  didn't receive onDownloadStart. Not an error, ignoring");
            return;
        }
        c(j, false);
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j) {
        if (this.e == null) {
            C1044Mm.a("nf_cdnUrlDownloadEvent", "onDownloadComplete  didn't receive onDownloadStart. Not an error, ignoring");
            return;
        }
        c(j, true);
        this.e = null;
    }

    private void c(long j, boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - this.j;
        long j2 = j - this.c;
        if (currentTimeMillis > 0 && j2 >= 0) {
            final d dVar = new d(z);
            try {
                dVar.a(this.b, this.e, this.j, this.c, currentTimeMillis, j2, TN.a.d());
                new C1071Np().d(new C1079Nx.b() { // from class: o.baZ
                    @Override // o.C1079Nx.b
                    public final void run() {
                        C4227baY.this.e(dVar);
                    }
                });
                return;
            } catch (JSONException e) {
                C1044Mm.b("nf_cdnUrlDownloadEvent", e, "onDownloadComplete jsonException", new Object[0]);
                return;
            } catch (Exception e2) {
                C1044Mm.b("nf_cdnUrlDownloadEvent", e2, "onDownloadComplete exception", new Object[0]);
                return;
            }
        }
        C1044Mm.a("nf_cdnUrlDownloadEvent", "onDownloadComplete not sending dl report.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(d dVar) {
        this.g.a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.baY$d */
    /* loaded from: classes3.dex */
    public class d extends aUI {
        private final boolean d;

        @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
        public boolean e() {
            return this.d;
        }

        d(boolean z) {
            this.d = z;
        }

        @Override // com.netflix.mediaclient.servicemgr.Logblob
        public String a() {
            return LogBlobType.OFFLINE_CDN_URL_DOWNLOAD.a();
        }

        void a(C4283bbb c4283bbb, C4223baU c4223baU, long j, long j2, long j3, long j4, ConnectivityUtils.NetType netType) {
            this.i.put("offlinedlreport", LogBlobType.OFFLINE_CDN_URL_DOWNLOAD.a());
            this.i.put("oxid", c4283bbb.c);
            this.i.put("dxid", c4283bbb.e);
            this.i.put("downloadstarttime", j);
            this.i.put("startbyteoffset", j2);
            this.i.put("playbackcontextid", c4283bbb.b);
            this.i.put("cdnid", c4223baU.b);
            this.i.put("dlid", c4283bbb.a);
            this.i.put("bytes", j4);
            this.i.put("duration", j3);
            this.i.put("dlFilePath", C4227baY.this.h.getAbsolutePath());
            this.i.put("fileSizeAtStart", C4227baY.this.f);
            this.i.put("fileSizeNow", C4227baY.this.h.length());
            this.i.put("birthTime", C4227baY.this.a);
            ConnectivityUtils.c(this.i, netType);
        }
    }
}

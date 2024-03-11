package o;

import android.os.Handler;
import android.os.HandlerThread;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.offline.log.OfflineErrorLogblob;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.bbO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4270bbO implements InterfaceC4268bbM {
    private final InterfaceC1979aVj a;
    private final C4390bdc b;
    private final IClientLogging c;
    private final Handler h;
    private final Map<String, InterfaceC4271bbP> e = new HashMap();
    private final Map<String, InterfaceC4525bgE> d = new HashMap();

    public C4270bbO(C4390bdc c4390bdc, HandlerThread handlerThread, InterfaceC1979aVj interfaceC1979aVj, IClientLogging iClientLogging) {
        this.b = c4390bdc;
        this.a = interfaceC1979aVj;
        this.c = iClientLogging;
        this.h = new Handler(handlerThread.getLooper());
    }

    @Override // o.InterfaceC4268bbM
    public void e(InterfaceC4297bbp interfaceC4297bbp, String str, InterfaceC4271bbP interfaceC4271bbP) {
        C1044Mm.a("nf_offlineManifestMgr", "requestOfflineManifestFromCache playableId=" + interfaceC4297bbp.h());
        Status status = InterfaceC1078Nw.aJ;
        InterfaceC4525bgE a = a(interfaceC4297bbp, str);
        if (a == null) {
            status = new NetflixStatus(StatusCode.DL_MANIFEST_NOT_FOUND_IN_CACHE);
        }
        if (interfaceC4271bbP != null) {
            interfaceC4271bbP.a(a, status);
        }
    }

    @Override // o.InterfaceC4268bbM
    public void c(final InterfaceC4297bbp interfaceC4297bbp, final C1980aVk c1980aVk, final String str, DownloadVideoQuality downloadVideoQuality, InterfaceC4271bbP interfaceC4271bbP) {
        String h = interfaceC4297bbp.h();
        String e2 = C4338bcd.e(interfaceC4297bbp);
        C1044Mm.a("nf_offlineManifestMgr", "requestOfflineManifestFromServer playableId=" + h);
        this.d.remove(h);
        this.e.put(h, interfaceC4271bbP);
        this.b.d(h, interfaceC4297bbp.i(), interfaceC4297bbp.g(), e2, downloadVideoQuality, new AbstractC4397bdj() { // from class: o.bbO.4
            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
            public void a(final JSONObject jSONObject, final Status status) {
                C4270bbO.this.h.post(new Runnable() { // from class: o.bbO.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        C4270bbO.this.a(status, interfaceC4297bbp, str, true, jSONObject, c1980aVk);
                    }
                });
            }
        });
    }

    @Override // o.InterfaceC4268bbM
    public void e(InterfaceC4297bbp interfaceC4297bbp, String str, String str2, DownloadVideoQuality downloadVideoQuality, InterfaceC4271bbP interfaceC4271bbP) {
        String h = interfaceC4297bbp.h();
        String e2 = C4338bcd.e(interfaceC4297bbp);
        C1044Mm.a("nf_offlineManifestMgr", "requestOfflineManifestRefreshFromServer playableId=" + h);
        e(interfaceC4297bbp, str, new AnonymousClass3(h, interfaceC4271bbP, interfaceC4297bbp, e2, str2, downloadVideoQuality, str));
    }

    /* renamed from: o.bbO$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass3 implements InterfaceC4271bbP {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC4271bbP b;
        final /* synthetic */ DownloadVideoQuality d;
        final /* synthetic */ InterfaceC4297bbp e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ String i;

        AnonymousClass3(String str, InterfaceC4271bbP interfaceC4271bbP, InterfaceC4297bbp interfaceC4297bbp, String str2, String str3, DownloadVideoQuality downloadVideoQuality, String str4) {
            this.g = str;
            this.b = interfaceC4271bbP;
            this.e = interfaceC4297bbp;
            this.f = str2;
            this.i = str3;
            this.d = downloadVideoQuality;
            this.a = str4;
        }

        @Override // o.InterfaceC4271bbP
        public void a(InterfaceC4525bgE interfaceC4525bgE, final Status status) {
            C4270bbO.this.d.remove(this.g);
            C4270bbO.this.e.put(this.g, this.b);
            if (status.j() && interfaceC4525bgE != null) {
                C4270bbO.this.b.c(this.g, this.e.i(), this.e.g(), this.f, this.i, this.d, interfaceC4525bgE, new AbstractC4397bdj() { // from class: o.bbO.3.2
                    @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
                    public void a(final JSONObject jSONObject, final Status status2) {
                        C4270bbO.this.h.post(new Runnable() { // from class: o.bbO.3.2.4
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                C4270bbO.this.a(status2, anonymousClass3.e, anonymousClass3.a, false, jSONObject, null);
                            }
                        });
                    }
                });
            } else {
                C4270bbO.this.h.post(new Runnable() { // from class: o.bbO.3.5
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        C4270bbO.this.a(status, anonymousClass3.e, anonymousClass3.a, false, null, null);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Status status, InterfaceC4297bbp interfaceC4297bbp, String str, boolean z, JSONObject jSONObject, C1980aVk c1980aVk) {
        InterfaceC4525bgE interfaceC4525bgE;
        Status status2;
        String h = interfaceC4297bbp.h();
        String i = interfaceC4297bbp.i();
        String g = interfaceC4297bbp.g();
        InterfaceC4271bbP remove = this.e.remove(h);
        if (remove == null) {
            C1044Mm.a("nf_offlineManifestMgr", "onManifestsFetched but no callback");
            return;
        }
        if (status.j()) {
            e b = b(jSONObject);
            Status status3 = b.e;
            interfaceC4525bgE = b.c;
            if (status3.j()) {
                status3 = b(interfaceC4297bbp, str, jSONObject);
            }
            status2 = status3;
            if (status2.j()) {
                if (!new File(C4336bcb.c(str, h)).exists()) {
                    InterfaceC1598aHf.a(new C1596aHd("handleManifestResponse manifest gone:").b(false));
                }
                e(h, b.c);
                if (z) {
                    this.a.c(h, i, g, c1980aVk, b.c.U());
                }
            }
        } else {
            interfaceC4525bgE = null;
            status2 = status;
        }
        if (status2.i()) {
            OfflineErrorLogblob.a(this.c.e(), interfaceC4297bbp, status2, OfflineErrorLogblob.ErrorCategory.d(status, OfflineErrorLogblob.ErrorCategory.Manifest));
        }
        remove.a(interfaceC4525bgE, status2);
    }

    private Status b(InterfaceC4297bbp interfaceC4297bbp, String str, JSONObject jSONObject) {
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        String c = C4336bcb.c(str, interfaceC4297bbp.h());
        C1044Mm.c("nf_offlineManifestMgr", "filepath for manifest=%s", c);
        String jSONObject2 = jSONObject.toString();
        try {
            if (C8106deC.c(c, jSONObject2.getBytes("UTF-8"))) {
                OfflineErrorLogblob.b(this.c.e(), interfaceC4297bbp, c + ", inputLen=" + jSONObject2.length() + ", fileLength=" + new File(c).length());
                return netflixImmutableStatus;
            }
        } catch (UnsupportedEncodingException unused) {
            InterfaceC1598aHf.a(new C1596aHd("persistManifest unsupported encoding").b(false));
        }
        return new NetflixStatus(StatusCode.DL_CANT_PERSIST_MANIFEST);
    }

    private e b(JSONObject jSONObject) {
        e eVar = new e();
        List<InterfaceC4525bgE> e2 = C4563bgq.e(jSONObject);
        if (e2 != null && e2.size() > 0) {
            eVar.e = InterfaceC1078Nw.aJ;
            eVar.c = e2.get(0);
        } else {
            C1044Mm.d("nf_offlineManifestMgr", "manifest parse error");
            eVar.e = new NetflixStatus(StatusCode.RESPONSE_PARSE_ERROR);
        }
        return eVar;
    }

    @Override // o.InterfaceC4268bbM
    public void d(String str) {
        this.e.remove(str);
        this.d.remove(str);
    }

    private InterfaceC4525bgE a(InterfaceC4297bbp interfaceC4297bbp, String str) {
        InterfaceC4525bgE interfaceC4525bgE = this.d.get(interfaceC4297bbp.h());
        if (interfaceC4525bgE == null && (interfaceC4525bgE = c(interfaceC4297bbp, str)) != null) {
            e(interfaceC4297bbp.h(), interfaceC4525bgE);
        }
        return interfaceC4525bgE;
    }

    @Override // o.InterfaceC4268bbM
    public void b(String str) {
        this.d.remove(str);
        this.e.remove(str);
    }

    @Override // o.InterfaceC4268bbM
    public void a(int i) {
        if (i >= 60) {
            this.h.post(new Runnable() { // from class: o.bbO.1
                @Override // java.lang.Runnable
                public void run() {
                    C4270bbO.this.d.clear();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    private InterfaceC4525bgE c(InterfaceC4297bbp interfaceC4297bbp, String str) {
        Throwable th;
        Exception e2;
        BufferedReader bufferedReader;
        String str2;
        File file = new File(C4336bcb.c(str, interfaceC4297bbp.h()));
        ?? r3 = 0;
        r3 = null;
        InterfaceC4525bgE interfaceC4525bgE = null;
        try {
            if (!file.exists()) {
                InterfaceC1598aHf.a(new C1596aHd("oxId=" + interfaceC4297bbp.i() + " readManifestFromPersistentStore file not found " + file.getAbsolutePath()).b(false));
                StringBuilder sb = new StringBuilder();
                sb.append("readManifestFromPersistentStore file not found=");
                sb.append(file.getAbsolutePath());
                C1044Mm.d("nf_offlineManifestMgr", sb.toString());
                OfflineErrorLogblob.e(this.c.e(), interfaceC4297bbp, file.getAbsolutePath());
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(C8106deC.h(file), Charset.forName("utf-8")));
            } catch (Exception e3) {
                e2 = e3;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                C8106deC.d((Closeable) r3);
                throw th;
            }
            try {
                List<InterfaceC4525bgE> c = C4563bgq.c(bufferedReader);
                if (c != null && c.size() > 0) {
                    interfaceC4525bgE = c.get(0);
                } else {
                    if (c == null) {
                        str2 = "nfManifestList is null";
                    } else {
                        str2 = "nfManifestList size=" + c.size();
                    }
                    InterfaceC1598aHf.a(new C1596aHd(str2).b(false));
                }
            } catch (Exception e4) {
                e2 = e4;
                InterfaceC1598aHf.a(new C1596aHd("readManifestFromPersistentStore Exception:").d(e2).b(false));
                C1044Mm.e("nf_offlineManifestMgr", "readManifestFromPersistentStore read error", e2);
                C8106deC.d(bufferedReader);
                return interfaceC4525bgE;
            }
            C8106deC.d(bufferedReader);
            return interfaceC4525bgE;
        } catch (Throwable th3) {
            r3 = interfaceC4297bbp;
            th = th3;
        }
    }

    private void e(String str, InterfaceC4525bgE interfaceC4525bgE) {
        if (this.d.size() >= 10) {
            b();
        }
        this.d.put(str, interfaceC4525bgE);
    }

    private void b() {
        String str = null;
        long j = 2147483647L;
        for (Map.Entry<String, InterfaceC4525bgE> entry : this.d.entrySet()) {
            if (str == null) {
                str = entry.getKey();
            }
            long X = entry.getValue().X();
            if (entry.getValue().X() < j) {
                str = entry.getKey();
                j = X;
            }
        }
        if (str != null) {
            this.d.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bbO$e */
    /* loaded from: classes3.dex */
    public class e {
        public Status e = InterfaceC1078Nw.aJ;
        public InterfaceC4525bgE c = null;

        e() {
        }
    }
}

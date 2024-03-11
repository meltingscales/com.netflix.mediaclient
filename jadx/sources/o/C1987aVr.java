package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC4208baF;

/* renamed from: o.aVr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1987aVr implements InterfaceC4209baG {
    public static String a = "com.netflix.mediaclient.intent.action.DOWNLOAD_ERROR";
    public static String b = "errorCode";
    public static String c = "com.netflix.mediaclient.intent.category.PDSLOG_DOWNLOAD";
    public static String d = "playableId";
    public static String e = "errorMessage";
    private static final String g = "PdsDownloadSessionManager";
    public static String h = "com.netflix.mediaclient.intent.action.LICENSE_ERROR";
    public static String i = "com.netflix.mediaclient.intent.action.MANIFEST_EXPIRED";
    aTU f;
    InterfaceC5090bsG j;
    private IClientLogging k;
    private String m;
    private InterfaceC4208baF n;
    private String r;
    private Object t = new Object();

    /* renamed from: o  reason: collision with root package name */
    private final BroadcastReceiver f13450o = new BroadcastReceiver() { // from class: o.aVr.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1044Mm.d(C1987aVr.g, "Received intent %s", intent);
            if (intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra(C1987aVr.d);
            String stringExtra2 = intent.getStringExtra(C1987aVr.b);
            String stringExtra3 = intent.getStringExtra(C1987aVr.e);
            C1986aVq d2 = C1987aVr.this.d(stringExtra);
            if (d2 == null) {
                C1044Mm.e(C1987aVr.g, "playable: %s - no session, dropping intent %s", stringExtra, intent.getAction());
                return;
            }
            String action = intent.getAction();
            if (C1987aVr.h.equals(action)) {
                d2.c(stringExtra2, stringExtra3);
            } else if (C1987aVr.i.equals(action)) {
                d2.e(stringExtra2, stringExtra3);
            } else if (C1987aVr.a.equals(action)) {
                d2.b(stringExtra2, stringExtra3);
            } else {
                C1044Mm.a(C1987aVr.g, "We do not support action :%s ", action);
            }
        }
    };
    private Map<String, C1986aVq> l = new HashMap();

    /* renamed from: o.aVr$a */
    /* loaded from: classes3.dex */
    public interface a {
        void d(C1986aVq c1986aVq);
    }

    @Override // o.InterfaceC4209baG
    public void b(Status status) {
    }

    @Override // o.InterfaceC4209baG
    public void b(String str) {
    }

    @Override // o.InterfaceC4209baG
    public void b(String str, Status status) {
    }

    @Override // o.InterfaceC4209baG
    public void b(InterfaceC5206buQ interfaceC5206buQ) {
    }

    @Override // o.InterfaceC4209baG
    public boolean c() {
        return false;
    }

    @Override // o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, Status status) {
    }

    @Override // o.InterfaceC4209baG
    public void e(InterfaceC5206buQ interfaceC5206buQ, Status status) {
    }

    @Override // o.InterfaceC4209baG
    public void e(boolean z) {
    }

    public C1987aVr(Context context, InterfaceC4208baF interfaceC4208baF, IClientLogging iClientLogging) {
        this.k = iClientLogging;
        this.n = interfaceC4208baF;
        this.j = iClientLogging.e();
        this.f = iClientLogging.h();
        e(context);
        C1044Mm.e(g, "inited download session manager");
    }

    public void b() {
        this.m = this.k.a();
        this.r = this.k.f();
    }

    public void c(Context context) {
        a(context);
    }

    public void b(String str, String str2, String str3, C1980aVk c1980aVk, AbstractC4564bgr abstractC4564bgr) {
        a(str);
        C1044Mm.a(g, "setOfflineManifest playableId: %s, oxid: %s, dxid: %s", str, str2, str3);
        d(str, str2, str3, c1980aVk, abstractC4564bgr).h();
    }

    @Override // o.InterfaceC4209baG
    public void c(InterfaceC5206buQ interfaceC5206buQ, final int i2) {
        if (i2 < 0 && i2 <= 100) {
            InterfaceC1598aHf.a("PdsDownloadSessionManager.onOfflinePlayableProgress:: wrong percentageDownloaded: " + i2);
        }
        C1986aVq c2 = c(interfaceC5206buQ);
        if (c2.d()) {
            c(c2, new a() { // from class: o.aVr.4
                @Override // o.C1987aVr.a
                public void d(C1986aVq c1986aVq) {
                    C1987aVr.this.c(c1986aVq, i2);
                }
            });
        } else {
            c(c2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(C1986aVq c1986aVq, int i2) {
        if (c1986aVq.b()) {
            c1986aVq.a(false);
            c1986aVq.j();
        }
        c1986aVq.b(i2);
    }

    @Override // o.InterfaceC4209baG
    public void a(InterfaceC5206buQ interfaceC5206buQ) {
        C1986aVq c2 = c(interfaceC5206buQ);
        if (c2.d()) {
            c(c2, new a() { // from class: o.aVr.5
                @Override // o.C1987aVr.a
                public void d(C1986aVq c1986aVq) {
                    C1987aVr.this.b(c1986aVq);
                }
            });
        } else {
            b(c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C1986aVq c1986aVq) {
        c1986aVq.c();
        a(c1986aVq.a());
    }

    @Override // o.InterfaceC4209baG
    public void d(InterfaceC5206buQ interfaceC5206buQ, StopReason stopReason) {
        C1986aVq d2 = d(interfaceC5206buQ.aH_());
        if (d2 == null) {
            return;
        }
        switch (AnonymousClass1.c[stopReason.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return;
            case 7:
            case 8:
            case 9:
                d2.a(true);
                d2.f();
                return;
            default:
                C1044Mm.a(g, " onDownloadStopped stopReason: %s, no-op", stopReason);
                return;
        }
    }

    /* renamed from: o.aVr$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StopReason.values().length];
            c = iArr;
            try {
                iArr[StopReason.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[StopReason.WaitingToBeStarted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[StopReason.NetworkError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[StopReason.ManifestError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[StopReason.StorageError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[StopReason.NotEnoughSpace.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[StopReason.NoNetworkConnectivity.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[StopReason.StoppedFromAgentAPI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[StopReason.NotAllowedOnCurrentNetwork.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[StopReason.PlayerStreaming.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[StopReason.AccountInActive.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[StopReason.EncodesAreNotAvailableAnyMore.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[StopReason.GeoCheckError.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                c[StopReason.DownloadLimitRequiresManualResume.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                c[StopReason.EncodesRevoked.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    @Override // o.InterfaceC4209baG
    public void b(String str, Status status, boolean z) {
        e(str, status);
    }

    @Override // o.InterfaceC4209baG
    public void c(List<String> list, Status status) {
        for (String str : list) {
            e(str, status);
        }
    }

    private void e(String str, Status status) {
        d(str, status);
        a(str);
    }

    @Override // o.InterfaceC4209baG
    public void d(Status status) {
        a(status);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1986aVq d(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return this.l.get(str);
    }

    private C1986aVq c(InterfaceC5206buQ interfaceC5206buQ) {
        C1986aVq d2 = d(interfaceC5206buQ.aH_());
        return d2 != null ? d2 : d(interfaceC5206buQ.aH_(), interfaceC5206buQ.y(), interfaceC5206buQ.t(), C1980aVk.a(interfaceC5206buQ), null);
    }

    private void e() {
        synchronized (this.t) {
            this.l.clear();
        }
    }

    private void a(Status status) {
        for (C1986aVq c1986aVq : this.l.values()) {
            c1986aVq.a(status.c().toString(), status.l());
        }
    }

    private void d(String str, Status status) {
        C1986aVq c1986aVq = this.l.get(str);
        if (c1986aVq != null) {
            c1986aVq.a(status.c().toString(), status.l());
        }
    }

    private void a(String str) {
        synchronized (this.t) {
            if (this.l.containsKey(str)) {
                this.l.remove(str);
            }
        }
    }

    private void c(String str, C1986aVq c1986aVq) {
        if (this.l.get(str) != null) {
            InterfaceC1598aHf.a("PdsDownloadSessionManager.addDownloadSession:: session existed for playableId: " + str);
        }
        synchronized (this.t) {
            this.l.put(str, c1986aVq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1986aVq d(String str, String str2, String str3, C1980aVk c1980aVk, AbstractC4564bgr abstractC4564bgr) {
        C1986aVq b2 = new C1986aVq(str, str2, str3, this.m, this.r, this.f).c(c1980aVk).b(abstractC4564bgr);
        c(str, b2);
        return b2;
    }

    private void c(C1986aVq c1986aVq, final a aVar) {
        c1986aVq.d(true);
        this.n.d(c1986aVq.a(), new InterfaceC4208baF.c() { // from class: o.aVr.3
            @Override // o.InterfaceC4208baF.c
            public void a(String str, C4216baN c4216baN, Status status) {
                C1986aVq d2 = C1987aVr.this.d(str);
                if (d2 == null) {
                    if (c4216baN != null) {
                        C1987aVr.this.d(str, c4216baN.b(), c4216baN.d(), c4216baN.e(), c4216baN.c());
                        return;
                    } else {
                        C1044Mm.e(C1987aVr.g, "error receiving manifest from cache movieId=%s status=%s", str, status.toString());
                        return;
                    }
                }
                d2.d(false);
                if (c4216baN == null || c4216baN.c() == null) {
                    return;
                }
                C1044Mm.a(C1987aVr.g, "got manifestFromCache :%s - setting links and sendng pds resume", str);
                d2.b(c4216baN.c());
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.d(d2);
                }
            }
        });
    }

    private void e(Context context) {
        C1044Mm.e(g, "Register receiver");
        C8116deM.c(context, this.f13450o, c, a, i, h);
    }

    private void a(Context context) {
        C8116deM.a(context, this.f13450o);
    }
}

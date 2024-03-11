package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bbl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4293bbl {
    public static final a b = new a(null);
    @SerializedName("isOptedIn")
    private boolean e;
    @SerializedName("pauseUntil")
    private long g;
    @SerializedName("optInSizeMap")
    private final HashMap<String, Float> f = new HashMap<>();
    @SerializedName("showSizeMap")
    private final HashMap<String, Integer> i = new HashMap<>();
    @SerializedName("deletedVideos")
    private HashSet<String> d = new HashSet<>();
    @SerializedName("downloadedVideos")
    private LinkedHashMap<String, Integer> c = new LinkedHashMap<>();
    @SerializedName("lastUpdated")
    private long a = System.currentTimeMillis();

    public final HashMap<String, Float> a() {
        return this.f;
    }

    public final void a(long j) {
        this.a = j;
    }

    public final long b() {
        return this.a;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final HashSet<String> c() {
        return this.d;
    }

    public final long d() {
        return this.g;
    }

    public final void d(long j) {
        this.g = j;
    }

    public final LinkedHashMap<String, Integer> e() {
        return this.c;
    }

    public final boolean i() {
        return this.e;
    }

    public final HashMap<String, Integer> j() {
        return this.i;
    }

    /* renamed from: o.bbl$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C4293bbl e(String str) {
            Throwable th;
            C8632dsu.c((Object) str, "");
            if (str.length() == 0) {
                return null;
            }
            try {
                return (C4293bbl) C8118deO.a().fromJson(str, (Class<Object>) C4293bbl.class);
            } catch (JsonSyntaxException e) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                C1596aHd e2 = new C1596aHd("DownloadedForYouInfo: unable to restore json object.", null, null, false, null, false, false, 126, null).b(false).d(e).b(ErrorType.h).e(NotificationFactory.DATA, str);
                ErrorType errorType = e2.a;
                if (errorType != null) {
                    e2.e.put("errorType", errorType.c());
                    String b = e2.b();
                    if (b != null) {
                        String c = errorType.c();
                        e2.a(c + " " + b);
                    }
                }
                if (e2.b() != null && e2.i != null) {
                    th = new Throwable(e2.b(), e2.i);
                } else if (e2.b() != null) {
                    th = new Throwable(e2.b());
                } else {
                    th = e2.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(e2, th);
                    return null;
                }
                dVar.e().b(e2, th);
                return null;
            }
        }
    }

    public final String h() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}

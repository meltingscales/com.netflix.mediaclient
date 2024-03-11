package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.logging.proxy.TracerouteProbe$createLogblob$2;
import com.netflix.mediaclient.service.logging.proxy.TracerouteProbe$start$2;
import com.netflix.mediaclient.servicemgr.Logblob;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Result;
import o.aVH;

/* loaded from: classes3.dex */
public final class aVE {
    public static final a a = new a(null);
    private final aMF c;

    public final aMF a() {
        return this.c;
    }

    public aVE(aMF amf) {
        C8632dsu.c((Object) amf, "");
        this.c = amf;
    }

    public final Object c(InterfaceC8585dra<? super Logblob> interfaceC8585dra) {
        return dwY.b(new TracerouteProbe$createLogblob$2(this, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(int i, InterfaceC8585dra<? super List<String>> interfaceC8585dra) {
        InterfaceC8585dra b2;
        Object e;
        b2 = C8590drf.b(interfaceC8585dra);
        C8587drc c8587drc = new C8587drc(b2);
        this.c.addDataRequest(new aVH(i, new c(c8587drc)));
        Object b3 = c8587drc.b();
        e = C8586drb.e();
        if (b3 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b3;
    }

    /* loaded from: classes3.dex */
    public static final class c implements aVH.d {
        final /* synthetic */ InterfaceC8585dra<List<String>> e;

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC8585dra<? super List<String>> interfaceC8585dra) {
            this.e = interfaceC8585dra;
        }

        @Override // o.aVH.d
        public void b(List<String> list) {
            C8632dsu.c((Object) list, "");
            aVE.a.getLogTag();
            InterfaceC8585dra<List<String>> interfaceC8585dra = this.e;
            Result.c cVar = Result.e;
            interfaceC8585dra.resumeWith(Result.e(list));
        }

        @Override // o.aVH.d
        public void a(Status status) {
            C8632dsu.c((Object) status, "");
            InterfaceC8585dra<List<String>> interfaceC8585dra = this.e;
            Result.c cVar = Result.e;
            Throwable e = status.e();
            if (e == null) {
                e = new Exception(status.c().name());
            }
            interfaceC8585dra.resumeWith(Result.e(C8556dpz.a(e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(String str, int i, int i2, int i3, int i4, InterfaceC8585dra<? super b> interfaceC8585dra) {
        return dwY.b(new TracerouteProbe$start$2(i2, i3, i4, this, str, i, null), interfaceC8585dra);
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        /* renamed from: o.aVE$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0098b extends b {
            private final int a;
            private final Map<String, List<String>> c;
            private final int e;

            public final Map<String, List<String>> b() {
                return this.c;
            }

            public final int d() {
                return this.e;
            }

            public final int e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0098b) {
                    C0098b c0098b = (C0098b) obj;
                    return this.a == c0098b.a && this.e == c0098b.e && C8632dsu.c(this.c, c0098b.c);
                }
                return false;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.e)) * 31) + this.c.hashCode();
            }

            public String toString() {
                int i = this.a;
                int i2 = this.e;
                Map<String, List<String>> map = this.c;
                return "Success(ttl=" + i + ", statusCode=" + i2 + ", headers=" + map + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0098b(int i, int i2, Map<String, ? extends List<String>> map) {
                super(null);
                C8632dsu.c((Object) map, "");
                this.a = i;
                this.e = i2;
                this.c = map;
            }
        }

        /* loaded from: classes3.dex */
        public static final class a extends b {
            private final Exception d;

            public a() {
                this(null, 1, null);
            }

            public final Exception b() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
            }

            public int hashCode() {
                Exception exc = this.d;
                if (exc == null) {
                    return 0;
                }
                return exc.hashCode();
            }

            public String toString() {
                Exception exc = this.d;
                return "Error(exception=" + exc + ")";
            }

            public a(Exception exc) {
                super(null);
                this.d = exc;
            }

            public /* synthetic */ a(Exception exc, int i, C8627dsp c8627dsp) {
                this((i & 1) != 0 ? null : exc);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TracerouteProbe");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b e(String str, int i, int i2) {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        Exception e;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                a.getLogTag();
                URLConnection openConnection = new URL(str).openConnection();
                C8632dsu.d(openConnection);
                httpsURLConnection = (HttpsURLConnection) openConnection;
                try {
                    httpsURLConnection.setUseCaches(false);
                    httpsURLConnection.setRequestMethod("HEAD");
                    httpsURLConnection.setSSLSocketFactory(new aVD(i2));
                    httpsURLConnection.setConnectTimeout(i);
                    httpsURLConnection.setReadTimeout(i);
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
                    C8632dsu.a(headerFields, "");
                    b.C0098b c0098b = new b.C0098b(i2, responseCode, headerFields);
                    httpsURLConnection.disconnect();
                    return c0098b;
                } catch (Exception e2) {
                    e = e2;
                    httpsURLConnection2 = httpsURLConnection;
                    a.getLogTag();
                    b.a aVar = new b.a(e);
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}

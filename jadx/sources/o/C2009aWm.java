package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.net.NetworkRequestType;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import o.C9864xy;
import o.InterfaceC8457dmh;

/* renamed from: o.aWm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2009aWm implements GO {
    private final C9865xz c;

    public C2009aWm(aHJ ahj) {
        C9865xz a = ahj.a((InterfaceC9854xo) new C9829xP(), (InterfaceC9857xr) new aZM(new C4945bpU(ahj)), 1, true, "MDX DIAL Queue");
        this.c = a;
        a.e();
    }

    @Override // o.InterfaceC8457dmh
    public void c(String str, final InterfaceC8457dmh.e eVar) {
        this.c.e(new c(0, str, eVar) { // from class: o.aWm.3
            @Override // com.netflix.android.volley.Request
            public C9864xy<Void> b(C9858xs c9858xs) {
                String str2 = new String(c9858xs.c);
                try {
                    str2 = new String(c9858xs.c, C9821xH.c(c9858xs.d).replace("\"", ""));
                } catch (UnsupportedEncodingException e) {
                    eVar.a(e);
                }
                eVar.c(c9858xs.e, c9858xs.d, str2);
                return C9864xy.c(null, C9821xH.d(c9858xs));
            }
        });
    }

    @Override // o.GO
    public void b(String str, InterfaceC8457dmh.e eVar) {
        a(str, null, eVar);
    }

    public void a(String str, final String str2, final InterfaceC8457dmh.e eVar) {
        this.c.e(new c(1, str, eVar) { // from class: o.aWm.5
            @Override // com.netflix.android.volley.Request
            public String a() {
                return "text/plain; charset=utf-8";
            }

            @Override // com.netflix.android.volley.Request
            public C9864xy<Void> b(C9858xs c9858xs) {
                String str3 = new String(c9858xs.c);
                try {
                    str3 = new String(c9858xs.c, C9821xH.c(c9858xs.d).replace("\"", ""));
                } catch (UnsupportedEncodingException e) {
                    eVar.a(e);
                }
                eVar.c(c9858xs.e, c9858xs.d, str3);
                return C9864xy.c(null, C9821xH.d(c9858xs));
            }

            @Override // com.netflix.android.volley.Request
            public Map<String, String> j() {
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Type", "text/plain; charset=utf-8");
                return hashMap;
            }

            @Override // com.netflix.android.volley.Request
            public byte[] Q_() {
                String str3 = str2;
                if (str3 == null) {
                    return null;
                }
                return str3.getBytes(StandardCharsets.UTF_8);
            }
        });
    }

    /* renamed from: o.aWm$c */
    /* loaded from: classes3.dex */
    protected static abstract class c extends Request<Void> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.netflix.android.volley.Request
        public void b(Void r1) {
        }

        public c(int i, String str, InterfaceC8457dmh.e eVar) {
            super(i, str, C2009aWm.d(eVar));
            e(false);
            c(NetworkRequestType.MDX_LOCAL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C9864xy.b d(final InterfaceC8457dmh.e eVar) {
        return new C9864xy.b() { // from class: o.aWo
            @Override // o.C9864xy.b
            public final void b(VolleyError volleyError) {
                C2009aWm.c(InterfaceC8457dmh.e.this, volleyError);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(InterfaceC8457dmh.e eVar, VolleyError volleyError) {
        String str;
        C9858xs c9858xs = volleyError.b;
        if (c9858xs != null) {
            try {
                str = new String(c9858xs.c, C9821xH.c(c9858xs.d).replace("\"", ""));
            } catch (UnsupportedEncodingException e) {
                C1044Mm.e("VolleyHttpClient", "Failed to parse body - unsupported encoding", e);
                str = null;
            }
            eVar.c(c9858xs.e, c9858xs.d, str);
            return;
        }
        eVar.a(volleyError);
    }
}

package o;

import android.net.Uri;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.net.probe.ProbeConfigResponse;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.bad  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4232bad extends AbstractC5042brL<String> {
    private byte[] a;
    private d d;
    private final Map<String, String> e;
    private String g;
    private final String i;

    /* renamed from: o.bad$d */
    /* loaded from: classes3.dex */
    public interface d {
        void e(a aVar);
    }

    @Override // com.netflix.android.volley.Request
    public boolean C() {
        return false;
    }

    @Override // o.AbstractC5042brL
    public String K() {
        return null;
    }

    @Override // com.netflix.android.volley.Request
    public byte[] Q_() {
        return this.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC5042brL
    public String a(String str) {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: c */
    public String a_(String str, String str2) {
        return "OK";
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
    }

    public void e(d dVar) {
        this.d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: h */
    public void a(String str) {
    }

    public C4232bad(String str, List<ProbeConfigResponse.c> list, int i) {
        super(a(list));
        this.e = new HashMap();
        this.g = str;
        this.i = str;
        for (ProbeConfigResponse.c cVar : list) {
            int i2 = AnonymousClass5.c[cVar.e().ordinal()];
            if (i2 == 1) {
                this.e.put(cVar.c(), cVar.a());
            } else if (i2 == 2) {
                this.g = Uri.parse(this.g).buildUpon().appendQueryParameter(cVar.c(), cVar.a()).toString();
            } else if (i2 == 3) {
                this.a = cVar.a().getBytes();
            }
        }
        this.g = Uri.parse(this.g).buildUpon().appendQueryParameter("pulse", Integer.toString(i + 1)).toString();
    }

    /* renamed from: o.bad$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ProbeConfigResponse.RequestOptionsType.values().length];
            c = iArr;
            try {
                iArr[ProbeConfigResponse.RequestOptionsType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ProbeConfigResponse.RequestOptionsType.URLPARAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ProbeConfigResponse.RequestOptionsType.BODY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static int a(List<ProbeConfigResponse.c> list) {
        for (ProbeConfigResponse.c cVar : list) {
            if (cVar.e() == ProbeConfigResponse.RequestOptionsType.BODY) {
                return 1;
            }
        }
        return 0;
    }

    @Override // o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        g("");
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        try {
            Map<String, String> j = super.j();
            j.putAll(this.e);
            return j;
        } catch (VolleyError e) {
            C1044Mm.b("nf_probe", e, "unable to use Netflix headers", new Object[0]);
            return this.e;
        }
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public C9864xy<String> b(C9858xs c9858xs) {
        byte[] bArr;
        d dVar;
        if (c9858xs != null && (bArr = c9858xs.c) != null && (dVar = this.d) != null) {
            dVar.e(new a(this.i, bArr.length));
        }
        return C9864xy.c("OK", null);
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.LOW;
    }

    @Override // com.netflix.android.volley.Request
    public InterfaceC9814xA t() {
        return new C9852xm(2500, 0, 1.0f);
    }

    /* renamed from: o.bad$a */
    /* loaded from: classes3.dex */
    public static class a {
        public final int a;
        public final String b;

        public a(String str, int i) {
            this.b = str;
            this.a = i;
        }
    }
}

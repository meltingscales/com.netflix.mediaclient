package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AbstractC7829dGx;

/* loaded from: classes3.dex */
public final class aCA extends aZC<String> implements aCC {
    private final boolean a;
    private aCB d;
    private final Context e;
    private final C7826dGu f;
    private Map<String, String> v;

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface d {
        aCA b(C7826dGu c7826dGu, boolean z);
    }

    public aCB J() {
        return this.d;
    }

    @Override // o.aCC
    public void e(aCB acb) {
        this.d = acb;
    }

    @AssistedInject
    public aCA(@ApplicationContext Context context, @Assisted C7826dGu c7826dGu, @Assisted boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c7826dGu, "");
        this.e = context;
        this.f = c7826dGu;
        this.a = z;
        k(c7826dGu.j().toString());
    }

    @Override // o.aZC, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        boolean g;
        Map<String, String> j = super.j();
        if (j == null) {
            j = new LinkedHashMap<>();
        }
        String c = C5041brK.c(this.e);
        if (c != null) {
            g = C8691duz.g(c);
            if (!g) {
                j.put("schema-variant", C5041brK.c(this.e));
            }
        }
        for (String str : this.f.c().d()) {
            j.put(str, this.f.c().a(str));
        }
        return j;
    }

    @Override // o.aZC
    public String M() {
        throw new IllegalStateException("This should never be called: it's instead handled in getMSLPayload.");
    }

    @Override // o.aZC, o.aZE
    public String w_() {
        AbstractC7825dGt b = this.f.b();
        if (b != null) {
            C7872dIo c7872dIo = new C7872dIo();
            b.a(c7872dIo);
            return c7872dIo.v();
        }
        throw new IllegalStateException("request.body() was null in GraphQLApolloMSLVolleyRequest");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZC
    /* renamed from: a */
    public String c(C8380djl c8380djl) {
        this.v = c8380djl != null ? c8380djl.b() : null;
        Object c = super.c(c8380djl);
        C8632dsu.a(c, "");
        return (String) c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    public void a(String str) {
        AbstractC7829dGx c;
        aCB J2 = J();
        if (J2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Map<String, String> map = this.v;
        InterfaceC7871dIn interfaceC7871dIn = null;
        if (str != null && (c = AbstractC7829dGx.c.c(AbstractC7829dGx.b, str, null, 1, null)) != null) {
            interfaceC7871dIn = c.e();
        }
        J2.c(200, map, interfaceC7871dIn);
    }

    @Override // o.aZE
    public void e(Status status) {
        String str;
        StatusCodeError statusCodeError;
        if ((status != null ? status.e() : null) != null) {
            statusCodeError = new StatusCodeError(status.c(), status.e());
        } else {
            StatusCode c = status != null ? status.c() : null;
            if (status == null || (str = status.l()) == null) {
                str = "Null status message in GraphQLVolleyWebClientRequest.onFailure with code " + (status != null ? status.c() : null);
            }
            statusCodeError = new StatusCodeError(c, str);
        }
        aCB J2 = J();
        if (J2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        J2.d(new IOException(statusCodeError));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZC
    /* renamed from: f */
    public String j(String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                return str;
            }
        }
        throw new IllegalStateException("Got null or blank response in GraphQLApolloMSLVolleyRequest: " + str);
    }
}

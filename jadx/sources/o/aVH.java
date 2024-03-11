package o;

import android.net.Uri;
import com.google.gson.annotations.SerializedName;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aVH extends AbstractC5042brL<List<? extends String>> {
    private final d a;
    private ApiEndpointRegistry d;
    private final int e;

    /* loaded from: classes3.dex */
    public static final class c {
        @SerializedName(SignupConstants.Field.URL)
        private String b;

        public final String d() {
            return this.b;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(Status status);

        void b(List<String> list);
    }

    @Override // com.netflix.android.volley.Request
    public boolean C() {
        return true;
    }

    protected Void L() {
        return null;
    }

    @Override // o.AbstractC5042brL
    public /* synthetic */ String K() {
        return (String) L();
    }

    @Override // o.AbstractC5042brL
    public /* bridge */ /* synthetic */ void a(List<? extends String> list) {
        a2((List<String>) list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aVH(int i, d dVar) {
        super(0);
        C8632dsu.c((Object) dVar, "");
        this.e = i;
        this.a = dVar;
    }

    @Override // o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        C8632dsu.c((Object) apiEndpointRegistry, "");
        this.d = apiEndpointRegistry;
        C8632dsu.d(apiEndpointRegistry);
        g(apiEndpointRegistry.a((String) null).toExternalForm());
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.LOW;
    }

    @Override // o.AbstractC5042brL
    public String a(String str) {
        C8632dsu.c((Object) str, "");
        String uri = Uri.parse(str).buildUpon().clearQuery().path("/netflix/hdhelper/v1").appendQueryParameter("https", "true").appendQueryParameter("urlCount", String.valueOf(this.e)).appendQueryParameter("token", "4883947f15a219c48ae934f4cd565ab2").build().toString();
        C8632dsu.a(uri, "");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: c */
    public List<String> a_(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        List<c> a = ((b) C8118deO.a().fromJson(str, (Class<Object>) b.class)).a();
        ArrayList arrayList = new ArrayList();
        for (c cVar : a) {
            String d2 = cVar.d();
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    protected void a2(List<String> list) {
        C8632dsu.c((Object) list, "");
        this.a.b(list);
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        C8632dsu.c((Object) status, "");
        this.a.a(status);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @SerializedName("targets")
        private List<c> b;

        public final List<c> a() {
            return this.b;
        }

        public b() {
            List<c> i;
            i = C8569dql.i();
            this.b = i;
        }
    }
}

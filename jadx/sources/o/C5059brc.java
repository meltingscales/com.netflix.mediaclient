package o;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;
import java.util.Map;

/* renamed from: o.brc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5059brc extends AbstractC1900aSk<ResolveSimpleUrlPatternResponse> {
    public static final b a = new b(null);
    private final String d;
    private final InterfaceC4986bqI j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5059brc(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI, String str) {
        super(context, transport, "ResolveSimpleUrlPatternRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
        C8632dsu.c((Object) interfaceC4986bqI, "");
        C8632dsu.c((Object) str, "");
        this.j = interfaceC4986bqI;
        this.d = str;
    }

    /* renamed from: o.brc$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ResolveSimpleUrlPatternRequest");
        }
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> f;
        String str = this.d;
        f = C8569dql.f("[\"umsSimpleUrlPattern\", \"" + str + "\"]");
        return f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    public void b(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse) {
        this.j.a(resolveSimpleUrlPatternResponse, InterfaceC1078Nw.aJ);
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        this.j.a((ResolveSimpleUrlPatternResponse) null, status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public ResolveSimpleUrlPatternResponse e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        JsonObject e = C0946Ir.e(a.getLogTag(), str);
        if (C8118deO.e(e)) {
            throw new FalkorException("Data is empty");
        }
        JsonObject asJsonObject = e != null ? e.getAsJsonObject("umsSimpleUrlPattern") : null;
        JsonObject asJsonObject2 = asJsonObject != null ? asJsonObject.getAsJsonObject(this.d) : null;
        ResolveSimpleUrlPatternResponse.Builder builder = ResolveSimpleUrlPatternResponse.builder();
        if (asJsonObject2 != null) {
            for (Map.Entry<String, JsonElement> entry : asJsonObject2.entrySet()) {
                C8632dsu.d(entry);
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                if (C8632dsu.c((Object) key, (Object) SignupConstants.Field.URL)) {
                    C8632dsu.d(value);
                    builder.url(C9688vC.c(value));
                } else if (C8632dsu.c((Object) key, (Object) UmaAlert.ICON_ERROR)) {
                    C8632dsu.d(value);
                    builder.url(C9688vC.c(value));
                }
            }
        }
        ResolveSimpleUrlPatternResponse build = builder.build();
        C8632dsu.a(build, "");
        return build;
    }
}

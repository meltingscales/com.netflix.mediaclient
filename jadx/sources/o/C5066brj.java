package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;
import java.util.Map;

/* renamed from: o.brj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5066brj extends AbstractC1900aSk<UpdateProductChoiceResponse> {
    public static final b a = new b(null);
    private final C8190dfh<String, String> d;
    private final InterfaceC4986bqI i;

    public static final C5066brj e(Context context, NetflixDataRequest.Transport transport, String str, InterfaceC4986bqI interfaceC4986bqI) {
        return a.e(context, transport, str, interfaceC4986bqI);
    }

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5066brj(Context context, NetflixDataRequest.Transport transport, String str, String str2, String str3, String str4, boolean z, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "UpdateProductChoiceRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.i = interfaceC4986bqI;
        C8190dfh<String, String> c8190dfh = new C8190dfh<>();
        this.d = c8190dfh;
        str4 = str4 == null ? "AndroidPriceConsent" : str4;
        c8190dfh.put("param", "\"" + str4 + "\"");
        c8190dfh.put("param", "\"" + str + "\"");
        c8190dfh.put("param", "\"" + str2 + "\"");
        c8190dfh.put("param", "\"" + str3 + "\"");
        String str5 = z ? "true" : "";
        c8190dfh.put("param", "\"" + str5 + "\"");
    }

    /* renamed from: o.brj$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("UpdateProductChoiceRequest");
        }

        public final C5066brj e(Context context, NetflixDataRequest.Transport transport, String str, InterfaceC4986bqI interfaceC4986bqI) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) transport, "");
            C8632dsu.c((Object) str, "");
            try {
                JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
                String asString = asJsonObject.get("planID").getAsString();
                String asString2 = asJsonObject.get("priceTier").getAsString();
                String asString3 = asJsonObject.get("message_guid").getAsString();
                String asString4 = asJsonObject.get("context").getAsString();
                if (asString4 == null) {
                    asString4 = "AndroidPriceConsent";
                }
                String str2 = asString4;
                C8632dsu.d((Object) asString);
                C8632dsu.d((Object) asString2);
                return new C5066brj(context, transport, asString, asString2, asString3, str2, false, interfaceC4986bqI);
            } catch (Exception e) {
                String message = e.getMessage();
                throw new FalkorException("Invalid CTA params: " + str + ". Original message: " + message, e);
            }
        }
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b2 = super.b();
        b2.putAll(this.d);
        C8632dsu.d(b2);
        return b2;
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> e;
        e = C8566dqi.e("[\"updateProductChoiceMap\"]");
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: e */
    public void b(UpdateProductChoiceResponse updateProductChoiceResponse) {
        InterfaceC4986bqI interfaceC4986bqI = this.i;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.a(updateProductChoiceResponse, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.i;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.a((UpdateProductChoiceResponse) null, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: b */
    public UpdateProductChoiceResponse e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        b bVar = a;
        bVar.getLogTag();
        JsonObject e = C0946Ir.e(bVar.getLogTag(), str);
        if (C8118deO.e(e)) {
            throw new FalkorException("Empty product choice map");
        }
        Object e2 = C8118deO.e(e, "updateProductChoiceMap", (Class<Object>) UpdateProductChoiceResponse.class);
        C8632dsu.a(e2, "");
        return (UpdateProductChoiceResponse) e2;
    }
}

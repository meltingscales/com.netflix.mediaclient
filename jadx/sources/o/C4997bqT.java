package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;
import java.util.Map;

/* renamed from: o.bqT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4997bqT extends AbstractC1900aSk<MembershipChoicesResponse> {
    public static final c a = new c(null);
    private static final String d = "[\"productChoicesMap\"]";
    private final InterfaceC4986bqI g;
    private final C8190dfh<String, String> j;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4997bqT(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "GetProductChoicesRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
        this.g = interfaceC4986bqI;
        C8190dfh<String, String> c8190dfh = new C8190dfh<>();
        this.j = c8190dfh;
        c8190dfh.put("param", "\"AndroidPriceConsent\"");
    }

    /* renamed from: o.bqT$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("GetProductChoicesRequest");
        }
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b = super.b();
        b.putAll(this.j);
        C8632dsu.d(b);
        return b;
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> e;
        e = C8566dqi.e(d);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    public void b(MembershipChoicesResponse membershipChoicesResponse) {
        C8632dsu.c((Object) membershipChoicesResponse, "");
        InterfaceC4986bqI interfaceC4986bqI = this.g;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.a(membershipChoicesResponse, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.g;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.a((MembershipChoicesResponse) null, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public MembershipChoicesResponse e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        c cVar = a;
        cVar.getLogTag();
        JsonObject e = C0946Ir.e(cVar.getLogTag(), str);
        if (C8118deO.e(e)) {
            throw new FalkorException("Empty product choice map");
        }
        Object e2 = C8118deO.e(e, "productChoicesMap", (Class<Object>) MembershipChoicesResponse.class);
        C8632dsu.a(e2, "");
        return (MembershipChoicesResponse) e2;
    }
}

package o;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.bqL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4989bqL extends AbstractC1900aSk<String> {
    public static final d a = new d(null);
    private final C8190dfh<String, String> d;
    private final InterfaceC4986bqI g;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4989bqL(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI, List<String> list) {
        super(context, transport, "AutoLoginTokenWithScopesRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
        C8632dsu.c((Object) list, "");
        this.g = interfaceC4986bqI;
        this.d = new C8190dfh<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C8190dfh<String, String> c8190dfh = this.d;
            c8190dfh.put("param", "\"" + ((String) it.next()) + "\"");
        }
    }

    /* renamed from: o.bqL$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AutoLoginTokenWithScopesRequest");
        }
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b = super.b();
        b.putAll(this.d);
        C8632dsu.d(b);
        return b;
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> e;
        e = C8566dqi.e("[\"autoLoginTokenWithScopes\"]");
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        InterfaceC4986bqI interfaceC4986bqI = this.g;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b(str, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.g;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b((String) null, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: d */
    public String e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        d dVar = a;
        dVar.getLogTag();
        JsonObject e = C0946Ir.e(dVar.getLogTag(), str);
        if (C8118deO.e(e)) {
            throw new FalkorException("Empty auto login token");
        }
        JsonElement jsonElement = e.get("autoLoginTokenWithScopes");
        if (jsonElement == null) {
            throw new FalkorException("Empty auto login token");
        }
        String asString = jsonElement.getAsString();
        C8632dsu.a(asString, "");
        return asString;
    }
}

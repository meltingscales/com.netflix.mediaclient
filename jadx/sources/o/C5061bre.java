package o;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;

/* renamed from: o.bre  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5061bre extends AbstractC1900aSk<Boolean> {
    public static final c d = new c(null);
    private final InterfaceC4986bqI a;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    public C5061bre(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "RegisterProfileOnboardCompleted");
        this.a = interfaceC4986bqI;
    }

    /* renamed from: o.bre$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> e;
        e = C8566dqi.e("[\"profiles\",\"registerOnrampCompletion\"]");
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: d */
    public Boolean e(String str, String str2) {
        JsonElement jsonElement;
        C8632dsu.c((Object) str, "");
        JsonObject asJsonObject = C0946Ir.e("RegisterProfileOnboardCompleted", str).getAsJsonObject("profiles");
        return Boolean.valueOf((asJsonObject == null || (jsonElement = asJsonObject.get("registerOnrampCompletion")) == null) ? false : jsonElement.getAsBoolean());
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        C8632dsu.c((Object) status, "");
        InterfaceC4986bqI interfaceC4986bqI = this.a;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b(false, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public void b(Boolean bool) {
        InterfaceC4986bqI interfaceC4986bqI = this.a;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b(bool != null ? bool.booleanValue() : false, InterfaceC1078Nw.aJ);
        }
    }
}

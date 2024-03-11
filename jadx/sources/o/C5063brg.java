package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;

/* renamed from: o.brg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5063brg extends AbstractC1900aSk<Boolean> {
    public static final b a = new b(null);
    private final InterfaceC4986bqI d;

    @Override // o.AbstractC1902aSm
    public boolean j() {
        return true;
    }

    @Override // o.AbstractC1902aSm
    public /* synthetic */ void b(Object obj) {
        e(((Boolean) obj).booleanValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5063brg(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "RetryPaymentRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
        C8632dsu.c((Object) interfaceC4986bqI, "");
        this.d = interfaceC4986bqI;
    }

    /* renamed from: o.brg$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> e;
        e = C8566dqi.e("[\"user\", \"retryPayment\"]");
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public Boolean e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C1044Mm.e("RetryPaymentRequest", "parseFalkorResponse for retryPayment request = " + str);
        JsonObject e = C0946Ir.e("RetryPaymentRequest", str);
        if (C8118deO.e(e)) {
            return Boolean.FALSE;
        }
        try {
            JsonObject asJsonObject = e.getAsJsonObject("user");
            if (asJsonObject.has("retryPayment")) {
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("retryPayment");
                if (asJsonObject2.has("status")) {
                    return Boolean.valueOf(C8632dsu.c((Object) asJsonObject2.get("status").getAsString(), (Object) "SUCCESS"));
                }
            }
            return Boolean.FALSE;
        } catch (Exception e2) {
            C1044Mm.b("RetryPaymentRequest", "String response to parse = " + str);
            throw new FalkorException("response missing user json objects", e2);
        }
    }

    protected void e(boolean z) {
        this.d.c(z ? InterfaceC1078Nw.aJ : InterfaceC1078Nw.a);
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        C8632dsu.c((Object) status, "");
        this.d.c(status);
    }
}

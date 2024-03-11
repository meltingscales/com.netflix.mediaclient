package o;

import android.content.Context;
import com.netflix.android.volley.AuthFailureError;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayApiPlaybackLogs;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SendServiceTokensPolicy;
import com.netflix.mediaclient.servicemgr.Logblob;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.aTW;
import org.json.JSONObject;

/* renamed from: o.aVa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1970aVa extends AbstractC2101aZx {
    private final C1972aVc a;

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1970aVa(Context context, List<Logblob> list, Logblob.d dVar, aTW.a aVar) {
        C1044Mm.e("nf_logblob_SendLogblobsMsl", "SendLogblobsMSLRequest::");
        this.a = new C1972aVc(context, list, dVar, aVar);
    }

    @Override // o.aZE
    public boolean F_() {
        return !Config_FastProperty_SendServiceTokensPolicy.shouldSendWithLogblobs();
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return this.a.a();
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return this.a.b();
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        try {
            return this.a.a(super.j(), true);
        } catch (AuthFailureError e) {
            C1044Mm.b("nf_logblob_SendLogblobsMsl", e, "", new Object[0]);
            return new HashMap();
        }
    }

    @Override // o.aZE
    public String G_() {
        return this.a.d();
    }

    @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        return this.a.b(super.o());
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: e */
    public void a(JSONObject jSONObject) {
        this.a.c(jSONObject);
    }

    @Override // o.aZE
    public void e(Status status) {
        this.a.d(status);
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public boolean C() {
        return this.a.e();
    }

    @Override // o.AbstractC2103aZz, o.aZE
    public String O() {
        return Config_FastProperty_PlayApiPlaybackLogs.shouldSendLogblobs() ? "/playapi/android/logblob/1" : super.O();
    }

    @Override // o.AbstractC2103aZz, o.aZE
    public void L() {
        if (Config_FastProperty_PlayApiPlaybackLogs.shouldSendLogblobs()) {
            k(((aZE) this).i.j().d("/playapi/android/logblob/1"));
        } else {
            super.L();
        }
    }

    @Override // o.aZF, o.AbstractC2100aZw
    /* renamed from: h */
    public JSONObject a(String str) {
        return this.a.b(str);
    }
}

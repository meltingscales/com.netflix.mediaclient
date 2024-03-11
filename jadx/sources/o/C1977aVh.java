package o;

import android.content.Context;
import com.netflix.android.volley.AuthFailureError;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayApiPlaybackLogs;
import com.netflix.mediaclient.servicemgr.Logblob;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.aTW;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aVh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1977aVh extends AbstractC5039brI<JSONObject> {
    private final C1972aVc e;

    @Override // o.AbstractC5042brL
    public boolean O() {
        return false;
    }

    public C1977aVh(Context context, List<Logblob> list, Logblob.d dVar, aTW.a aVar) {
        super(context, 1);
        C1044Mm.e("nf_logblob_SendLogblobsWeb", "SendLogblobsWebRequest::");
        this.e = new C1972aVc(context, list, dVar, aVar);
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Request.Priority s() {
        return this.e.a();
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return this.e.b();
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        try {
            return this.e.a(super.j(), false);
        } catch (AuthFailureError e) {
            C1044Mm.b("nf_logblob_SendLogblobsWeb", e, "", new Object[0]);
            return new HashMap();
        }
    }

    @Override // com.netflix.android.volley.Request
    public Map<String, String> o() {
        return this.e.b(super.o());
    }

    @Override // o.AbstractC5039brI
    public List<String> L() {
        return this.e.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5039brI
    /* renamed from: c */
    public JSONObject e(String str, String str2) {
        return this.e.b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        this.e.c(jSONObject);
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        this.e.d(status);
    }

    @Override // com.netflix.android.volley.Request
    public byte[] l() {
        C1044Mm.e("nf_logblob_SendLogblobsWeb", "getPostBody()::");
        return Q_();
    }

    @Override // com.netflix.android.volley.Request
    public byte[] Q_() {
        String d = this.e.d();
        C1044Mm.a("nf_logblob_SendLogblobsWeb", "getBody():: %s", d);
        try {
            return d.getBytes(StandardCharsets.UTF_8);
        } catch (Exception e) {
            C1044Mm.b("nf_logblob_SendLogblobsWeb", e, "Failed to create body of logblob logging request", new Object[0]);
            return null;
        }
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL
    public String a(String str) {
        if (Config_FastProperty_PlayApiPlaybackLogs.shouldSendLogblobs()) {
            String d = ((AbstractC5042brL) this).s.j().d("/playapi/android/logblob/1");
            C1044Mm.a("nf_logblob_SendLogblobsWeb", "getFullUrl:: baseURL %s, full URL %s", str, d);
            return d;
        }
        return super.a(str);
    }
}

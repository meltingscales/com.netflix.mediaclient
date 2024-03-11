package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.aSf  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C1895aSf extends aRV<String> {
    private final String a;
    private String d;
    private String e;

    @Override // o.AbstractC5042brL
    public boolean O() {
        return false;
    }

    @Override // o.AbstractC5042brL
    public boolean X() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5039brI
    /* renamed from: c */
    public String e(String str, String str2) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1895aSf(Context context, String str, AbstractC5079brw abstractC5079brw) {
        super(context, 1);
        this.e = str;
        if (abstractC5079brw != null) {
            this.d = abstractC5079brw.x();
        }
        String format = String.format("[\"%s\"]", "reportVoipPostCallInfo");
        this.a = format;
        C1044Mm.d("nf_voip", "Query = %s", format);
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.LOG_VOIP;
    }

    @Override // com.netflix.android.volley.Request
    public Map<String, String> o() {
        HashMap hashMap = new HashMap();
        hashMap.put("authtoken", this.e);
        hashMap.put("callstats", this.d.toString());
        for (String str : L()) {
            hashMap.put(V(), str);
        }
        return hashMap;
    }

    @Override // o.AbstractC5039brI
    public List<String> L() {
        return Arrays.asList(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: f */
    public void a(String str) {
        C1044Mm.e("nf_voip", "VoIP call stats sent successfully");
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        C1044Mm.j("nf_voip", "Failed to send VoIP call stats");
    }
}

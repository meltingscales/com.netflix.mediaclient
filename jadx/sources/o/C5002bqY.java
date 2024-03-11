package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: o.bqY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5002bqY extends AbstractC1900aSk<String> {
    private final String a;
    private final String d;
    private final String h;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: e */
    public void b(String str) {
    }

    @Override // o.AbstractC1902aSm
    public boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5002bqY(Context context, NetflixDataRequest.Transport transport, String str, String str2) {
        super(context, transport, "RecordUmsImpressionRequest");
        this.h = "[\"ums\", \"setImpression\"]";
        this.a = str2;
        this.d = str;
        C1044Mm.d("eog_RecordEogImpression", "Query = %s", "[\"ums\", \"setImpression\"]");
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Arrays.asList("[\"ums\", \"setImpression\"]");
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b = super.b();
        b.put("param", String.format("\"%s\"", this.d));
        Object[] objArr = new Object[1];
        objArr[0] = C8168dfL.g(this.a) ? "back" : this.a;
        b.put("param", String.format("\"%s\"", objArr));
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public String e(String str, String str2) {
        C1044Mm.d("eog_RecordEogImpression", "String response to parse = %s", str);
        return str;
    }
}

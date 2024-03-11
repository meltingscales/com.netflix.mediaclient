package o;

import com.netflix.mediaclient.media.LanguageChoice;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aUJ extends AbstractC5119bsj {
    private final String a;
    private final LanguageChoice.SelectionReport d;
    private final Long e;

    public aUJ(LanguageChoice.SelectionReport selectionReport, Long l, String str) {
        C8632dsu.c((Object) selectionReport, "");
        this.d = selectionReport;
        this.e = l;
        this.a = str;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        this.i.putOpt("report", this.d.toJson());
        this.i.putOpt("playableId", this.e);
        this.i.putOpt("playableUri", this.a);
        JSONObject jSONObject = this.i;
        C8632dsu.a(jSONObject, "");
        return jSONObject;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.LanguageUserOverride.a();
        C8632dsu.a(a, "");
        return a;
    }
}

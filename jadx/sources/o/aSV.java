package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.servicemgr.Logblob;
import o.aMN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aSV extends aUI {
    private String b;
    private final aMN.d d;
    private final String e;

    public aSV(aMN.d dVar, String str) {
        C8632dsu.c((Object) dVar, "");
        this.d = dVar;
        this.e = str;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.DynamicModule.a();
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        this.i.put("moduleName", this.d.a());
        String str = this.e;
        if (str != null) {
            this.i.put("moduleState", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            this.i.put("moduleError", str2);
        }
        JSONObject jSONObject = this.i;
        C8632dsu.a(jSONObject, "");
        return jSONObject;
    }

    public final aSV d(String str) {
        Logblob.Severity severity;
        this.b = str;
        if (str != null) {
            if (e(str)) {
                severity = Logblob.Severity.warn;
            } else {
                severity = Logblob.Severity.error;
            }
            this.f = severity;
        }
        return this;
    }

    private final boolean e(String str) {
        boolean e;
        boolean e2;
        e = duD.e((CharSequence) str, (CharSequence) "Split Install Error (-7)", true);
        if (e) {
            return true;
        }
        e2 = duD.e((CharSequence) str, (CharSequence) "Split Install Error (-1)", true);
        return e2;
    }
}

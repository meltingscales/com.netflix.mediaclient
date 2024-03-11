package o;

import org.json.JSONException;

/* loaded from: classes3.dex */
public class aWU extends aWS {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "mdxinit";
    }

    public aWU(String str, long j) {
        super(str, j);
        try {
            this.i.put("mdxver", "2014.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

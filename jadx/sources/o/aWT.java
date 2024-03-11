package o;

import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class aWT extends aWS {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "reconnect";
    }

    public aWT(String str, long j, MdxTargetType mdxTargetType, String str2, String str3, boolean z, String str4, String str5, String str6) {
        super(str, j, str4, str5, str6);
        try {
            this.i.put("mdxver", "2014.1");
            this.i.put("targettype", mdxTargetType.d());
            this.i.put("deviceid", str2 != null ? str2 : "");
            this.i.put("devicename", "");
            this.i.put("usermismatch", String.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

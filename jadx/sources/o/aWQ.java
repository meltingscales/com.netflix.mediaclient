package o;

import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class aWQ extends aWN {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "mdxplay";
    }

    public aWQ(String str, MdxTargetType mdxTargetType, String str2, String str3) {
        super(str);
        try {
            this.i.put("targettype", mdxTargetType.d());
            this.i.put("deviceid", str2 == null ? "" : str2);
            this.i.put("devicename", "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

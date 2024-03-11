package o;

import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.net.probe.ProbeConfigResponse;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
class aZZ extends aUI {
    private final String d;

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return this.d;
    }

    public aZZ(String str, String str2, JsonObject jsonObject, List<ProbeConfigResponse.c> list, Collection<C4231bac> collection) {
        this.d = str2;
        d();
        try {
            this.i.put(SignupConstants.Field.URL, str);
            this.i.put("ctx", C8123deT.a(jsonObject));
            this.i.put("reqopts", C8123deT.d(C8118deO.a().toJsonTree(list)));
            this.i.put(NotificationFactory.DATA, C8123deT.d(C8118deO.a().toJsonTree(collection)));
        } catch (JSONException unused) {
            C1044Mm.d("nf_probe", "unable to create probe logblob");
        }
    }
}

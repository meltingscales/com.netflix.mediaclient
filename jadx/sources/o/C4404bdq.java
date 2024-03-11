package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4404bdq extends AbstractC4398bdk {
    private final boolean a;
    protected final InterfaceC4389bdb d;
    private final String x;
    private final String y;

    @Override // o.AbstractC4398bdk
    protected String T() {
        return "FetchAccountOnHoldUma";
    }

    public C4404bdq(Context context, String str, boolean z, InterfaceC4389bdb interfaceC4389bdb) {
        super(context);
        this.d = interfaceC4389bdb;
        this.y = str;
        this.a = z;
        this.x = "[\"accountOnHoldUma\"]";
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.HIGH;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Arrays.asList(this.x);
    }

    @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        if (o2 == null) {
            o2 = new HashMap<>();
        }
        String str = this.y;
        if (str != null) {
            o2.put("tagFilter", str);
        }
        if (this.a) {
            o2.put("isConsumptionOnly", "true");
        }
        return o2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: c */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (this.d != null) {
            try {
                jSONObject2 = jSONObject.getJSONObject("jsonGraph").getJSONObject("accountOnHoldUma").getJSONObject("value");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            this.d.e(new C4363bdB(jSONObject2).b(), InterfaceC1078Nw.aJ);
            return;
        }
        C1044Mm.e("nq_accountOnHoldUma", "no callback for accountOnHoldUma");
    }

    @Override // o.aZE
    public void e(Status status) {
        InterfaceC4389bdb interfaceC4389bdb = this.d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.e(null, status);
        } else {
            C1044Mm.e("nq_accountOnHoldUma", "no callback for accountOnHoldUma");
        }
    }
}

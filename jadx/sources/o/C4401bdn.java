package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bdn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4401bdn extends AbstractC4366bdE {
    public static final d d = new d(null);
    private final InterfaceC4389bdb a;
    private final String e;

    @Override // o.aZE
    public String G_() {
        return this.e;
    }

    @Override // o.AbstractC2103aZz, o.aZE
    public String O() {
        return "/playapi/android/adbreakhydration";
    }

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    /* renamed from: o.bdn$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AdBreakHydrationRequest");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4401bdn(Context context, String str, InterfaceC4389bdb interfaceC4389bdb) {
        super(context);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.a = interfaceC4389bdb;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        C8200dfr.e(j, "adBreakHydration", true);
        C8632dsu.d(j);
        return j;
    }

    private final void d(JSONObject jSONObject, Status status) {
        InterfaceC4389bdb interfaceC4389bdb = this.a;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.c(jSONObject, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: d */
    public void a(JSONObject jSONObject) {
        Status status;
        String str;
        C8632dsu.c((Object) jSONObject, "");
        JSONArray optJSONArray = jSONObject.optJSONArray(VisualStateDefinition.ELEMENT_STATE.RESULT);
        int i = 0;
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        if (length > 0) {
            status = InterfaceC1078Nw.aJ;
            str = "OK";
        } else {
            status = InterfaceC1078Nw.ax;
            str = "NODEQUARK_FAILURE";
        }
        C8632dsu.a(status, str);
        while (true) {
            if (i >= length) {
                break;
            }
            status = C1959aUp.a(this.C, optJSONArray.optJSONObject(i), BasePlayErrorStatus.PlayRequestType.other);
            C8632dsu.a(status, "");
            if (!status.i()) {
                i++;
            } else if (c(status)) {
                ((aZE) this).m.a(this);
                return;
            }
        }
        d(jSONObject, status);
    }

    @Override // o.aZE
    public void e(Status status) {
        C8632dsu.c((Object) status, "");
        d(null, status);
    }

    @Override // o.AbstractC2103aZz, o.aZE
    public void L() {
        k(((aZE) this).i.j().d("/playapi/android/adbreakhydration"));
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.IMMEDIATE;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    /* renamed from: X */
    public NetworkRequestType y() {
        return NetworkRequestType.PLAY_ADBREAK_HYDRATION;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        List<String> f;
        f = C8569dql.f("[\"adbreakhydration\"]");
        return f;
    }
}

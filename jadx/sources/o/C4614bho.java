package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.IPlayer;
import org.json.JSONObject;

/* renamed from: o.bho  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4614bho implements IPlayer.c {
    private JSONObject a;
    private String b;
    private C4974bpx c;
    private String d;
    private UmaAlert e;

    @Override // com.netflix.mediaclient.servicemgr.IPlayer.c
    public String a() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.servicemgr.IPlayer.c
    public String b() {
        return this.b;
    }

    public C4974bpx c() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.servicemgr.IPlayer.c
    public int d() {
        return 0;
    }

    public JSONObject e() {
        return this.a;
    }

    public C4614bho(C4974bpx c4974bpx) {
        this.d = "";
        this.b = "100";
        this.a = new JSONObject();
        this.e = null;
        if (c4974bpx != null) {
            this.d = c4974bpx.l();
            this.b = c4974bpx.c();
            this.a = c4974bpx.d();
            this.c = c4974bpx;
        }
    }

    public String toString() {
        return "StreamingPlaybackError{, mUserDisplayErrorString='" + this.d + "', mUiDisplayErrorCode='" + this.b + "', mErrExtraInfo=" + this.a + '}';
    }

    public C4614bho(String str, String str2, JSONObject jSONObject) {
        this.d = "";
        this.b = "100";
        new JSONObject();
        this.e = null;
        this.d = str;
        this.b = str2;
        this.a = jSONObject;
    }

    @Override // com.netflix.mediaclient.servicemgr.IPlayer.c
    public boolean h() {
        C4974bpx c4974bpx = this.c;
        if (c4974bpx == null || !(c4974bpx.j() instanceof InterfaceC4413bdz)) {
            return false;
        }
        return ((InterfaceC4413bdz) this.c.j()).z();
    }

    public UmaAlert f() {
        UmaAlert umaAlert = this.e;
        if (umaAlert != null) {
            return umaAlert;
        }
        try {
            String optString = e().optString("uma", "");
            if (C8168dfL.h(optString)) {
                this.e = (UmaAlert) C8118deO.a().fromJson(optString, (Class<Object>) UmaAlert.class);
            }
        } catch (Exception e) {
            InterfaceC1597aHe.b("Error parsing umaAlert = $umaAlert", e, ErrorType.s);
        }
        return this.e;
    }
}

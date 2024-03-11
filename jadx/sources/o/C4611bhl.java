package o;

import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import org.json.JSONObject;

/* renamed from: o.bhl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4611bhl extends C4614bho {
    private final MembershipChoicesResponse d;

    public final MembershipChoicesResponse j() {
        return this.d;
    }

    public C4611bhl(String str, String str2, JSONObject jSONObject) {
        super(str, str2, jSONObject);
        this.d = jSONObject != null ? (MembershipChoicesResponse) C8118deO.a().fromJson(jSONObject.toString(), (Class<Object>) MembershipChoicesResponse.class) : null;
    }
}

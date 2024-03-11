package o;

import com.netflix.cl.model.TrackingInfo;
import org.json.JSONObject;

/* renamed from: o.Vr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1282Vr {
    public static final C1282Vr e = new C1282Vr();

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject c(JSONObject jSONObject) {
        return jSONObject;
    }

    private C1282Vr() {
    }

    public static final TrackingInfo a(final JSONObject jSONObject) {
        return new TrackingInfo() { // from class: o.Vo
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject c;
                c = C1282Vr.c(JSONObject.this);
                return c;
            }
        };
    }
}

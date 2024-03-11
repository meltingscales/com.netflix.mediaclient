package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aUN extends C1973aVd {
    public static final d a = new d(null);
    private final int e;

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aUN(String str, int i, boolean z) {
        super(str, "skipByDelta", z);
        C8632dsu.c((Object) str, "");
        this.e = i;
    }

    @Override // o.C1973aVd
    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("delta", this.e);
        return jSONObject;
    }
}

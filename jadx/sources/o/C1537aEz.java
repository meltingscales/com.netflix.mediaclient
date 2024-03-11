package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.advisory.Advisory;
import kotlin.NotImplementedError;

/* renamed from: o.aEz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1537aEz implements Advisory {
    private final C2570aia a;

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getSecondaryMessage() {
        return null;
    }

    public C1537aEz(C2570aia c2570aia) {
        C8632dsu.c((Object) c2570aia, "");
        this.a = c2570aia;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public Advisory.Type getType() {
        String c = this.a.c();
        if (C8632dsu.c((Object) c, (Object) C2868aoG.b.b().b())) {
            return Advisory.Type.CONTENT_ADVISORY;
        }
        if (C8632dsu.c((Object) c, (Object) C2883aoV.c.e().b())) {
            return Advisory.Type.EXPIRY_NOTICE;
        }
        if (C8632dsu.c((Object) c, (Object) C3138atL.b.b().b())) {
            return Advisory.Type.PRODUCT_PLACEMENT_ADVISORY;
        }
        return Advisory.Type.UNKNOWN;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public float getDuration() {
        Integer d = this.a.d();
        return (d != null ? d.intValue() : 0.0f) / 1000;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public float getDelay() {
        Integer e = this.a.e();
        return (e != null ? e.intValue() : 0.0f) / 1000;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getMessage() {
        String b = this.a.b();
        return b == null ? "" : b;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public JsonObject getData(JsonElement jsonElement) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}

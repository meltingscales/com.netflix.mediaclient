package o;

import com.netflix.model.leafs.PrePlayExperience;
import o.C2586aiq;

/* loaded from: classes3.dex */
public final class aEG implements PrePlayExperience {
    private final C2586aiq c;

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getUiLabel() {
        return "";
    }

    public aEG(C2586aiq c2586aiq) {
        C8632dsu.c((Object) c2586aiq, "");
        this.c = c2586aiq;
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getType() {
        return this.c.a();
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public boolean getAutoPlay() {
        Boolean d;
        C2586aiq.c c = this.c.c();
        if (c == null || (d = c.d()) == null) {
            return false;
        }
        return d.booleanValue();
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getPrePlayVideoId() {
        C2586aiq.h a;
        C2586aiq.e b;
        C2586aiq.c c = this.c.c();
        if (c == null || (a = c.a()) == null || (b = a.b()) == null) {
            return null;
        }
        return Integer.valueOf(b.d()).toString();
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getImpressionData() {
        C2586aiq.c c = this.c.c();
        if (c != null) {
            return c.e();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public int getTrackId() {
        C2586aiq.a e;
        Integer d;
        C2586aiq.b b = this.c.b();
        if (b == null || (e = b.e()) == null || (d = e.d()) == null) {
            return -10386;
        }
        return d.intValue();
    }
}

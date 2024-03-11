package o;

import com.netflix.model.leafs.originals.ContentWarning;
import o.C2282adM;

/* loaded from: classes3.dex */
public final class aDC extends ContentWarning {
    private final C2282adM.a c;

    public aDC(C2282adM.a aVar) {
        C8632dsu.c((Object) aVar, "");
        this.c = aVar;
    }

    @Override // com.netflix.model.leafs.originals.ContentWarning
    public String url() {
        return this.c.a();
    }

    @Override // com.netflix.model.leafs.originals.ContentWarning
    public String message() {
        return this.c.c();
    }
}

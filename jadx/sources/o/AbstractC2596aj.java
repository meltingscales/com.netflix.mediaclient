package o;

import com.airbnb.epoxy.ModelList;
import java.util.List;

/* renamed from: o.aj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2596aj extends Z {
    private final C1943aU d = new C1943aU();
    protected final List<AbstractC3073as<?>> a = new ModelList();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.Z
    public List<AbstractC3073as<?>> d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.Z
    public AbstractC3073as<?> a(int i) {
        AbstractC3073as<?> abstractC3073as = this.a.get(i);
        return abstractC3073as.j() ? abstractC3073as : this.d;
    }
}

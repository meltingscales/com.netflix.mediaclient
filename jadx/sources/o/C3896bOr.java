package o;

import javax.inject.Inject;
import o.aRF;

/* renamed from: o.bOr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3896bOr {
    private final boolean a;

    @Inject
    public C3896bOr(boolean z) {
        this.a = z;
    }

    public final boolean b() {
        aRF.b bVar = aRF.e;
        return bVar.a().d() ? this.a : bVar.a().e();
    }
}

package o;

import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import javax.inject.Inject;

/* renamed from: o.aCv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1479aCv implements InterfaceC1469aCl {
    private final ImageResolutionClass a;

    @Override // o.InterfaceC1469aCl
    public ImageResolutionClass e() {
        return this.a;
    }

    @Inject
    public C1479aCv() {
        aOV c = c();
        this.a = c != null ? c.C() : null;
    }

    private final aOV c() {
        return AbstractApplicationC1040Mh.getInstance().i().d();
    }

    @Override // o.InterfaceC1469aCl
    public Boolean a() {
        aOV c = c();
        if (c != null) {
            return Boolean.valueOf(c.e());
        }
        return null;
    }
}

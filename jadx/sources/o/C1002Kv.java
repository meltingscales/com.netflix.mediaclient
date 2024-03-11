package o;

import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.advisory.ContentAction;
import java.util.List;
import java.util.Locale;

/* renamed from: o.Kv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1002Kv extends IT {
    private InterfaceC1242Ud g;

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
    }

    @Override // o.IT
    protected boolean x() {
        return true;
    }

    public C1002Kv(C0954Iz<?> c0954Iz, String str, ContentAction contentAction) {
        super("UpdateExpiryAdvisoryStatus", c0954Iz, AbstractC1761aNg.e());
        this.g = IE.b("expiringContentNotice", str, contentAction.name().toLowerCase(Locale.ENGLISH));
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.g);
    }

    @Override // o.IT
    protected void e(HZ hz) {
        if (hz.t_() || (hz.f() && hz.l().size() == 0)) {
            throw new FalkorException("Empty value");
        }
    }
}

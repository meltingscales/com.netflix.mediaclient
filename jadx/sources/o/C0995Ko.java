package o;

import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.Ko  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0995Ko extends IT {
    private static final d f = new d();
    private final Map<String, String> h;
    private final InterfaceC5223buh i;
    private final BillboardInteractionType j;

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

    public C0995Ko(C0954Iz<?> c0954Iz, InterfaceC5223buh interfaceC5223buh, BillboardInteractionType billboardInteractionType, Map<String, String> map) {
        super("LogBillboardActivity", c0954Iz, AbstractC1761aNg.e());
        this.i = interfaceC5223buh;
        this.j = billboardInteractionType;
        this.h = map;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        String jSONObject = this.h != null ? new JSONObject((Map) this.h).toString() : "{}";
        if (f.b(this.d.j(), this.i.getId())) {
            list.add(IE.b("logBillboardActivity", this.i.getId(), this.j.c(), jSONObject));
        } else {
            i();
        }
    }

    @Override // o.IT
    protected void e(HZ hz) {
        if (hz.t_() || (hz.f() && hz.l().size() == 0)) {
            throw new FalkorException("Empty value");
        }
    }

    /* renamed from: o.Ko$d */
    /* loaded from: classes3.dex */
    static final class d {
        private String e = null;
        private final HashSet<String> b = new HashSet<>();

        public boolean b(String str, String str2) {
            if (this.b.contains(str2)) {
                return false;
            }
            this.b.add(str2);
            C1044Mm.a("LogBillboardActivityTask", "(size: %d) - Added videoId: %s", Integer.valueOf(this.b.size()), str2);
            return true;
        }
    }
}

package o;

import com.netflix.mediaclient.android.app.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Kh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0988Kh extends IS {
    private final String i;

    public C0988Kh(C0954Iz<?> c0954Iz, IG ig, C0953Iy c0953Iy, String str, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        super(e(z), c0954Iz, ig, c0953Iy, str, z, interfaceC1757aNc);
        this.i = str;
    }

    private static String e(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("KidsCharacterDetails");
        sb.append(z ? ":prefetch" : "");
        return sb.toString();
    }

    @Override // o.IS, o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        super.d(list);
        list.add(IE.b("characters", this.i, "summary"));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C0956Jb.e());
        arrayList.addAll(C0956Jb.f());
        arrayList.addAll(C0956Jb.b());
        arrayList.add("logoBrandedHoriz");
        list.add(IE.b("characters", this.i, "watchNext", arrayList));
        list.add(IE.b("characters", this.i, "watchNext", "topNode", arrayList));
        list.add(IE.b("characters", this.i, "gallery", "summary"));
        list.add(C0956Jb.a(this.i));
    }

    @Override // o.IS, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        super.a(interfaceC1757aNc, c1244Uf);
        interfaceC1757aNc.b((InterfaceC5230buo) this.d.a(IE.b("characters", this.i)), Boolean.TRUE, InterfaceC1078Nw.aJ);
    }

    @Override // o.IS, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        super.a(interfaceC1757aNc, status);
        interfaceC1757aNc.b(null, Boolean.FALSE, status);
    }
}

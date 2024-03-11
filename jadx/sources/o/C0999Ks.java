package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* renamed from: o.Ks  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0999Ks extends AbstractC0985Ke<Boolean> {
    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public Boolean e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        return Boolean.TRUE;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean d() {
        return true;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean e() {
        return true;
    }

    public C0999Ks() {
        super("MarkGamesEducationBillboardAsSeenTask", TaskMode.FROM_NETWORK, false, 4, null);
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b("games", "markEducationBillboardSeen");
        C8632dsu.a(b, "");
        list.add(b);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        return new ArrayList();
    }
}

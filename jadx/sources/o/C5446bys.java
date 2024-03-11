package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.List;
import o.C8143den;

/* renamed from: o.bys  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5446bys extends AbstractC0985Ke<Boolean> {
    private final boolean d;

    @Override // o.AbstractC0985Ke
    /* renamed from: c */
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

    public C5446bys(boolean z) {
        super("RaterDismissedTask", TaskMode.FROM_NETWORK, false, 4, null);
        this.d = z;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b("bulkRater", "dismiss");
        C8632dsu.a(b, "");
        list.add(b);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        List<C8143den.d> f;
        f = C8569dql.f(new C8143den.d("param", String.valueOf(this.d)));
        return f;
    }
}

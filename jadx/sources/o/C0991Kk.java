package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.Collection;
import java.util.List;

/* renamed from: o.Kk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0991Kk extends AbstractC0985Ke<InterfaceC5230buo> {
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991Kk(String str, TaskMode taskMode) {
        super("KidsCharacterDetails", taskMode, false, 4, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        this.e = str;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        List g;
        List g2;
        List b;
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b2 = IE.b("characters", this.e, "summary");
        C8632dsu.a(b2, "");
        list.add(b2);
        List<String> e = C0956Jb.e();
        C8632dsu.a(e, "");
        List<String> f = C0956Jb.f();
        C8632dsu.a(f, "");
        g = C8576dqs.g((Collection) e, (Iterable) f);
        List<String> b3 = C0956Jb.b();
        C8632dsu.a(b3, "");
        g2 = C8576dqs.g((Collection) g, (Iterable) b3);
        b = C8576dqs.b((Collection<? extends String>) ((Collection<? extends Object>) g2), "logoBrandedHoriz");
        InterfaceC1242Ud b4 = IE.b("characters", this.e, "watchNext", b);
        C8632dsu.a(b4, "");
        list.add(b4);
        InterfaceC1242Ud b5 = IE.b("characters", this.e, "watchNext", "topNode", b);
        C8632dsu.a(b5, "");
        list.add(b5);
        InterfaceC1242Ud b6 = IE.b("characters", this.e, "gallery", "summary");
        C8632dsu.a(b6, "");
        list.add(b6);
        InterfaceC1242Ud a = C0956Jb.a(this.e);
        C8632dsu.a(a, "");
        list.add(a);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: a */
    public InterfaceC5230buo e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        return (InterfaceC5230buo) interfaceC1240Ub.b(IE.b("characters", this.e));
    }
}

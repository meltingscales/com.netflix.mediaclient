package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.List;

/* renamed from: o.Kl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0992Kl extends AbstractC0985Ke<Boolean> {
    private final String d;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0992Kl(String str) {
        super("LogImpressionTask", TaskMode.FROM_NETWORK, false, 4, null);
        C8632dsu.c((Object) str, "");
        this.d = str;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b("impression", this.d);
        C8632dsu.a(b, "");
        list.add(b);
    }
}

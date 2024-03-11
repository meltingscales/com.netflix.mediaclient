package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.List;

/* renamed from: o.Ky  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1005Ky extends AbstractC0985Ke<List<? extends InterfaceC5195buF>> {
    private final String a;
    private final InterfaceC1242Ud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005Ky(String str, TaskMode taskMode) {
        super("Seasons", taskMode, false, 4, null);
        List e;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        this.a = str;
        e = C8566dqi.e(str);
        InterfaceC1242Ud e2 = C0956Jb.e(e);
        C8632dsu.a(e2, "");
        this.b = e2;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.a, "seasons", "summary");
        C8632dsu.a(b, "");
        list.add(b);
        InterfaceC1242Ud b2 = IE.b(SignupConstants.Field.VIDEOS, this.a, "seasons", "latest", "detail");
        C8632dsu.a(b2, "");
        list.add(b2);
        list.add(this.b);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public List<InterfaceC5195buF> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        return interfaceC1240Ub.c(this.b);
    }
}

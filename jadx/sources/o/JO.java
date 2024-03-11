package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.List;

/* loaded from: classes3.dex */
public final class JO extends AbstractC0985Ke<List<? extends InterfaceC5195buF>> {
    private final InterfaceC1242Ud c;
    private final String d;
    private final TaskMode e;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean a(List<? extends InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JO(String str, TaskMode taskMode) {
        super("FetchSeasonsListTask", null, false, 6, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        this.d = str;
        this.e = taskMode;
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, str, "seasons", IE.a(39), "detail");
        C8632dsu.a(b, "");
        this.c = b;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.d, "seasons", "summary");
        C8632dsu.a(b, "");
        list.add(b);
        list.add(this.c);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean a() {
        return this.e == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean b() {
        return this.e == TaskMode.FROM_NETWORK;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: d */
    public List<InterfaceC5195buF> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        return interfaceC1240Ub.c(this.c);
    }
}

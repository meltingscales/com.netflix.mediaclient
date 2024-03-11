package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import java.util.List;

/* renamed from: o.Jq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0971Jq extends AbstractC0985Ke<GenreItem> {
    private final InterfaceC1242Ud a;
    private final String c;
    private final TaskMode e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0971Jq(String str, TaskMode taskMode) {
        super("FetchGenreItemCmpTask", taskMode, false, 4, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) taskMode, "");
        this.c = str;
        this.e = taskMode;
        InterfaceC1242Ud b = IE.b("genres", str, "summary");
        C8632dsu.a(b, "");
        this.a = b;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public GenreItem e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        GenreItem a;
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(this.a);
        C8328diM c8328diM = b instanceof C8328diM ? (C8328diM) b : null;
        return (c8328diM == null || (a = c8328diM.a()) == null) ? new DefaultGenreItem() : a;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.a);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean a() {
        return this.e == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean b() {
        return this.e == TaskMode.FROM_NETWORK;
    }
}

package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.List;
import o.C8143den;

/* renamed from: o.Ja  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0955Ja extends AbstractC0985Ke<List<? extends InterfaceC5198buI>> {
    private final String a;
    private final int b;
    private final String c;
    private final int e;

    public /* synthetic */ C0955Ja(String str, String str2, int i, int i2, TaskMode taskMode, int i3, C8627dsp c8627dsp) {
        this(str, str2, i, i2, (i3 & 16) != 0 ? TaskMode.FROM_CACHE_OR_NETWORK : taskMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0955Ja(String str, String str2, int i, int i2, TaskMode taskMode) {
        super("FetchBulkRaterImagesTask", taskMode, false, 4, null);
        C8632dsu.c((Object) taskMode, "");
        this.c = str;
        this.a = str2;
        this.e = i;
        this.b = i2;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        InterfaceC1242Ud b;
        C8632dsu.c((Object) list, "");
        String str = this.a;
        if (str != null) {
            b = IE.b("lists", str);
        } else {
            String str2 = this.c;
            if (str2 != null) {
                b = IE.b("lolomos", str2, LoMoType.BULK_RATER.a());
            } else {
                throw new IllegalArgumentException("Must set either lolomoId or listId");
            }
        }
        C8632dsu.d(b);
        InterfaceC1242Ud c = b.c(IE.a(this.e, this.b)).c("listItem").c("bulkRaterImages");
        C8632dsu.a(c, "");
        list.add(c);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: a */
    public List<InterfaceC5198buI> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        List b = interfaceC1240Ub.b(c1244Uf.e);
        C8632dsu.a(b, "");
        return b;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        List<C8143den.d> e;
        e = C8566dqi.e(new C8143den.d("enableBulkRater", "true"));
        return e;
    }
}

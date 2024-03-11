package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.List;
import o.C8143den;

/* renamed from: o.bBc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3526bBc extends AbstractC0985Ke<Boolean> {
    public static final c b = new c(null);
    private final String a;

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
    public C3526bBc(String str) {
        super("CollectTasteInteractionTask", TaskMode.FROM_NETWORK, false, 4, null);
        C8632dsu.c((Object) str, "");
        this.a = str;
    }

    /* renamed from: o.bBc$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b2 = IE.b("collectTaste", "interaction");
        C8632dsu.a(b2, "");
        list.add(b2);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        List<C8143den.d> f;
        f = C8569dql.f(new C8143den.d("BULK_RATER_INTERACTION_PARAM", this.a));
        return f;
    }
}

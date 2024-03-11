package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;

/* renamed from: o.Jx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0978Jx extends AbstractC0985Ke<Boolean> {
    public static final a d = new a(null);
    private final InterfaceC1242Ud c;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean b() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0978Jx(String str) {
        super(d.getLogTag(), null, false, 6, null);
        C8632dsu.c((Object) str, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, str, "isRestricted");
        C8632dsu.a(b, "");
        this.c = b;
    }

    /* renamed from: o.Jx$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("FetchIsVideoRestricted");
        }
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.c);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: d */
    public Boolean e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(this.c);
        InterfaceC8366diy interfaceC8366diy = b instanceof InterfaceC8366diy ? (InterfaceC8366diy) b : null;
        if (interfaceC8366diy != null) {
            return interfaceC8366diy.aL();
        }
        return null;
    }
}

package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2824anP {
    public static final C2824anP c = new C2824anP();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> c() {
        return d;
    }

    private C2824anP() {
    }

    static {
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        C9018hf.a aVar = new C9018hf.a("recordRdid", C2945ape.b.b());
        e = C8566dqi.e(new C9021hi.d(SignupConstants.Field.LANG_ID).b(new C9027ho(SignupConstants.Field.LANG_ID)).b());
        e2 = C8566dqi.e(aVar.b(e).d());
        d = e2;
    }
}

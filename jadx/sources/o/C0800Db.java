package o;

import com.netflix.clcs.codegen.type.CLCSItemAlignment;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* renamed from: o.Db  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0800Db {
    public static final C0800Db a = new C0800Db();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final int d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C0800Db() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j2;
        List e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("CLCSDesignSpaceSize");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignSpaceSize", e2).b(C0796Cx.d.d()).a());
        e = j2;
        e3 = C8566dqi.e("CLCSContainerStyle");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSContainerStyle", e3).b(C0791Cs.d.c()).a());
        j = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, C9019hg.d(dVar.c())).d());
        b = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("contentJustification", CLCSStackContentJustification.a.b()).d(), new C9018hf.a("contentSpacing", CLCSSpaceSize.c.d()).d(), new C9018hf.a("contentSpacingSize", DA.e.c()).e(j2).d(), new C9018hf.a("contentStretch", EE.e.a()).d(), new C9018hf.a("itemAlignment", CLCSItemAlignment.e.a()).d(), new C9018hf.a("style", C0820Dv.b.a()).e(j3).d(), new C9018hf.a("children", C9019hg.d(C9019hg.a(C9019hg.d(C0823Dy.e.b())))).e(j4).d());
        c = j5;
        d = 8;
    }
}

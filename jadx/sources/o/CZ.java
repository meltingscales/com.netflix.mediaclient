package o;

import com.netflix.clcs.codegen.type.CLCSTemplateItemFlexibleSize;
import com.netflix.mediaclient.media.subtitles.BaseSubtitle;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EL;

/* loaded from: classes2.dex */
public final class CZ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final int d;
    public static final CZ e = new CZ();

    public final List<AbstractC9025hm> d() {
        return a;
    }

    private CZ() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List e2;
        List e3;
        List<AbstractC9025hm> j3;
        EL.e eVar = EL.d;
        j = C8569dql.j(new C9018hf.a(BaseSubtitle.ATTR_ORDER, eVar.a()).d(), new C9018hf.a("size", C9019hg.d(CLCSTemplateItemFlexibleSize.d.d())).d());
        c = j;
        j2 = C8569dql.j(new C9018hf.a(BaseSubtitle.ATTR_ORDER, eVar.a()).d(), new C9018hf.a("numColumns", C9019hg.d(eVar.a())).d());
        b = j2;
        e2 = C8566dqi.e("CLCSTemplateItemFlexible");
        e3 = C8566dqi.e("CLCSTemplateItemNumColumns");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d(), new C9017he.d("CLCSTemplateItemFlexible", e2).b(j).a(), new C9017he.d("CLCSTemplateItemNumColumns", e3).b(j2).a());
        a = j3;
        d = 8;
    }
}

package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.C1332Xp;
import o.C1346Yd;
import o.C2272adC;
import o.C2628ajf;
import o.C2635ajm;
import o.C8632dsu;
import o.C9646uN;
import o.InterfaceC1610aHr;
import o.InterfaceC9638uF;
import o.bAG;
import o.bBC;
import o.dpR;

/* loaded from: classes4.dex */
public final class bBC extends C1045Mp {
    public static final bBC e = new bBC();

    private bBC() {
        super("CollectTasteHelper");
    }

    public final int d(Context context) {
        C8632dsu.c((Object) context, "");
        int i = context.getResources().getDisplayMetrics().widthPixels;
        float dimension = 2 * context.getResources().getDimension(bAG.d.b);
        return ((float) i) > dimension ? i - ((int) dimension) : i;
    }

    public final void e(List<String> list) {
        C8632dsu.c((Object) list, "");
        for (String str : list) {
            if (str != null) {
                C9646uN.b b = C9646uN.d.a().e(str).c(false).b();
                InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
                Context d = AbstractApplicationC1040Mh.d();
                C8632dsu.a(d, "");
                SubscribersKt.subscribeBy$default(eVar.d(d).d(b), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.helper.CollectTasteHelper$prefetchImage$1$1
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        a(th);
                        return dpR.c;
                    }

                    public final void a(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        bBC bbc = bBC.e;
                    }
                }, (drM) null, 2, (Object) null);
            }
        }
    }

    public final C2272adC c(C3528bBe c3528bBe, int i) {
        List<C1346Yd.e> a;
        C1346Yd.e eVar;
        C8632dsu.c((Object) c3528bBe, "");
        Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>> c = c3528bBe.b().c();
        if (c == null || (a = c.a()) == null || (eVar = a.get(i)) == null) {
            return null;
        }
        return eVar.b();
    }

    public final String e(C2272adC c2272adC) {
        Integer c;
        return (c2272adC == null || (c = c2272adC.c()) == null) ? "" : String.valueOf(c.intValue());
    }

    public final Pair<List<C2635ajm.d>, String> d(C3528bBe c3528bBe, int i) {
        C2272adC.b d;
        C2272adC.c e2;
        String d2;
        C2635ajm l;
        C8632dsu.c((Object) c3528bBe, "");
        C2272adC c = c(c3528bBe, i);
        List<C2635ajm.d> list = null;
        String e3 = c != null ? c.e() : null;
        if (e3 == null || e3.length() == 0) {
            if (c != null && (d = c.d()) != null && (e2 = d.e()) != null) {
                d2 = e2.d();
            }
            d2 = null;
        } else {
            if (c != null) {
                d2 = c.e();
            }
            d2 = null;
        }
        if (c != null && (l = c.l()) != null) {
            list = l.a();
        }
        return new Pair<>(list, d2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.Pair] */
    public final Pair<Drawable, String> d(C2272adC c2272adC) {
        C2628ajf f;
        C2628ajf.a c;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = new Pair(null, "");
        if (c2272adC != null && (f = c2272adC.f()) != null && (c = f.c()) != null) {
            final aEW aew = new aEW(c);
            dpR dpr = (dpR) C9726vo.d(aew.getAdvisoryBoard(), aew.getRatingDescription(), new drX<AdvisoryBoard, String, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.helper.CollectTasteHelper$getRatingDetails$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(AdvisoryBoard advisoryBoard, String str) {
                    e(advisoryBoard, str);
                    return dpR.c;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.Pair] */
                public final void e(AdvisoryBoard advisoryBoard, String str) {
                    C8632dsu.c((Object) advisoryBoard, "");
                    C8632dsu.c((Object) str, "");
                    Ref.ObjectRef<Pair<Drawable, String>> objectRef2 = objectRef;
                    C1332Xp c1332Xp = C1332Xp.b;
                    objectRef2.d = new Pair(((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b(aew, true), str);
                }
            });
        }
        return (Pair) objectRef.d;
    }

    public final String a(C2272adC c2272adC) {
        C2628ajf f;
        C2628ajf.a c;
        String h;
        return (c2272adC == null || (f = c2272adC.f()) == null || (c = f.c()) == null || (h = c.h()) == null) ? "" : h;
    }

    public final Pair<String, String> c(Context context, C2272adC c2272adC) {
        C8632dsu.c((Object) context, "");
        Pair<String, String> pair = new Pair<>("", "");
        if (c2272adC != null) {
            C2272adC.e g = c2272adC.g();
            String e2 = g != null ? g.e() : null;
            int g2 = new C1535aEx(c2272adC.h()).g();
            if (e2 != null) {
                return new Pair<>(e2, e2);
            }
            if (g2 > 0) {
                C8112deI c = C8178dfV.c(g2, context);
                return new Pair<>(c.d(), c.b());
            }
            return pair;
        }
        return pair;
    }

    public final Pair<String, String> a(NetflixActivity netflixActivity, C2272adC c2272adC) {
        List<PlaybackBadge> i;
        C8632dsu.c((Object) netflixActivity, "");
        if (c2272adC != null && (i = c2272adC.i()) != null) {
            return InterfaceC3656bFy.d.e(netflixActivity).a(new C1515aEd(i), netflixActivity);
        }
        return new Pair<>("", "");
    }

    public final int c() {
        return C1860aQy.b.e().d();
    }

    public final int e() {
        C1332Xp c1332Xp = C1332Xp.b;
        return C4000bSn.b((Context) C1332Xp.b(Context.class), LoMoType.STANDARD);
    }

    public final String e(C3528bBe c3528bBe, int i) {
        List<InterfaceC5222bug<? extends InterfaceC5223buh>> d;
        InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug;
        InterfaceC5223buh video;
        C8632dsu.c((Object) c3528bBe, "");
        Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>> c = c3528bBe.b().c();
        if (c == null || (d = c.d()) == null || (interfaceC5222bug = d.get(i)) == null || (video = interfaceC5222bug.getVideo()) == null) {
            return null;
        }
        return video.getId();
    }

    public final int c(C3528bBe c3528bBe) {
        C8632dsu.c((Object) c3528bBe, "");
        return c3528bBe.c().a();
    }
}

package o;

import android.content.Context;
import android.util.TypedValue;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController;
import com.netflix.mediaclient.ui.upnextfeed.impl.models.UpNextLoadingShimmer$addItemShimmerModels$1;
import kotlin.Pair;
import o.AbstractC3073as;
import o.C7939dav;
import o.dpR;

/* renamed from: o.dbV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7966dbV {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(int i, int i2, int i3) {
        return i;
    }

    public static /* synthetic */ void a(C7966dbV c7966dbV, InterfaceC2023aX interfaceC2023aX, String str, boolean z, long j, drO dro, int i, Object obj) {
        if ((i & 8) != 0) {
            j = 0;
        }
        long j2 = j;
        UpNextLoadingShimmer$addItemShimmerModels$1 upNextLoadingShimmer$addItemShimmerModels$1 = dro;
        if ((i & 16) != 0) {
            upNextLoadingShimmer$addItemShimmerModels$1 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.UpNextLoadingShimmer$addItemShimmerModels$1
                public final void d() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }
            };
        }
        c7966dbV.a(interfaceC2023aX, str, z, j2, upNextLoadingShimmer$addItemShimmerModels$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drO dro, C3780bKj c3780bKj, C2077aZ c2077aZ, int i) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    public final void a(InterfaceC2023aX interfaceC2023aX, String str, boolean z, long j, final drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) str);
        c3780bKj.e(new AbstractC3073as.b() { // from class: o.dca
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int d;
                d = C7966dbV.d(i, i2, i3);
                return d;
            }
        });
        c3780bKj.c(new Pair<>(-1, -2));
        if (z) {
            c3780bKj.e(C7939dav.a.y);
            C3787bKq c3787bKq = new C3787bKq();
            c3787bKq.b((CharSequence) (str + "-left-tab"));
            c3787bKq.d(UpNextFeedEpoxyController.Companion.c());
            c3787bKq.a(BrowseExperience.e());
            c3787bKq.d(true);
            C1332Xp c1332Xp = C1332Xp.b;
            c3787bKq.d(Integer.valueOf((int) TypedValue.applyDimension(1, 7, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3780bKj.add(c3787bKq);
        } else {
            c3780bKj.e(C7939dav.a.q);
        }
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) (str + "-video"));
        c3787bKq2.d(true);
        float f = (float) 7;
        C1332Xp c1332Xp2 = C1332Xp.b;
        c3787bKq2.d(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq2.a(BrowseExperience.e());
        long j2 = j * 400;
        c3787bKq2.c(j2);
        c3780bKj.add(c3787bKq2);
        bJN bjn = new bJN();
        bjn.e((CharSequence) (str + "-maturity_rating"));
        c3780bKj.add(bjn);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) (str + "-title_logo"));
        UpNextFeedEpoxyController.a aVar = UpNextFeedEpoxyController.Companion;
        c3787bKq3.d(aVar.c());
        c3787bKq3.d(true);
        c3787bKq3.d(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq3.a(BrowseExperience.e());
        c3787bKq3.c(j2);
        c3780bKj.add(c3787bKq3);
        bJN bjn2 = new bJN();
        bjn2.e((CharSequence) (str + "-cta3"));
        c3780bKj.add(bjn2);
        C3787bKq c3787bKq4 = new C3787bKq();
        c3787bKq4.b((CharSequence) (str + "-cta2"));
        c3787bKq4.c(C7939dav.a.b);
        c3787bKq4.d(aVar.c());
        c3787bKq4.d(true);
        c3787bKq4.d(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq4.a(BrowseExperience.e());
        c3787bKq4.c(j2);
        c3780bKj.add(c3787bKq4);
        C3787bKq c3787bKq5 = new C3787bKq();
        c3787bKq5.b((CharSequence) (str + "-cta1"));
        c3787bKq5.c(C7939dav.a.b);
        c3787bKq5.d(aVar.d());
        c3787bKq5.d(true);
        c3787bKq5.d(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq5.a(BrowseExperience.e());
        c3787bKq5.c(j2);
        c3780bKj.add(c3787bKq5);
        if (C1875aRm.a.d()) {
            C3787bKq c3787bKq6 = new C3787bKq();
            c3787bKq6.b((CharSequence) (str + "-message"));
            c3787bKq6.c(C7939dav.a.z);
            c3787bKq6.d(aVar.c());
            c3787bKq6.d(true);
            c3787bKq6.d(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3787bKq6.a(BrowseExperience.e());
            c3787bKq6.c(j2);
            c3780bKj.add(c3787bKq6);
            C3787bKq c3787bKq7 = new C3787bKq();
            c3787bKq7.b((CharSequence) (str + "-synopsis"));
            c3787bKq7.c(C7939dav.a.K);
            c3787bKq7.d(aVar.c());
            c3787bKq7.d(true);
            c3787bKq7.d(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3787bKq7.a(BrowseExperience.e());
            c3787bKq7.c(j2);
            c3780bKj.add(c3787bKq7);
            C3787bKq c3787bKq8 = new C3787bKq();
            c3787bKq8.b((CharSequence) (str + "-tags"));
            c3787bKq8.c(C7939dav.a.P);
            c3787bKq8.d(aVar.c());
            c3787bKq8.d(true);
            c3787bKq8.d(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3787bKq8.a(BrowseExperience.e());
            c3787bKq8.c(j2);
            c3780bKj.add(c3787bKq8);
        } else {
            bJN bjn3 = new bJN();
            bjn3.e((CharSequence) (str + "-message"));
            c3780bKj.add(bjn3);
            bJN bjn4 = new bJN();
            bjn4.e((CharSequence) (str + "-synopsis"));
            c3780bKj.add(bjn4);
            bJN bjn5 = new bJN();
            bjn5.e((CharSequence) (str + "-tags"));
            c3780bKj.add(bjn5);
        }
        c3780bKj.b(new InterfaceC4467bf() { // from class: o.dbZ
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                C7966dbV.d(drO.this, (C3780bKj) abstractC3073as, (C2077aZ) obj, i);
            }
        });
        interfaceC2023aX.add(c3780bKj);
    }
}

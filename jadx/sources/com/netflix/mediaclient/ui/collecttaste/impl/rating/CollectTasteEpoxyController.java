package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import android.content.Context;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.AbstractC8918fl;
import o.C1346Yd;
import o.C1596aHd;
import o.C2272adC;
import o.C2274adE;
import o.C3528bBe;
import o.C3530bBg;
import o.C3787bKq;
import o.C8140dek;
import o.C8168dfL;
import o.C8569dql;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.C8974go;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.bAG;
import o.bJM;
import o.dqE;

/* loaded from: classes4.dex */
public final class CollectTasteEpoxyController extends TypedEpoxyController<C3528bBe> {
    public static final a Companion = new a(null);
    private static final long LOADING_DELAY_MS = 400;
    private final Context context;

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public CollectTasteEpoxyController(Context context) {
        C8632dsu.c((Object) context, "");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C3528bBe c3528bBe) {
        Map d;
        Map k;
        Throwable th;
        int d2;
        C2272adC b;
        C2274adE b2;
        C2274adE.b b3;
        C8632dsu.c((Object) c3528bBe, "");
        AbstractC8918fl<Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>>> b4 = c3528bBe.b();
        if (b4 instanceof C8974go) {
            addLoadingShimmerModel$default(this, "collect-taste-loading", 0L, 2, null);
        } else if (b4 instanceof C8932fz) {
            addLoadingShimmerModel("collect-taste-loading", 400L);
        } else if (b4 instanceof C8971gl) {
            Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>> c = c3528bBe.b().c();
            ArrayList arrayList = null;
            List<InterfaceC5222bug<? extends InterfaceC5223buh>> d3 = c != null ? c.d() : null;
            Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>> c2 = c3528bBe.b().c();
            List<C1346Yd.e> a2 = c2 != null ? c2.a() : null;
            if (a2 != null) {
                d2 = C8572dqo.d(a2, 10);
                ArrayList arrayList2 = new ArrayList(d2);
                for (C1346Yd.e eVar : a2) {
                    arrayList2.add((eVar == null || (b = eVar.b()) == null || (b2 = b.b()) == null || (b3 = b2.b()) == null) ? null : b3.e());
                }
                arrayList = arrayList2;
            }
            if (d3 == null || d3.isEmpty() || arrayList == null || arrayList.isEmpty()) {
                addErrorModel();
                return;
            }
            int i = 0;
            for (Object obj : d3) {
                if (i < 0) {
                    C8569dql.h();
                }
                addCollectTasteTitleCardModel((InterfaceC5222bug) obj, (String) arrayList.get(i));
                i++;
            }
        } else if (b4 instanceof C8927fu) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Fetching collect-taste titles call failed", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b5 = c1596aHd.b();
                if (b5 != null) {
                    String c3 = errorType.c();
                    c1596aHd.a(c3 + " " + b5);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a3 = dVar.a();
            if (a3 != null) {
                a3.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            addErrorModel();
        }
    }

    static /* synthetic */ void addLoadingShimmerModel$default(CollectTasteEpoxyController collectTasteEpoxyController, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        collectTasteEpoxyController.addLoadingShimmerModel(str, j);
    }

    private final void addCollectTasteTitleCardModel(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, String str) {
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        C3530bBg c3530bBg = new C3530bBg();
        String id = interfaceC5222bug.getVideo().getId();
        c3530bBg.d((CharSequence) ("collect-taste-title-card-" + id));
        c3530bBg.b(video.getTitle());
        if (str == null) {
            str = video.getBoxshotUrl();
        }
        c3530bBg.c(str);
        c3530bBg.c(C8140dek.a.a(this.context, interfaceC5222bug.getVideo()));
        add(c3530bBg);
    }

    private final void addLoadingShimmerModel(String str, long j) {
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.c(bAG.b.h);
        c3787bKq.b((CharSequence) str);
        c3787bKq.d(true);
        c3787bKq.c(j);
        c3787bKq.a(BrowseExperience.e());
        add(c3787bKq);
    }

    private final void addErrorModel() {
        bJM bjm = new bJM();
        bjm.b((CharSequence) UmaAlert.ICON_ERROR);
        bjm.c((CharSequence) C8168dfL.d(C9834xU.h.j));
        add(bjm);
    }
}

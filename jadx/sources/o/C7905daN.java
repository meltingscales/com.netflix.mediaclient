package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.UpNextFeedSection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.AbstractC7916daY;
import o.C1332Xp;
import o.C7905daN;
import o.C7912daU;
import o.C7939dav;
import o.C7978dbh;
import o.C8153dex;
import o.C8576dqs;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC2023aX;
import o.aQT;
import o.bKJ;
import o.bKL;
import o.dpR;
import o.drM;
import o.drX;

/* renamed from: o.daN  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7905daN {
    private final Map<Integer, Drawable> d = new LinkedHashMap();

    public final void a(Context context, InterfaceC2023aX interfaceC2023aX, List<TrailerItem.a> list, drM<? super Integer, dpR> drm) {
        int d;
        Drawable drawable;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) drm, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                C8569dql.h();
            }
            TrailerItem.a aVar = (TrailerItem.a) obj;
            linkedHashMap.put(Integer.valueOf(i), aVar.a());
            Integer num = C7912daU.d.d().get(aVar.a());
            if (context != null && num != null) {
                drawable = this.d.get(num);
                if (drawable == null) {
                    drawable = ContextCompat.getDrawable(context, num.intValue());
                    if (drawable != null) {
                        float f = 20;
                        C1332Xp c1332Xp = C1332Xp.b;
                        drawable.setBounds(0, 0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
                        this.d.put(num, drawable);
                    }
                }
                arrayList.add(new bKJ.e(aVar.b(), drawable, false, 4, null));
                i++;
            }
            drawable = null;
            arrayList.add(new bKJ.e(aVar.b(), drawable, false, 4, null));
            i++;
        }
        if (!(!arrayList.isEmpty())) {
            c(interfaceC2023aX);
            return;
        }
        bKL bkl = new bKL();
        bkl.b((CharSequence) "scrollable-tab-bar");
        if (C8153dex.X()) {
            bkl.d(C7939dav.a.H);
        }
        bkl.a((List<bKJ.e>) arrayList);
        bkl.d((bKJ.c) new a(drm, linkedHashMap));
        interfaceC2023aX.add(bkl);
    }

    /* renamed from: o.daN$a */
    /* loaded from: classes5.dex */
    public static final class a implements bKJ.c {
        final /* synthetic */ drM<Integer, dpR> a;
        final /* synthetic */ Map<Integer, String> e;

        /* JADX WARN: Multi-variable type inference failed */
        a(drM<? super Integer, dpR> drm, Map<Integer, String> map) {
            this.a = drm;
            this.e = map;
        }

        @Override // o.bKJ.c
        public void a(View view, int i) {
            C8632dsu.c((Object) view, "");
            this.a.invoke(Integer.valueOf(i));
            String str = this.e.get(Integer.valueOf(i));
            if (str == null) {
                str = "unknown list context";
            }
            CLv2Utils.d(new ChangeValueCommand(str));
        }
    }

    public final void c(final InterfaceC2023aX interfaceC2023aX, C7975dbe c7975dbe, final Context context, final drM<? super Integer, dpR> drm) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c7975dbe, "");
        C8632dsu.c((Object) drm, "");
        C8980gu.c(c7975dbe, new drM<C7978dbh, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextHeader$buildModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7978dbh c7978dbh) {
                e(c7978dbh);
                return dpR.c;
            }

            public final void e(C7978dbh c7978dbh) {
                List<UpNextFeedSection> G;
                C8632dsu.c((Object) c7978dbh, "");
                G = C8576dqs.G(c7978dbh.j());
                Context context2 = context;
                final C7905daN c7905daN = this;
                ArrayList arrayList = new ArrayList();
                for (final UpNextFeedSection upNextFeedSection : G) {
                    bKJ.e eVar = (bKJ.e) C9726vo.d(context2, upNextFeedSection.getSummary().getTitle(), new drX<Context, String, bKJ.e>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextHeader$buildModel$1$scrollableTabBarItems$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: b */
                        public final bKJ.e invoke(Context context3, String str) {
                            Drawable drawable;
                            Map map;
                            Map map2;
                            C8632dsu.c((Object) context3, "");
                            C8632dsu.c((Object) str, "");
                            Integer num = C7912daU.d.e().get(UpNextFeedSection.this.getSummary().getListContext());
                            if (num != null && aQT.c.c().a() && !Config_Ab55851_MobileNav.a.a()) {
                                map = c7905daN.d;
                                drawable = (Drawable) map.get(num);
                                if (drawable == null) {
                                    drawable = ContextCompat.getDrawable(context3, num.intValue());
                                    if (drawable != null) {
                                        C7905daN c7905daN2 = c7905daN;
                                        float f = 20;
                                        C1332Xp c1332Xp = C1332Xp.b;
                                        drawable.setBounds(0, 0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
                                        map2 = c7905daN2.d;
                                        map2.put(num, drawable);
                                    }
                                }
                                return new bKJ.e(str, drawable, false);
                            }
                            drawable = null;
                            return new bKJ.e(str, drawable, false);
                        }
                    });
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
                InterfaceC2023aX interfaceC2023aX2 = InterfaceC2023aX.this;
                C7905daN c7905daN2 = this;
                drM<Integer, dpR> drm2 = drm;
                if (!(!arrayList.isEmpty())) {
                    if ((c7978dbh.d() instanceof AbstractC7916daY.e) || (c7978dbh.d() instanceof AbstractC7916daY.b)) {
                        c7905daN2.c(interfaceC2023aX2);
                        return;
                    }
                    return;
                }
                bKL bkl = new bKL();
                bkl.b((CharSequence) "scrollable-tab-bar");
                if (C8153dex.X()) {
                    bkl.d(C7939dav.a.H);
                }
                bkl.a((List<bKJ.e>) arrayList);
                bkl.d((bKJ.c) new c(drm2, c7978dbh));
                interfaceC2023aX2.add(bkl);
            }

            /* loaded from: classes5.dex */
            public static final class c implements bKJ.c {
                final /* synthetic */ drM<Integer, dpR> a;
                final /* synthetic */ C7978dbh c;

                /* JADX WARN: Multi-variable type inference failed */
                c(drM<? super Integer, dpR> drm, C7978dbh c7978dbh) {
                    this.a = drm;
                    this.c = c7978dbh;
                }

                @Override // o.bKJ.c
                public void a(View view, int i) {
                    ListOfMoviesSummary summary;
                    C8632dsu.c((Object) view, "");
                    this.a.invoke(Integer.valueOf(i));
                    UpNextFeedSection upNextFeedSection = this.c.j().get(i);
                    CLv2Utils.d(new ChangeValueCommand((upNextFeedSection == null || (summary = upNextFeedSection.getSummary()) == null || (r2 = summary.getListContext()) == null) ? "unknown list context" : "unknown list context"));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC2023aX interfaceC2023aX) {
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) ("loading-group"));
        c3780bKj.c(new Pair<>(-1, -2));
        c3780bKj.e(C7939dav.a.l);
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) ("loading-header-0"));
        c3787bKq.b(true);
        c3787bKq.a(BrowseExperience.e());
        c3787bKq.c(((long) 0) * 400);
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) ("loading-header-1"));
        c3787bKq2.b(true);
        c3787bKq2.a(BrowseExperience.e());
        c3787bKq2.c(((long) 1) * 400);
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) ("loading-header-2"));
        c3787bKq3.b(true);
        c3787bKq3.a(BrowseExperience.e());
        c3787bKq3.c(((long) 2) * 400);
        c3780bKj.add(c3787bKq3);
        interfaceC2023aX.add(c3780bKj);
    }
}

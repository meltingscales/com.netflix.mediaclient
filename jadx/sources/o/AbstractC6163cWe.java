package o;

import android.content.Context;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryEpoxyController;
import java.util.ArrayList;
import java.util.List;
import o.cVP;

/* renamed from: o.cWe  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6163cWe implements bJF<TvDiscoveryEpoxyController.b> {
    private final AppView a;
    private final C9935zP c;

    public /* synthetic */ AbstractC6163cWe(C9935zP c9935zP, AppView appView, C8627dsp c8627dsp) {
        this(c9935zP, appView);
    }

    public final AppView a() {
        return this.a;
    }

    public final C9935zP c() {
        return this.c;
    }

    private AbstractC6163cWe(C9935zP c9935zP, AppView appView) {
        this.c = c9935zP;
        this.a = appView;
    }

    /* renamed from: o.cWe$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC6163cWe {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9935zP c9935zP) {
            super(c9935zP, AppView.mdxDiscovery, null);
            C8632dsu.c((Object) c9935zP, "");
        }

        @Override // o.bJF
        /* renamed from: b */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, TvDiscoveryEpoxyController.b bVar) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) bVar, "");
            C6176cWr c6176cWr = new C6176cWr();
            c6176cWr.b((CharSequence) "headerImage-card");
            c6176cWr.d(c());
            c6176cWr.c(true);
            c6176cWr.d(Integer.valueOf(cVP.d.a));
            interfaceC2023aX.add(c6176cWr);
            C6179cWu c6179cWu = new C6179cWu();
            c6179cWu.c((CharSequence) "headerText-card");
            c6179cWu.d(bVar.e());
            c6179cWu.b((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.mq));
            interfaceC2023aX.add(c6179cWu);
            C6180cWv c6180cWv = new C6180cWv();
            c6180cWv.b((CharSequence) "sectionTitle-card");
            c6180cWv.a(bVar.e());
            c6180cWv.d((CharSequence) C1333Xq.d(com.netflix.mediaclient.ui.R.o.mr).a(bVar.c().size()).c());
            interfaceC2023aX.add(c6180cWv);
            int i = 0;
            for (Object obj : bVar.c()) {
                if (i < 0) {
                    C8569dql.h();
                }
                cVR cvr = (cVR) obj;
                C6171cWm c6171cWm = new C6171cWm();
                c6171cWm.c((CharSequence) ("item-card-" + cvr.c()));
                c6171cWm.a(bVar.e());
                c6171cWm.d(cvr.c());
                c6171cWm.c(Boolean.valueOf(cvr.d()));
                c6171cWm.e(c());
                c6171cWm.b((CharSequence) cvr.b());
                c6171cWm.e(i == bVar.c().size() - 1);
                c6171cWm.c(bVar.c().size() == 1);
                c6171cWm.d(true);
                interfaceC2023aX.add(c6171cWm);
                cvr.d();
                i++;
            }
        }
    }

    /* renamed from: o.cWe$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC6163cWe {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9935zP c9935zP) {
            super(c9935zP, AppView.mdxDiscoveryConfirmation, null);
            C8632dsu.c((Object) c9935zP, "");
        }

        @Override // o.bJF
        /* renamed from: a */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, TvDiscoveryEpoxyController.b bVar) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) bVar, "");
            C6176cWr c6176cWr = new C6176cWr();
            c6176cWr.b((CharSequence) "headerImage-fullscreen");
            c6176cWr.d(c());
            c6176cWr.c(false);
            c6176cWr.d(Integer.valueOf(cVP.d.c));
            interfaceC2023aX.add(c6176cWr);
            C6179cWu c6179cWu = new C6179cWu();
            c6179cWu.c((CharSequence) "headerText-fullscreen-2");
            c6179cWu.d(bVar.e());
            C1333Xq d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.ma);
            List<cVR> c = bVar.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : c) {
                if (((cVR) obj).d()) {
                    arrayList.add(obj);
                }
            }
            c6179cWu.b((CharSequence) d.a(arrayList.size()).c());
            interfaceC2023aX.add(c6179cWu);
            bKU bku = new bKU();
            bku.d((CharSequence) "space-fullscreen-2");
            bku.a(Integer.valueOf(context.getResources().getDimensionPixelSize(cVP.a.a)));
            interfaceC2023aX.add(bku);
            C6183cWy c6183cWy = new C6183cWy();
            c6183cWy.c((CharSequence) "text-fullscreen-2");
            c6183cWy.a(bVar.e());
            c6183cWy.b((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.mb));
            c6183cWy.b(context.getResources().getDimensionPixelSize(cVP.a.d));
            interfaceC2023aX.add(c6183cWy);
            bJK bjk = new bJK();
            bjk.d((CharSequence) "filler-top-fullscreen");
            bjk.d(Float.valueOf(0.2f));
            interfaceC2023aX.add(bjk);
            List<cVR> c2 = bVar.c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c2) {
                if (((cVR) obj2).d()) {
                    arrayList2.add(obj2);
                }
            }
            int i = 0;
            for (Object obj3 : arrayList2) {
                if (i < 0) {
                    C8569dql.h();
                }
                cVR cvr = (cVR) obj3;
                C6171cWm c6171cWm = new C6171cWm();
                c6171cWm.c((CharSequence) ("item-fullscreen-" + cvr.c()));
                c6171cWm.a(bVar.e());
                c6171cWm.d(cvr.c());
                c6171cWm.b((CharSequence) cvr.b());
                c6171cWm.e(cvr.a());
                boolean z = true;
                if (i != bVar.c().size() - 1) {
                    z = false;
                }
                c6171cWm.e(z);
                c6171cWm.d(false);
                interfaceC2023aX.add(c6171cWm);
                i++;
            }
            bJK bjk2 = new bJK();
            bjk2.d((CharSequence) "filler-bottom-fullscreen");
            bjk2.d(Float.valueOf(0.8f));
            interfaceC2023aX.add(bjk2);
        }
    }

    /* renamed from: o.cWe$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC6163cWe {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9935zP c9935zP) {
            super(c9935zP, AppView.mdxDiscoveryConnect, null);
            C8632dsu.c((Object) c9935zP, "");
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, TvDiscoveryEpoxyController.b bVar) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) bVar, "");
            C6176cWr c6176cWr = new C6176cWr();
            c6176cWr.b((CharSequence) "headerImage-fullscreen");
            c6176cWr.d(c());
            c6176cWr.c(false);
            c6176cWr.d(Integer.valueOf(cVP.d.c));
            interfaceC2023aX.add(c6176cWr);
            C6179cWu c6179cWu = new C6179cWu();
            c6179cWu.c((CharSequence) "headerText-fullscreen-3");
            c6179cWu.d(bVar.e());
            c6179cWu.b((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.mi));
            interfaceC2023aX.add(c6179cWu);
            bKU bku = new bKU();
            bku.d((CharSequence) "space-fullscreen-2");
            bku.a(Integer.valueOf(context.getResources().getDimensionPixelSize(cVP.a.a)));
            interfaceC2023aX.add(bku);
            C6183cWy c6183cWy = new C6183cWy();
            c6183cWy.c((CharSequence) "text-fullscreen-3");
            c6183cWy.a(bVar.e());
            c6183cWy.b((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.md));
            c6183cWy.b(context.getResources().getDimensionPixelSize(cVP.a.d));
            interfaceC2023aX.add(c6183cWy);
            bJK bjk = new bJK();
            bjk.d((CharSequence) "filler-top-fullscreen");
            bjk.d(Float.valueOf(0.2f));
            interfaceC2023aX.add(bjk);
            List<cVR> c = bVar.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : c) {
                if (((cVR) obj).d()) {
                    arrayList.add(obj);
                }
            }
            int i = 0;
            for (Object obj2 : arrayList) {
                if (i < 0) {
                    C8569dql.h();
                }
                cVR cvr = (cVR) obj2;
                C6171cWm c6171cWm = new C6171cWm();
                c6171cWm.c((CharSequence) ("item-fullscreen-" + cvr.c()));
                c6171cWm.a(bVar.e());
                c6171cWm.d(cvr.c());
                c6171cWm.b((CharSequence) cvr.b());
                c6171cWm.e(cvr.a());
                boolean z = true;
                if (i != bVar.c().size() - 1) {
                    z = false;
                }
                c6171cWm.e(z);
                c6171cWm.d(false);
                interfaceC2023aX.add(c6171cWm);
                i++;
            }
            bJK bjk2 = new bJK();
            bjk2.d((CharSequence) "filler-bottom-fullscreen");
            bjk2.d(Float.valueOf(0.8f));
            interfaceC2023aX.add(bjk2);
        }
    }

    /* renamed from: o.cWe$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC6163cWe {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9935zP c9935zP) {
            super(c9935zP, AppView.mdxDiscoveryFinal, null);
            C8632dsu.c((Object) c9935zP, "");
        }

        @Override // o.bJF
        /* renamed from: a */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, TvDiscoveryEpoxyController.b bVar) {
            boolean z;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) bVar, "");
            C6176cWr c6176cWr = new C6176cWr();
            c6176cWr.b((CharSequence) "headerImage-fullscreen");
            c6176cWr.d(c());
            c6176cWr.c(false);
            c6176cWr.d(Integer.valueOf(cVP.d.d));
            interfaceC2023aX.add(c6176cWr);
            boolean a = bVar.a();
            List<cVR> c = bVar.c();
            ArrayList<cVR> arrayList = new ArrayList();
            for (Object obj : c) {
                if (((cVR) obj).d()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                for (cVR cvr : arrayList) {
                    if (cvr.a() == 4) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            List<cVR> c2 = bVar.c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c2) {
                if (((cVR) obj2).a() == 3) {
                    arrayList2.add(obj2);
                }
            }
            boolean z2 = z && (arrayList2.isEmpty() ^ true);
            C6179cWu c6179cWu = new C6179cWu();
            c6179cWu.c((CharSequence) "headerText-fullscreen-4");
            c6179cWu.d(bVar.e());
            c6179cWu.b((CharSequence) C1333Xq.d(a ? com.netflix.mediaclient.ui.R.o.ml : z2 ? com.netflix.mediaclient.ui.R.o.mh : z ? com.netflix.mediaclient.ui.R.o.mg : com.netflix.mediaclient.ui.R.o.mo).a(arrayList2.size()).c());
            interfaceC2023aX.add(c6179cWu);
            bKU bku = new bKU();
            bku.d((CharSequence) "space-fullscreen-2");
            bku.a(Integer.valueOf(context.getResources().getDimensionPixelSize(cVP.a.a)));
            interfaceC2023aX.add(bku);
            C6183cWy c6183cWy = new C6183cWy();
            c6183cWy.c((CharSequence) "text-fullscreen-4");
            c6183cWy.a(bVar.e());
            C1333Xq d = C1333Xq.d(a ? com.netflix.mediaclient.ui.R.o.mk : z2 ? com.netflix.mediaclient.ui.R.o.me : z ? com.netflix.mediaclient.ui.R.o.mf : com.netflix.mediaclient.ui.R.o.mj);
            int size = bVar.c().size();
            if (z2) {
                size -= arrayList2.size();
            }
            c6183cWy.b((CharSequence) d.a(size).c());
            c6183cWy.b(context.getResources().getDimensionPixelSize(cVP.a.d));
            interfaceC2023aX.add(c6183cWy);
            bJK bjk = new bJK();
            bjk.d((CharSequence) "filler-top-fullscreen");
            bjk.d(Float.valueOf(0.2f));
            interfaceC2023aX.add(bjk);
            List<cVR> c3 = bVar.c();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : c3) {
                if (((cVR) obj3).d()) {
                    arrayList3.add(obj3);
                }
            }
            int i = 0;
            for (Object obj4 : arrayList3) {
                if (i < 0) {
                    C8569dql.h();
                }
                cVR cvr2 = (cVR) obj4;
                C6171cWm c6171cWm = new C6171cWm();
                c6171cWm.c((CharSequence) ("item-fullscreen-" + cvr2.c()));
                c6171cWm.a(bVar.e());
                c6171cWm.d(cvr2.c());
                c6171cWm.b((CharSequence) cvr2.b());
                c6171cWm.e(cvr2.a());
                c6171cWm.e(i == bVar.c().size() - 1);
                c6171cWm.d(false);
                interfaceC2023aX.add(c6171cWm);
                i++;
            }
            bJK bjk2 = new bJK();
            bjk2.d((CharSequence) "filler-bottom-fullscreen");
            bjk2.d(Float.valueOf(0.8f));
            interfaceC2023aX.add(bjk2);
        }
    }
}

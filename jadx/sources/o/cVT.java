package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryEpoxyController;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import o.AbstractC6163cWe;
import o.AbstractC6184cWz;
import o.C1596aHd;
import o.C8632dsu;
import o.C9834xU;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cVP;
import o.cVS;
import o.cVT;
import o.cVU;
import o.dpR;
import o.dqE;

/* loaded from: classes6.dex */
public final class cVT extends AbstractC1091Oi {
    public static final b c = new b(null);
    private static final Comparator<cVR> j = new Comparator() { // from class: o.cVW
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a;
            a = cVT.a((cVR) obj, (cVR) obj2);
            return a;
        }
    };
    public List<cVQ> a;
    public cVS.d b;
    private AbstractC6163cWe f;
    private AlertDialog g;
    private boolean i;

    /* renamed from: o  reason: collision with root package name */
    private cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> f13704o;
    private final cVU n = new cVU();
    private final Map<String, cVR> h = new LinkedHashMap();

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("TvDiscoveryFragment");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<cVR> b(Map<String, cVR> map) {
            SortedSet a;
            List<cVR> U;
            a = C8580dqw.a(map.values(), cVT.j);
            U = C8576dqs.U(a);
            return U;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(cVR cvr, cVR cvr2) {
        return cvr.b().compareTo(cvr2.b());
    }

    public final cVS.d a() {
        cVS.d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        C8632dsu.d("");
        return null;
    }

    private final C9935zP g() {
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        return bVar.d(viewLifecycleOwner);
    }

    public final List<cVQ> d() {
        List<cVQ> list = this.a;
        if (list != null) {
            return list;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(AbstractC6184cWz abstractC6184cWz) {
        SortedSet a;
        List U;
        SortedSet a2;
        List U2;
        int d;
        SortedSet a3;
        List U3;
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa;
        SortedSet a4;
        List U4;
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa2;
        SortedSet a5;
        List U5;
        SortedSet a6;
        List U6;
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa3;
        cVR b2;
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa4;
        SortedSet a7;
        List U7;
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa5 = null;
        if (abstractC6184cWz instanceof AbstractC6184cWz.d.h) {
            this.i = false;
            this.h.clear();
            for (cVQ cvq : ((AbstractC6184cWz.d.h) abstractC6184cWz).d()) {
                this.h.put(cvq.a(), new cVR(cvq.a(), cvq.e(), true, 0, 8, null));
            }
            AbstractC6163cWe.a aVar = new AbstractC6163cWe.a(g());
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa6 = this.f13704o;
            if (cwa6 == null) {
                C8632dsu.d("");
                cwa6 = null;
            }
            Typed2EpoxyController<AbstractC6163cWe, TvDiscoveryEpoxyController.b> e = cwa6.e();
            a7 = C8580dqw.a(this.h.values(), j);
            U7 = C8576dqs.U(a7);
            e.setData(aVar, new TvDiscoveryEpoxyController.b(U7, false, false, 4, null));
            this.n.a(aVar.a(), this.n.a(this.h.values(), true));
            this.f = aVar;
            e();
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa7 = this.f13704o;
            if (cwa7 == null) {
                C8632dsu.d("");
            } else {
                cwa5 = cwa7;
            }
            cwa5.open();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.a) {
            this.i = false;
            Map<String, cVR> map = this.h;
            AbstractC6184cWz.a aVar2 = (AbstractC6184cWz.a) abstractC6184cWz;
            String d2 = aVar2.d();
            cVR cvr = this.h.get(aVar2.d());
            if (cvr == null || (b2 = cVR.b(cvr, null, null, aVar2.e(), 0, 11, null)) == null) {
                throw new IllegalStateException(("wrong uuid sent: " + aVar2.d()).toString());
            }
            map.put(d2, b2);
            AbstractC6163cWe.a aVar3 = new AbstractC6163cWe.a(g());
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa8 = this.f13704o;
            if (cwa8 == null) {
                C8632dsu.d("");
                cwa8 = null;
            }
            cwa8.e().setData(aVar3, new TvDiscoveryEpoxyController.b(c.b(this.h), this.i, false, 4, null));
            this.f = aVar3;
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa9 = this.f13704o;
            if (cwa9 == null) {
                C8632dsu.d("");
                cwa4 = null;
            } else {
                cwa4 = cwa9;
            }
            cWA.setFullscreen$default(cwa4, this.i, false, false, 4, null);
            e();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.d.C0111d) {
            this.n.a();
            this.i = true;
            AbstractC6163cWe.b bVar = new AbstractC6163cWe.b(g());
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa10 = this.f13704o;
            if (cwa10 == null) {
                C8632dsu.d("");
                cwa10 = null;
            }
            Typed2EpoxyController<AbstractC6163cWe, TvDiscoveryEpoxyController.b> e2 = cwa10.e();
            a6 = C8580dqw.a(this.h.values(), j);
            U6 = C8576dqs.U(a6);
            e2.setData(bVar, new TvDiscoveryEpoxyController.b(U6, this.i, false, 4, null));
            this.n.a(bVar.a(), cVU.a(this.n, this.h.values(), false, 2, null));
            this.f = bVar;
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa11 = this.f13704o;
            if (cwa11 == null) {
                C8632dsu.d("");
                cwa3 = null;
            } else {
                cwa3 = cwa11;
            }
            cWA.setFullscreen$default(cwa3, this.i, false, false, 4, null);
            e();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.c) {
            AbstractC6184cWz.c cVar = (AbstractC6184cWz.c) abstractC6184cWz;
            if (this.h.get(cVar.b()) == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            cVR cvr2 = this.h.get(cVar.b());
            C8632dsu.d(cvr2);
            cVR cvr3 = cvr2;
            this.h.put(cvr3.c(), cVR.b(cvr3, null, null, false, cVar.a(), 7, null));
            this.i = true;
            AbstractC6163cWe.d dVar = new AbstractC6163cWe.d(g());
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa12 = this.f13704o;
            if (cwa12 == null) {
                C8632dsu.d("");
                cwa12 = null;
            }
            Typed2EpoxyController<AbstractC6163cWe, TvDiscoveryEpoxyController.b> e3 = cwa12.e();
            a5 = C8580dqw.a(this.h.values(), j);
            U5 = C8576dqs.U(a5);
            e3.setData(dVar, new TvDiscoveryEpoxyController.b(U5, this.i, false, 4, null));
            this.f = dVar;
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa13 = this.f13704o;
            if (cwa13 == null) {
                C8632dsu.d("");
            } else {
                cwa5 = cwa13;
            }
            cwa5.setFullscreen(this.i, false, true);
            e();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.b) {
            AlertDialog alertDialog = this.g;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.i = true;
            AbstractC6163cWe.e eVar = new AbstractC6163cWe.e(g());
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa14 = this.f13704o;
            if (cwa14 == null) {
                C8632dsu.d("");
                cwa14 = null;
            }
            Typed2EpoxyController<AbstractC6163cWe, TvDiscoveryEpoxyController.b> e4 = cwa14.e();
            a4 = C8580dqw.a(this.h.values(), j);
            U4 = C8576dqs.U(a4);
            e4.setData(eVar, new TvDiscoveryEpoxyController.b(U4, this.i, false, 4, null));
            this.n.a(eVar.a(), cVU.a(this.n, this.h.values(), false, 2, null));
            cVU cvu = this.n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.h.values()) {
                if (((cVR) obj).d()) {
                    arrayList.add(obj);
                }
            }
            cvu.a((List<cVR>) arrayList, false);
            this.f = eVar;
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa15 = this.f13704o;
            if (cwa15 == null) {
                C8632dsu.d("");
                cwa2 = null;
            } else {
                cwa2 = cwa15;
            }
            cWA.setFullscreen$default(cwa2, this.i, true, false, 4, null);
            e();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.d.a) {
            this.n.c();
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa16 = this.f13704o;
            if (cwa16 == null) {
                C8632dsu.d("");
            } else {
                cwa5 = cwa16;
            }
            cwa5.close();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.d.c) {
            this.n.c();
            this.i = false;
            AbstractC6163cWe.a aVar4 = new AbstractC6163cWe.a(g());
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa17 = this.f13704o;
            if (cwa17 == null) {
                C8632dsu.d("");
                cwa17 = null;
            }
            Typed2EpoxyController<AbstractC6163cWe, TvDiscoveryEpoxyController.b> e5 = cwa17.e();
            a3 = C8580dqw.a(this.h.values(), j);
            U3 = C8576dqs.U(a3);
            e5.setData(aVar4, new TvDiscoveryEpoxyController.b(U3, this.i, false, 4, null));
            this.n.a(aVar4.a(), this.n.a(this.h.values(), true));
            this.f = aVar4;
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa18 = this.f13704o;
            if (cwa18 == null) {
                C8632dsu.d("");
                cwa = null;
            } else {
                cwa = cwa18;
            }
            cWA.setFullscreen$default(cwa, this.i, false, false, 4, null);
            e();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.d.b) {
            this.n.a();
            this.i = true;
            AbstractC6163cWe.d dVar2 = new AbstractC6163cWe.d(g());
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa19 = this.f13704o;
            if (cwa19 == null) {
                C8632dsu.d("");
                cwa19 = null;
            }
            Typed2EpoxyController<AbstractC6163cWe, TvDiscoveryEpoxyController.b> e6 = cwa19.e();
            Comparator<cVR> comparator = j;
            a = C8580dqw.a(this.h.values(), comparator);
            U = C8576dqs.U(a);
            e6.setData(dVar2, new TvDiscoveryEpoxyController.b(U, this.i, false, 4, null));
            this.n.a(dVar2.a(), cVU.a(this.n, this.h.values(), false, 2, null));
            this.f = dVar2;
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa20 = this.f13704o;
            if (cwa20 == null) {
                C8632dsu.d("");
            } else {
                cwa5 = cwa20;
            }
            cwa5.setFullscreen(this.i, false, true);
            cVS.d a8 = a();
            a2 = C8580dqw.a(this.h.values(), comparator);
            U2 = C8576dqs.U(a2);
            ArrayList<cVR> arrayList2 = new ArrayList();
            for (Object obj2 : U2) {
                if (((cVR) obj2).d()) {
                    arrayList2.add(obj2);
                }
            }
            d = C8572dqo.d(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(d);
            for (cVR cvr4 : arrayList2) {
                arrayList3.add(cvr4.c());
            }
            a8.a(arrayList3);
            e();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.d.j) {
            this.n.c();
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), C9834xU.o.c);
            C1333Xq d3 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.mn);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : this.h.values()) {
                if (((cVR) obj3).d()) {
                    arrayList4.add(obj3);
                }
            }
            builder.setTitle(d3.a(arrayList4.size()).c());
            builder.setMessage(com.netflix.mediaclient.ui.R.o.mm);
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.cVZ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    cVT.d(cVT.this, dialogInterface);
                }
            });
            builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.lY, new DialogInterface.OnClickListener() { // from class: o.cWa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cVT.d(cVT.this, dialogInterface, i);
                }
            });
            builder.setNegativeButton(com.netflix.mediaclient.ui.R.o.lV, new DialogInterface.OnClickListener() { // from class: o.cVY
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cVT.e(cVT.this, dialogInterface, i);
                }
            });
            this.g = builder.show();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.d.e) {
            if (!(this.f instanceof AbstractC6163cWe.e)) {
                this.n.e();
            }
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa21 = this.f13704o;
            if (cwa21 == null) {
                C8632dsu.d("");
            } else {
                cwa5 = cwa21;
            }
            cwa5.close();
        } else if (abstractC6184cWz instanceof AbstractC6184cWz.e) {
            if (!(this.f instanceof AbstractC6163cWe.e)) {
                this.n.e();
            }
            cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa22 = this.f13704o;
            if (cwa22 == null) {
                C8632dsu.d("");
            } else {
                cwa5 = cwa22;
            }
            cwa5.close();
        }
        if (this.i) {
            C1058Nc.c(requireNetflixActivity());
        } else {
            C1058Nc.e(requireNetflixActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cVT cvt, DialogInterface dialogInterface) {
        C8632dsu.c((Object) cvt, "");
        cvt.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cVT cvt, DialogInterface dialogInterface, int i) {
        List U;
        SortedSet a;
        List U2;
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa;
        C8632dsu.c((Object) cvt, "");
        cvt.n.c();
        cvt.a().d();
        dialogInterface.dismiss();
        U = C8576dqs.U(cvt.h.values());
        ArrayList<cVR> arrayList = new ArrayList();
        for (Object obj : U) {
            cVR cvr = (cVR) obj;
            if (cvr.d() && cvr.a() != 3) {
                arrayList.add(obj);
            }
        }
        for (cVR cvr2 : arrayList) {
            cvt.h.put(cvr2.c(), cVR.b(cvr2, null, null, false, 4, 7, null));
        }
        cvt.i = true;
        AbstractC6163cWe.e eVar = new AbstractC6163cWe.e(cvt.g());
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa2 = cvt.f13704o;
        if (cwa2 == null) {
            C8632dsu.d("");
            cwa2 = null;
        }
        Typed2EpoxyController<AbstractC6163cWe, TvDiscoveryEpoxyController.b> e = cwa2.e();
        a = C8580dqw.a(cvt.h.values(), j);
        U2 = C8576dqs.U(a);
        e.setData(eVar, new TvDiscoveryEpoxyController.b(U2, cvt.i, true));
        cvt.n.a(eVar.a(), cVU.a(cvt.n, cvt.h.values(), false, 2, null));
        cVU cvu = cvt.n;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : cvt.h.values()) {
            if (((cVR) obj2).d()) {
                arrayList2.add(obj2);
            }
        }
        cvu.a((List<cVR>) arrayList2, true);
        cvt.f = eVar;
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa3 = cvt.f13704o;
        if (cwa3 == null) {
            C8632dsu.d("");
            cwa = null;
        } else {
            cwa = cwa3;
        }
        cWA.setFullscreen$default(cwa, cvt.i, true, false, 4, null);
        cvt.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(cVT cvt, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) cvt, "");
        cvt.n.a();
        dialogInterface.dismiss();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        drM<View, dpR> drm = new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryFragment$onCreateView$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                e(view);
                return dpR.c;
            }

            public final void e(View view) {
                cVU cvu;
                C8632dsu.c((Object) view, "");
                cVT.this.f = null;
                cvu = cVT.this.n;
                cvu.b();
                super/*com.netflix.mediaclient.android.fragment.NetflixDialogFrag*/.dismiss();
            }
        };
        C9935zP g = g();
        Context requireContext2 = requireContext();
        C8632dsu.a(requireContext2, "");
        this.f13704o = new cWA<>(requireContext, drm, new TvDiscoveryEpoxyController(g, requireContext2));
        a(g());
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa = this.f13704o;
        if (cwa == null) {
            C8632dsu.d("");
            return null;
        }
        return cwa;
    }

    @Override // o.AbstractC1091Oi, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        g().b(AbstractC6184cWz.class, new AbstractC6184cWz.d.h(d()));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        cWA<AbstractC6163cWe, TvDiscoveryEpoxyController.b> cwa = this.f13704o;
        if (cwa == null) {
            C8632dsu.d("");
            cwa = null;
        }
        cwa.close();
        return true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.n.d();
        C1058Nc.c(requireNetflixActivity());
        super.onDestroyView();
    }

    @Override // o.AbstractC1091Oi
    public void c(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        AbstractC6163cWe abstractC6163cWe = this.f;
        if (!(abstractC6163cWe instanceof AbstractC6163cWe.b)) {
            if (!(abstractC6163cWe instanceof AbstractC6163cWe.d)) {
                if (abstractC6163cWe instanceof AbstractC6163cWe.e) {
                    bLD bld = new bLD();
                    bld.d((CharSequence) "actionBar-fullscreen");
                    bld.c(this.i);
                    interfaceC2023aX.add(bld);
                    return;
                }
                return;
            }
            bLD bld2 = new bLD();
            bld2.d((CharSequence) "actionBar-fullscreen");
            bld2.c(this.i);
            interfaceC2023aX.add(bld2);
            return;
        }
        bLD bld3 = new bLD();
        bld3.d((CharSequence) "actionBar-fullscreen");
        bld3.c(this.i);
        bld3.d(Integer.valueOf(com.netflix.mediaclient.ui.R.e.f13244o));
        bld3.a(new View.OnClickListener() { // from class: o.cWc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cVT.d(cVT.this, view);
            }
        });
        interfaceC2023aX.add(bld3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cVT cvt, View view) {
        C8632dsu.c((Object) cvt, "");
        cvt.g().b(AbstractC6184cWz.class, AbstractC6184cWz.e.e);
    }

    @Override // o.AbstractC1091Oi
    public void a(InterfaceC2023aX interfaceC2023aX) {
        boolean z;
        C8632dsu.c((Object) interfaceC2023aX, "");
        AbstractC6163cWe abstractC6163cWe = this.f;
        if (!(abstractC6163cWe instanceof AbstractC6163cWe.a)) {
            if (!(abstractC6163cWe instanceof AbstractC6163cWe.b)) {
                if (!(abstractC6163cWe instanceof AbstractC6163cWe.d)) {
                    if (abstractC6163cWe instanceof AbstractC6163cWe.e) {
                        C6162cWd c6162cWd = new C6162cWd();
                        c6162cWd.c((CharSequence) "buttons-fullscreen");
                        c6162cWd.e(g());
                        c6162cWd.e((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.lU));
                        c6162cWd.b((AbstractC6184cWz.d) AbstractC6184cWz.d.e.c);
                        c6162cWd.e(Integer.valueOf(cVP.g.d));
                        interfaceC2023aX.add(c6162cWd);
                        return;
                    }
                    return;
                }
                C6162cWd c6162cWd2 = new C6162cWd();
                c6162cWd2.c((CharSequence) "buttons-fullscreen");
                c6162cWd2.e(g());
                c6162cWd2.d((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.lW));
                c6162cWd2.c((AbstractC6184cWz.d) AbstractC6184cWz.d.j.e);
                c6162cWd2.a(Integer.valueOf(cVP.g.a));
                interfaceC2023aX.add(c6162cWd2);
                return;
            }
            C6162cWd c6162cWd3 = new C6162cWd();
            c6162cWd3.c((CharSequence) "buttons-fullscreen");
            c6162cWd3.e(g());
            c6162cWd3.d((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.lT));
            c6162cWd3.e((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.lQ));
            c6162cWd3.b((AbstractC6184cWz.d) AbstractC6184cWz.d.b.a);
            c6162cWd3.c((AbstractC6184cWz.d) AbstractC6184cWz.d.c.d);
            c6162cWd3.e(Integer.valueOf(cVP.g.d));
            c6162cWd3.a(Integer.valueOf(cVP.g.e));
            interfaceC2023aX.add(c6162cWd3);
            return;
        }
        C6162cWd c6162cWd4 = new C6162cWd();
        c6162cWd4.c((CharSequence) "buttons-card");
        c6162cWd4.e(g());
        c6162cWd4.d((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.lX));
        c6162cWd4.e((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.lS));
        c6162cWd4.b((AbstractC6184cWz.d) AbstractC6184cWz.d.C0111d.c);
        c6162cWd4.c((AbstractC6184cWz.d) AbstractC6184cWz.d.a.b);
        Collection<cVR> values = this.h.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (cVR cvr : values) {
                if (cvr.d()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        c6162cWd4.e(z);
        c6162cWd4.e(Integer.valueOf(cVP.g.b));
        c6162cWd4.a(Integer.valueOf(cVP.g.c));
        interfaceC2023aX.add(c6162cWd4);
    }

    @SuppressLint({"CheckResult"})
    private final void a(C9935zP c9935zP) {
        SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC6184cWz.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryFragment$subscribe$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, new drM<AbstractC6184cWz, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryFragment$subscribe$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6184cWz abstractC6184cWz) {
                a(abstractC6184cWz);
                return dpR.c;
            }

            public final void a(AbstractC6184cWz abstractC6184cWz) {
                C8632dsu.c((Object) abstractC6184cWz, "");
                cVT.this.a(abstractC6184cWz);
            }
        }, 2, (Object) null);
    }
}

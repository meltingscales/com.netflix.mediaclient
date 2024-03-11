package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import com.netflix.mediaclient.ui.lightbox.impl.LightboxEpoxyController;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6719cic;
import o.C4194bZs;
import o.C4199bZx;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8931fy;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.bZE;
import o.dpR;
import o.drI;

@AndroidEntryPoint
/* renamed from: o.bZs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4194bZs extends AbstractC4188bZm {
    private final AppView j;
    private final InterfaceC8554dpx k;
    private final InterfaceC8554dpx l;
    private int m;
    private final C9935zP n;

    /* renamed from: o  reason: collision with root package name */
    private LightboxEpoxyController f13558o;
    private Parcelable p;
    private C4200bZy s;
    private EpoxyRecyclerView t;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(C4194bZs.class, "lightboxViewModel", "getLightboxViewModel()Lcom/netflix/mediaclient/ui/lightbox/impl/mvrx/LightBoxViewModel;", 0))};
    public static final a b = new a(null);

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.j;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* renamed from: o.bZs$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC8882fB<C4194bZs, bZE> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ boolean c;
        final /* synthetic */ drM e;

        public e(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.c = z;
            this.e = drm;
            this.b = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: e */
        public InterfaceC8554dpx<bZE> c(C4194bZs c4194bZs, dtC<?> dtc) {
            C8632dsu.c((Object) c4194bZs, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.b;
            return d.d(c4194bZs, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.lightbox.impl.LightBoxFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C4199bZx.class), this.c, this.e);
        }
    }

    /* renamed from: o.bZs$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("LightBoxFragment");
        }

        public final C4194bZs e(ArrayList<LightBoxItem> arrayList, int i) {
            C4194bZs c4194bZs = new C4194bZs();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.arg_items", arrayList);
            bundle.putInt("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.arg_initial_position", i);
            c4194bZs.setArguments(bundle);
            return c4194bZs;
        }
    }

    public C4194bZs() {
        final InterfaceC8660dtv a2 = dsA.a(bZE.class);
        this.k = new e(a2, false, new drM<InterfaceC8890fJ<bZE, C4199bZx>, bZE>() { // from class: com.netflix.mediaclient.ui.lightbox.impl.LightBoxFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bZE, o.fS] */
            @Override // o.drM
            /* renamed from: d */
            public final bZE invoke(InterfaceC8890fJ<bZE, C4199bZx> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C4199bZx.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, e[0]);
        this.n = C9935zP.b.d(this);
        this.l = dpA.d(LazyThreadSafetyMode.e, new drO<MiniPlayerVideoGroupViewModel>() { // from class: com.netflix.mediaclient.ui.lightbox.impl.LightBoxFragment$miniPlayerViewModel$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final MiniPlayerVideoGroupViewModel invoke() {
                return (MiniPlayerVideoGroupViewModel) new ViewModelProvider(C4194bZs.this).get(MiniPlayerVideoGroupViewModel.class);
            }
        });
        this.j = AppView.UNKNOWN;
    }

    private final bZE I() {
        return (bZE) this.k.getValue();
    }

    private final MiniPlayerVideoGroupViewModel G() {
        return (MiniPlayerVideoGroupViewModel) this.l.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        C4200bZy c4200bZy = null;
        C4200bZy e2 = C4200bZy.e(layoutInflater, null, false);
        C8632dsu.a(e2, "");
        this.s = e2;
        if (e2 == null) {
            C8632dsu.d("");
        } else {
            c4200bZy = e2;
        }
        return c4200bZy.c();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        this.f13558o = new LightboxEpoxyController(requireContext, G(), this.n, bx_());
        C4200bZy c4200bZy = this.s;
        C4200bZy c4200bZy2 = null;
        if (c4200bZy == null) {
            C8632dsu.d("");
            c4200bZy = null;
        }
        C3786bKp c3786bKp = c4200bZy.a;
        C8632dsu.a(c3786bKp, "");
        this.t = c3786bKp;
        c cVar = new c();
        EpoxyRecyclerView epoxyRecyclerView = this.t;
        if (epoxyRecyclerView == null) {
            C8632dsu.d("");
            epoxyRecyclerView = null;
        }
        LightboxEpoxyController lightboxEpoxyController = this.f13558o;
        if (lightboxEpoxyController == null) {
            C8632dsu.d("");
            lightboxEpoxyController = null;
        }
        epoxyRecyclerView.setController(lightboxEpoxyController);
        EpoxyRecyclerView epoxyRecyclerView2 = this.t;
        if (epoxyRecyclerView2 == null) {
            C8632dsu.d("");
            epoxyRecyclerView2 = null;
        }
        epoxyRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        EpoxyRecyclerView epoxyRecyclerView3 = this.t;
        if (epoxyRecyclerView3 == null) {
            C8632dsu.d("");
            epoxyRecyclerView3 = null;
        }
        cVar.attachToRecyclerView(epoxyRecyclerView3);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList<LightBoxItem> parcelableArrayList = arguments.getParcelableArrayList("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.arg_items");
            if (parcelableArrayList != null) {
                bZE I = I();
                C8632dsu.d(parcelableArrayList);
                I.e(parcelableArrayList);
            }
            this.m = arguments.getInt("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.arg_initial_position");
        }
        this.p = bundle != null ? bundle.getParcelable("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.recycler_view_saved_state") : null;
        C4200bZy c4200bZy3 = this.s;
        if (c4200bZy3 == null) {
            C8632dsu.d("");
        } else {
            c4200bZy2 = c4200bZy3;
        }
        ImageButton imageButton = c4200bZy2.b;
        C8632dsu.a(imageButton, "");
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.bZr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4194bZs.a(C4194bZs.this, view2);
            }
        });
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        C8632dsu.a(netflixImmutableStatus, "");
        d(netflixImmutableStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4194bZs c4194bZs, View view) {
        C8632dsu.c((Object) c4194bZs, "");
        c4194bZs.bg_();
    }

    @Override // o.bMX, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        G().k();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.n.b(AbstractC6719cic.class, new AbstractC6719cic.e.C0117e(0, 41));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        this.n.b(AbstractC6719cic.class, new AbstractC6719cic.e.C0117e(0, 40));
        super.onPause();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        EpoxyRecyclerView epoxyRecyclerView = this.t;
        if (epoxyRecyclerView == null) {
            C8632dsu.d("");
            epoxyRecyclerView = null;
        }
        RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        bundle.putParcelable("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.recycler_view_saved_state", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(I(), new drM<C4199bZx, dpR>() { // from class: com.netflix.mediaclient.ui.lightbox.impl.LightBoxFragment$invalidate$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final dpR invoke(C4199bZx c4199bZx) {
                LightboxEpoxyController lightboxEpoxyController;
                Parcelable parcelable;
                EpoxyRecyclerView epoxyRecyclerView;
                Parcelable parcelable2;
                EpoxyRecyclerView epoxyRecyclerView2;
                int i;
                C8632dsu.c((Object) c4199bZx, "");
                lightboxEpoxyController = C4194bZs.this.f13558o;
                EpoxyRecyclerView epoxyRecyclerView3 = null;
                if (lightboxEpoxyController == null) {
                    C8632dsu.d("");
                    lightboxEpoxyController = null;
                }
                lightboxEpoxyController.setData(c4199bZx.b());
                parcelable = C4194bZs.this.p;
                if (parcelable == null) {
                    epoxyRecyclerView2 = C4194bZs.this.t;
                    if (epoxyRecyclerView2 == null) {
                        C8632dsu.d("");
                    } else {
                        epoxyRecyclerView3 = epoxyRecyclerView2;
                    }
                    i = C4194bZs.this.m;
                    epoxyRecyclerView3.scrollToPosition(i);
                    return dpR.c;
                }
                epoxyRecyclerView = C4194bZs.this.t;
                if (epoxyRecyclerView == null) {
                    C8632dsu.d("");
                    epoxyRecyclerView = null;
                }
                RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
                if (layoutManager != null) {
                    parcelable2 = C4194bZs.this.p;
                    layoutManager.onRestoreInstanceState(parcelable2);
                    return dpR.c;
                }
                return null;
            }
        });
    }

    /* renamed from: o.bZs$c */
    /* loaded from: classes4.dex */
    public static final class c extends C9956zk {
        public c() {
            super(8388611);
        }

        @Override // o.C9956zk, androidx.recyclerview.widget.SnapHelper
        public void attachToRecyclerView(RecyclerView recyclerView) {
            c(recyclerView, 40, 1, 1, 1);
        }
    }
}

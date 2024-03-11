package com.netflix.mediaclient.ui.kids.character_details;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.widget.TransparentToOpaqueScrollBehavior;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC4154bYf;
import o.AbstractC8882fB;
import o.C1045Mp;
import o.C1234Tv;
import o.C1332Xp;
import o.C1596aHd;
import o.C1619aI;
import o.C2755am;
import o.C4153bYe;
import o.C4156bYh;
import o.C4169bYu;
import o.C4171bYw;
import o.C4172bYx;
import o.C4174bYz;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8927fu;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9935zP;
import o.DialogC1237Ty;
import o.InterfaceC1078Nw;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4255bb;
import o.InterfaceC5195buF;
import o.InterfaceC5223buh;
import o.InterfaceC5227bul;
import o.InterfaceC5230buo;
import o.InterfaceC8554dpx;
import o.InterfaceC8612dsa;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8965gf;
import o.InterfaceC8976gq;
import o.bFO;
import o.bFP;
import o.bXZ;
import o.bYA;
import o.bYC;
import o.dpR;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.dsA;
import o.dtC;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class KidsCharacterFrag extends AbstractC4154bYf implements bFP, bFO {
    private C9935zP k;
    private String l;
    private final AppView m;
    private TransparentToOpaqueScrollBehavior<View> n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC8554dpx f13277o;
    private final C4169bYu p;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private a q;
    private final C4172bYx r;
    private boolean s;
    private Parcelable t;
    private final InterfaceC8554dpx w;
    private TrackingInfoHolder x;
    private final InterfaceC8554dpx y;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(KidsCharacterFrag.class, "characterViewModel", "getCharacterViewModel()Lcom/netflix/mediaclient/ui/kids/character_details/CharacterViewModel;", 0)), dsA.c(new PropertyReference1Impl(KidsCharacterFrag.class, "videoViewModel", "getVideoViewModel()Lcom/netflix/mediaclient/ui/kids/character_details/VideoViewModel;", 0)), dsA.c(new PropertyReference1Impl(KidsCharacterFrag.class, "showViewModel", "getShowViewModel()Lcom/netflix/mediaclient/ui/kids/character_details/ShowViewModel;", 0))};
    public static final d j = new d(null);
    public static final int b = 8;

    public static final KidsCharacterFrag e(String str, TrackingInfoHolder trackingInfoHolder) {
        return j.c(str, trackingInfoHolder);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.m;
    }

    @Override // o.bFO
    public void e(Parcelable parcelable) {
        this.t = parcelable;
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC8882fB<KidsCharacterFrag, bYA> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ drM b;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ boolean e;

        public b(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.e = z;
            this.b = drm;
            this.c = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: e */
        public InterfaceC8554dpx<bYA> c(KidsCharacterFrag kidsCharacterFrag, dtC<?> dtc) {
            C8632dsu.c((Object) kidsCharacterFrag, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.c;
            return d.d(kidsCharacterFrag, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$special$$inlined$fragmentViewModel$default$6$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C4171bYw.class), this.e, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8882fB<KidsCharacterFrag, bYC> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ drM b;
        final /* synthetic */ boolean c;
        final /* synthetic */ InterfaceC8660dtv d;

        public c(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.d = interfaceC8660dtv;
            this.c = z;
            this.b = drm;
            this.a = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: b */
        public InterfaceC8554dpx<bYC> c(KidsCharacterFrag kidsCharacterFrag, dtC<?> dtc) {
            C8632dsu.c((Object) kidsCharacterFrag, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.d;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.a;
            return d.d(kidsCharacterFrag, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$special$$inlined$fragmentViewModel$default$4$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C4174bYz.class), this.c, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC8882fB<KidsCharacterFrag, C4153bYe> {
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ boolean c;
        final /* synthetic */ drM d;
        final /* synthetic */ InterfaceC8660dtv e;

        public e(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.c = z;
            this.d = drm;
            this.b = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: e */
        public InterfaceC8554dpx<C4153bYe> c(KidsCharacterFrag kidsCharacterFrag, dtC<?> dtc) {
            C8632dsu.c((Object) kidsCharacterFrag, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.b;
            return d.d(kidsCharacterFrag, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C4156bYh.class), this.c, this.d);
        }
    }

    public KidsCharacterFrag() {
        final InterfaceC8660dtv a2 = dsA.a(C4153bYe.class);
        e eVar = new e(a2, false, new drM<InterfaceC8890fJ<C4153bYe, C4156bYh>, C4153bYe>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bYe, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final C4153bYe invoke(InterfaceC8890fJ<C4153bYe, C4156bYh> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C4156bYh.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2);
        dtC<?>[] dtcArr = e;
        this.f13277o = eVar.c(this, dtcArr[0]);
        final InterfaceC8660dtv a3 = dsA.a(bYC.class);
        this.y = new c(a3, false, new drM<InterfaceC8890fJ<bYC, C4174bYz>, bYC>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$special$$inlined$fragmentViewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.fS, o.bYC] */
            @Override // o.drM
            /* renamed from: b */
            public final bYC invoke(InterfaceC8890fJ<bYC, C4174bYz> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a3).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C4174bYz.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a3).c(this, dtcArr[1]);
        final InterfaceC8660dtv a4 = dsA.a(bYA.class);
        this.w = new b(a4, false, new drM<InterfaceC8890fJ<bYA, C4171bYw>, bYA>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$special$$inlined$fragmentViewModel$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bYA, o.fS] */
            @Override // o.drM
            /* renamed from: b */
            public final bYA invoke(InterfaceC8890fJ<bYA, C4171bYw> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a4).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C4171bYw.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a4).c(this, dtcArr[2]);
        this.s = true;
        this.r = new C4172bYx();
        this.p = new C4169bYu();
        this.n = new TransparentToOpaqueScrollBehavior<>(0, 0, 0, 0.0f, 14, null);
        this.m = AppView.characterDetails;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("KidsCharacterFrag");
        }

        public final KidsCharacterFrag c(String str, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            KidsCharacterFrag kidsCharacterFrag = new KidsCharacterFrag();
            Bundle bundle = new Bundle();
            bundle.putString("extra_character_id", str);
            Bundle bundle2 = new Bundle();
            bundle2.putString("CharacterId", str);
            bundle.putParcelable(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER, trackingInfoHolder);
            bundle.putBundle("mavericks:arg", bundle2);
            kidsCharacterFrag.setArguments(bundle);
            return kidsCharacterFrag;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        private final RecyclerView a;
        private final CharacterEpoxyController c;
        private final C1619aI d;

        public final CharacterEpoxyController a() {
            return this.c;
        }

        public final RecyclerView b() {
            return this.a;
        }

        public final C1619aI d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            RecyclerView recyclerView = this.a;
            CharacterEpoxyController characterEpoxyController = this.c;
            C1619aI c1619aI = this.d;
            return "Holder(recyclerView=" + recyclerView + ", epoxyController=" + characterEpoxyController + ", visibilityTracker=" + c1619aI + ")";
        }

        public a(RecyclerView recyclerView, CharacterEpoxyController characterEpoxyController, C1619aI c1619aI) {
            C8632dsu.c((Object) recyclerView, "");
            C8632dsu.c((Object) characterEpoxyController, "");
            C8632dsu.c((Object) c1619aI, "");
            this.a = recyclerView;
            this.c = characterEpoxyController;
            this.d = c1619aI;
        }
    }

    public final Lazy<PlaybackLauncher> I() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4153bYe F() {
        return (C4153bYe) this.f13277o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bYC L() {
        return (bYC) this.y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bYA G() {
        return (bYA) this.w.getValue();
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.a(F(), L(), G(), new InterfaceC8612dsa<C4156bYh, C4174bYz, C4171bYw, Boolean>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$isLoadingData$1
            @Override // o.InterfaceC8612dsa
            /* renamed from: c */
            public final Boolean invoke(C4156bYh c4156bYh, C4174bYz c4174bYz, C4171bYw c4171bYw) {
                C8632dsu.c((Object) c4156bYh, "");
                C8632dsu.c((Object) c4174bYz, "");
                C8632dsu.c((Object) c4171bYw, "");
                return Boolean.valueOf(c4156bYh.i() || c4174bYz.e() || c4171bYw.k());
            }
        })).booleanValue();
    }

    @Override // o.bMX, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(arguments, "");
        this.l = arguments.getString("extra_character_id");
        TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) arguments.getParcelable(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
        if (trackingInfoHolder == null) {
            trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.CHARACTER_DP);
        }
        this.x = trackingInfoHolder;
        String str = this.l;
        if (str == null) {
            throw new IllegalStateException("Character ID can't be null".toString());
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("Character Frag - characterID: " + str);
        InterfaceC8965gf.e.c(this, F(), null, new drM<C4156bYh, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$onCreate$2

            /* loaded from: classes4.dex */
            public final /* synthetic */ class d {
                public static final /* synthetic */ int[] b;

                static {
                    int[] iArr = new int[VideoType.values().length];
                    try {
                        iArr[VideoType.SHOW.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoType.EPISODE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    b = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4156bYh c4156bYh) {
                d(c4156bYh);
                return dpR.c;
            }

            public final void d(C4156bYh c4156bYh) {
                bYA G;
                bYA G2;
                bYA G3;
                bYC L;
                C4172bYx c4172bYx;
                TrackingInfoHolder trackingInfoHolder2;
                C8632dsu.c((Object) c4156bYh, "");
                List<InterfaceC5223buh> e2 = c4156bYh.e();
                if (e2 != null && e2.size() == 1 && c4156bYh.e().get(0).getType() == VideoType.MOVIE) {
                    c4172bYx = KidsCharacterFrag.this.r;
                    KidsCharacterFrag kidsCharacterFrag = KidsCharacterFrag.this;
                    InterfaceC5223buh interfaceC5223buh = c4156bYh.e().get(0);
                    trackingInfoHolder2 = KidsCharacterFrag.this.x;
                    if (trackingInfoHolder2 == null) {
                        C8632dsu.d("");
                        trackingInfoHolder2 = null;
                    }
                    c4172bYx.e(kidsCharacterFrag, interfaceC5223buh, trackingInfoHolder2);
                    return;
                }
                InterfaceC5223buh c2 = c4156bYh.c();
                if (c2 != null) {
                    KidsCharacterFrag kidsCharacterFrag2 = KidsCharacterFrag.this;
                    G = kidsCharacterFrag2.G();
                    G.c(CharacterEpoxyController.Companion.a(c4156bYh));
                    VideoType type = c2.getType();
                    int i = type == null ? -1 : d.b[type.ordinal()];
                    if (i == 1) {
                        G2 = kidsCharacterFrag2.G();
                        String id = c2.getId();
                        C8632dsu.a(id, "");
                        G2.b(id);
                    } else if (i != 2) {
                        L = kidsCharacterFrag2.L();
                        L.a(c2.getId(), c2.getType());
                    } else {
                        G3 = kidsCharacterFrag2.G();
                        String cd_ = ((InterfaceC5227bul) c2).cd_();
                        C8632dsu.a(cd_, "");
                        G3.b(cd_);
                    }
                }
            }
        }, 1, null);
        if (bundle == null || (parcelable = bundle.getParcelable("kcf_ss_layout_manager")) == null) {
            return;
        }
        e(parcelable);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.i.D, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        this.k = bVar.d(viewLifecycleOwner);
        NetflixActivity by_ = by_();
        C9935zP c9935zP = this.k;
        TrackingInfoHolder trackingInfoHolder = null;
        if (c9935zP == null) {
            C8632dsu.d("");
            c9935zP = null;
        }
        CharacterEpoxyController characterEpoxyController = new CharacterEpoxyController(by_, c9935zP);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.g.cO);
        recyclerView.setHasFixedSize(true);
        Context context = recyclerView.getContext();
        C8632dsu.a(context, "");
        recyclerView.setLayoutManager(new FillerGridLayoutManager(context, 0, 0, false, false, 30, null));
        recyclerView.setAdapter(characterEpoxyController.getAdapter());
        recyclerView.setItemAnimator(null);
        C1619aI c1619aI = new C1619aI();
        c1619aI.a(true);
        C8632dsu.d(recyclerView);
        c1619aI.d(recyclerView);
        this.n.c(recyclerView);
        characterEpoxyController.addModelBuildListener(new InterfaceC4255bb() { // from class: o.bYr
            @Override // o.InterfaceC4255bb
            public final void b(C2755am c2755am) {
                KidsCharacterFrag.d(KidsCharacterFrag.this, recyclerView, c2755am);
            }
        });
        this.q = new a(recyclerView, characterEpoxyController, c1619aI);
        K();
        C4169bYu c4169bYu = this.p;
        C9935zP c9935zP2 = this.k;
        if (c9935zP2 == null) {
            C8632dsu.d("");
            c9935zP2 = null;
        }
        TrackingInfoHolder trackingInfoHolder2 = this.x;
        if (trackingInfoHolder2 == null) {
            C8632dsu.d("");
        } else {
            trackingInfoHolder = trackingInfoHolder2;
        }
        c4169bYu.d(c9935zP2, trackingInfoHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(KidsCharacterFrag kidsCharacterFrag, RecyclerView recyclerView, C2755am c2755am) {
        RecyclerView.LayoutManager layoutManager;
        C8632dsu.c((Object) kidsCharacterFrag, "");
        C8632dsu.c((Object) c2755am, "");
        kidsCharacterFrag.bD_();
        if (kidsCharacterFrag.t == null || kidsCharacterFrag.isLoadingData() || recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(kidsCharacterFrag.t);
        kidsCharacterFrag.t = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("kcf_ss_layout_manager", a());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.q = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bu_() {
        super.bu_();
        View view = getView();
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: o.bYl
                @Override // java.lang.Runnable
                public final void run() {
                    KidsCharacterFrag.n(KidsCharacterFrag.this);
                }
            }, 50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(KidsCharacterFrag kidsCharacterFrag) {
        C1619aI d2;
        C8632dsu.c((Object) kidsCharacterFrag, "");
        a aVar = kidsCharacterFrag.q;
        if (aVar == null || (d2 = aVar.d()) == null) {
            return;
        }
        d2.b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bv_() {
        C1619aI d2;
        super.bv_();
        a aVar = this.q;
        if (aVar == null || (d2 = aVar.d()) == null) {
            return;
        }
        d2.b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        C8980gu.a(F(), L(), G(), new InterfaceC8612dsa<C4156bYh, C4174bYz, C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$updateActionBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            /* renamed from: c */
            public final dpR invoke(C4156bYh c4156bYh, C4174bYz c4174bYz, C4171bYw c4171bYw) {
                TransparentToOpaqueScrollBehavior transparentToOpaqueScrollBehavior;
                TransparentToOpaqueScrollBehavior transparentToOpaqueScrollBehavior2;
                TransparentToOpaqueScrollBehavior transparentToOpaqueScrollBehavior3;
                C8632dsu.c((Object) c4156bYh, "");
                C8632dsu.c((Object) c4174bYz, "");
                C8632dsu.c((Object) c4171bYw, "");
                NetflixActivity bj_ = KidsCharacterFrag.this.bj_();
                if (bj_ != null) {
                    KidsCharacterFrag kidsCharacterFrag = KidsCharacterFrag.this;
                    NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
                    if (netflixActionBar != null) {
                        transparentToOpaqueScrollBehavior = kidsCharacterFrag.n;
                        TransparentToOpaqueScrollBehavior.c(transparentToOpaqueScrollBehavior, ColorUtils.setAlphaComponent(netflixActionBar.j(), 0), 0, 2, null);
                        NetflixActionBar.b.C0051b k = bj_.getActionBarStateBuilder().k(true);
                        transparentToOpaqueScrollBehavior2 = kidsCharacterFrag.n;
                        NetflixActionBar.b.C0051b e2 = k.c(transparentToOpaqueScrollBehavior2).e(true);
                        InterfaceC5230buo c2 = c4156bYh.d().c();
                        NetflixActionBar.b.C0051b l = e2.e((CharSequence) (c2 != null ? c2.i() : null)).l(false);
                        transparentToOpaqueScrollBehavior3 = kidsCharacterFrag.n;
                        NetflixActionBar.b.C0051b c3 = l.c(transparentToOpaqueScrollBehavior3.c());
                        if (c4156bYh.d().c() != null && (c4174bYz.c().c() != null || c4171bYw.j().c() != null)) {
                            c3.d(true);
                            c3.a(new ActionBar.LayoutParams(-2, -2, 8388627));
                        }
                        netflixActionBar.c(c3.c());
                        return dpR.c;
                    }
                    return null;
                }
                return null;
            }
        });
        return true;
    }

    @Override // o.bFO
    public Parcelable a() {
        RecyclerView b2;
        RecyclerView.LayoutManager layoutManager;
        a aVar = this.q;
        if (aVar == null || (b2 = aVar.b()) == null || (layoutManager = b2.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.onSaveInstanceState();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public String toString() {
        String netflixFrag = super.toString();
        String str = this.l;
        return netflixFrag + " : " + str;
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.a(F(), L(), G(), new InterfaceC8612dsa<C4156bYh, C4174bYz, C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            /* renamed from: c */
            public final dpR invoke(C4156bYh c4156bYh, C4174bYz c4174bYz, C4171bYw c4171bYw) {
                boolean z;
                KidsCharacterFrag.a aVar;
                CharacterEpoxyController a2;
                C8632dsu.c((Object) c4156bYh, "");
                C8632dsu.c((Object) c4174bYz, "");
                C8632dsu.c((Object) c4171bYw, "");
                KidsCharacterFrag.d dVar = KidsCharacterFrag.j;
                dVar.getLogTag();
                dVar.getLogTag();
                dVar.getLogTag();
                z = KidsCharacterFrag.this.s;
                if (z && !KidsCharacterFrag.this.isLoadingData()) {
                    KidsCharacterFrag.this.s = false;
                    if (c4156bYh.a()) {
                        KidsCharacterFrag.this.d(new NetflixStatus(StatusCode.NETWORK_ERROR, 0));
                    } else {
                        KidsCharacterFrag kidsCharacterFrag = KidsCharacterFrag.this;
                        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                        C8632dsu.a(netflixImmutableStatus, "");
                        kidsCharacterFrag.d(netflixImmutableStatus);
                    }
                }
                aVar = KidsCharacterFrag.this.q;
                if (aVar == null || (a2 = aVar.a()) == null) {
                    return null;
                }
                a2.setData(c4156bYh, c4174bYz, c4171bYw);
                return dpR.c;
            }
        });
    }

    private final void K() {
        CompositeDisposable compositeDisposable = this.f;
        C9935zP c9935zP = this.k;
        if (c9935zP == null) {
            C8632dsu.d("");
            c9935zP = null;
        }
        Observable d2 = c9935zP.d(bXZ.class);
        final drM<bXZ, dpR> drm = new drM<bXZ, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$setupEventHandler$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bXZ bxz) {
                a(bxz);
                return dpR.c;
            }

            public final void a(bXZ bxz) {
                bYA G;
                bYA G2;
                C4153bYe F;
                bYC L;
                bYA G3;
                bYA G4;
                bYA G5;
                C4172bYx c4172bYx;
                C4172bYx c4172bYx2;
                C4172bYx c4172bYx3;
                if (bxz instanceof bXZ.e) {
                    c4172bYx3 = KidsCharacterFrag.this.r;
                    Lazy<PlaybackLauncher> I = KidsCharacterFrag.this.I();
                    C8632dsu.d(bxz);
                    c4172bYx3.c(I, (bXZ.e) bxz);
                } else if (bxz instanceof bXZ.a) {
                    c4172bYx2 = KidsCharacterFrag.this.r;
                    NetflixActivity bj_ = KidsCharacterFrag.this.bj_();
                    C8632dsu.d(bxz);
                    c4172bYx2.b(bj_, (bXZ.a) bxz, "CharacterBoxart");
                } else if (bxz instanceof bXZ.b) {
                    c4172bYx = KidsCharacterFrag.this.r;
                    Lazy<PlaybackLauncher> I2 = KidsCharacterFrag.this.I();
                    C8632dsu.d(bxz);
                    c4172bYx.c(I2, (bXZ.b) bxz);
                } else if (bxz instanceof bXZ.j) {
                    KidsCharacterFrag.this.N();
                } else if (bxz instanceof bXZ.h) {
                    G5 = KidsCharacterFrag.this.G();
                    G5.c(((bXZ.h) bxz).a());
                } else if (bxz instanceof bXZ.c) {
                    G4 = KidsCharacterFrag.this.G();
                    bYA.c(G4, false, false, null, 7, null);
                } else if (bxz instanceof bXZ.d) {
                    F = KidsCharacterFrag.this.F();
                    L = KidsCharacterFrag.this.L();
                    G3 = KidsCharacterFrag.this.G();
                    final KidsCharacterFrag kidsCharacterFrag = KidsCharacterFrag.this;
                    C8980gu.a(F, L, G3, new InterfaceC8612dsa<C4156bYh, C4174bYz, C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$setupEventHandler$1.1
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        public /* synthetic */ dpR invoke(C4156bYh c4156bYh, C4174bYz c4174bYz, C4171bYw c4171bYw) {
                            c(c4156bYh, c4174bYz, c4171bYw);
                            return dpR.c;
                        }

                        public final void c(C4156bYh c4156bYh, C4174bYz c4174bYz, C4171bYw c4171bYw) {
                            bYA G6;
                            bYC L2;
                            C4153bYe F2;
                            C8632dsu.c((Object) c4156bYh, "");
                            C8632dsu.c((Object) c4174bYz, "");
                            C8632dsu.c((Object) c4171bYw, "");
                            if (c4156bYh.d() instanceof C8927fu) {
                                F2 = KidsCharacterFrag.this.F();
                                F2.c(true);
                            } else if (c4174bYz.c() instanceof C8927fu) {
                                L2 = KidsCharacterFrag.this.L();
                                L2.c(true);
                            } else if (c4171bYw.j() instanceof C8927fu) {
                                G6 = KidsCharacterFrag.this.G();
                                bYA.a(G6, true, false, 2, null);
                            }
                        }
                    });
                } else if (bxz instanceof bXZ.i) {
                    G2 = KidsCharacterFrag.this.G();
                    G2.b(true);
                } else if (bxz instanceof bXZ.g) {
                    G = KidsCharacterFrag.this.G();
                    bYA.c(G, true, false, null, 6, null);
                }
            }
        };
        Consumer consumer = new Consumer() { // from class: o.bYn
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KidsCharacterFrag.e(drM.this, obj);
            }
        };
        final KidsCharacterFrag$setupEventHandler$2 kidsCharacterFrag$setupEventHandler$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$setupEventHandler$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d3;
                Map k;
                Throwable th2;
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k = dqE.k(d3);
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
        };
        Disposable subscribe = d2.subscribe(consumer, new Consumer() { // from class: o.bYj
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KidsCharacterFrag.c(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        C8980gu.c(G(), new drM<C4171bYw, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$showSeasonSelector$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4171bYw c4171bYw) {
                a(c4171bYw);
                return dpR.c;
            }

            public final void a(C4171bYw c4171bYw) {
                C9935zP c9935zP;
                C8632dsu.c((Object) c4171bYw, "");
                List<InterfaceC5195buF> c2 = c4171bYw.d().c();
                if (c2 == null || !(!c2.isEmpty())) {
                    return;
                }
                C1234Tv c1234Tv = new C1234Tv(c2);
                final KidsCharacterFrag kidsCharacterFrag = KidsCharacterFrag.this;
                Observable<Integer> e2 = c1234Tv.e();
                c9935zP = kidsCharacterFrag.k;
                if (c9935zP == null) {
                    C8632dsu.d("");
                    c9935zP = null;
                }
                Observable<Integer> take = e2.takeUntil(c9935zP.d()).skip(1L).take(1L);
                C8632dsu.a(take, "");
                SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag$showSeasonSelector$1$model$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Integer num) {
                        e(num);
                        return dpR.c;
                    }

                    public final void e(Integer num) {
                        C9935zP c9935zP2;
                        c9935zP2 = KidsCharacterFrag.this.k;
                        if (c9935zP2 == null) {
                            C8632dsu.d("");
                            c9935zP2 = null;
                        }
                        C8632dsu.d(num);
                        c9935zP2.b(bXZ.class, new bXZ.h(num.intValue()));
                    }
                }, 3, (Object) null);
                c1234Tv.d(c4171bYw.g());
                FragmentActivity requireActivity = KidsCharacterFrag.this.requireActivity();
                C8632dsu.a(requireActivity, "");
                new DialogC1237Ty(requireActivity, c1234Tv, null, true, null, 16, null).show();
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        int i = this.h;
        C1332Xp c1332Xp = C1332Xp.b;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i + ((int) TypedValue.applyDimension(1, 60, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
    }
}

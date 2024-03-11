package com.netflix.mediaclient.ui.home.impl.games;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import o.AbstractC4034bTu;
import o.AbstractC4038bTy;
import o.AbstractC8882fB;
import o.C1026Lt;
import o.C1045Mp;
import o.C1333Xq;
import o.C1596aHd;
import o.C4037bTx;
import o.C4048bUh;
import o.C5105bsV;
import o.C8054ddD;
import o.C8126deW;
import o.C8153dex;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9726vo;
import o.C9737vz;
import o.C9834xU;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6068cSu;
import o.InterfaceC8554dpx;
import o.InterfaceC8612dsa;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8976gq;
import o.bLW;
import o.bSY;
import o.bTF;
import o.bTX;
import o.dpB;
import o.dpD;
import o.dpR;
import o.dqD;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class GamesLolomoFragment extends AbstractC4038bTy {
    static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(GamesLolomoFragment.class, "gameHandleViewModel", "getGameHandleViewModel()Lcom/netflix/mediaclient/ui/home/impl/games/GameHandleViewModel;", 0))};
    public static final d e = new d(null);
    private boolean l = C8153dex.s();
    private final InterfaceC8554dpx m;
    private final InterfaceC8554dpx n;

    /* renamed from: o  reason: collision with root package name */
    private final AppView f13273o;
    @Inject
    public InterfaceC6068cSu search;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.f13273o;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public void c(boolean z) {
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8882fB<GamesLolomoFragment, C4037bTx> {
        final /* synthetic */ drM a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ boolean e;

        public c(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.b = interfaceC8660dtv;
            this.e = z;
            this.a = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: e */
        public InterfaceC8554dpx<C4037bTx> c(GamesLolomoFragment gamesLolomoFragment, dtC<?> dtc) {
            C8632dsu.c((Object) gamesLolomoFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.b;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(gamesLolomoFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(C4037bTx.e.class), this.e, this.a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GamesLolomoFragment");
        }
    }

    public GamesLolomoFragment() {
        InterfaceC8554dpx b2;
        final InterfaceC8660dtv a = dsA.a(C4037bTx.class);
        this.m = new c(a, false, new drM<InterfaceC8890fJ<C4037bTx, C4037bTx.e>, C4037bTx>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bTx, o.fS] */
            @Override // o.drM
            /* renamed from: e */
            public final C4037bTx invoke(InterfaceC8890fJ<C4037bTx, C4037bTx.e> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C4037bTx.e.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a).c(this, b[0]);
        b2 = dpB.b(LazyThreadSafetyMode.e, new drO<C5105bsV>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$playbackExperience$2
            @Override // o.drO
            /* renamed from: c */
            public final C5105bsV invoke() {
                return new C5105bsV("trailerInLolomo", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$playbackExperience$2.1
                    @Override // o.drO
                    /* renamed from: b */
                    public final String invoke() {
                        String d2 = C8126deW.d();
                        C8632dsu.a(d2, "");
                        return d2;
                    }
                });
            }
        });
        this.n = b2;
        this.f13273o = AppView.browseGames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4037bTx K() {
        return (C4037bTx) this.m.getValue();
    }

    public final InterfaceC6068cSu L() {
        InterfaceC6068cSu interfaceC6068cSu = this.search;
        if (interfaceC6068cSu != null) {
            return interfaceC6068cSu;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C5105bsV J() {
        return (C5105bsV) this.n.getValue();
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Map b2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        N();
        if (this.l) {
            C4037bTx.e(K(), true, false, null, 6, null);
        }
        if (C8126deW.a()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            b2 = dqD.b(dpD.a("appView", String.valueOf(bh_())));
            k = dqE.k(b2);
            C1596aHd c1596aHd = new C1596aHd("GUI-373 Game is shown to kids profile.", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b3 = c1596aHd.b();
                if (b3 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b3);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        super.onCreateOptionsMenu(menu, menuInflater);
        if (C8153dex.Q()) {
            return;
        }
        L().a(menu).setVisible(true);
    }

    private final void N() {
        C9935zP af_ = af_();
        if (this.l) {
            DisposableKt.plusAssign(bk_(), SubscribersKt.subscribeBy$default(af_.d(AbstractC4034bTu.class), (drM) null, (drO) null, new drM<AbstractC4034bTu, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$setUpEventHandlers$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC4034bTu abstractC4034bTu) {
                    c(abstractC4034bTu);
                    return dpR.c;
                }

                public final void c(AbstractC4034bTu abstractC4034bTu) {
                    C4037bTx K;
                    C8632dsu.c((Object) abstractC4034bTu, "");
                    if (C8632dsu.c(abstractC4034bTu, AbstractC4034bTu.b.d)) {
                        GamesLolomoFragment.this.O();
                    } else if (C8632dsu.c(abstractC4034bTu, AbstractC4034bTu.d.d)) {
                        Context context = GamesLolomoFragment.this.getContext();
                        C1333Xq d2 = C1333Xq.d(R.o.bY);
                        K = GamesLolomoFragment.this.K();
                        C8054ddD.a(context, C8168dfL.c(d2.d("handle", K.j()).c()).toString(), 1);
                    }
                }
            }, 3, (Object) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(getContext(), NetflixActivity.class);
        if (netflixActivity != null) {
            startActivityForResult(ad().get().d(netflixActivity), 6003, null);
        }
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public LolomoEpoxyController c(bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drO<MiniPlayerVideoGroupViewModel> dro, drM<? super LoMo, dpR> drm) {
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        LolomoMvRxFragment.d Z = Z();
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        return new GamesLolomoEpoxyController(Z, requireContext, af_(), bsy, blw, btx, drx, drm, dro, aq().i(), K());
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C9935zP af_() {
        return C9935zP.b.d(this);
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C4048bUh F() {
        return new C4048bUh(new InterfaceC8612dsa<Integer, String, String, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$buildVolatileRowHandler$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Integer num, String str, String str2) {
                c(num.intValue(), str, str2);
                return dpR.c;
            }

            public final void c(int i, String str, String str2) {
                bTF aq;
                aq = GamesLolomoFragment.this.aq();
                bTF.d(aq, i, false, 2, null);
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        NetflixActivity bj_2 = bj_();
        Boolean bool = (Boolean) C9726vo.d(bj_, bj_2 != null ? bj_2.getNetflixActionBar() : null, new drX<NetflixActivity, NetflixActionBar, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$updateActionBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
            @Override // o.drX
            /* renamed from: d */
            public final Boolean invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar) {
                boolean z;
                Ref.ObjectRef objectRef;
                Ref.BooleanRef booleanRef;
                C4037bTx K;
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) netflixActionBar, "");
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.d = GamesLolomoFragment.this.ag().get().a();
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.a = true;
                Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                z = GamesLolomoFragment.this.l;
                if (z) {
                    K = GamesLolomoFragment.this.K();
                    objectRef = objectRef5;
                    booleanRef = booleanRef3;
                    C8980gu.c(K, new AnonymousClass1(booleanRef2, booleanRef3, objectRef2, objectRef4, netflixActivity, objectRef5, GamesLolomoFragment.this, objectRef3));
                } else {
                    objectRef = objectRef5;
                    booleanRef = booleanRef3;
                }
                netflixActionBar.c(netflixActivity.getActionBarStateBuilder().l(booleanRef2.a).e((CharSequence) objectRef2.d).d(0).e((View.OnClickListener) objectRef3.d).e((Drawable) objectRef4.d).e((String) objectRef.d).n(booleanRef.a).i(true).h(true).f(true).g(false).d(GamesLolomoFragment.this).c());
                return Boolean.TRUE;
            }

            /* renamed from: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$updateActionBar$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends Lambda implements drM<C4037bTx.e, dpR> {
                final /* synthetic */ Ref.ObjectRef<View.OnClickListener> a;
                final /* synthetic */ Ref.ObjectRef<String> b;
                final /* synthetic */ Ref.ObjectRef<String> c;
                final /* synthetic */ NetflixActivity d;
                final /* synthetic */ Ref.BooleanRef e;
                final /* synthetic */ Ref.BooleanRef f;
                final /* synthetic */ GamesLolomoFragment h;
                final /* synthetic */ Ref.ObjectRef<Drawable> i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<Drawable> objectRef2, NetflixActivity netflixActivity, Ref.ObjectRef<String> objectRef3, GamesLolomoFragment gamesLolomoFragment, Ref.ObjectRef<View.OnClickListener> objectRef4) {
                    super(1);
                    this.f = booleanRef;
                    this.e = booleanRef2;
                    this.c = objectRef;
                    this.i = objectRef2;
                    this.d = netflixActivity;
                    this.b = objectRef3;
                    this.h = gamesLolomoFragment;
                    this.a = objectRef4;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r10v4, types: [T, java.lang.String] */
                /* JADX WARN: Type inference failed for: r10v5, types: [o.bTA, T] */
                @Override // o.drM
                /* renamed from: e */
                public final dpR invoke(C4037bTx.e eVar) {
                    Drawable mutate;
                    C8632dsu.c((Object) eVar, "");
                    if (eVar.e()) {
                        this.f.a = false;
                        this.e.a = true;
                        return dpR.c;
                    }
                    ?? d = eVar.d();
                    T t = 0;
                    t = 0;
                    if (d != 0) {
                        Ref.ObjectRef<String> objectRef = this.c;
                        Ref.ObjectRef<Drawable> objectRef2 = this.i;
                        NetflixActivity netflixActivity = this.d;
                        Ref.ObjectRef<String> objectRef3 = this.b;
                        final GamesLolomoFragment gamesLolomoFragment = this.h;
                        Ref.ObjectRef<View.OnClickListener> objectRef4 = this.a;
                        objectRef.d = d;
                        Drawable drawable = ResourcesCompat.getDrawable(netflixActivity.getResources(), C1026Lt.a.CW, netflixActivity.getTheme());
                        if (drawable != null && (mutate = drawable.mutate()) != null) {
                            mutate.setTint(netflixActivity.getResources().getColor(C9834xU.c.C, netflixActivity.getTheme()));
                            t = mutate;
                        }
                        objectRef2.d = t;
                        objectRef3.d = C1333Xq.d(gamesLolomoFragment.ad().get().b()).d("gameHandle", d).c();
                        objectRef4.d = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007a: IPUT  
                              (wrap: ?? : 0x0077: CONSTRUCTOR  (r10v5 ?? I:o.bTA A[REMOVE]) = (r5v0 'gamesLolomoFragment' com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment A[DONT_INLINE]) call: o.bTA.<init>(com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment):void type: CONSTRUCTOR)
                              (r6v0 'objectRef4' kotlin.jvm.internal.Ref$ObjectRef<android.view.View$OnClickListener>)
                             kotlin.jvm.internal.Ref.ObjectRef.d java.lang.Object in method: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$updateActionBar$1.1.e(o.bTx$e):o.dpR, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.bTA, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:486)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 27 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = ""
                            o.C8632dsu.c(r10, r0)
                            boolean r0 = r10.e()
                            if (r0 == 0) goto L18
                            kotlin.jvm.internal.Ref$BooleanRef r10 = r9.f
                            r0 = 0
                            r10.a = r0
                            kotlin.jvm.internal.Ref$BooleanRef r10 = r9.e
                            r0 = 1
                            r10.a = r0
                            o.dpR r10 = o.dpR.c
                            goto L80
                        L18:
                            java.lang.String r10 = r10.d()
                            r0 = 0
                            if (r10 == 0) goto L7f
                            kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r1 = r9.c
                            kotlin.jvm.internal.Ref$ObjectRef<android.graphics.drawable.Drawable> r2 = r9.i
                            com.netflix.mediaclient.android.activity.NetflixActivity r3 = r9.d
                            kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r4 = r9.b
                            com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment r5 = r9.h
                            kotlin.jvm.internal.Ref$ObjectRef<android.view.View$OnClickListener> r6 = r9.a
                            r1.d = r10
                            android.content.res.Resources r1 = r3.getResources()
                            int r7 = o.C1026Lt.a.CW
                            android.content.res.Resources$Theme r8 = r3.getTheme()
                            android.graphics.drawable.Drawable r1 = androidx.core.content.res.ResourcesCompat.getDrawable(r1, r7, r8)
                            if (r1 == 0) goto L55
                            android.graphics.drawable.Drawable r1 = r1.mutate()
                            if (r1 == 0) goto L55
                            android.content.res.Resources r0 = r3.getResources()
                            int r7 = o.C9834xU.c.C
                            android.content.res.Resources$Theme r3 = r3.getTheme()
                            int r0 = r0.getColor(r7, r3)
                            r1.setTint(r0)
                            r0 = r1
                        L55:
                            r2.d = r0
                            dagger.Lazy r0 = r5.ad()
                            java.lang.Object r0 = r0.get()
                            o.bNT r0 = (o.bNT) r0
                            java.lang.String r0 = r0.b()
                            o.Xq r0 = o.C1333Xq.d(r0)
                            java.lang.String r1 = "gameHandle"
                            o.Xq r10 = r0.d(r1, r10)
                            java.lang.String r10 = r10.c()
                            r4.d = r10
                            o.bTA r10 = new o.bTA
                            r10.<init>(r5)
                            r6.d = r10
                            o.dpR r10 = o.dpR.c
                            goto L80
                        L7f:
                            r10 = r0
                        L80:
                            return r10
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.games.GamesLolomoFragment$updateActionBar$1.AnonymousClass1.invoke(o.bTx$e):o.dpR");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void b(GamesLolomoFragment gamesLolomoFragment, View view) {
                        C8632dsu.c((Object) gamesLolomoFragment, "");
                        gamesLolomoFragment.O();
                    }
                }
            });
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            int i = this.i;
            int i2 = ((NetflixFrag) this).d;
            int i3 = this.g;
            LolomoMvRxFragment.e ak = ak();
            if (ak != null) {
                bTX n = ak.n();
                int i4 = i + i2 + i3;
                n.setPadding(n.getPaddingLeft(), i4, n.getPaddingRight(), this.h + view.getResources().getDimensionPixelSize(R.b.q));
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            if (this.l && i == 6003 && i2 == -1) {
                K().b(true, true, af_());
            }
        }
    }

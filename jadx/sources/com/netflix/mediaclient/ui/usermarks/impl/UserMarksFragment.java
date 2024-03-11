package com.netflix.mediaclient.ui.usermarks.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.usermarks.api.UserMarksFlexEventType;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.mediaclient.util.ViewUtils;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC1403aA;
import o.AbstractC5100bsQ;
import o.AbstractC5271bvc;
import o.AbstractC6719cic;
import o.AbstractC6729cim;
import o.AbstractC8026dcc;
import o.AbstractC8027dcd;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.C1026Lt;
import o.C1030Lx;
import o.C1045Mp;
import o.C1333Xq;
import o.C1565aG;
import o.C1619aI;
import o.C3786bKp;
import o.C6652chO;
import o.C6734cir;
import o.C7593czD;
import o.C7969dbY;
import o.C8000dcC;
import o.C8002dcE;
import o.C8029dcf;
import o.C8033dcj;
import o.C8045dcv;
import o.C8047dcx;
import o.C8049dcz;
import o.C8054ddD;
import o.C8126deW;
import o.C8310dhv;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9687vB;
import o.C9834xU;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC1126Pr;
import o.InterfaceC2023aX;
import o.InterfaceC4360bcz;
import o.InterfaceC5283bvo;
import o.InterfaceC6718cib;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.aQJ;
import o.dpB;
import o.dpR;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes5.dex */
public final class UserMarksFragment extends AbstractC8026dcc implements InterfaceC8894fN, MenuProvider {
    private final AppView k;
    private final InterfaceC8554dpx l;
    private final boolean m;
    private d n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13328o;
    private AbstractC6729cim.b p;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private final InterfaceC8554dpx r;
    private AbstractC5100bsQ s;
    @Inject
    public InterfaceC1126Pr socialSharing;
    private final InterfaceC8554dpx t;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(UserMarksFragment.class, "userMarksViewModel", "getUserMarksViewModel()Lcom/netflix/mediaclient/ui/usermarks/impl/UserMarksViewModel;", 0))};
    public static final e j = new e(null);
    public static final int b = 8;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.m;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC8882fB<UserMarksFragment, C8002dcE> {
        final /* synthetic */ drM b;
        final /* synthetic */ boolean c;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ InterfaceC8660dtv e;

        public b(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.c = z;
            this.b = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: b */
        public InterfaceC8554dpx<C8002dcE> c(UserMarksFragment userMarksFragment, dtC<?> dtc) {
            C8632dsu.c((Object) userMarksFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(userMarksFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(C8049dcz.class), this.c, this.b);
        }
    }

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        return InterfaceC8894fN.b.d(this);
    }

    @Override // o.InterfaceC8894fN
    public <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return InterfaceC8894fN.b.e(this, abstractC8899fS, abstractC8928fv, drx);
    }

    @Override // o.InterfaceC8894fN
    public void i_() {
        InterfaceC8894fN.b.e(this);
    }

    public UserMarksFragment() {
        InterfaceC8554dpx b2;
        final InterfaceC8660dtv a = dsA.a(C8002dcE.class);
        this.t = new b(a, false, new drM<InterfaceC8890fJ<C8002dcE, C8049dcz>, C8002dcE>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.dcE, o.fS] */
            @Override // o.drM
            /* renamed from: d */
            public final C8002dcE invoke(InterfaceC8890fJ<C8002dcE, C8049dcz> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C8049dcz.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a).c(this, e[0]);
        this.f13328o = aQJ.e.a().b();
        b2 = dpB.b(LazyThreadSafetyMode.e, new drO<MiniPlayerVideoGroupViewModel>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$miniPlayerViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final MiniPlayerVideoGroupViewModel invoke() {
                MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel = (MiniPlayerVideoGroupViewModel) new ViewModelProvider(UserMarksFragment.this.by_()).get(MiniPlayerVideoGroupViewModel.class);
                miniPlayerVideoGroupViewModel.a(new C8045dcv());
                return miniPlayerVideoGroupViewModel;
            }
        });
        this.l = b2;
        this.r = C1565aG.c(this, C8029dcf.a.j, false, false, null, new drX<InterfaceC2023aX, Context, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$playerBinder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC2023aX interfaceC2023aX, Context context) {
                c(interfaceC2023aX, context);
                return dpR.c;
            }

            /* renamed from: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$playerBinder$2$1  reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends Lambda implements drM<C8049dcz, dpR> {
                final /* synthetic */ UserMarksFragment c;
                final /* synthetic */ InterfaceC2023aX e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UserMarksFragment userMarksFragment, InterfaceC2023aX interfaceC2023aX) {
                    super(1);
                    this.c = userMarksFragment;
                    this.e = interfaceC2023aX;
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                    a(c8049dcz);
                    return dpR.c;
                }

                public final void a(C8049dcz c8049dcz) {
                    MiniPlayerVideoGroupViewModel K;
                    MiniPlayerVideoGroupViewModel K2;
                    AbstractC5100bsQ abstractC5100bsQ;
                    boolean z;
                    C9935zP G;
                    MiniPlayerVideoGroupViewModel K3;
                    C8632dsu.c((Object) c8049dcz, "");
                    C7969dbY b = c8049dcz.b();
                    if (b != null) {
                        final UserMarksFragment userMarksFragment = this.c;
                        InterfaceC2023aX interfaceC2023aX = this.e;
                        AbstractC5271bvc.b bVar = new AbstractC5271bvc.b(Long.parseLong(b.i()));
                        K = userMarksFragment.K();
                        K.c(bVar);
                        K2 = userMarksFragment.K();
                        abstractC5100bsQ = userMarksFragment.s;
                        K2.a(abstractC5100bsQ);
                        z = userMarksFragment.f13328o;
                        if (z && (!c8049dcz.a().isEmpty())) {
                            C6734cir c6734cir = new C6734cir();
                            String i = b.i();
                            c6734cir.b((CharSequence) ("preview-player-" + i));
                            c6734cir.b(b.i());
                            c6734cir.d(bVar.d());
                            c6734cir.c(userMarksFragment.getString(C9834xU.h.b));
                            c6734cir.d(PlayContextImp.w);
                            c6734cir.b(VideoType.create(c8049dcz.b().h()));
                            c6734cir.c(Float.valueOf(1.778f));
                            c6734cir.e(b.a());
                            c6734cir.f(b.f());
                            c6734cir.a(false);
                            c6734cir.b(false);
                            c6734cir.a(AppView.userMarksHome);
                            c6734cir.j("userMarksHome");
                            c6734cir.e(false);
                            G = userMarksFragment.G();
                            c6734cir.b(G);
                            c6734cir.b((InterfaceC6718cib) new C6652chO(null));
                            K3 = userMarksFragment.K();
                            c6734cir.b(K3);
                            c6734cir.c(b.d());
                            c6734cir.d(b.g());
                            c6734cir.c(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00df: INVOKE  
                                  (r4v8 'c6734cir' o.cir)
                                  (wrap: o.bf<o.cir, o.cim$b> : 0x00dc: CONSTRUCTOR  (r9v14 o.bf<o.cir, o.cim$b> A[REMOVE]) = (r1v0 'userMarksFragment' com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment A[DONT_INLINE]) call: o.dcs.<init>(com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment):void type: CONSTRUCTOR)
                                 type: INTERFACE call: o.cip.c(o.bf):o.cip in method: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$playerBinder$2.1.a(o.dcz):void, file: classes5.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.dcs, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 31 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = ""
                                o.C8632dsu.c(r9, r0)
                                o.dbY r0 = r9.b()
                                if (r0 == 0) goto Le5
                                com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment r1 = r8.c
                                o.aX r2 = r8.e
                                o.bvc$b r3 = new o.bvc$b
                                java.lang.String r4 = r0.i()
                                long r4 = java.lang.Long.parseLong(r4)
                                r3.<init>(r4)
                                com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel r4 = com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.c(r1)
                                r4.c(r3)
                                com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel r4 = com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.c(r1)
                                o.bsQ r5 = com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.f(r1)
                                r4.a(r5)
                                boolean r4 = com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.e(r1)
                                if (r4 == 0) goto Le5
                                java.util.List r4 = r9.a()
                                boolean r4 = r4.isEmpty()
                                r4 = r4 ^ 1
                                if (r4 == 0) goto Le5
                                o.cir r4 = new o.cir
                                r4.<init>()
                                java.lang.String r5 = r0.i()
                                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                                r6.<init>()
                                java.lang.String r7 = "preview-player-"
                                r6.append(r7)
                                r6.append(r5)
                                java.lang.String r5 = r6.toString()
                                r4.b(r5)
                                java.lang.String r5 = r0.i()
                                r4.b(r5)
                                java.lang.String r3 = r3.d()
                                r4.d(r3)
                                int r3 = o.C9834xU.h.b
                                java.lang.String r3 = r1.getString(r3)
                                r4.c(r3)
                                com.netflix.mediaclient.util.PlayContext r3 = com.netflix.mediaclient.clutils.PlayContextImp.w
                                r4.d(r3)
                                o.dbY r9 = r9.b()
                                int r9 = r9.h()
                                com.netflix.mediaclient.servicemgr.interface_.VideoType r9 = com.netflix.mediaclient.servicemgr.interface_.VideoType.create(r9)
                                r4.b(r9)
                                r9 = 1071879553(0x3fe39581, float:1.778)
                                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                                r4.c(r9)
                                java.lang.String r9 = r0.a()
                                r4.e(r9)
                                java.lang.String r9 = r0.f()
                                r4.f(r9)
                                r9 = 0
                                r4.a(r9)
                                r4.b(r9)
                                com.netflix.cl.model.AppView r3 = com.netflix.cl.model.AppView.userMarksHome
                                r4.a(r3)
                                java.lang.String r3 = "userMarksHome"
                                r4.j(r3)
                                r4.e(r9)
                                o.zP r9 = com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.a(r1)
                                r4.b(r9)
                                o.chO r9 = new o.chO
                                r3 = 0
                                r9.<init>(r3)
                                r4.b(r9)
                                com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel r9 = com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment.c(r1)
                                r4.b(r9)
                                int r9 = r0.d()
                                r4.c(r9)
                                int r9 = r0.g()
                                long r5 = (long) r9
                                r4.d(r5)
                                o.dcs r9 = new o.dcs
                                r9.<init>(r1)
                                r4.c(r9)
                                r2.add(r4)
                            Le5:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$playerBinder$2.AnonymousClass1.a(o.dcz):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void a(UserMarksFragment userMarksFragment, C6734cir c6734cir, AbstractC6729cim.b bVar, int i) {
                            C9935zP G;
                            C8632dsu.c((Object) userMarksFragment, "");
                            userMarksFragment.p = bVar;
                            G = userMarksFragment.G();
                            G.b(AbstractC6719cic.class, new AbstractC6719cic.e.c(0, 0));
                        }
                    }

                    public final void c(InterfaceC2023aX interfaceC2023aX, Context context) {
                        C8632dsu.c((Object) interfaceC2023aX, "");
                        C8632dsu.c((Object) context, "");
                        C8980gu.c(UserMarksFragment.this.N(), new AnonymousClass1(UserMarksFragment.this, interfaceC2023aX));
                    }
                }, 14, null);
                this.k = AppView.userMarksHome;
            }

            /* loaded from: classes5.dex */
            public static final class e extends C1045Mp {
                public /* synthetic */ e(C8627dsp c8627dsp) {
                    this();
                }

                private e() {
                    super("UserMarksFragment");
                }

                public final UserMarksFragment d() {
                    return new UserMarksFragment();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final C8002dcE N() {
                return (C8002dcE) this.t.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final C9935zP G() {
                C9935zP.b bVar = C9935zP.b;
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                C8632dsu.a(viewLifecycleOwner, "");
                return bVar.d(viewLifecycleOwner);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final MiniPlayerVideoGroupViewModel K() {
                return (MiniPlayerVideoGroupViewModel) this.l.getValue();
            }

            private final LifecycleAwareEpoxyViewBinder M() {
                return (LifecycleAwareEpoxyViewBinder) this.r.getValue();
            }

            public final Lazy<PlaybackLauncher> F() {
                Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
                if (lazy != null) {
                    return lazy;
                }
                C8632dsu.d("");
                return null;
            }

            public final InterfaceC1126Pr I() {
                InterfaceC1126Pr interfaceC1126Pr = this.socialSharing;
                if (interfaceC1126Pr != null) {
                    return interfaceC1126Pr;
                }
                C8632dsu.d("");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class d {
                private final View a;
                private final C3786bKp b;
                private final C1619aI d;
                private final UserMarksEpoxyController e;

                public final C3786bKp b() {
                    return this.b;
                }

                public final C1619aI c() {
                    return this.d;
                }

                public final UserMarksEpoxyController d() {
                    return this.e;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof d) {
                        d dVar = (d) obj;
                        return C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.d, dVar.d);
                    }
                    return false;
                }

                public int hashCode() {
                    return (((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
                }

                public String toString() {
                    View view = this.a;
                    UserMarksEpoxyController userMarksEpoxyController = this.e;
                    C3786bKp c3786bKp = this.b;
                    C1619aI c1619aI = this.d;
                    return "Holder(rootView=" + view + ", epoxyController=" + userMarksEpoxyController + ", recyclerView=" + c3786bKp + ", epoxyVisibilityTracker=" + c1619aI + ")";
                }

                public d(View view, UserMarksEpoxyController userMarksEpoxyController, C3786bKp c3786bKp, C1619aI c1619aI) {
                    C8632dsu.c((Object) view, "");
                    C8632dsu.c((Object) userMarksEpoxyController, "");
                    C8632dsu.c((Object) c3786bKp, "");
                    C8632dsu.c((Object) c1619aI, "");
                    this.a = view;
                    this.e = userMarksEpoxyController;
                    this.b = c3786bKp;
                    this.d = c1619aI;
                }
            }

            @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
            public boolean bD_() {
                final NetflixActivity bj_ = bj_();
                final NetflixActionBar netflixActionBar = bj_ != null ? bj_.getNetflixActionBar() : null;
                if (netflixActionBar != null) {
                    C8980gu.c(N(), new drM<C8049dcz, Boolean>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$updateActionBar$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: c */
                        public final Boolean invoke(C8049dcz c8049dcz) {
                            C8632dsu.c((Object) c8049dcz, "");
                            if (c8049dcz.c()) {
                                Drawable drawable = ContextCompat.getDrawable(NetflixActivity.this, C1026Lt.a.RC);
                                int color = ContextCompat.getColor(NetflixActivity.this, C1030Lx.d.b);
                                netflixActionBar.c(NetflixActivity.this.getActionBarStateBuilder().b(this.requireContext().getResources().getString(C8029dcf.j.b)).e((CharSequence) NetflixActivity.this.getResources().getString(C8029dcf.j.a)).c(color).b(drawable).c(new ColorDrawable(ContextCompat.getColor(NetflixActivity.this, C1030Lx.d.j))).l(true).b(false).d(true).e(true).c());
                            } else {
                                netflixActionBar.c(NetflixActivity.this.getActionBarStateBuilder().e((CharSequence) NetflixActivity.this.getResources().getString(C8029dcf.j.d)).l(true).b(false).c());
                            }
                            return Boolean.TRUE;
                        }
                    });
                }
                return super.bD_();
            }

            @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
            public void e(View view) {
                C8632dsu.c((Object) view, "");
                int i = this.i;
                int i2 = ((NetflixFrag) this).d;
                int i3 = this.g;
                int c2 = ViewUtils.c((Context) getActivity(), true);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                    marginLayoutParams.topMargin = i + i2 + i3;
                    marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                    marginLayoutParams.bottomMargin = c2;
                    marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                    marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                    view.requestLayout();
                }
            }

            @Override // androidx.fragment.app.Fragment
            @SuppressLint({"AutoDispose"})
            public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                C8632dsu.c((Object) layoutInflater, "");
                super.onCreateView(layoutInflater, viewGroup, bundle);
                CompositeDisposable bk_ = bk_();
                Single<AbstractC5100bsQ> b2 = InterfaceC4360bcz.b.a().b();
                final drM<AbstractC5100bsQ, dpR> drm = new drM<AbstractC5100bsQ, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$onCreateView$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(AbstractC5100bsQ abstractC5100bsQ) {
                        b(abstractC5100bsQ);
                        return dpR.c;
                    }

                    public final void b(AbstractC5100bsQ abstractC5100bsQ) {
                        C8632dsu.c((Object) abstractC5100bsQ, "");
                        UserMarksFragment.this.s = abstractC5100bsQ;
                    }
                };
                bk_.add(b2.subscribe(new Consumer() { // from class: o.dcr
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        UserMarksFragment.d(drM.this, obj);
                    }
                }));
                return layoutInflater.inflate(C8029dcf.c.b, viewGroup, false);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(drM drm, Object obj) {
                C8632dsu.c((Object) drm, "");
                drm.invoke(obj);
            }

            @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                C8632dsu.c((Object) view, "");
                C8000dcC d2 = C8000dcC.d(view);
                C8632dsu.a(d2, "");
                super.onViewCreated(view, bundle);
                InterfaceC5283bvo b2 = C8126deW.b();
                boolean z = (b2 == null || b2.isKidsProfile() || !aQJ.e.a().a()) ? false : true;
                FragmentActivity requireActivity = requireActivity();
                C8632dsu.a(requireActivity, "");
                requireActivity.addMenuProvider(this, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
                C8002dcE N = N();
                Context applicationContext = requireContext().getApplicationContext();
                C8632dsu.a(applicationContext, "");
                N.b(applicationContext);
                N().j();
                C3786bKp c3786bKp = d2.e;
                Context requireContext = requireContext();
                C8632dsu.a(requireContext, "");
                c3786bKp.setLayoutManager(new FillerGridLayoutManager(requireContext, 0, 0, false, false, 30, null));
                UserMarksEpoxyController userMarksEpoxyController = new UserMarksEpoxyController(G(), this.f13328o, z);
                c3786bKp.setController(userMarksEpoxyController);
                C8632dsu.d(c3786bKp);
                this.n = new d(view, userMarksEpoxyController, c3786bKp, new C1619aI());
                c(c3786bKp);
                boolean a = C8310dhv.a();
                int i = a ? 8 : 4;
                d dVar = this.n;
                AbstractC1403aA.i d3 = AbstractC1403aA.d(dVar != null ? dVar.b() : null).d(i).d(C8033dcj.class);
                Context requireContext2 = requireContext();
                C8632dsu.a(requireContext2, "");
                d3.b(new C8047dcx(requireContext2, a, new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$onViewCreated$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(String str) {
                        d(str);
                        return dpR.c;
                    }

                    public final void d(final String str) {
                        C8980gu.c(UserMarksFragment.this.N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$onViewCreated$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                                d(c8049dcz);
                                return dpR.c;
                            }

                            public final void d(C8049dcz c8049dcz) {
                                C8632dsu.c((Object) c8049dcz, "");
                                List<C7969dbY> a2 = c8049dcz.a();
                                String str2 = str;
                                Iterator<C7969dbY> it = a2.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i2 = -1;
                                        break;
                                    } else if (C8632dsu.c((Object) it.next().e(), (Object) str2)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("position", String.valueOf(i2));
                                linkedHashMap.put("mode", "Swipe");
                                UserMarksFlexEventType.e.a(UserMarksFlexEventType.a, c8049dcz.a().get(i2).i(), c8049dcz.a().get(i2).g(), linkedHashMap);
                            }
                        });
                        UserMarksFragment.this.e(str);
                    }
                }));
                d dVar2 = this.n;
                AbstractC1403aA.e a2 = AbstractC1403aA.a(dVar2 != null ? dVar2.d() : null);
                d dVar3 = this.n;
                a2.d(dVar3 != null ? dVar3.b() : null).a().b(C8033dcj.class).c(new c());
                Q();
                e();
                Status status = InterfaceC1078Nw.aJ;
                C8632dsu.a(status, "");
                d(status);
            }

            /* loaded from: classes5.dex */
            public static final class c extends AbstractC1403aA.b<C8033dcj> {
                c() {
                }

                @Override // o.AbstractC1403aA.b
                /* renamed from: a */
                public void e(int i, int i2, C8033dcj c8033dcj, View view) {
                    UserMarksFragment.this.N().c(i, i2);
                }

                @Override // o.AbstractC1403aA.b
                /* renamed from: c */
                public void d(C8033dcj c8033dcj, View view) {
                    C8002dcE N = UserMarksFragment.this.N();
                    final UserMarksFragment userMarksFragment = UserMarksFragment.this;
                    C8980gu.c(N, new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$onViewCreated$4$onDragReleased$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                            d(c8049dcz);
                            return dpR.c;
                        }

                        public final void d(C8049dcz c8049dcz) {
                            C8632dsu.c((Object) c8049dcz, "");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("edit_mode_enabled", String.valueOf(c8049dcz.c()));
                            UserMarksFlexEventType.a.b(UserMarksFlexEventType.e, UserMarksFlexEventType.f13327o, null, linkedHashMap, 2, null);
                            UserMarksFragment.this.N().i();
                        }
                    });
                }
            }

            @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
            public void onDestroyView() {
                C3786bKp b2;
                super.onDestroyView();
                d dVar = this.n;
                if (dVar != null && (b2 = dVar.b()) != null) {
                    d(b2);
                }
                this.n = null;
            }

            private final void Q() {
                DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy$default(G().d(AbstractC8027dcd.class), (drM) null, (drO) null, new drM<AbstractC8027dcd, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$subscribeEvents$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(AbstractC8027dcd abstractC8027dcd) {
                        a(abstractC8027dcd);
                        return dpR.c;
                    }

                    public final void a(final AbstractC8027dcd abstractC8027dcd) {
                        Map<String, String> d2;
                        C8632dsu.c((Object) abstractC8027dcd, "");
                        if (abstractC8027dcd instanceof AbstractC8027dcd.d) {
                            C8002dcE N = UserMarksFragment.this.N();
                            final UserMarksFragment userMarksFragment = UserMarksFragment.this;
                            C8980gu.c(N, new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$subscribeEvents$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                                    b(c8049dcz);
                                    return dpR.c;
                                }

                                public final void b(C8049dcz c8049dcz) {
                                    AbstractC6729cim.b bVar;
                                    C8632dsu.c((Object) c8049dcz, "");
                                    int indexOf = c8049dcz.a().indexOf(((AbstractC8027dcd.d) AbstractC8027dcd.this).d());
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("position", String.valueOf(indexOf));
                                    UserMarksFlexEventType.e.a(UserMarksFlexEventType.g, ((AbstractC8027dcd.d) AbstractC8027dcd.this).d().i(), ((AbstractC8027dcd.d) AbstractC8027dcd.this).d().g(), linkedHashMap);
                                    C7969dbY b2 = c8049dcz.b();
                                    if (C8632dsu.c((Object) (b2 != null ? b2.e() : null), (Object) ((AbstractC8027dcd.d) AbstractC8027dcd.this).d().e())) {
                                        return;
                                    }
                                    bVar = userMarksFragment.p;
                                    if (bVar != null) {
                                        bVar.e();
                                    }
                                    userMarksFragment.N().a(((AbstractC8027dcd.d) AbstractC8027dcd.this).d());
                                }
                            });
                        } else if (abstractC8027dcd instanceof AbstractC8027dcd.c) {
                            C8980gu.c(UserMarksFragment.this.N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$subscribeEvents$1.2
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                                    d(c8049dcz);
                                    return dpR.c;
                                }

                                public final void d(C8049dcz c8049dcz) {
                                    C8632dsu.c((Object) c8049dcz, "");
                                    int indexOf = c8049dcz.a().indexOf(((AbstractC8027dcd.c) AbstractC8027dcd.this).c());
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("position", String.valueOf(indexOf));
                                    UserMarksFlexEventType.e.a(UserMarksFlexEventType.j, ((AbstractC8027dcd.c) AbstractC8027dcd.this).c().i(), ((AbstractC8027dcd.c) AbstractC8027dcd.this).c().g(), linkedHashMap);
                                }
                            });
                            UserMarksFragment.this.c(((AbstractC8027dcd.c) abstractC8027dcd).c());
                        } else if (abstractC8027dcd instanceof AbstractC8027dcd.e) {
                            C8980gu.c(UserMarksFragment.this.N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$subscribeEvents$1.3
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                                    d(c8049dcz);
                                    return dpR.c;
                                }

                                public final void d(C8049dcz c8049dcz) {
                                    C8632dsu.c((Object) c8049dcz, "");
                                    int indexOf = c8049dcz.a().indexOf(((AbstractC8027dcd.e) AbstractC8027dcd.this).e());
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("position", String.valueOf(indexOf));
                                    linkedHashMap.put("mode", "EditMode");
                                    UserMarksFlexEventType.e.a(UserMarksFlexEventType.a, ((AbstractC8027dcd.e) AbstractC8027dcd.this).e().i(), ((AbstractC8027dcd.e) AbstractC8027dcd.this).e().g(), linkedHashMap);
                                }
                            });
                            UserMarksFragment.this.e(((AbstractC8027dcd.e) abstractC8027dcd).e().e());
                        } else if (abstractC8027dcd instanceof AbstractC8027dcd.a) {
                            UserMarksFlexEventType.a aVar = UserMarksFlexEventType.e;
                            UserMarksFlexEventType userMarksFlexEventType = UserMarksFlexEventType.m;
                            AbstractC8027dcd.a aVar2 = (AbstractC8027dcd.a) abstractC8027dcd;
                            String i = aVar2.e().i();
                            int g = aVar2.e().g();
                            d2 = dqE.d();
                            aVar.a(userMarksFlexEventType, i, g, d2);
                            InterfaceC1126Pr I = UserMarksFragment.this.I();
                            String i2 = aVar2.e().i();
                            VideoType create = VideoType.create(aVar2.e().h());
                            C8632dsu.a(create, "");
                            String b2 = aVar2.e().b();
                            String c2 = C1333Xq.d(C8029dcf.j.j).d(SignupConstants.Field.VIDEO_TITLE, aVar2.e().j()).d("timestamp", C7969dbY.e.b(aVar2.e().g())).c();
                            C8632dsu.a(c2, "");
                            I.e(i2, create, b2, c2, (int) TimeUnit.MILLISECONDS.toSeconds(aVar2.e().g()), null);
                        }
                    }
                }, 3, (Object) null));
                DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy$default(G().d(AbstractC6719cic.class), (drM) null, (drO) null, new drM<AbstractC6719cic, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$subscribeEvents$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(AbstractC6719cic abstractC6719cic) {
                        e(abstractC6719cic);
                        return dpR.c;
                    }

                    public final void e(AbstractC6719cic abstractC6719cic) {
                        AbstractC6729cim.b bVar;
                        C8632dsu.c((Object) abstractC6719cic, "");
                        if (abstractC6719cic instanceof AbstractC6719cic.e.d) {
                            bVar = UserMarksFragment.this.p;
                            if (bVar != null) {
                                bVar.d(true);
                            }
                            C8002dcE N = UserMarksFragment.this.N();
                            final UserMarksFragment userMarksFragment = UserMarksFragment.this;
                            C8980gu.c(N, new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$subscribeEvents$2.1
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                /* renamed from: e */
                                public final dpR invoke(C8049dcz c8049dcz) {
                                    Map<String, String> d2;
                                    C8632dsu.c((Object) c8049dcz, "");
                                    C7969dbY b2 = c8049dcz.b();
                                    if (b2 != null) {
                                        UserMarksFragment userMarksFragment2 = UserMarksFragment.this;
                                        UserMarksFlexEventType.a aVar = UserMarksFlexEventType.e;
                                        UserMarksFlexEventType userMarksFlexEventType = UserMarksFlexEventType.l;
                                        String i = b2.i();
                                        int g = b2.g();
                                        d2 = dqE.d();
                                        aVar.a(userMarksFlexEventType, i, g, d2);
                                        userMarksFragment2.c(b2);
                                        return dpR.c;
                                    }
                                    return null;
                                }
                            });
                        }
                    }
                }, 3, (Object) null));
            }

            @Override // o.InterfaceC8894fN
            public void e() {
                M().e();
                C8980gu.c(N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$invalidate$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: d */
                    public final dpR invoke(C8049dcz c8049dcz) {
                        UserMarksFragment.d dVar;
                        UserMarksEpoxyController d2;
                        C8632dsu.c((Object) c8049dcz, "");
                        dVar = UserMarksFragment.this.n;
                        if (dVar == null || (d2 = dVar.d()) == null) {
                            return null;
                        }
                        d2.setData(c8049dcz);
                        return dpR.c;
                    }
                });
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
                bD_();
            }

            @Override // androidx.core.view.MenuProvider
            public void onCreateMenu(final Menu menu, MenuInflater menuInflater) {
                C8632dsu.c((Object) menu, "");
                C8632dsu.c((Object) menuInflater, "");
                menuInflater.inflate(C8029dcf.d.e, menu);
                C8980gu.c(N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$onCreateMenu$1
                    private static int c = 0;
                    private static int e = 1;
                    private static byte e$ss2$43 = 24;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                        c(c8049dcz);
                        return dpR.c;
                    }

                    public final void c(C8049dcz c8049dcz) {
                        int i;
                        int i2 = 2 % 2;
                        int i3 = e + 29;
                        c = i3 % 128;
                        int i4 = i3 % 2;
                        C8632dsu.c((Object) c8049dcz, "");
                        MenuItem findItem = menu.findItem(C8029dcf.a.b);
                        Context requireContext = this.requireContext();
                        if (c8049dcz.c()) {
                            int i5 = e + 87;
                            c = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i6 = C8029dcf.j.b;
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            i = C8029dcf.j.b;
                        } else {
                            i = C8029dcf.j.c;
                        }
                        String string = requireContext.getString(i);
                        if (!(!string.startsWith("'!#+"))) {
                            Object[] objArr = new Object[1];
                            b(string.substring(4), objArr);
                            string = ((String) objArr[0]).intern();
                            int i7 = c + 101;
                            e = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        MenuItemCompat.setContentDescription(findItem, string);
                    }

                    private void b(String str, Object[] objArr) {
                        byte[] decode = Base64.decode(str, 0);
                        byte[] bArr = new byte[decode.length];
                        for (int i = 0; i < decode.length; i++) {
                            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$43);
                        }
                        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
                    }
                });
            }

            @Override // androidx.core.view.MenuProvider
            public boolean onMenuItemSelected(MenuItem menuItem) {
                C8632dsu.c((Object) menuItem, "");
                int itemId = menuItem.getItemId();
                if (itemId == C8029dcf.a.a) {
                    L();
                } else if (itemId != C8029dcf.a.b) {
                    return false;
                } else {
                    C8980gu.c(N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$onMenuItemSelected$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                            d(c8049dcz);
                            return dpR.c;
                        }

                        public final void d(C8049dcz c8049dcz) {
                            C8632dsu.c((Object) c8049dcz, "");
                            UserMarksFragment.this.N().c(!c8049dcz.c());
                        }
                    });
                }
                return true;
            }

            private final void L() {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C9834xU.o.c);
                builder.setTitle(C8029dcf.j.f);
                builder.setMessage(C8029dcf.j.g);
                builder.setPositiveButton(C8029dcf.j.i, new DialogInterface.OnClickListener() { // from class: o.dcu
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        UserMarksFragment.b(UserMarksFragment.this, dialogInterface, i);
                    }
                });
                builder.setNegativeButton(R.o.cL, (DialogInterface.OnClickListener) null);
                builder.show();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(UserMarksFragment userMarksFragment, DialogInterface dialogInterface, int i) {
                C8632dsu.c((Object) userMarksFragment, "");
                userMarksFragment.N().f();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void c(final C7969dbY c7969dbY) {
                C8980gu.c(N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$playUserMarkFullscreen$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: e */
                    public final dpR invoke(C8049dcz c8049dcz) {
                        C8632dsu.c((Object) c8049dcz, "");
                        int indexOf = c8049dcz.a().indexOf(C7969dbY.this);
                        final NetflixActivity bj_ = this.bj_();
                        if (bj_ != null) {
                            final UserMarksFragment userMarksFragment = this;
                            C7969dbY c7969dbY2 = C7969dbY.this;
                            String i = c7969dbY2.i();
                            VideoType create = VideoType.create(c7969dbY2.h());
                            PlayContext playContext = PlayContextImp.w;
                            PlayerExtras playerExtras = new PlayerExtras(c7969dbY2.g(), 0L, 0, false, false, null, false, AppView.userMarksHome, 0L, 0.0f, null, null, null, new C7593czD(true, indexOf, c8049dcz.a()), null, 24446, null);
                            C8632dsu.d(create);
                            C8632dsu.d(playContext);
                            userMarksFragment.F().get().c(i, create, playContext, playerExtras, bj_, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$playUserMarkFullscreen$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(Boolean bool) {
                                    b(bool.booleanValue());
                                    return dpR.c;
                                }

                                public final void b(boolean z) {
                                    if (z || !NetflixActivity.this.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                                        return;
                                    }
                                    C8054ddD.c(userMarksFragment.bj_(), C9834xU.h.j, 1);
                                }
                            });
                            return dpR.c;
                        }
                        return null;
                    }
                });
            }

            @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
            public boolean y() {
                return J();
            }

            @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
            public boolean o() {
                return J();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void e(final String str) {
                if (str != null) {
                    if (this.f13328o) {
                        C8980gu.c(N(), new drM<C8049dcz, dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$removeMark$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
                                a(c8049dcz);
                                return dpR.c;
                            }

                            public final void a(C8049dcz c8049dcz) {
                                AbstractC6729cim.b bVar;
                                C7969dbY c7969dbY;
                                AbstractC6729cim.b bVar2;
                                C8632dsu.c((Object) c8049dcz, "");
                                String str2 = str;
                                C7969dbY b2 = c8049dcz.b();
                                if (C8632dsu.c((Object) str2, (Object) (b2 != null ? b2.e() : null))) {
                                    List<C7969dbY> a = c8049dcz.a();
                                    String str3 = str;
                                    Iterator<C7969dbY> it = a.iterator();
                                    int i = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i = -1;
                                            break;
                                        } else if (C8632dsu.c((Object) it.next().e(), (Object) str3)) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                    if (c8049dcz.a().size() > 1) {
                                        if (i == 0) {
                                            c7969dbY = c8049dcz.a().get(1);
                                        } else {
                                            c7969dbY = c8049dcz.a().get(i - 1);
                                        }
                                        bVar2 = this.p;
                                        if (bVar2 != null) {
                                            bVar2.e();
                                        }
                                        this.N().a(c7969dbY);
                                        return;
                                    }
                                    bVar = this.p;
                                    if (bVar != null) {
                                        bVar.d(true);
                                    }
                                }
                            }
                        });
                    }
                    N().d(str);
                }
            }

            private final boolean J() {
                return ((Boolean) C8980gu.c(N(), new drM<C8049dcz, Boolean>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment$maybeClearEditMode$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: b */
                    public final Boolean invoke(C8049dcz c8049dcz) {
                        C8632dsu.c((Object) c8049dcz, "");
                        if (c8049dcz.c()) {
                            UserMarksFragment.this.N().c(false);
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    }
                })).booleanValue();
            }

            private final void c(RecyclerView recyclerView) {
                C1619aI c2;
                d dVar = this.n;
                if (dVar == null || (c2 = dVar.c()) == null) {
                    return;
                }
                c2.d(recyclerView);
            }

            private final void d(RecyclerView recyclerView) {
                C1619aI c2;
                d dVar = this.n;
                if (dVar == null || (c2 = dVar.c()) == null) {
                    return;
                }
                c2.c(recyclerView);
            }
        }

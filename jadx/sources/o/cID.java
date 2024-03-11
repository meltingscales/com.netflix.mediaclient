package o;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.mvrx.lifecycleAwareLazy;
import javax.inject.Inject;
import o.AbstractC5822cJq;
import o.AbstractC5823cJr;
import o.AbstractC5824cJs;
import o.AbstractC5826cJu;
import o.C1572aGg;
import o.C5836cKd;
import o.C8632dsu;
import o.C8903fW;
import o.C8916fj;
import o.C8983gx;
import o.InterfaceC1570aGe;
import o.InterfaceC1571aGf;
import o.InterfaceC8660dtv;
import o.cBO;
import o.cBQ;
import o.cBR;
import o.cID;
import o.cIF;
import o.cIG;
import o.cII;
import o.cJB;
import o.cJC;
import o.cJD;
import o.cJE;
import o.cJF;
import o.dpR;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;

/* loaded from: classes4.dex */
public final class cID implements cIH {
    public static final b a = new b(null);
    public static final int b = 8;
    private final InterfaceC8554dpx c;
    private final InterfaceC1570aGe d;

    @Inject
    public cID(final Activity activity, InterfaceC1570aGe interfaceC1570aGe) {
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC1570aGe, "");
        this.d = interfaceC1570aGe;
        b2 = dpB.b(new drO<cIF>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$playerUIViewModel$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final cIF invoke() {
                Activity activity2 = activity;
                C8632dsu.d(activity2);
                final ComponentActivity componentActivity = (ComponentActivity) activity2;
                final InterfaceC8660dtv a2 = dsA.a(cIF.class);
                return (cIF) new lifecycleAwareLazy(componentActivity, null, new drO<cIF>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$playerUIViewModel$2$invoke$$inlined$viewModel$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [o.cIF, o.fS] */
                    @Override // o.drO
                    /* renamed from: a */
                    public final cIF invoke() {
                        C8903fW c8903fW = C8903fW.c;
                        Class e = drI.e(InterfaceC8660dtv.this);
                        ComponentActivity componentActivity2 = componentActivity;
                        Bundle extras = componentActivity2.getIntent().getExtras();
                        C8916fj c8916fj = new C8916fj(componentActivity2, extras != null ? extras.get("mavericks:arg") : null, null, null, 12, null);
                        String name = drI.e(a2).getName();
                        C8632dsu.a(name, "");
                        return C8903fW.e(c8903fW, e, C5836cKd.class, c8916fj, name, false, null, 48, null);
                    }
                }, 2, null).getValue();
            }
        });
        this.c = b2;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PlayerControlsComposeImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cIF b() {
        return (cIF) this.c.getValue();
    }

    @Override // o.cIH
    public void d(ViewGroup viewGroup, final drM<? super cBO, dpR> drm) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) drm, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cII.d.b, viewGroup, false);
        viewGroup.addView(inflate);
        C8632dsu.d(inflate);
        ((ComposeView) inflate).setContent(ComposableLambdaKt.composableLambdaInstance(-171800162, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$initialize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                e(composer, num.intValue());
                return dpR.c;
            }

            public final void e(Composer composer, int i) {
                cIF b2;
                InterfaceC1570aGe interfaceC1570aGe;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-171800162, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl.initialize.<anonymous> (PlayerControlsComposeImpl.kt:65)");
                    }
                    b2 = cID.this.b();
                    final State e = C8983gx.e(b2, composer, 8);
                    interfaceC1570aGe = cID.this.d;
                    InterfaceC1571aGf a2 = interfaceC1570aGe.a();
                    final cID cid = cID.this;
                    final drM<cBO, dpR> drm2 = drm;
                    C1572aGg.b(a2, ComposableLambdaKt.composableLambda(composer, 1734324973, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$initialize$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                            b(composer2, num.intValue());
                            return dpR.c;
                        }

                        public final void b(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1734324973, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl.initialize.<anonymous>.<anonymous> (PlayerControlsComposeImpl.kt:68)");
                                }
                                C5836cKd d = PlayerControlsComposeImpl$initialize$1.d(e);
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                                final cID cid2 = cid;
                                final drM<cBO, dpR> drm3 = drm2;
                                cIG.e(d, fillMaxSize$default, new drM<cJF, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl.initialize.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // o.drM
                                    public /* synthetic */ dpR invoke(cJF cjf) {
                                        c(cjf);
                                        return dpR.c;
                                    }

                                    public final void c(cJF cjf) {
                                        C8632dsu.c((Object) cjf, "");
                                        cID.this.a(cjf, drm3);
                                    }
                                }, composer2, 56, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composer, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5836cKd d(State<C5836cKd> state) {
                return state.getValue();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(cJF cjf, drM<? super cBO, dpR> drm) {
        if (cjf instanceof C5825cJt) {
            drm.invoke(cBO.C5567c.c);
        } else if (cjf instanceof C5828cJw) {
            drm.invoke(cBO.F.a);
        } else if (cjf instanceof cJA) {
            drm.invoke(cBO.H.d);
        } else if (cjf instanceof C5831cJz) {
            drm.invoke(new cBO.C5572h(true));
        } else if (cjf instanceof C5830cJy) {
            drm.invoke(new cBO.C5572h(false));
            b().h();
        } else if (cjf instanceof C5829cJx) {
            drm.invoke(cBO.G.c);
        } else if (cjf instanceof C5827cJv) {
            drm.invoke(cBO.C.d);
        } else if (cjf instanceof cJD) {
            c((cJD) cjf, drm);
        } else if (cjf instanceof AbstractC5822cJq) {
            e((AbstractC5822cJq) cjf, drm);
        } else if (cjf instanceof cJC) {
            a((cJC) cjf, drm);
        } else if (cjf instanceof cJB) {
            c((cJB) cjf, drm);
        } else if (cjf instanceof cJE) {
            a((cJE) cjf, drm);
        } else if (cjf instanceof AbstractC5823cJr) {
            a((AbstractC5823cJr) cjf, drm);
        } else if (cjf instanceof AbstractC5824cJs) {
            a((AbstractC5824cJs) cjf, drm);
        } else if (cjf instanceof AbstractC5826cJu) {
            c((AbstractC5826cJu) cjf, drm);
        }
    }

    private final void c(cJD cjd, drM<? super cBO, dpR> drm) {
        if (cjd instanceof cJD.c) {
            drm.invoke(cBO.C5581q.d);
        } else if (cjd instanceof cJD.d) {
            drm.invoke(cBO.C5581q.d);
        }
    }

    private final void e(AbstractC5822cJq abstractC5822cJq, drM<? super cBO, dpR> drm) {
        if (abstractC5822cJq instanceof AbstractC5822cJq.b) {
            drm.invoke(cBO.Q.e);
        } else if (abstractC5822cJq instanceof AbstractC5822cJq.a) {
            drm.invoke(new cBO.W(((AbstractC5822cJq.a) abstractC5822cJq).c()));
        } else if (abstractC5822cJq instanceof AbstractC5822cJq.d) {
            drm.invoke(new cBO.C5566b(((AbstractC5822cJq.d) abstractC5822cJq).d()));
        }
    }

    private final void a(cJC cjc, final drM<? super cBO, dpR> drm) {
        if (C8632dsu.c(cjc, cJC.e.d)) {
            b().d(false, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$onTappableContainerEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    drm.invoke(cBO.X.a);
                    drm.invoke(new cBO.C5582r(true, 10000, false, 0, 8, null));
                }
            });
        } else if (C8632dsu.c(cjc, cJC.c.a)) {
            b().d(true, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$onTappableContainerEvent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    drm.invoke(cBO.X.a);
                    drm.invoke(new cBO.C5582r(false, 10000, false, 0, 8, null));
                }
            });
        } else if (C8632dsu.c(cjc, cJC.b.e)) {
            b().c(new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$onTappableContainerEvent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    e(bool.booleanValue());
                    return dpR.c;
                }

                public final void e(boolean z) {
                    if (z) {
                        drm.invoke(cBO.C5568d.e);
                    } else {
                        drm.invoke(cBO.I.b);
                    }
                }
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$onTappableContainerEvent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    drm.invoke(cBR.e.b.a);
                }
            });
        } else if (C8632dsu.c(cjc, cJC.a.b)) {
            b().d(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$onTappableContainerEvent$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    drm.invoke(cBO.C5576l.c);
                }
            });
        } else if (C8632dsu.c(cjc, cJC.d.a)) {
            b().d(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerControlsComposeImpl$onTappableContainerEvent$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    drm.invoke(cBO.C5580p.c);
                }
            });
        }
    }

    private final void c(cJB cjb, drM<? super cBO, dpR> drm) {
        if (cjb instanceof cJB.b) {
            b().f();
        } else if (cjb instanceof cJB.d) {
            drm.invoke(new cBO.C5584t(((cJB.d) cjb).d()));
            drm.invoke(cBO.X.a);
        } else if (cjb instanceof cJB.e) {
            cJB.e eVar = (cJB.e) cjb;
            drm.invoke(new cBO.C5582r(eVar.e(), eVar.d() * 10000, false, 0, 8, null));
        }
    }

    private final void a(cJE cje, drM<? super cBO, dpR> drm) {
        if (cje instanceof cJE.c) {
            cJE.c cVar = (cJE.c) cje;
            b().c(cVar.d(), cVar.c(), cVar.b());
            drm.invoke(cBO.X.a);
            drm.invoke(new cBO.C5577m(cVar.d(), cVar.c()));
        } else if (cje instanceof cJE.d) {
            cJE.d dVar = (cJE.d) cje;
            b().a(dVar.b(), dVar.e(), dVar.c());
            drm.invoke(new cBO.C5579o(dVar.b(), dVar.e(), dVar.d()));
        } else if (cje instanceof cJE.a) {
            cJE.a aVar = (cJE.a) cje;
            b().e(aVar.e());
            drm.invoke(cBO.X.a);
            drm.invoke(new cBO.C5582r(aVar.d(), aVar.e(), aVar.c(), aVar.b()));
        } else if (cje instanceof cJE.b) {
            cJE.b bVar = (cJE.b) cje;
            if (bVar.a()) {
                b().b(cII.c.m);
                return;
            }
            b().k();
            drm.invoke(new cBO.C5582r(false, bVar.b(), true, 0, 8, null));
        }
    }

    private final void a(AbstractC5823cJr abstractC5823cJr, drM<? super cBO, dpR> drm) {
        if (abstractC5823cJr instanceof AbstractC5823cJr.c) {
            b().j();
            return;
        }
        if (abstractC5823cJr instanceof AbstractC5823cJr.e) {
            String e = ((AbstractC5823cJr.e) abstractC5823cJr).e();
            drm.invoke(new cBQ.h(e != null ? e : "", 0));
        } else if (abstractC5823cJr instanceof AbstractC5823cJr.a) {
            String c = ((AbstractC5823cJr.a) abstractC5823cJr).c();
            drm.invoke(new cBQ.h(c != null ? c : "", 1));
        }
    }

    private final void a(AbstractC5824cJs abstractC5824cJs, drM<? super cBO, dpR> drm) {
        if (C8632dsu.c(abstractC5824cJs, AbstractC5824cJs.d.c)) {
            drm.invoke(cBR.d.c.e);
        } else if (C8632dsu.c(abstractC5824cJs, AbstractC5824cJs.e.a)) {
            drm.invoke(cBR.d.a.c);
        }
    }

    private final void c(AbstractC5826cJu abstractC5826cJu, drM<? super cBO, dpR> drm) {
        if (C8632dsu.c(abstractC5826cJu, AbstractC5826cJu.b.a)) {
            drm.invoke(cBR.e.C0109e.d);
        } else if (C8632dsu.c(abstractC5826cJu, AbstractC5826cJu.c.a)) {
            drm.invoke(cBR.e.d.a);
        } else if (C8632dsu.c(abstractC5826cJu, AbstractC5826cJu.i.c)) {
            drm.invoke(cBR.e.f.e);
        } else if (C8632dsu.c(abstractC5826cJu, AbstractC5826cJu.a.b)) {
            b().g();
            drm.invoke(cBR.e.c.c);
        } else if (C8632dsu.c(abstractC5826cJu, AbstractC5826cJu.d.e)) {
            b().i();
            drm.invoke(cBR.e.a.e);
        } else if (C8632dsu.c(abstractC5826cJu, AbstractC5826cJu.e.e)) {
            drm.invoke(cBO.C5565a.c);
        }
    }

    @Override // o.cIH
    public void b(cBA cba) {
        C8632dsu.c((Object) cba, "");
        b().c(cba);
    }
}

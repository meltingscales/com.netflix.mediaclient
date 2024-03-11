package com.netflix.mediaclient.android.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC1186Rz;
import o.C1572aGg;
import o.C8153dex;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC1571aGf;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8812dzl;
import o.InterfaceC8822dzv;
import o.LA;
import o.aGE;
import o.bXD;
import o.dpB;
import o.dpR;
import o.drO;
import o.drX;
import o.dwQ;
import o.dwU;
import o.dwY;
import o.dxK;
import o.dxZ;
import o.dyQ;
import o.dyS;
import o.dzB;

@SuppressLint({"ViewConstructor"})
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class NetflixActionBarInterstitials extends AbstractC1186Rz {
    private final dwU a;
    private final InterfaceC8812dzl<Boolean> c;
    private final InterfaceC8554dpx<ComposeView> d;
    private final dyS<Boolean> e;
    @Inject
    public bXD interstitials;
    @Inject
    public dwQ mainDispatcher;

    public final dyS<Boolean> j() {
        return this.e;
    }

    public final void setInterstitials(bXD bxd) {
        C8632dsu.c((Object) bxd, "");
        this.interstitials = bxd;
    }

    public final void setMainDispatcher(dwQ dwq) {
        C8632dsu.c((Object) dwq, "");
        this.mainDispatcher = dwq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixActionBarInterstitials(final Context context, View view) {
        super(context);
        InterfaceC8554dpx<ComposeView> b;
        C8632dsu.c((Object) context, "");
        b = dpB.b(new drO<ComposeView>() { // from class: com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials$composeViewDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final ComposeView invoke() {
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setId(R.g.f);
                composeView.setBackgroundResource(0);
                this.addView(composeView, new LinearLayout.LayoutParams(-1, -2));
                return composeView;
            }
        });
        this.d = b;
        dwU c = dwY.c(dxZ.d(null, 1, null).plus(d()));
        this.a = c;
        InterfaceC8812dzl<Boolean> d = dzB.d(Boolean.FALSE);
        this.c = d;
        this.e = d;
        setOrientation(1);
        setLayoutTransition(new LayoutTransition());
        addView(view, new LinearLayout.LayoutParams(-1, -2));
        C8737dwr.c(c, null, null, new AnonymousClass1(null), 3, null);
    }

    public final bXD c() {
        bXD bxd = this.interstitials;
        if (bxd != null) {
            return bxd;
        }
        C8632dsu.d("");
        return null;
    }

    public final dwQ d() {
        dwQ dwq = this.mainDispatcher;
        if (dwq != null) {
            return dwq;
        }
        C8632dsu.d("");
        return null;
    }

    /* renamed from: com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int c;

        AnonymousClass1(InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: b */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.c;
            if (i == 0) {
                C8556dpz.d(obj);
                InterfaceC8822dzv<drX<Composer, Integer, dpR>> d = NetflixActionBarInterstitials.this.c().d();
                final NetflixActionBarInterstitials netflixActionBarInterstitials = NetflixActionBarInterstitials.this;
                dyQ<? super drX<Composer, Integer, dpR>> dyq = new dyQ() { // from class: com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials.1.2
                    @Override // o.dyQ
                    /* renamed from: e */
                    public final Object emit(final drX<? super Composer, ? super Integer, dpR> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        if (drx == null) {
                            if (NetflixActionBarInterstitials.this.d.isInitialized()) {
                                ((View) NetflixActionBarInterstitials.this.d.getValue()).setVisibility(8);
                            }
                            NetflixActionBarInterstitials.this.c.d(C8589dre.e(false));
                        } else {
                            ComposeView composeView = (ComposeView) NetflixActionBarInterstitials.this.d.getValue();
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1578504046, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // o.drX
                                public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                                    d(composer, num.intValue());
                                    return dpR.c;
                                }

                                public final void d(Composer composer, int i2) {
                                    final Modifier modifier;
                                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1578504046, i2, -1, "com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials.<anonymous>.<anonymous>.<anonymous> (NetflixActionBarInterstitials.kt:83)");
                                        }
                                        composer.startReplaceableGroup(1692770901);
                                        if (C8153dex.f()) {
                                            RoundedCornerShape m399RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.b.a, composer, 0));
                                            modifier = ShadowKt.m1073shadows4CzXII$default(BorderKt.m114borderxT4_qwU(PaddingKt.m274paddingVpY3zN4(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(R.b.b, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.b.c, composer, 0)), Dp.m2492constructorimpl(1), LA.e(Token.Color.C0427ao.d), m399RoundedCornerShape0680j_4), Dp.m2492constructorimpl(8), m399RoundedCornerShape0680j_4, true, 0L, 0L, 24, null);
                                        } else {
                                            modifier = Modifier.Companion;
                                        }
                                        composer.endReplaceableGroup();
                                        InterfaceC1571aGf c = aGE.c((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                                        final drX<Composer, Integer, dpR> drx2 = drx;
                                        C1572aGg.b(c, ComposableLambdaKt.composableLambda(composer, 1106913533, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials$1$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // o.drX
                                            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                                                a(composer2, num.intValue());
                                                return dpR.c;
                                            }

                                            public final void a(Composer composer2, int i3) {
                                                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1106913533, i3, -1, "com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetflixActionBarInterstitials.kt:104)");
                                                    }
                                                    Modifier modifier2 = Modifier.this;
                                                    drX<Composer, Integer, dpR> drx3 = drx2;
                                                    composer2.startReplaceableGroup(733328855);
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                                    composer2.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                                    drO<ComposeUiNode> constructor = companion.getConstructor();
                                                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
                                                    if (!(composer2.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                                                    Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                                                    composer2.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    drx3.invoke(composer2, 0);
                                                    composer2.endReplaceableGroup();
                                                    composer2.endNode();
                                                    composer2.endReplaceableGroup();
                                                    composer2.endReplaceableGroup();
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
                            }));
                            composeView.setVisibility(0);
                            NetflixActionBarInterstitials.this.c.d(C8589dre.e(true));
                        }
                        return dpR.c;
                    }
                };
                this.c = 1;
                if (d.collect(dyq, this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        dxK.b(this.a.getCoroutineContext(), null, 1, null);
        super.onDetachedFromWindow();
    }
}

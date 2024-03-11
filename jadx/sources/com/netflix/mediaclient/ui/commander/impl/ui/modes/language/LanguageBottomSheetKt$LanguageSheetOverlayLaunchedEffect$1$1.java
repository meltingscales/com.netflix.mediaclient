package com.netflix.mediaclient.ui.commander.impl.ui.modes.language;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.netflix.mediaclient.ui.commander.impl.presenter.AudioSubtitlesScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1293Wc;
import o.C3581bDd;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8478dnb;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.bCO;
import o.bCT;
import o.dmW;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class LanguageBottomSheetKt$LanguageSheetOverlayLaunchedEffect$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dmW a;
    final /* synthetic */ Modifier b;
    int c;
    final /* synthetic */ MutableState<Integer> d;
    final /* synthetic */ ControllerScreen.c.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageBottomSheetKt$LanguageSheetOverlayLaunchedEffect$1$1(ControllerScreen.c.e eVar, dmW dmw, Modifier modifier, MutableState<Integer> mutableState, InterfaceC8585dra<? super LanguageBottomSheetKt$LanguageSheetOverlayLaunchedEffect$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = eVar;
        this.a = dmw;
        this.b = modifier;
        this.d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LanguageBottomSheetKt$LanguageSheetOverlayLaunchedEffect$1$1(this.e, this.a, this.b, this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LanguageBottomSheetKt$LanguageSheetOverlayLaunchedEffect$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object c0056e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            if (this.e.b().i()) {
                C1293Wc j = this.e.c().j();
                if (j != null) {
                    c0056e = new AudioSubtitlesScreen.e.a(j, this.e.b().i());
                } else {
                    c0056e = new AudioSubtitlesScreen.e.C0056e(this.e.b().i());
                }
                dmW dmw = this.a;
                final Modifier modifier = this.b;
                final ControllerScreen.c.e eVar = this.e;
                final MutableState<Integer> mutableState = this.d;
                C3581bDd c3581bDd = new C3581bDd(c0056e, ComposableLambdaKt.composableLambdaInstance(1945453304, true, new InterfaceC8613dsb<AudioSubtitlesScreen.e, InterfaceC8478dnb<Object>, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheetKt$LanguageSheetOverlayLaunchedEffect$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(AudioSubtitlesScreen.e eVar2, InterfaceC8478dnb<Object> interfaceC8478dnb, Composer composer, Integer num) {
                        a(eVar2, interfaceC8478dnb, composer, num.intValue());
                        return dpR.c;
                    }

                    public final void a(final AudioSubtitlesScreen.e eVar2, InterfaceC8478dnb<Object> interfaceC8478dnb, Composer composer, int i2) {
                        C8632dsu.c((Object) eVar2, "");
                        C8632dsu.c((Object) interfaceC8478dnb, "");
                        if ((i2 & 14) == 0) {
                            i2 |= composer.changed(eVar2) ? 4 : 2;
                        }
                        if ((i2 & 651) != 130 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1945453304, i2, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageSheetOverlayLaunchedEffect.<anonymous>.<anonymous>.<anonymous> (LanguageBottomSheet.kt:65)");
                            }
                            final ControllerScreen.c.e eVar3 = eVar;
                            final MutableState<Integer> mutableState2 = mutableState;
                            bCT.e(eVar2, ComposableLambdaKt.composableLambda(composer, -450912152, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheetKt.LanguageSheetOverlayLaunchedEffect.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // o.drX
                                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                                    a(composer2, num.intValue());
                                    return dpR.c;
                                }

                                public final void a(Composer composer2, int i3) {
                                    int d;
                                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-450912152, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageSheetOverlayLaunchedEffect.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LanguageBottomSheet.kt:68)");
                                        }
                                        d = bCT.d(mutableState2);
                                        drM<ControllerScreen.e, dpR> d2 = ControllerScreen.c.e.this.d();
                                        AudioSubtitlesScreen.e eVar4 = eVar2;
                                        composer2.startReplaceableGroup(-737627055);
                                        final MutableState<Integer> mutableState3 = mutableState2;
                                        Object rememberedValue = composer2.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheetKt$LanguageSheetOverlayLaunchedEffect$1$1$1$1$1$1
                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final void d(int i4) {
                                                    bCT.c(mutableState3, i4);
                                                }

                                                @Override // o.drM
                                                public /* synthetic */ dpR invoke(Integer num) {
                                                    d(num.intValue());
                                                    return dpR.c;
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue);
                                        }
                                        composer2.endReplaceableGroup();
                                        bCO.d(eVar4, d, (drM) rememberedValue, null, d2, composer2, 384, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), Modifier.this, eVar.d(), composer, (i2 & 14) | 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }));
                this.c = 1;
                if (dmw.e(c3581bDd, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}

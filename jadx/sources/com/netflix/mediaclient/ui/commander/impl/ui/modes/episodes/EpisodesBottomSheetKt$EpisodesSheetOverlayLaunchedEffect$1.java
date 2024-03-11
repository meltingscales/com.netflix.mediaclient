package com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.EpisodesScreen;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1291Wa;
import o.C3581bDd;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8478dnb;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.VW;
import o.bCH;
import o.bCI;
import o.dmW;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class EpisodesBottomSheetKt$EpisodesSheetOverlayLaunchedEffect$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Integer a;
    final /* synthetic */ List<VW> b;
    final /* synthetic */ dmW c;
    final /* synthetic */ String d;
    final /* synthetic */ Modifier e;
    int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ ControllerScreen.c.e h;
    final /* synthetic */ boolean i;
    final /* synthetic */ List<C1291Wa> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodesBottomSheetKt$EpisodesSheetOverlayLaunchedEffect$1(boolean z, boolean z2, List<C1291Wa> list, String str, List<VW> list2, Integer num, dmW dmw, Modifier modifier, ControllerScreen.c.e eVar, InterfaceC8585dra<? super EpisodesBottomSheetKt$EpisodesSheetOverlayLaunchedEffect$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.g = z;
        this.i = z2;
        this.j = list;
        this.d = str;
        this.b = list2;
        this.a = num;
        this.c = dmw;
        this.e = modifier;
        this.h = eVar;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((EpisodesBottomSheetKt$EpisodesSheetOverlayLaunchedEffect$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new EpisodesBottomSheetKt$EpisodesSheetOverlayLaunchedEffect$1(this.g, this.i, this.j, this.d, this.b, this.a, this.c, this.e, this.h, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object eVar;
        String str;
        List<VW> list;
        e = C8586drb.e();
        int i = this.f;
        if (i == 0) {
            C8556dpz.d(obj);
            if (this.g || this.i) {
                List<C1291Wa> list2 = this.j;
                if (list2 != null && (!list2.isEmpty()) && (str = this.d) != null && str.length() > 0 && (list = this.b) != null && (!list.isEmpty())) {
                    List<C1291Wa> list3 = this.j;
                    Integer num = this.a;
                    eVar = new EpisodesScreen.d.C0061d(list3, num != null ? num.intValue() : 0, this.d, this.b, true, this.i);
                } else {
                    eVar = new EpisodesScreen.d.e(true);
                }
                dmW dmw = this.c;
                final Modifier modifier = this.e;
                final ControllerScreen.c.e eVar2 = this.h;
                C3581bDd c3581bDd = new C3581bDd(eVar, ComposableLambdaKt.composableLambdaInstance(1580536025, true, new InterfaceC8613dsb<EpisodesScreen.d, InterfaceC8478dnb<Object>, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheetKt$EpisodesSheetOverlayLaunchedEffect$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(EpisodesScreen.d dVar, InterfaceC8478dnb<Object> interfaceC8478dnb, Composer composer, Integer num2) {
                        b(dVar, interfaceC8478dnb, composer, num2.intValue());
                        return dpR.c;
                    }

                    public final void b(final EpisodesScreen.d dVar, InterfaceC8478dnb<Object> interfaceC8478dnb, Composer composer, int i2) {
                        C8632dsu.c((Object) dVar, "");
                        C8632dsu.c((Object) interfaceC8478dnb, "");
                        if ((i2 & 14) == 0) {
                            i2 |= composer.changed(dVar) ? 4 : 2;
                        }
                        if ((i2 & 651) != 130 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1580536025, i2, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesSheetOverlayLaunchedEffect.<anonymous>.<anonymous> (EpisodesBottomSheet.kt:79)");
                            }
                            final ControllerScreen.c.e eVar3 = eVar2;
                            bCI.c(dVar, ComposableLambdaKt.composableLambda(composer, 1629810633, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheetKt.EpisodesSheetOverlayLaunchedEffect.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // o.drX
                                public /* synthetic */ dpR invoke(Composer composer2, Integer num2) {
                                    b(composer2, num2.intValue());
                                    return dpR.c;
                                }

                                public final void b(Composer composer2, int i3) {
                                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1629810633, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesSheetOverlayLaunchedEffect.<anonymous>.<anonymous>.<anonymous> (EpisodesBottomSheet.kt:82)");
                                        }
                                        bCH.c(EpisodesScreen.d.this, null, 0.0f, eVar3.d(), composer2, 0, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), Modifier.this, eVar2.d(), composer, (i2 & 14) | 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }));
                this.f = 1;
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

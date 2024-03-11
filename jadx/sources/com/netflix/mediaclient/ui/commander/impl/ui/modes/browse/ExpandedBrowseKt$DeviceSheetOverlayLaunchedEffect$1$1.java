package com.netflix.mediaclient.ui.commander.impl.ui.modes.browse;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3581bDd;
import o.C8556dpz;
import o.C8569dql;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8478dnb;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.bBT;
import o.dmW;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ControllerScreen.c.e a;
    final /* synthetic */ dmW b;
    final /* synthetic */ Modifier c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1(ControllerScreen.c.e eVar, dmW dmw, Modifier modifier, InterfaceC8585dra<? super ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = eVar;
        this.b = dmw;
        this.c = modifier;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1(this.a, this.b, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        List i;
        e = C8586drb.e();
        int i2 = this.d;
        if (i2 == 0) {
            C8556dpz.d(obj);
            if (this.a.b().a()) {
                dmW dmw = this.b;
                ConnectionState a = this.a.a();
                i = C8569dql.i();
                DeviceSheetScreen.a.C0059a c0059a = new DeviceSheetScreen.a.C0059a(a, i, null, null, false, false, this.a.b().a(), this.a.b().a(), this.a.c().e(), null, null, null, null, 7724, null);
                final ControllerScreen.c.e eVar = this.a;
                final Modifier modifier = this.c;
                C3581bDd c3581bDd = new C3581bDd(c0059a, ComposableLambdaKt.composableLambdaInstance(837881524, true, new InterfaceC8613dsb<DeviceSheetScreen.a.C0059a, InterfaceC8478dnb<Object>, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(DeviceSheetScreen.a.C0059a c0059a2, InterfaceC8478dnb<Object> interfaceC8478dnb, Composer composer, Integer num) {
                        a(c0059a2, interfaceC8478dnb, composer, num.intValue());
                        return dpR.c;
                    }

                    public final void a(DeviceSheetScreen.a.C0059a c0059a2, InterfaceC8478dnb<Object> interfaceC8478dnb, Composer composer, int i3) {
                        C8632dsu.c((Object) c0059a2, "");
                        C8632dsu.c((Object) interfaceC8478dnb, "");
                        if ((i3 & 14) == 0) {
                            i3 |= composer.changed(c0059a2) ? 4 : 2;
                        }
                        if ((i3 & 651) != 130 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(837881524, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.DeviceSheetOverlayLaunchedEffect.<anonymous>.<anonymous>.<anonymous> (ExpandedBrowse.kt:200)");
                            }
                            bBT.a(c0059a2, modifier, ControllerScreen.c.e.this.d(), composer, i3 & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }));
                this.d = 1;
                if (dmw.e(c3581bDd, this) == e) {
                    return e;
                }
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}

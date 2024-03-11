package com.netflix.mediaclient.ui.commander.impl.presenter;

import androidx.compose.runtime.ProduceStateScope;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1294Wd;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8499dnw;
import o.InterfaceC8585dra;
import o.InterfaceC8615dsd;
import o.VM;
import o.VX;
import o.bBP;
import o.bBR;
import o.bBW;
import o.dpR;
import o.drM;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class ControllerSheetPresenterKt$controllerSheetPresenter$state$3 extends SuspendLambda implements drX<ProduceStateScope<ControllerScreen.c>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    int c;
    final /* synthetic */ bBR d;
    final /* synthetic */ InterfaceC8499dnw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerSheetPresenterKt$controllerSheetPresenter$state$3(bBR bbr, InterfaceC8499dnw interfaceC8499dnw, InterfaceC8585dra<? super ControllerSheetPresenterKt$controllerSheetPresenter$state$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = bbr;
        this.e = interfaceC8499dnw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ControllerSheetPresenterKt$controllerSheetPresenter$state$3 controllerSheetPresenterKt$controllerSheetPresenter$state$3 = new ControllerSheetPresenterKt$controllerSheetPresenter$state$3(this.d, this.e, interfaceC8585dra);
        controllerSheetPresenterKt$controllerSheetPresenter$state$3.a = obj;
        return controllerSheetPresenterKt$controllerSheetPresenter$state$3;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(ProduceStateScope<ControllerScreen.c> produceStateScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ControllerSheetPresenterKt$controllerSheetPresenter$state$3) create(produceStateScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.a;
            dyS b = dyR.b(this.d.f().e(), this.d.f().d(), this.d.j().a(), this.d.e().d(), new AnonymousClass1(null));
            final InterfaceC8499dnw interfaceC8499dnw = this.e;
            final bBR bbr = this.d;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$controllerSheetPresenter$state$3.3
                @Override // o.dyQ
                /* renamed from: a */
                public final Object emit(ControllerScreen.b bVar, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    ControllerScreen.c dVar;
                    VX d = bVar.d();
                    ConnectionState c = bVar.c();
                    C1294Wd a = bVar.a();
                    if (a.b()) {
                        InterfaceC8499dnw.this.c(DeviceSheetScreen.e);
                    } else {
                        ProduceStateScope<ControllerScreen.c> produceStateScope2 = produceStateScope;
                        if (d != null) {
                            if (d.a() == TargetDeviceUiState.a) {
                                bBW.a.e(bbr.j());
                            }
                            dVar = bBP.c(c, d, bbr, InterfaceC8499dnw.this);
                        } else {
                            final bBR bbr2 = bbr;
                            final InterfaceC8499dnw interfaceC8499dnw2 = InterfaceC8499dnw.this;
                            dVar = new ControllerScreen.c.d(c, a, new drM<ControllerScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$controllerSheetPresenter$state$3$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(ControllerScreen.e eVar) {
                                    c(eVar);
                                    return dpR.c;
                                }

                                public final void c(ControllerScreen.e eVar) {
                                    C8632dsu.c((Object) eVar, "");
                                    bBP.a(eVar, bBR.this, interfaceC8499dnw2);
                                }
                            });
                        }
                        produceStateScope2.setValue(dVar);
                    }
                    return dpR.c;
                }
            };
            this.c = 1;
            if (b.collect(dyq, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$controllerSheetPresenter$state$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8615dsd<VX, ConnectionState, C1294Wd, VM, InterfaceC8585dra<? super ControllerScreen.b>, Object> {
        /* synthetic */ Object a;
        /* synthetic */ Object b;
        /* synthetic */ Object c;
        /* synthetic */ Object d;
        int e;

        AnonymousClass1(InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(5, interfaceC8585dra);
        }

        @Override // o.InterfaceC8615dsd
        /* renamed from: c */
        public final Object invoke(VX vx, ConnectionState connectionState, C1294Wd c1294Wd, VM vm, InterfaceC8585dra<? super ControllerScreen.b> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC8585dra);
            anonymousClass1.c = vx;
            anonymousClass1.b = connectionState;
            anonymousClass1.d = c1294Wd;
            anonymousClass1.a = vm;
            return anonymousClass1.invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.e == 0) {
                C8556dpz.d(obj);
                return new ControllerScreen.b((VX) this.c, (ConnectionState) this.b, (C1294Wd) this.d, (VM) this.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

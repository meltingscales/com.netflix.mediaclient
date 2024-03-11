package com.netflix.mediaclient.ui.commander.impl.presenter;

import androidx.compose.runtime.ProduceStateScope;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1294Wd;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8499dnw;
import o.InterfaceC8585dra;
import o.InterfaceC8619dsh;
import o.VT;
import o.VX;
import o.VY;
import o.VZ;
import o.bBQ;
import o.bBS;
import o.bMT;
import o.dpR;
import o.drM;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class DeviceSheetPresenterKt$deviceSheetPresenter$state$3 extends SuspendLambda implements drX<ProduceStateScope<DeviceSheetScreen.a>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ bMT a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bBS c;
    final /* synthetic */ boolean d;
    final /* synthetic */ InterfaceC8499dnw e;
    int f;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSheetPresenterKt$deviceSheetPresenter$state$3(bBS bbs, InterfaceC8499dnw interfaceC8499dnw, boolean z, boolean z2, bMT bmt, InterfaceC8585dra<? super DeviceSheetPresenterKt$deviceSheetPresenter$state$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = bbs;
        this.e = interfaceC8499dnw;
        this.d = z;
        this.b = z2;
        this.a = bmt;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(ProduceStateScope<DeviceSheetScreen.a> produceStateScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DeviceSheetPresenterKt$deviceSheetPresenter$state$3) create(produceStateScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DeviceSheetPresenterKt$deviceSheetPresenter$state$3 deviceSheetPresenterKt$deviceSheetPresenter$state$3 = new DeviceSheetPresenterKt$deviceSheetPresenter$state$3(this.c, this.e, this.d, this.b, this.a, interfaceC8585dra);
        deviceSheetPresenterKt$deviceSheetPresenter$state$3.h = obj;
        return deviceSheetPresenterKt$deviceSheetPresenter$state$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.f;
        if (i == 0) {
            C8556dpz.d(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.h;
            dyS e2 = dyR.e(this.c.j().a(), this.c.h().b(), this.c.f().e(), this.c.f().d(), this.c.b().b(), new AnonymousClass1(null));
            final InterfaceC8499dnw interfaceC8499dnw = this.e;
            final bBS bbs = this.c;
            final boolean z = this.d;
            final boolean z2 = this.b;
            final bMT bmt = this.a;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$deviceSheetPresenter$state$3.5
                @Override // o.dyQ
                /* renamed from: c */
                public final Object emit(DeviceSheetScreen.b bVar, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    boolean d = bVar.d();
                    List<VZ> b = bVar.b();
                    VX c = bVar.c();
                    ConnectionState a = bVar.a();
                    if ((a != ConnectionState.e && a != ConnectionState.d) || d) {
                        bBQ.c(bbs);
                        ProduceStateScope<DeviceSheetScreen.a> produceStateScope2 = produceStateScope;
                        List<VY> e3 = bVar.e();
                        VT b2 = a == ConnectionState.f ? bbs.a().b() : null;
                        VZ e4 = c != null ? c.e() : null;
                        Long b3 = bbs.e().b();
                        String e5 = bbs.e().e();
                        boolean z3 = z;
                        boolean z4 = z2;
                        bMT bmt2 = bmt;
                        final bBS bbs2 = bbs;
                        final InterfaceC8499dnw interfaceC8499dnw2 = InterfaceC8499dnw.this;
                        produceStateScope2.setValue(new DeviceSheetScreen.a.C0059a(a, b, b2, e3, z3, z4, d, false, e4, bmt2, b3, e5, new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$deviceSheetPresenter$state$3$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                                b(eVar);
                                return dpR.c;
                            }

                            public final void b(DeviceSheetScreen.e eVar) {
                                C8632dsu.c((Object) eVar, "");
                                bBQ.d(eVar, bBS.this, interfaceC8499dnw2);
                            }
                        }, 128, null));
                    } else {
                        InterfaceC8499dnw.this.c(ControllerScreen.c);
                    }
                    return dpR.c;
                }
            };
            this.f = 1;
            if (e2.collect(dyq, this) == e) {
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
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$deviceSheetPresenter$state$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8619dsh<C1294Wd, List<? extends VZ>, VX, ConnectionState, List<? extends VY>, InterfaceC8585dra<? super DeviceSheetScreen.b>, Object> {
        /* synthetic */ Object a;
        /* synthetic */ Object b;
        /* synthetic */ Object c;
        /* synthetic */ Object d;
        /* synthetic */ Object e;
        int j;

        AnonymousClass1(InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(6, interfaceC8585dra);
        }

        @Override // o.InterfaceC8619dsh
        /* renamed from: a */
        public final Object invoke(C1294Wd c1294Wd, List<VZ> list, VX vx, ConnectionState connectionState, List<VY> list2, InterfaceC8585dra<? super DeviceSheetScreen.b> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC8585dra);
            anonymousClass1.c = c1294Wd;
            anonymousClass1.b = list;
            anonymousClass1.d = vx;
            anonymousClass1.e = connectionState;
            anonymousClass1.a = list2;
            return anonymousClass1.invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.j == 0) {
                C8556dpz.d(obj);
                return new DeviceSheetScreen.b(((C1294Wd) this.c).b(), (List) this.b, (VX) this.d, (ConnectionState) this.e, (List) this.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

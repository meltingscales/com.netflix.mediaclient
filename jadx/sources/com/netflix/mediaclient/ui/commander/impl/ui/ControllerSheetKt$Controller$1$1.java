package com.netflix.mediaclient.ui.commander.impl.ui;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bBU;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class ControllerSheetKt$Controller$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableState<Dp> a;
    final /* synthetic */ CommanderState b;
    final /* synthetic */ MutableState<CommanderState> c;
    final /* synthetic */ MutableState<Dp> d;
    final /* synthetic */ MutableFloatState e;
    final /* synthetic */ MutableState<Dp> f;
    final /* synthetic */ float g;
    final /* synthetic */ float h;
    final /* synthetic */ MutableState<Dp> i;
    final /* synthetic */ float j;
    final /* synthetic */ drM<ControllerScreen.e, dpR> k;
    final /* synthetic */ float l;
    final /* synthetic */ float m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ ControllerScreen.c f13257o;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CommanderState.values().length];
            try {
                iArr[CommanderState.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommanderState.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ControllerSheetKt$Controller$1$1(CommanderState commanderState, MutableState<CommanderState> mutableState, drM<? super ControllerScreen.e, dpR> drm, float f, float f2, float f3, MutableState<Dp> mutableState2, MutableState<Dp> mutableState3, MutableState<Dp> mutableState4, MutableState<Dp> mutableState5, MutableFloatState mutableFloatState, float f4, float f5, ControllerScreen.c cVar, InterfaceC8585dra<? super ControllerSheetKt$Controller$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = commanderState;
        this.c = mutableState;
        this.k = drm;
        this.j = f;
        this.g = f2;
        this.h = f3;
        this.i = mutableState2;
        this.a = mutableState3;
        this.d = mutableState4;
        this.f = mutableState5;
        this.e = mutableFloatState;
        this.m = f4;
        this.l = f5;
        this.f13257o = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ControllerSheetKt$Controller$1$1(this.b, this.c, this.k, this.j, this.g, this.h, this.i, this.a, this.d, this.f, this.e, this.m, this.l, this.f13257o, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ControllerSheetKt$Controller$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommanderState f;
        C8586drb.e();
        if (this.n == 0) {
            C8556dpz.d(obj);
            bBU.b(this.c, this.b);
            f = bBU.f(this.c);
            int i = a.a[f.ordinal()];
            if (i == 1) {
                bBU.c(this.k, this.j, this.g, this.h, this.i, this.c, this.a, this.d, this.f, this.e);
            } else if (i != 2) {
                bBU.b(this.k, this.f13257o, this.l, this.i, this.c, this.a, this.d, this.f, this.e);
            } else {
                bBU.b(this.k, this.m, this.l, this.i, this.c, this.a, this.d, this.f, this.e);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

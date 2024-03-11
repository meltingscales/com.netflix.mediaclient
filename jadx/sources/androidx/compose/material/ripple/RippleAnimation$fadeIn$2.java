package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxD;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RippleAnimation$fadeIn$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dxD>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$fadeIn$2(RippleAnimation rippleAnimation, InterfaceC8585dra<? super RippleAnimation$fadeIn$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        RippleAnimation$fadeIn$2 rippleAnimation$fadeIn$2 = new RippleAnimation$fadeIn$2(this.this$0, interfaceC8585dra);
        rippleAnimation$fadeIn$2.L$0 = obj;
        return rippleAnimation$fadeIn$2;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dxD> interfaceC8585dra) {
        return ((RippleAnimation$fadeIn$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RippleAnimation rippleAnimation, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.this$0, interfaceC8585dra);
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            Animatable animatable;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                animatable = this.this$0.animatedAlpha;
                Float e2 = C8589dre.e(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, e2, tween$default, null, null, this, 12, null) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dxD c;
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.L$0;
            C8737dwr.c(dwu, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            C8737dwr.c(dwu, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            c = C8737dwr.c(dwu, null, null, new AnonymousClass3(this.this$0, null), 3, null);
            return c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RippleAnimation rippleAnimation, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass2(this.this$0, interfaceC8585dra);
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            Animatable animatable;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                animatable = this.this$0.animatedRadiusPercent;
                Float e2 = C8589dre.e(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, e2, tween$default, null, null, this, 12, null) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(RippleAnimation rippleAnimation, InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass3(this.this$0, interfaceC8585dra);
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            Animatable animatable;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                animatable = this.this$0.animatedCenterPercent;
                Float e2 = C8589dre.e(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, e2, tween$default, null, null, this, 12, null) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        }
    }
}

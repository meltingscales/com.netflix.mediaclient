package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8792dys;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ InterfaceC8792dys<T> $channel;
    final /* synthetic */ State<drM<T, dpR>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3(InterfaceC8792dys<T> interfaceC8792dys, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends drM<? super T, dpR>> state2, InterfaceC8585dra<? super AnimateAsStateKt$animateValueAsState$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$channel = interfaceC8792dys;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC8585dra);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke2(dwu, interfaceC8585dra);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L23
            if (r2 != r3) goto L1b
            java.lang.Object r2 = r0.L$1
            o.dyy r2 = (o.InterfaceC8798dyy) r2
            java.lang.Object r4 = r0.L$0
            o.dwU r4 = (o.dwU) r4
            o.C8556dpz.d(r17)
            r5 = r17
            goto L40
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            o.C8556dpz.d(r17)
            java.lang.Object r2 = r0.L$0
            o.dwU r2 = (o.dwU) r2
            o.dys<T> r4 = r0.$channel
            o.dyy r4 = r4.ct_()
            r15 = r4
            r4 = r2
            r2 = r15
        L33:
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r5 = r2.c(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r2.a()
            o.dys<T> r6 = r0.$channel
            java.lang.Object r6 = r6.s()
            java.lang.Object r6 = o.C8797dyx.c(r6)
            if (r6 != 0) goto L5a
            r8 = r5
            goto L5b
        L5a:
            r8 = r6
        L5b:
            r5 = 0
            r13 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r14 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<T, V> r9 = r0.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r10 = r0.$animSpec$delegate
            androidx.compose.runtime.State<o.drM<T, o.dpR>> r11 = r0.$listener$delegate
            r12 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r10 = 3
            r11 = 0
            r6 = r4
            r7 = r5
            r8 = r13
            r9 = r14
            o.C8738dws.e(r6, r7, r8, r9, r10, r11)
            goto L33
        L74:
            o.dpR r1 = o.dpR.c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<drM<T, dpR>> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T t, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends drM<? super T, dpR>> state2, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$newTarget = t;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC8585dra);
        }

        @Override // o.drX
        public /* bridge */ /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return invoke2(dwu, interfaceC8585dra);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            AnimationSpec animateValueAsState$lambda$6;
            drM animateValueAsState$lambda$4;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                if (!C8632dsu.c(this.$newTarget, this.$animatable.getTargetValue())) {
                    Animatable<T, V> animatable = this.$animatable;
                    T t = this.$newTarget;
                    animateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t, animateValueAsState$lambda$6, null, null, this, 12, null) == e) {
                        return e;
                    }
                }
                return dpR.c;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            animateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(this.$listener$delegate);
            if (animateValueAsState$lambda$4 != null) {
                animateValueAsState$lambda$4.invoke(this.$animatable.getValue());
            }
            return dpR.c;
        }
    }
}

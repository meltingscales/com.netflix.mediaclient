package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref.ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef<MotionDurationScaleImpl> objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, InterfaceC8585dra<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$systemDurationScaleSettingConsumer = objectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, interfaceC8585dra);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r11.L$0
            o.dxD r0 = (o.dxD) r0
            o.C8556dpz.d(r12)     // Catch: java.lang.Throwable -> L14
            goto L67
        L14:
            r12 = move-exception
            goto L81
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            o.C8556dpz.d(r12)
            java.lang.Object r12 = r11.L$0
            r4 = r12
            o.dwU r4 = (o.dwU) r4
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.platform.MotionDurationScaleImpl> r12 = r11.$systemDurationScaleSettingConsumer     // Catch: java.lang.Throwable -> L7f
            T r12 = r12.d     // Catch: java.lang.Throwable -> L7f
            androidx.compose.ui.platform.MotionDurationScaleImpl r12 = (androidx.compose.ui.platform.MotionDurationScaleImpl) r12     // Catch: java.lang.Throwable -> L7f
            if (r12 == 0) goto L58
            android.view.View r1 = r11.$this_createLifecycleAwareWindowRecomposer     // Catch: java.lang.Throwable -> L7f
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L7f
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L7f
            o.dzv r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.access$getAnimationScaleFlowFor(r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r5 = r1.b()     // Catch: java.lang.Throwable -> L7f
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L7f
            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L7f
            r12.setScaleFactor(r5)     // Catch: java.lang.Throwable -> L7f
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch: java.lang.Throwable -> L7f
            r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L7f
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            o.dxD r12 = o.C8738dws.e(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7f
            goto L59
        L58:
            r12 = r3
        L59:
            androidx.compose.runtime.Recomposer r1 = r11.$recomposer     // Catch: java.lang.Throwable -> L7a
            r11.L$0 = r12     // Catch: java.lang.Throwable -> L7a
            r11.label = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r1.runRecomposeAndApplyChanges(r11)     // Catch: java.lang.Throwable -> L7a
            if (r1 != r0) goto L66
            return r0
        L66:
            r0 = r12
        L67:
            if (r0 == 0) goto L6c
            o.dxD.b.b(r0, r3, r2, r3)
        L6c:
            androidx.lifecycle.LifecycleOwner r12 = r11.$source
            androidx.lifecycle.Lifecycle r12 = r12.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.$self
            r12.removeObserver(r0)
            o.dpR r12 = o.dpR.c
            return r12
        L7a:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L81
        L7f:
            r12 = move-exception
            r0 = r3
        L81:
            if (r0 == 0) goto L86
            o.dxD.b.b(r0, r3, r2, r3)
        L86:
            androidx.lifecycle.LifecycleOwner r0 = r11.$source
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.$self
            r0.removeObserver(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.InterfaceC8792dys;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements drX<dyQ<? super Float>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ InterfaceC8792dys<dpR> $channel;
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, InterfaceC8792dys<dpR> interfaceC8792dys, Context context, InterfaceC8585dra<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = interfaceC8792dys;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, interfaceC8585dra);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // o.drX
    public final Object invoke(dyQ<? super Float> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:7:0x0016, B:16:0x0046, B:19:0x0053, B:21:0x005b, B:12:0x002a, B:15:0x0040), top: B:29:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:16:0x0046). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r7.L$1
            o.dyy r1 = (o.InterfaceC8798dyy) r1
            java.lang.Object r4 = r7.L$0
            o.dyQ r4 = (o.dyQ) r4
            o.C8556dpz.d(r8)     // Catch: java.lang.Throwable -> L87
            goto L46
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.lang.Object r1 = r7.L$1
            o.dyy r1 = (o.InterfaceC8798dyy) r1
            java.lang.Object r4 = r7.L$0
            o.dyQ r4 = (o.dyQ) r4
            o.C8556dpz.d(r8)     // Catch: java.lang.Throwable -> L87
            goto L53
        L2e:
            o.C8556dpz.d(r8)
            java.lang.Object r8 = r7.L$0
            r4 = r8
            o.dyQ r4 = (o.dyQ) r4
            android.content.ContentResolver r8 = r7.$resolver
            android.net.Uri r1 = r7.$animationScaleUri
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r5 = r7.$contentObserver
            r6 = 0
            r8.registerContentObserver(r1, r6, r5)
            o.dys<o.dpR> r8 = r7.$channel     // Catch: java.lang.Throwable -> L87
            o.dyy r1 = r8.ct_()     // Catch: java.lang.Throwable -> L87
        L46:
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L87
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L87
            r7.label = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r1.c(r7)     // Catch: java.lang.Throwable -> L87
            if (r8 != r0) goto L53
            return r0
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L87
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L7d
            r1.a()     // Catch: java.lang.Throwable -> L87
            android.content.Context r8 = r7.$applicationContext     // Catch: java.lang.Throwable -> L87
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r8 = android.provider.Settings.Global.getFloat(r8, r5, r6)     // Catch: java.lang.Throwable -> L87
            java.lang.Float r8 = o.C8589dre.e(r8)     // Catch: java.lang.Throwable -> L87
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L87
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L87
            r7.label = r2     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r4.emit(r8, r7)     // Catch: java.lang.Throwable -> L87
            if (r8 != r0) goto L46
            return r0
        L7d:
            android.content.ContentResolver r8 = r7.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r7.$contentObserver
            r8.unregisterContentObserver(r0)
            o.dpR r8 = o.dpR.c
            return r8
        L87:
            r8 = move-exception
            android.content.ContentResolver r0 = r7.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r7.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

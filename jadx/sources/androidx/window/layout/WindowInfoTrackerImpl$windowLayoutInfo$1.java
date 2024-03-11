package androidx.window.layout;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8792dys;
import o.dpR;
import o.drX;
import o.dyQ;

/* loaded from: classes2.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements drX<dyQ<? super WindowLayoutInfo>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, InterfaceC8585dra<? super WindowInfoTrackerImpl$windowLayoutInfo$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, interfaceC8585dra);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // o.drX
    public final Object invoke(dyQ<? super WindowLayoutInfo> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:7:0x001a, B:16:0x0061, B:19:0x0070, B:21:0x0078, B:12:0x0032, B:15:0x005d), top: B:29:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:16:0x0061). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r8.L$2
            o.dyy r1 = (o.InterfaceC8798dyy) r1
            java.lang.Object r4 = r8.L$1
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r8.L$0
            o.dyQ r5 = (o.dyQ) r5
            o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L99
            goto L61
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            java.lang.Object r1 = r8.L$2
            o.dyy r1 = (o.InterfaceC8798dyy) r1
            java.lang.Object r4 = r8.L$1
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r8.L$0
            o.dyQ r5 = (o.dyQ) r5
            o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L99
            goto L70
        L36:
            o.C8556dpz.d(r9)
            java.lang.Object r9 = r8.L$0
            r5 = r9
            o.dyQ r5 = (o.dyQ) r5
            kotlinx.coroutines.channels.BufferOverflow r9 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r1 = 10
            r4 = 4
            r6 = 0
            o.dys r9 = o.C8799dyz.e(r1, r9, r6, r4, r6)
            androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0 r4 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r1 = r8.this$0
            androidx.window.layout.WindowBackend r1 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r1)
            android.app.Activity r6 = r8.$activity
            androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0 r7 = new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0
            r7.<init>()
            r1.registerLayoutChangeCallback(r6, r7, r4)
            o.dyy r1 = r9.ct_()     // Catch: java.lang.Throwable -> L99
        L61:
            r8.L$0 = r5     // Catch: java.lang.Throwable -> L99
            r8.L$1 = r4     // Catch: java.lang.Throwable -> L99
            r8.L$2 = r1     // Catch: java.lang.Throwable -> L99
            r8.label = r3     // Catch: java.lang.Throwable -> L99
            java.lang.Object r9 = r1.c(r8)     // Catch: java.lang.Throwable -> L99
            if (r9 != r0) goto L70
            return r0
        L70:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L99
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L99
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r1.a()     // Catch: java.lang.Throwable -> L99
            androidx.window.layout.WindowLayoutInfo r9 = (androidx.window.layout.WindowLayoutInfo) r9     // Catch: java.lang.Throwable -> L99
            r8.L$0 = r5     // Catch: java.lang.Throwable -> L99
            r8.L$1 = r4     // Catch: java.lang.Throwable -> L99
            r8.L$2 = r1     // Catch: java.lang.Throwable -> L99
            r8.label = r2     // Catch: java.lang.Throwable -> L99
            java.lang.Object r9 = r5.emit(r9, r8)     // Catch: java.lang.Throwable -> L99
            if (r9 != r0) goto L61
            return r0
        L8d:
            androidx.window.layout.WindowInfoTrackerImpl r9 = r8.this$0
            androidx.window.layout.WindowBackend r9 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r9)
            r9.unregisterLayoutChangeCallback(r4)
            o.dpR r9 = o.dpR.c
            return r9
        L99:
            r9 = move-exception
            androidx.window.layout.WindowInfoTrackerImpl r0 = r8.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m2755invokeSuspend$lambda0(InterfaceC8792dys interfaceC8792dys, WindowLayoutInfo windowLayoutInfo) {
        C8632dsu.a(windowLayoutInfo, "");
        interfaceC8792dys.d((InterfaceC8792dys) windowLayoutInfo);
    }
}

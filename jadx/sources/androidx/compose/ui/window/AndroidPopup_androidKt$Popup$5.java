package androidx.compose.ui.window;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$Popup$5 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, InterfaceC8585dra<? super AndroidPopup_androidKt$Popup$5> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, interfaceC8585dra);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AndroidPopup_androidKt$Popup$5) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r3.L$0
            o.dwU r1 = (o.dwU) r1
            o.C8556dpz.d(r4)
            goto L36
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1b:
            o.C8556dpz.d(r4)
            java.lang.Object r4 = r3.L$0
            o.dwU r4 = (o.dwU) r4
            r1 = r4
        L23:
            boolean r4 = o.dwY.b(r1)
            if (r4 == 0) goto L3c
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r4 = new o.drM<java.lang.Long, o.dpR>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.1
                static {
                    /*
                        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1) androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.1.INSTANCE androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.<init>():void");
                }

                public final void invoke(long r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.invoke(long):void");
                }

                @Override // o.drM
                public /* synthetic */ o.dpR invoke(java.lang.Long r3) {
                    /*
                        r2 = this;
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r0 = r3.longValue()
                        r2.invoke(r0)
                        o.dpR r3 = o.dpR.c
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r3.L$0 = r1
            r3.label = r2
            java.lang.Object r4 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r3)
            if (r4 != r0) goto L36
            return r0
        L36:
            androidx.compose.ui.window.PopupLayout r4 = r3.$popupLayout
            r4.pollForLocationOnScreenChange()
            goto L23
        L3c:
            o.dpR r4 = o.dpR.c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

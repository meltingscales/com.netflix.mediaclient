package com.netflix.mediaclient.ui.player.v2.uiView.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.condition.State;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.cHZ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerInteractiveNavigationAdapter$generateSnapshotList$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super List<? extends State>>, Object> {
    int b;
    final /* synthetic */ cHZ c;
    final /* synthetic */ PlayerControls d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInteractiveNavigationAdapter$generateSnapshotList$2(PlayerControls playerControls, cHZ chz, InterfaceC8585dra<? super PlayerInteractiveNavigationAdapter$generateSnapshotList$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = playerControls;
        this.c = chz;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerInteractiveNavigationAdapter$generateSnapshotList$2(this.d, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super List<? extends State>> interfaceC8585dra) {
        return ((PlayerInteractiveNavigationAdapter$generateSnapshotList$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = o.C8576dqs.U(r0);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            o.C8588drd.c()
            int r0 = r5.b
            if (r0 != 0) goto L64
            o.C8556dpz.d(r6)
            com.netflix.model.leafs.originals.interactive.PlayerControls r6 = r5.d
            com.netflix.model.leafs.originals.interactive.PlayerControls$Config r6 = r6.config()
            if (r6 == 0) goto L17
            int r6 = r6.maxSnapshotsToDisplay()
            goto L18
        L17:
            r6 = 0
        L18:
            if (r6 <= 0) goto L5f
            o.cHZ r0 = r5.c
            com.netflix.model.leafs.originals.interactive.InteractiveMoments r0 = o.cHZ.b(r0)
            if (r0 == 0) goto L5f
            com.netflix.model.leafs.originals.interactive.condition.Snapshots r0 = r0.snapshots()
            if (r0 == 0) goto L5f
            java.util.List r0 = o.C8570dqm.w(r0)
            if (r0 == 0) goto L5f
            o.cHZ r1 = r5.c
            java.lang.String r1 = o.cHZ.d(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.netflix.model.leafs.originals.interactive.condition.State r4 = (com.netflix.model.leafs.originals.interactive.condition.State) r4
            if (r4 == 0) goto L3d
            java.lang.String r4 = r4.getStateSegmentId()
            boolean r4 = o.C8632dsu.c(r4, r1)
            if (r4 != 0) goto L3d
            r2.add(r3)
            goto L3d
        L5a:
            java.util.List r6 = o.C8570dqm.b(r2, r6)
            return r6
        L5f:
            java.util.List r6 = o.C8570dqm.c()
            return r6
        L64:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.v2.uiView.interactive.PlayerInteractiveNavigationAdapter$generateSnapshotList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

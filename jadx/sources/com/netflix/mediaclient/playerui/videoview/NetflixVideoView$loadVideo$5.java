package com.netflix.mediaclient.playerui.videoview;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.playerui.videoview.NetflixVideoView$loadVideo$5;
import kotlin.jvm.internal.Ref;
import o.AbstractApplicationC1040Mh;
import o.AbstractC5100bsQ;
import o.C8187dfe;
import o.C8632dsu;
import o.InterfaceC5085bsB;
import o.aJY;

/* loaded from: classes3.dex */
public final class NetflixVideoView$loadVideo$5 implements DefaultLifecycleObserver {
    final /* synthetic */ Ref.ObjectRef<InterfaceC5085bsB> a;
    final /* synthetic */ aJY c;

    public NetflixVideoView$loadVideo$5(Ref.ObjectRef<InterfaceC5085bsB> objectRef, aJY ajy) {
        this.a = objectRef;
        this.c = ajy;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        final Ref.ObjectRef<InterfaceC5085bsB> objectRef = this.a;
        final aJY ajy = this.c;
        C8187dfe.a(new Runnable() { // from class: o.aKb
            @Override // java.lang.Runnable
            public final void run() {
                NetflixVideoView$loadVideo$5.a(Ref.ObjectRef.this, ajy);
            }
        }, 1000L);
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ref.ObjectRef objectRef, aJY ajy) {
        AbstractC5100bsQ abstractC5100bsQ;
        C8632dsu.c((Object) objectRef, "");
        C8632dsu.c((Object) ajy, "");
        if (AbstractApplicationC1040Mh.getInstance().o().h()) {
            InterfaceC5085bsB interfaceC5085bsB = (InterfaceC5085bsB) objectRef.d;
            if (interfaceC5085bsB != null) {
                interfaceC5085bsB.y();
            }
            objectRef.d = null;
            ajy.ai();
            abstractC5100bsQ = ajy.aq;
            if (abstractC5100bsQ != null) {
                abstractC5100bsQ.e();
            }
        }
    }
}

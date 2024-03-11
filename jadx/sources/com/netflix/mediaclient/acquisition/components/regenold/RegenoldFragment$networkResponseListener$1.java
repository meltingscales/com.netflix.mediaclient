package com.netflix.mediaclient.acquisition.components.regenold;

import android.os.Handler;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class RegenoldFragment$networkResponseListener$1 implements NetworkRequestResponseListener {
    final /* synthetic */ RegenoldFragment this$0;

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onBeforeNetworkAction(Request request) {
        C8632dsu.c((Object) request, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegenoldFragment$networkResponseListener$1(RegenoldFragment regenoldFragment) {
        this.this$0 = regenoldFragment;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onAfterNetworkAction(Response response) {
        C8632dsu.c((Object) response, "");
        if (response.getStatus().j()) {
            Handler handler = new Handler();
            final RegenoldFragment regenoldFragment = this.this$0;
            handler.postDelayed(new Runnable() { // from class: com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment$networkResponseListener$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RegenoldFragment$networkResponseListener$1.onAfterNetworkAction$lambda$0(RegenoldFragment.this);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAfterNetworkAction$lambda$0(RegenoldFragment regenoldFragment) {
        C8632dsu.c((Object) regenoldFragment, "");
        regenoldFragment.getRegenoldTray().close();
    }
}

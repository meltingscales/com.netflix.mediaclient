package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
final class ap extends al {
    final /* synthetic */ aw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(aw awVar, TaskCompletionSource taskCompletionSource) {
        super(awVar, taskCompletionSource);
        this.c = awVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void d(Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.c.g;
        zVar.u(this.a);
        int i = bundle.getInt("error_code");
        oVar = aw.a;
        oVar.b("onError(%d)", Integer.valueOf(i));
        this.a.trySetException(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void h(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        com.google.android.play.core.assetpacks.internal.o oVar;
        super.h(bundle, bundle2);
        atomicBoolean = this.c.h;
        if (!atomicBoolean.compareAndSet(true, false)) {
            oVar = aw.a;
            oVar.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.f();
        }
    }
}

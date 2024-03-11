package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class ar extends al {
    final int c;
    final String d;
    final int e;
    final /* synthetic */ aw f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(aw awVar, TaskCompletionSource taskCompletionSource, int i, String str, int i2) {
        super(awVar, taskCompletionSource);
        this.f = awVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void d(Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.z zVar;
        com.google.android.play.core.assetpacks.internal.o oVar;
        zVar = this.f.f;
        zVar.u(this.a);
        int i = bundle.getInt("error_code");
        oVar = aw.a;
        oVar.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.e;
        if (i2 > 0) {
            this.f.D(this.c, this.d, i2 - 1);
        }
    }
}

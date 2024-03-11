package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import java.util.List;

/* loaded from: classes5.dex */
final class v extends p {
    final /* synthetic */ IBinder a;
    final /* synthetic */ y b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(y yVar, IBinder iBinder) {
        this.b = yVar;
        this.a = iBinder;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        List<Runnable> list;
        List list2;
        this.b.a.n = e.b(this.a);
        z.q(this.b.a);
        this.b.a.h = false;
        list = this.b.a.e;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.b.a.e;
        list2.clear();
    }
}

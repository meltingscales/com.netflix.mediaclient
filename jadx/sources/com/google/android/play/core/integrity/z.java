package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.ag;

/* loaded from: classes2.dex */
final class z {
    private static s a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a(Context context) {
        s sVar;
        synchronized (z.class) {
            if (a == null) {
                q qVar = new q(null);
                qVar.a(ag.a(context));
                a = qVar.b();
            }
            sVar = a;
        }
        return sVar;
    }
}

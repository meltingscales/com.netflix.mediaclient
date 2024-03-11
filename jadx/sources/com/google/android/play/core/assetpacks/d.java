package com.google.android.play.core.assetpacks;

import android.content.Context;

/* loaded from: classes5.dex */
public final class d {
    private static a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context) {
        a aVar;
        synchronized (d.class) {
            if (a == null) {
                cd cdVar = new cd(null);
                cdVar.b(new p(com.google.android.play.core.assetpacks.internal.ag.a(context)));
                a = cdVar.a();
            }
            aVar = a;
        }
        return aVar;
    }
}

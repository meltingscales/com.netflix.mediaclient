package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class q implements x {
    private Context a;

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.am.a(this.a, Context.class);
        return new s(this.a, null);
    }
}

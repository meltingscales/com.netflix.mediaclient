package com.google.android.play.core.assetpacks;

/* loaded from: classes5.dex */
final class ck extends RuntimeException {
    final int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ck(String str) {
        super(str);
        this.a = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ck(String str, int i) {
        super(str);
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ck(String str, Exception exc) {
        super(str, exc);
        this.a = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ck(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}

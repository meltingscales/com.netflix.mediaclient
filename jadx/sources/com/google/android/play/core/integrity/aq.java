package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class aq extends IntegrityTokenResponse {
    private final String a;
    private final y b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(String str, y yVar) {
        this.a = str;
        this.b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.a;
    }
}

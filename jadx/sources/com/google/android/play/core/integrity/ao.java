package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class ao extends IntegrityTokenRequest {
    private final String a;
    private final Long b;
    private final Object c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ao(String str, Long l, Object obj, an anVar) {
        this.a = str;
        this.b = l;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.a.equals(integrityTokenRequest.nonce()) && ((l = this.b) != null ? l.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z = true;
                if ((obj instanceof ao) || !a()) {
                    return z;
                }
                ao aoVar = (ao) obj;
                if (z) {
                    Object obj2 = aoVar.c;
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (obj instanceof ao) {
        }
        return z;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Long l = this.b;
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ (l == null ? 0 : l.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}

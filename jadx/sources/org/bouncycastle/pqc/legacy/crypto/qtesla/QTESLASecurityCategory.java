package org.bouncycastle.pqc.legacy.crypto.qtesla;

/* loaded from: classes6.dex */
public class QTESLASecurityCategory {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getPrivateSize(int i) {
        if (i != 5) {
            if (i == 6) {
                return 12392;
            }
            throw new IllegalArgumentException("unknown security category: " + i);
        }
        return 5224;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getPublicSize(int i) {
        if (i != 5) {
            if (i == 6) {
                return 38432;
            }
            throw new IllegalArgumentException("unknown security category: " + i);
        }
        return 14880;
    }
}

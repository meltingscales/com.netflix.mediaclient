package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes6.dex */
public class SPHINCSKeyParameters extends AsymmetricKeyParameter {
    private final String treeDigest;

    /* JADX INFO: Access modifiers changed from: protected */
    public SPHINCSKeyParameters(boolean z, String str) {
        super(z);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}

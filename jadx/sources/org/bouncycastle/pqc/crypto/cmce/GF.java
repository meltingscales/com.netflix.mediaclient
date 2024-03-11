package org.bouncycastle.pqc.crypto.cmce;

/* loaded from: classes6.dex */
abstract class GF {
    protected abstract short gf_frac(short s, short s2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract short gf_inv(short s);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract short gf_mul(short s, short s2);

    protected abstract short gf_reduce(int i);

    protected abstract short gf_sq(short s);
}

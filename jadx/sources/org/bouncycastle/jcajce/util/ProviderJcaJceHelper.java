package org.bouncycastle.jcajce.util;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes6.dex */
public class ProviderJcaJceHelper implements JcaJceHelper {
    protected final Provider provider;

    public ProviderJcaJceHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public AlgorithmParameters createAlgorithmParameters(String str) {
        return AlgorithmParameters.getInstance(str, this.provider);
    }

    @Override // org.bouncycastle.jcajce.util.JcaJceHelper
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str, this.provider);
    }
}

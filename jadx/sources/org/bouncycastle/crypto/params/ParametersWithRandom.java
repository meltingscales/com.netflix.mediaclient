package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;

/* loaded from: classes6.dex */
public class ParametersWithRandom implements CipherParameters {
    private CipherParameters parameters;
    private SecureRandom random;

    public ParametersWithRandom(CipherParameters cipherParameters, SecureRandom secureRandom) {
        this.random = CryptoServicesRegistrar.getSecureRandom(secureRandom);
        this.parameters = cipherParameters;
    }
}

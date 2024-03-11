package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public class DHValidationParameters {
    private int counter;
    private byte[] seed;

    public DHValidationParameters(byte[] bArr, int i) {
        this.seed = Arrays.clone(bArr);
        this.counter = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHValidationParameters) {
            DHValidationParameters dHValidationParameters = (DHValidationParameters) obj;
            if (dHValidationParameters.counter != this.counter) {
                return false;
            }
            return Arrays.areEqual(this.seed, dHValidationParameters.seed);
        }
        return false;
    }

    public int hashCode() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }
}

package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes6.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {
    private final int docLength;
    private final RainbowParameters params;

    public RainbowKeyParameters(boolean z, RainbowParameters rainbowParameters) {
        super(z);
        this.params = rainbowParameters;
        this.docLength = rainbowParameters.getM();
    }

    public RainbowParameters getParameters() {
        return this.params;
    }
}

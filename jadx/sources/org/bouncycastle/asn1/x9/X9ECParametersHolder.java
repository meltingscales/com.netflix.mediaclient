package org.bouncycastle.asn1.x9;

import org.bouncycastle.math.ec.ECCurve;

/* loaded from: classes6.dex */
public abstract class X9ECParametersHolder {
    private ECCurve curve;

    protected ECCurve createCurve() {
        return createParameters().getCurve();
    }

    protected abstract X9ECParameters createParameters();

    public ECCurve getCurve() {
        ECCurve eCCurve;
        synchronized (this) {
            if (this.curve == null) {
                this.curve = createCurve();
            }
            eCCurve = this.curve;
        }
        return eCCurve;
    }
}

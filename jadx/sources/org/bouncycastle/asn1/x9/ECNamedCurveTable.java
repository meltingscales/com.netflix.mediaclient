package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.anssi.ANSSINamedCurves;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.gm.GMNamedCurves;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;

/* loaded from: classes6.dex */
public class ECNamedCurveTable {
    public static X9ECParametersHolder getByNameLazy(String str) {
        X9ECParametersHolder byNameLazy = X962NamedCurves.getByNameLazy(str);
        if (byNameLazy == null) {
            byNameLazy = SECNamedCurves.getByNameLazy(str);
        }
        if (byNameLazy == null) {
            byNameLazy = NISTNamedCurves.getByNameLazy(str);
        }
        if (byNameLazy == null) {
            byNameLazy = TeleTrusTNamedCurves.getByNameLazy(str);
        }
        if (byNameLazy == null) {
            byNameLazy = ANSSINamedCurves.getByNameLazy(str);
        }
        if (byNameLazy == null) {
            byNameLazy = ECGOST3410NamedCurves.getByNameLazy(str);
        }
        return byNameLazy == null ? GMNamedCurves.getByNameLazy(str) : byNameLazy;
    }
}

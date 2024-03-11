package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes6.dex */
public class EC5Util {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class CustomCurves {
        private static Map CURVE_MAP = createCurveMap();

        private static Map createCurveMap() {
            HashMap hashMap = new HashMap();
            Enumeration names = CustomNamedCurves.getNames();
            while (names.hasMoreElements()) {
                String str = (String) names.nextElement();
                X9ECParametersHolder byNameLazy = ECNamedCurveTable.getByNameLazy(str);
                if (byNameLazy != null) {
                    ECCurve curve = byNameLazy.getCurve();
                    if (ECAlgorithms.isFpCurve(curve)) {
                        hashMap.put(curve, CustomNamedCurves.getByNameLazy(str).getCurve());
                    }
                }
            }
            ECCurve curve2 = CustomNamedCurves.getByNameLazy("Curve25519").getCurve();
            hashMap.put(new ECCurve.Fp(curve2.getField().getCharacteristic(), curve2.getA().toBigInteger(), curve2.getB().toBigInteger(), curve2.getOrder(), curve2.getCofactor(), true), curve2);
            return hashMap;
        }

        static ECCurve substitute(ECCurve eCCurve) {
            ECCurve eCCurve2 = (ECCurve) CURVE_MAP.get(eCCurve);
            return eCCurve2 != null ? eCCurve2 : eCCurve;
        }
    }

    public static ECCurve convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            return CustomCurves.substitute(new ECCurve.Fp(((ECFieldFp) field).getP(), a, b, null, null));
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] convertMidTerms = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new ECCurve.F2m(m, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a, b, (BigInteger) null, (BigInteger) null);
    }

    public static ECPoint convertPoint(ECCurve eCCurve, java.security.spec.ECPoint eCPoint) {
        return eCCurve.createPoint(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECParameterSpec convertSpec(java.security.spec.ECParameterSpec eCParameterSpec) {
        ECCurve convertCurve = convertCurve(eCParameterSpec.getCurve());
        ECPoint convertPoint = convertPoint(convertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger valueOf = BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof ECNamedCurveSpec ? new ECNamedCurveParameterSpec(((ECNamedCurveSpec) eCParameterSpec).getName(), convertCurve, convertPoint, order, valueOf, seed) : new ECParameterSpec(convertCurve, convertPoint, order, valueOf, seed);
    }
}

package o;

import java.lang.reflect.Method;

/* renamed from: o.aZa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2078aZa {
    private static byte[] c(aOV aov, String str) {
        String p = aov.p();
        if (p != null) {
            C1044Mm.a("nf_msl_client_EntityAuthorizationFactory", "%s using deviceIdToken : %s", str, p);
            try {
                return C8427dle.e(p);
            } catch (Exception e) {
                C1044Mm.b("nf_msl_client_EntityAuthorizationFactory", e, "can't base64 decode", new Object[0]);
            }
        }
        return null;
    }

    public static djG e(aOV aov, byte[] bArr) {
        try {
            Object obj = C1043Ml.p.get(-1157850869);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 38162, 4, 0)).getMethod("b", null);
                C1043Ml.p.put(-1157850869, obj);
            }
            InterfaceC8376djh interfaceC8376djh = (InterfaceC8376djh) ((Method) obj).invoke(null, null);
            C1044Mm.a("nf_msl_client_EntityAuthorizationFactory", "Client appId provider: %s", interfaceC8376djh);
            return new djR(aov.w().n(), bArr, aov.w().j(), new dkJ(interfaceC8376djh.a(), interfaceC8376djh.e()), new C8392djx(interfaceC8376djh.c()), c(aov, "UnauthenticatedAppIdAuthenticationData"));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}

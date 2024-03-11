package org.bouncycastle.jce.provider;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jce.spec.ECParameterSpec;

/* loaded from: classes6.dex */
class BouncyCastleProviderConfiguration implements ProviderConfiguration {
    private volatile Object dhDefaultParams;
    private volatile ECParameterSpec ecImplicitCaParams;
    private static Permission BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission("BC", "threadLocalEcImplicitlyCa");
    private static Permission BC_EC_PERMISSION = new ProviderConfigurationPermission("BC", "ecImplicitlyCa");
    private static Permission BC_DH_LOCAL_PERMISSION = new ProviderConfigurationPermission("BC", "threadLocalDhDefaultParams");
    private static Permission BC_DH_PERMISSION = new ProviderConfigurationPermission("BC", "DhDefaultParams");
    private static Permission BC_EC_CURVE_PERMISSION = new ProviderConfigurationPermission("BC", "acceptableEcCurves");
    private static Permission BC_ADDITIONAL_EC_CURVE_PERMISSION = new ProviderConfigurationPermission("BC", "additionalEcParameters");
    private ThreadLocal ecThreadSpec = new ThreadLocal();
    private ThreadLocal dhThreadSpec = new ThreadLocal();
    private volatile Set acceptableNamedCurves = new HashSet();
    private volatile Map additionalECParameters = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setParameter(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals("threadLocalEcImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_LOCAL_PERMISSION);
            }
            ECParameterSpec convertSpec = ((obj instanceof ECParameterSpec) || obj == null) ? (ECParameterSpec) obj : EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
            if (convertSpec != null) {
                this.ecThreadSpec.set(convertSpec);
                return;
            }
            threadLocal = this.ecThreadSpec;
        } else if (str.equals("ecImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_PERMISSION);
            }
            if ((obj instanceof ECParameterSpec) || obj == null) {
                this.ecImplicitCaParams = (ECParameterSpec) obj;
                return;
            } else {
                this.ecImplicitCaParams = EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
                return;
            }
        } else if (!str.equals("threadLocalDhDefaultParams")) {
            if (str.equals("DhDefaultParams")) {
                if (securityManager != null) {
                    securityManager.checkPermission(BC_DH_PERMISSION);
                }
                if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                    throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
                }
                this.dhDefaultParams = obj;
                return;
            } else if (str.equals("acceptableEcCurves")) {
                if (securityManager != null) {
                    securityManager.checkPermission(BC_EC_CURVE_PERMISSION);
                }
                this.acceptableNamedCurves = (Set) obj;
                return;
            } else if (str.equals("additionalEcParameters")) {
                if (securityManager != null) {
                    securityManager.checkPermission(BC_ADDITIONAL_EC_CURVE_PERMISSION);
                }
                this.additionalECParameters = (Map) obj;
                return;
            } else {
                return;
            }
        } else {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            threadLocal = this.dhThreadSpec;
            if (obj != null) {
                threadLocal.set(obj);
                return;
            }
        }
        threadLocal.remove();
    }
}

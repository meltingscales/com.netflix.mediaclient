package org.bouncycastle.crypto;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class CryptoServicesPermission extends Permission {
    private final Set<String> actions;

    public CryptoServicesPermission(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.actions = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof CryptoServicesPermission) && this.actions.equals(((CryptoServicesPermission) obj).actions);
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.actions.toString();
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (permission instanceof CryptoServicesPermission) {
            CryptoServicesPermission cryptoServicesPermission = (CryptoServicesPermission) permission;
            return getName().equals(cryptoServicesPermission.getName()) || this.actions.containsAll(cryptoServicesPermission.actions);
        }
        return false;
    }
}
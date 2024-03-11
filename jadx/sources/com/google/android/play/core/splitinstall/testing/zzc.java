package com.google.android.play.core.splitinstall.testing;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzc extends zzv {
    private final Integer zzb;
    private final Map zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzc(Integer num, Map map, zzb zzbVar) {
        this.zzb = num;
        this.zzc = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzv) {
            zzv zzvVar = (zzv) obj;
            Integer num = this.zzb;
            if (num == null) {
                if (zzvVar.zza() != null) {
                    return false;
                }
            } else if (!num.equals(zzvVar.zza())) {
                return false;
            }
            return this.zzc.equals(zzvVar.zzb());
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.zzb;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        Integer num = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + num + ", splitInstallErrorCodeByModule=" + valueOf + "}";
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    public final Integer zza() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    public final Map zzb() {
        return this.zzc;
    }
}

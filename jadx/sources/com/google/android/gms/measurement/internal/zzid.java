package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzle;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzid extends zzkb {
    public zzid(zzke zzkeVar) {
        super(zzkeVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkb
    protected final boolean zze() {
        return false;
    }

    public final byte[] zza(zzan zzanVar, String str) {
        zzkn zzknVar;
        zzbr.zzg.zza zzaVar;
        zzg zzgVar;
        zzbr.zzf.zza zzaVar2;
        Bundle bundle;
        byte[] bArr;
        long j;
        zzaj zza;
        zzd();
        this.zzx.zzae();
        Preconditions.checkNotNull(zzanVar);
        Preconditions.checkNotEmpty(str);
        if (!zzt().zze(str, zzap.zzbe)) {
            zzr().zzw().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(zzanVar.zza) && !"_iapx".equals(zzanVar.zza)) {
            zzr().zzw().zza("Generating a payload for this event is not available. package_name, event_name", str, zzanVar.zza);
            return null;
        } else {
            zzbr.zzf.zza zzb = zzbr.zzf.zzb();
            zzi().zzf();
            try {
                zzg zzb2 = zzi().zzb(str);
                if (zzb2 == null) {
                    zzr().zzw().zza("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!zzb2.zzr()) {
                    zzr().zzw().zza("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    zzbr.zzg.zza zza2 = zzbr.zzg.zzbf().zza(1).zza("android");
                    if (!TextUtils.isEmpty(zzb2.zzc())) {
                        zza2.zzf(zzb2.zzc());
                    }
                    if (!TextUtils.isEmpty(zzb2.zzn())) {
                        zza2.zze(zzb2.zzn());
                    }
                    if (!TextUtils.isEmpty(zzb2.zzl())) {
                        zza2.zzg(zzb2.zzl());
                    }
                    if (zzb2.zzm() != -2147483648L) {
                        zza2.zzh((int) zzb2.zzm());
                    }
                    zza2.zzf(zzb2.zzo()).zzk(zzb2.zzq());
                    if (zzle.zzb() && zzt().zze(zzb2.zzc(), zzap.zzcc)) {
                        if (!TextUtils.isEmpty(zzb2.zze())) {
                            zza2.zzk(zzb2.zze());
                        } else if (!TextUtils.isEmpty(zzb2.zzg())) {
                            zza2.zzp(zzb2.zzg());
                        } else if (!TextUtils.isEmpty(zzb2.zzf())) {
                            zza2.zzo(zzb2.zzf());
                        }
                    } else if (!TextUtils.isEmpty(zzb2.zze())) {
                        zza2.zzk(zzb2.zze());
                    } else if (!TextUtils.isEmpty(zzb2.zzf())) {
                        zza2.zzo(zzb2.zzf());
                    }
                    zza2.zzh(zzb2.zzp());
                    if (this.zzx.zzab() && zzt().zza(zzap.zza) && zzt().zzd(zza2.zzj())) {
                        zza2.zzj();
                        if (!TextUtils.isEmpty(null)) {
                            zza2.zzn(null);
                        }
                    }
                    Pair<String, Boolean> zza3 = zzs().zza(zzb2.zzc());
                    if (zzb2.zzaf() && zza3 != null && !TextUtils.isEmpty((CharSequence) zza3.first)) {
                        zza2.zzh(zza((String) zza3.first, Long.toString(zzanVar.zzd)));
                        Object obj = zza3.second;
                        if (obj != null) {
                            zza2.zza(((Boolean) obj).booleanValue());
                        }
                    }
                    zzl().zzaa();
                    zzbr.zzg.zza zzc = zza2.zzc(Build.MODEL);
                    zzl().zzaa();
                    zzc.zzb(Build.VERSION.RELEASE).zzf((int) zzl().zzf()).zzd(zzl().zzg());
                    zza2.zzi(zza(zzb2.zzd(), Long.toString(zzanVar.zzd)));
                    if (!TextUtils.isEmpty(zzb2.zzi())) {
                        zza2.zzl(zzb2.zzi());
                    }
                    String zzc2 = zzb2.zzc();
                    List<zzkn> zza4 = zzi().zza(zzc2);
                    Iterator<zzkn> it = zza4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzknVar = null;
                            break;
                        }
                        zzknVar = it.next();
                        if ("_lte".equals(zzknVar.zzc)) {
                            break;
                        }
                    }
                    if (zzknVar == null || zzknVar.zze == null) {
                        zzkn zzknVar2 = new zzkn(zzc2, "auto", "_lte", zzm().currentTimeMillis(), 0L);
                        zza4.add(zzknVar2);
                        zzi().zza(zzknVar2);
                    }
                    if (zzt().zze(zzc2, zzap.zzba)) {
                        zzki zzg = zzg();
                        zzg.zzr().zzx().zza("Checking account type status for ad personalization signals");
                        if (zzg.zzl().zzj()) {
                            String zzc3 = zzb2.zzc();
                            if (zzb2.zzaf() && zzg.zzj().zze(zzc3)) {
                                zzg.zzr().zzw().zza("Turning off ad personalization due to account type");
                                Iterator<zzkn> it2 = zza4.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zza4.add(new zzkn(zzc3, "auto", "_npa", zzg.zzm().currentTimeMillis(), 1L));
                            }
                        }
                    }
                    zzbr.zzk[] zzkVarArr = new zzbr.zzk[zza4.size()];
                    for (int i = 0; i < zza4.size(); i++) {
                        zzbr.zzk.zza zza5 = zzbr.zzk.zzj().zza(zza4.get(i).zzc).zza(zza4.get(i).zzd);
                        zzg().zza(zza5, zza4.get(i).zze);
                        zzkVarArr[i] = (zzbr.zzk) ((com.google.android.gms.internal.measurement.zzfd) zza5.zzu());
                    }
                    zza2.zzb(Arrays.asList(zzkVarArr));
                    Bundle zzb3 = zzanVar.zzb.zzb();
                    zzb3.putLong("_c", 1L);
                    zzr().zzw().zza("Marking in-app purchase as real-time");
                    zzb3.putLong("_r", 1L);
                    zzb3.putString("_o", zzanVar.zzc);
                    if (zzp().zzf(zza2.zzj())) {
                        zzp().zza(zzb3, "_dbg", (Object) 1L);
                        zzp().zza(zzb3, "_r", (Object) 1L);
                    }
                    zzaj zza6 = zzi().zza(str, zzanVar.zza);
                    if (zza6 == null) {
                        zzgVar = zzb2;
                        zzaVar = zza2;
                        zzaVar2 = zzb;
                        bundle = zzb3;
                        bArr = null;
                        zza = new zzaj(str, zzanVar.zza, 0L, 0L, zzanVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        zzaVar = zza2;
                        zzgVar = zzb2;
                        zzaVar2 = zzb;
                        bundle = zzb3;
                        bArr = null;
                        j = zza6.zzf;
                        zza = zza6.zza(zzanVar.zzd);
                    }
                    zzi().zza(zza);
                    zzak zzakVar = new zzak(this.zzx, zzanVar.zzc, str, zzanVar.zza, zzanVar.zzd, j, bundle);
                    zzbr.zzc.zza zzb4 = zzbr.zzc.zzj().zza(zzakVar.zzc).zza(zzakVar.zzb).zzb(zzakVar.zzd);
                    Iterator<String> it3 = zzakVar.zze.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        zzbr.zze.zza zza7 = zzbr.zze.zzh().zza(next);
                        zzg().zza(zza7, zzakVar.zze.zza(next));
                        zzb4.zza(zza7);
                    }
                    zzbr.zzg.zza zzaVar3 = zzaVar;
                    zzaVar3.zza(zzb4).zza(zzbr.zzh.zza().zza(zzbr.zzd.zza().zza(zza.zzc).zza(zzanVar.zza)));
                    zzaVar3.zzc(e_().zza(zzgVar.zzc(), Collections.emptyList(), zzaVar3.zzd(), Long.valueOf(zzb4.zzf())));
                    if (zzb4.zze()) {
                        zzaVar3.zzb(zzb4.zzf()).zzc(zzb4.zzf());
                    }
                    long zzk = zzgVar.zzk();
                    int i2 = (zzk > 0L ? 1 : (zzk == 0L ? 0 : -1));
                    if (i2 != 0) {
                        zzaVar3.zze(zzk);
                    }
                    long zzj = zzgVar.zzj();
                    if (zzj != 0) {
                        zzaVar3.zzd(zzj);
                    } else if (i2 != 0) {
                        zzaVar3.zzd(zzk);
                    }
                    zzgVar.zzv();
                    zzaVar3.zzg((int) zzgVar.zzs()).zzg(zzt().zze()).zza(zzm().currentTimeMillis()).zzb(true);
                    zzbr.zzf.zza zzaVar4 = zzaVar2;
                    zzaVar4.zza(zzaVar3);
                    zzg zzgVar2 = zzgVar;
                    zzgVar2.zza(zzaVar3.zzf());
                    zzgVar2.zzb(zzaVar3.zzg());
                    zzi().zza(zzgVar2);
                    zzi().b_();
                    try {
                        return zzg().zzc(((zzbr.zzf) ((com.google.android.gms.internal.measurement.zzfd) zzaVar4.zzu())).zzbi());
                    } catch (IOException e) {
                        zzr().zzf().zza("Data loss. Failed to bundle and serialize. appId", zzew.zza(str), e);
                        return bArr;
                    }
                }
            } catch (SecurityException e2) {
                zzr().zzw().zza("Resettable device id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                zzr().zzw().zza("app instance id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                zzi().zzh();
            }
        }
    }

    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}

package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzei extends zzea implements Set {
    private transient zzee zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzei zzj(Collection collection) {
        Object[] array = collection.toArray();
        return zzm(array.length, array);
    }

    public static zzei zzk() {
        return zzer.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzei) && zzl() && ((zzei) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzes.zza(this);
    }

    @Override // com.google.android.gms.internal.cast.zzea
    public zzee zzd() {
        zzee zzeeVar = this.zza;
        if (zzeeVar == null) {
            zzee zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzeeVar;
    }

    @Override // com.google.android.gms.internal.cast.zzea, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzeu iterator();

    zzee zzi() {
        return zzee.zzj(toArray());
    }

    boolean zzl() {
        return false;
    }

    private static zzei zzm(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new zzet(obj);
            }
            int zzh = zzh(i);
            Object[] objArr2 = new Object[zzh];
            int i2 = zzh - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr[i5];
                zzek.zza(obj2, i5);
                int hashCode = obj2.hashCode();
                int zza = zzdx.zza(hashCode);
                while (true) {
                    int i6 = zza & i2;
                    Object obj3 = objArr2[i6];
                    if (obj3 != null) {
                        if (obj3.equals(obj2)) {
                            break;
                        }
                        zza++;
                    } else {
                        objArr[i4] = obj2;
                        objArr2[i6] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new zzet(obj4);
            } else if (zzh(i4) < zzh / 2) {
                return zzm(i4, objArr);
            } else {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzer(objArr, i3, objArr2, i2, i4);
            }
        }
        return zzer.zza;
    }
}

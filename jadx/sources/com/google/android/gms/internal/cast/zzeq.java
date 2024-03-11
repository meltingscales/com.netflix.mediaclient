package com.google.android.gms.internal.cast;

import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeq extends zzeh {
    static final zzeh zza = new zzeq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzeq(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static zzeq zzh(int i, Object[] objArr, zzeg zzegVar) {
        byte[] bArr;
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i2 == 0) {
            return (zzeq) zza;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zzdw.zza(obj2, obj3);
            return new zzeq(null, objArr2, 1);
        }
        zzdr.zzb(i2, objArr2.length >> 1, "index");
        int zzh = zzei.zzh(i);
        if (i2 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zzdw.zza(obj4, obj5);
        } else {
            int i3 = zzh - 1;
            if (zzh <= 128) {
                bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 + i5;
                    int i7 = i4 + i4;
                    Object obj6 = objArr2[i6];
                    obj6.getClass();
                    Object obj7 = objArr2[i6 ^ 1];
                    obj7.getClass();
                    zzdw.zza(obj6, obj7);
                    int zza2 = zzdx.zza(obj6.hashCode());
                    while (true) {
                        int i8 = zza2 & i3;
                        int i9 = bArr[i8] & PrivateKeyType.INVALID;
                        if (i9 != 255) {
                            if (obj6.equals(objArr2[i9])) {
                                int i10 = i9 ^ 1;
                                Object obj8 = objArr2[i10];
                                obj8.getClass();
                                zzef zzefVar = new zzef(obj6, obj7, obj8);
                                objArr2[i10] = obj7;
                                obj = zzefVar;
                                break;
                            }
                            zza2 = i8 + 1;
                        } else {
                            bArr[i8] = (byte) i7;
                            if (i4 < i5) {
                                objArr2[i7] = obj6;
                                objArr2[i7 ^ 1] = obj7;
                            }
                            i4++;
                        }
                    }
                }
                if (i4 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i4), obj};
                }
                obj = bArr;
            } else if (zzh <= 32768) {
                bArr = new short[zzh];
                Arrays.fill(bArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj9 = objArr2[i13];
                    obj9.getClass();
                    Object obj10 = objArr2[i13 ^ 1];
                    obj10.getClass();
                    zzdw.zza(obj9, obj10);
                    int zza3 = zzdx.zza(obj9.hashCode());
                    while (true) {
                        int i15 = zza3 & i3;
                        char c = (char) bArr[i15];
                        if (c != 65535) {
                            if (obj9.equals(objArr2[c])) {
                                int i16 = c ^ 1;
                                Object obj11 = objArr2[i16];
                                obj11.getClass();
                                zzef zzefVar2 = new zzef(obj9, obj10, obj11);
                                objArr2[i16] = obj10;
                                obj = zzefVar2;
                                break;
                            }
                            zza3 = i15 + 1;
                        } else {
                            bArr[i15] = (short) i14;
                            if (i11 < i12) {
                                objArr2[i14] = obj9;
                                objArr2[i14 ^ 1] = obj10;
                            }
                            i11++;
                        }
                    }
                }
                if (i11 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i11), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[zzh];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    int i19 = i18 + i18;
                    int i20 = i17 + i17;
                    Object obj12 = objArr2[i19];
                    obj12.getClass();
                    Object obj13 = objArr2[i19 ^ 1];
                    obj13.getClass();
                    zzdw.zza(obj12, obj13);
                    int zza4 = zzdx.zza(obj12.hashCode());
                    while (true) {
                        int i21 = zza4 & i3;
                        ?? r14 = bArr[i21];
                        if (r14 != -1) {
                            if (obj12.equals(objArr2[r14])) {
                                int i22 = r14 ^ 1;
                                Object obj14 = objArr2[i22];
                                obj14.getClass();
                                zzef zzefVar3 = new zzef(obj12, obj13, obj14);
                                objArr2[i22] = obj13;
                                obj = zzefVar3;
                                break;
                            }
                            zza4 = i21 + 1;
                        } else {
                            bArr[i21] = i20;
                            if (i17 < i18) {
                                objArr2[i20] = obj12;
                                objArr2[i20 ^ 1] = obj13;
                            }
                            i17++;
                        }
                    }
                }
                if (i17 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i17), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzegVar.zzc = (zzef) objArr3[2];
            Object obj15 = objArr3[0];
            int intValue = ((Integer) objArr3[1]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj = obj15;
            i2 = intValue;
        }
        return new zzeq(obj, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[RETURN] */
    @Override // com.google.android.gms.internal.cast.zzeh, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzc
            java.lang.Object[] r1 = r8.zzb
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lb
            goto L8f
        Lb:
            r4 = 1
            if (r2 != r4) goto L21
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L8f
            r9 = r1[r4]
            r9.getClass()
            goto L9d
        L21:
            if (r0 != 0) goto L25
            goto L8f
        L25:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r5 = r2.length
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.cast.zzdx.zza(r0)
        L35:
            int r6 = r5 + (-1)
            r0 = r0 & r6
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L8f
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9d
        L4d:
            int r0 = r0 + 1
            goto L35
        L50:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r0
            short[] r2 = (short[]) r2
            int r5 = r2.length
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.cast.zzdx.zza(r0)
        L60:
            int r6 = r5 + (-1)
            r0 = r0 & r6
            short r6 = r2[r0]
            char r6 = (char) r6
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r6 != r7) goto L6c
            goto L8f
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9d
        L79:
            int r0 = r0 + 1
            goto L60
        L7c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.cast.zzdx.zza(r5)
        L87:
            int r6 = r2 + (-1)
            r5 = r5 & r6
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L91
        L8f:
            r9 = r3
            goto L9d
        L91:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La1
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9d:
            if (r9 != 0) goto La0
            return r3
        La0:
            return r9
        La1:
            int r5 = r5 + 1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzeq.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.cast.zzeh
    final zzea zza() {
        return new zzep(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzeh
    final zzei zze() {
        return new zzen(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzeh
    final zzei zzf() {
        return new zzeo(this, new zzep(this.zzb, 0, this.zzd));
    }
}

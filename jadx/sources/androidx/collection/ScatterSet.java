package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public abstract class ScatterSet<E> {
    public int _capacity;
    public int _size;
    public Object[] elements;
    public long[] metadata;

    public /* synthetic */ ScatterSet(C8627dsp c8627dsp) {
        this();
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    private ScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM drm, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            String str = (i2 & 2) != 0 ? "" : charSequence2;
            String str2 = (i2 & 4) == 0 ? charSequence3 : "";
            if ((i2 & 8) != 0) {
                i = -1;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence5 = charSequence4;
            drM<? super E, ? extends CharSequence> drm2 = drm;
            if ((i2 & 32) != 0) {
                drm2 = null;
            }
            return scatterSet.joinToString(charSequence, str, str2, i3, charSequence5, drm2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super E, ? extends CharSequence> drm) {
        Object[] objArr;
        Object[] objArr2;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr3 = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            Object obj = objArr3[(i4 << 3) + i6];
                            objArr2 = objArr3;
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            if (drm == null) {
                                sb.append(obj);
                            } else {
                                sb.append(drm.invoke(obj));
                            }
                            i3++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i6++;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                objArr3 = objArr;
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }
        sb.append(charSequence3);
        String sb22 = sb.toString();
        C8632dsu.a(sb22, "");
        return sb22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScatterSet) {
            ScatterSet scatterSet = (ScatterSet) obj;
            if (scatterSet.getSize() != getSize()) {
                return false;
            }
            Object[] objArr = this.elements;
            long[] jArr = this.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128 && !scatterSet.contains(objArr[(i << 3) + i3])) {
                                return false;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new drM<E, CharSequence>(this) { // from class: androidx.collection.ScatterSet$toString$1
            final /* synthetic */ ScatterSet<E> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((ScatterSet$toString$1<E>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final CharSequence invoke(E e) {
                return e == this.this$0 ? "(this)" : String.valueOf(e);
            }
        }, 25, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r18.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            int r4 = r0._capacity
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            long[] r7 = r0.metadata
            int r8 = r5 >> 3
            r9 = r5 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r15 = 63
            long r13 = r13 >> r15
            long r7 = r7 & r13
            long r9 = r10 >>> r9
            long r7 = r7 | r9
            r9 = r3 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            r15 = r3
            long r2 = ~r9
            long r9 = r9 - r13
            long r2 = r2 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r9
        L48:
            r13 = 0
            int r16 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r16 == 0) goto L6a
            int r13 = java.lang.Long.numberOfTrailingZeros(r2)
            int r13 = r13 >> 3
            int r13 = r13 + r5
            r13 = r13 & r4
            java.lang.Object[] r14 = r0.elements
            r14 = r14[r13]
            boolean r14 = o.C8632dsu.c(r14, r1)
            if (r14 == 0) goto L64
            if (r13 < 0) goto L73
            r2 = r12
            goto L74
        L64:
            r13 = 1
            long r13 = r2 - r13
            long r2 = r2 & r13
            goto L48
        L6a:
            long r2 = ~r7
            r12 = 6
            long r2 = r2 << r12
            long r2 = r2 & r7
            long r2 = r2 & r9
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L75
        L73:
            r2 = 0
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r15
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.contains(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i5];
                            i3 += obj != null ? obj.hashCode() : 0;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }
}

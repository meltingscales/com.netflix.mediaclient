package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.model.leafs.originals.BillboardAsset;

/* loaded from: classes4.dex */
public final class bTL {
    private final Integer a;
    private final int b;
    private final BillboardAsset c;
    private final Integer d;
    private final BillboardAsset e;
    private final boolean g;
    private final String h;
    private final boolean i;
    private final String j;

    public final BillboardAsset a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.h;
    }

    public final Integer d() {
        return this.d;
    }

    public final Integer e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bTL) {
            bTL btl = (bTL) obj;
            return this.b == btl.b && C8632dsu.c(this.c, btl.c) && C8632dsu.c(this.e, btl.e) && C8632dsu.c((Object) this.j, (Object) btl.j) && C8632dsu.c((Object) this.h, (Object) btl.h) && this.i == btl.i && this.g == btl.g && C8632dsu.c(this.a, btl.a) && C8632dsu.c(this.d, btl.d);
        }
        return false;
    }

    public final boolean f() {
        return this.i;
    }

    public final String g() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.b);
        BillboardAsset billboardAsset = this.c;
        int hashCode2 = billboardAsset == null ? 0 : billboardAsset.hashCode();
        BillboardAsset billboardAsset2 = this.e;
        int hashCode3 = billboardAsset2 == null ? 0 : billboardAsset2.hashCode();
        String str = this.j;
        int hashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.h;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        int hashCode6 = Boolean.hashCode(this.i);
        int hashCode7 = Boolean.hashCode(this.g);
        Integer num = this.a;
        int hashCode8 = num == null ? 0 : num.hashCode();
        Integer num2 = this.d;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean i() {
        return this.g;
    }

    public String toString() {
        int i = this.b;
        BillboardAsset billboardAsset = this.c;
        BillboardAsset billboardAsset2 = this.e;
        String str = this.j;
        String str2 = this.h;
        boolean z = this.i;
        boolean z2 = this.g;
        Integer num = this.a;
        Integer num2 = this.d;
        return "LolomoBackground(billboardVideoId=" + i + ", billboardAsset=" + billboardAsset + ", horizontalBillboardAsset=" + billboardAsset2 + ", imageUrl=" + str + ", horizontalImageUrl=" + str2 + ", isFullBleedVertical=" + z + ", isGameBillboard=" + z2 + ", dominantBackgroundColor=" + num + ", horizontalBackgroundColor=" + num2 + ")";
    }

    public bTL(int i, BillboardAsset billboardAsset, BillboardAsset billboardAsset2, String str, String str2, boolean z, boolean z2, Integer num, Integer num2) {
        this.b = i;
        this.c = billboardAsset;
        this.e = billboardAsset2;
        this.j = str;
        this.h = str2;
        this.i = z;
        this.g = z2;
        this.a = num;
        this.d = num2;
    }

    public /* synthetic */ bTL(int i, BillboardAsset billboardAsset, BillboardAsset billboardAsset2, String str, String str2, boolean z, boolean z2, Integer num, Integer num2, int i2, C8627dsp c8627dsp) {
        this(i, billboardAsset, billboardAsset2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : num, (i2 & JSONzip.end) != 0 ? null : num2);
    }
}

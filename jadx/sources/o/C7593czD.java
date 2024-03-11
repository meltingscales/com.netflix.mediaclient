package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.czD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7593czD {
    @SerializedName("userMarks")
    private List<C7969dbY> a;
    @SerializedName("inUserMarksPlayback")
    private boolean c;
    @SerializedName("currentUserMarkPosition")
    private int d;

    public C7593czD() {
        this(false, 0, null, 7, null);
    }

    public final int b() {
        return this.d;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final boolean c() {
        return this.c;
    }

    public final List<C7969dbY> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7593czD) {
            C7593czD c7593czD = (C7593czD) obj;
            return this.c == c7593czD.c && this.d == c7593czD.d && C8632dsu.c(this.a, c7593czD.a);
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.c) * 31) + Integer.hashCode(this.d)) * 31) + this.a.hashCode();
    }

    public String toString() {
        boolean z = this.c;
        int i = this.d;
        List<C7969dbY> list = this.a;
        return "UserMarksExtras(inUserMarksPlayback=" + z + ", currentUserMarkPosition=" + i + ", userMarks=" + list + ")";
    }

    public C7593czD(boolean z, int i, List<C7969dbY> list) {
        C8632dsu.c((Object) list, "");
        this.c = z;
        this.d = i;
        this.a = list;
    }

    public /* synthetic */ C7593czD(boolean z, int i, List list, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C8569dql.i() : list);
    }
}

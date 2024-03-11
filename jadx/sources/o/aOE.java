package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aOE {
    @SerializedName("count")
    private int c;
    @SerializedName("reported")
    private boolean d;

    public final int a() {
        return this.c;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void b(int i) {
        this.c = i;
    }

    public final boolean b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aOE) {
            aOE aoe = (aOE) obj;
            return this.c == aoe.c && this.d == aoe.d;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.c) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        int i = this.c;
        boolean z = this.d;
        return "PromptedPairingHistorySession(count=" + i + ", reported=" + z + ")";
    }

    public aOE(int i, boolean z) {
        this.c = i;
        this.d = z;
    }
}

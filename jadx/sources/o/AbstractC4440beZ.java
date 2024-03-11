package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beZ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4440beZ extends AbstractC4559bgm {
    private final int c;
    private final int e;

    @Override // o.AbstractC4559bgm
    @SerializedName("offset")
    public int b() {
        return this.c;
    }

    @Override // o.AbstractC4559bgm
    @SerializedName("size")
    public int c() {
        return this.e;
    }

    public int hashCode() {
        return ((this.c ^ 1000003) * 1000003) ^ this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4440beZ(int i, int i2) {
        this.c = i;
        this.e = i2;
    }

    public String toString() {
        return "HeaderBox{offset=" + this.c + ", size=" + this.e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4559bgm) {
            AbstractC4559bgm abstractC4559bgm = (AbstractC4559bgm) obj;
            return this.c == abstractC4559bgm.b() && this.e == abstractC4559bgm.c();
        }
        return false;
    }
}

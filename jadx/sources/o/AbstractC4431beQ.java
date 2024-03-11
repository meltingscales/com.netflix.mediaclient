package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beQ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4431beQ extends AbstractC4518bfy {
    private final String a;
    private final String d;

    @Override // o.AbstractC4518bfy
    @SerializedName("adEventToken")
    public String c() {
        return this.d;
    }

    @Override // o.AbstractC4518bfy
    @SerializedName("event")
    public String d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4431beQ(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null event");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null adEventToken");
        }
        this.d = str2;
    }

    public String toString() {
        return "ActionAdEvent{event=" + this.a + ", adEventToken=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4518bfy) {
            AbstractC4518bfy abstractC4518bfy = (AbstractC4518bfy) obj;
            return this.a.equals(abstractC4518bfy.d()) && this.d.equals(abstractC4518bfy.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode();
    }
}

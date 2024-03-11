package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4510bfq extends AbstractC4533bgM {
    private final String a;
    private final long c;
    private final String e;

    @Override // o.AbstractC4533bgM
    @SerializedName("timeMs")
    public long a() {
        return this.c;
    }

    @Override // o.AbstractC4533bgM
    @SerializedName("adEventToken")
    public String d() {
        return this.a;
    }

    @Override // o.AbstractC4533bgM
    @SerializedName("event")
    public String e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4510bfq(String str, long j, String str2) {
        if (str == null) {
            throw new NullPointerException("Null event");
        }
        this.e = str;
        this.c = j;
        if (str2 == null) {
            throw new NullPointerException("Null adEventToken");
        }
        this.a = str2;
    }

    public String toString() {
        return "TimedAdEvent{event=" + this.e + ", timeMs=" + this.c + ", adEventToken=" + this.a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4533bgM) {
            AbstractC4533bgM abstractC4533bgM = (AbstractC4533bgM) obj;
            return this.e.equals(abstractC4533bgM.e()) && this.c == abstractC4533bgM.a() && this.a.equals(abstractC4533bgM.d());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        long j = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.a.hashCode();
    }
}

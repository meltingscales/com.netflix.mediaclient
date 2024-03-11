package o;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beX  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4438beX extends AbstractC4556bgj {
    private final Map<String, AbstractC4531bgK> a;
    private final long b;
    private final String d;

    @Override // o.AbstractC4556bgj
    @SerializedName("segments")
    public Map<String, AbstractC4531bgK> a() {
        return this.a;
    }

    @Override // o.AbstractC4556bgj
    @SerializedName("initialSegment")
    public String b() {
        return this.d;
    }

    @Override // o.AbstractC4556bgj
    @SerializedName("viewableId")
    public long c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4438beX(String str, long j, Map<String, AbstractC4531bgK> map) {
        if (str == null) {
            throw new NullPointerException("Null initialSegment");
        }
        this.d = str;
        this.b = j;
        if (map == null) {
            throw new NullPointerException("Null segments");
        }
        this.a = map;
    }

    public String toString() {
        return "ChoiceMap{initialSegment=" + this.d + ", viewableId=" + this.b + ", segments=" + this.a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4556bgj) {
            AbstractC4556bgj abstractC4556bgj = (AbstractC4556bgj) obj;
            return this.d.equals(abstractC4556bgj.b()) && this.b == abstractC4556bgj.c() && this.a.equals(abstractC4556bgj.a());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.a.hashCode();
    }
}

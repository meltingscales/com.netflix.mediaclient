package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4432beR extends AbstractC4470bfC {
    private final List<AbstractC4468bfA> a;
    private final String b;
    private final String c;
    private final Map<String, AbstractC4518bfy> d;
    private final long e;

    @Override // o.AbstractC4470bfC
    @SerializedName("ads")
    public List<AbstractC4468bfA> a() {
        return this.a;
    }

    @Override // o.AbstractC4470bfC
    @SerializedName("locationMs")
    public long b() {
        return this.e;
    }

    @Override // o.AbstractC4470bfC
    @SerializedName("actionAdBreakEvents")
    public Map<String, AbstractC4518bfy> c() {
        return this.d;
    }

    @Override // o.AbstractC4470bfC
    @SerializedName("auditPingUrl")
    public String d() {
        return this.b;
    }

    @Override // o.AbstractC4470bfC
    @SerializedName("adBreakToken")
    public String e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4432beR(long j, List<AbstractC4468bfA> list, Map<String, AbstractC4518bfy> map, String str, String str2) {
        this.e = j;
        this.a = list;
        if (map == null) {
            throw new NullPointerException("Null actionAdBreakEvents");
        }
        this.d = map;
        this.b = str;
        this.c = str2;
    }

    public String toString() {
        return "AdBreak{locationMs=" + this.e + ", ads=" + this.a + ", actionAdBreakEvents=" + this.d + ", auditPingUrl=" + this.b + ", adBreakToken=" + this.c + "}";
    }

    public boolean equals(Object obj) {
        List<AbstractC4468bfA> list;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4470bfC) {
            AbstractC4470bfC abstractC4470bfC = (AbstractC4470bfC) obj;
            if (this.e == abstractC4470bfC.b() && ((list = this.a) != null ? list.equals(abstractC4470bfC.a()) : abstractC4470bfC.a() == null) && this.d.equals(abstractC4470bfC.c()) && ((str = this.b) != null ? str.equals(abstractC4470bfC.d()) : abstractC4470bfC.d() == null)) {
                String str2 = this.c;
                if (str2 == null) {
                    if (abstractC4470bfC.e() == null) {
                        return true;
                    }
                } else if (str2.equals(abstractC4470bfC.e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.e;
        int i = (int) (j ^ (j >>> 32));
        List<AbstractC4468bfA> list = this.a;
        int hashCode = list == null ? 0 : list.hashCode();
        int hashCode2 = this.d.hashCode();
        String str = this.b;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        return ((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}

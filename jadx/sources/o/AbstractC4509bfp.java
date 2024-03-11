package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4509bfp extends AbstractC4532bgL {
    private final JsonObject c;
    private final List<String> d;

    @Override // o.AbstractC4532bgL
    @SerializedName("streamingClientConfig")
    public JsonObject a() {
        return this.c;
    }

    @Override // o.AbstractC4532bgL
    @SerializedName("additionalGroupNames")
    public List<String> e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4509bfp(List<String> list, JsonObject jsonObject) {
        if (list == null) {
            throw new NullPointerException("Null additionalGroupNames");
        }
        this.d = list;
        this.c = jsonObject;
    }

    public String toString() {
        return "SteeringAdditionalInfo{additionalGroupNames=" + this.d + ", streamingClientConfig=" + this.c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4532bgL) {
            AbstractC4532bgL abstractC4532bgL = (AbstractC4532bgL) obj;
            if (this.d.equals(abstractC4532bgL.e())) {
                JsonObject jsonObject = this.c;
                if (jsonObject == null) {
                    if (abstractC4532bgL.a() == null) {
                        return true;
                    }
                } else if (jsonObject.equals(abstractC4532bgL.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        JsonObject jsonObject = this.c;
        return ((hashCode ^ 1000003) * 1000003) ^ (jsonObject == null ? 0 : jsonObject.hashCode());
    }
}

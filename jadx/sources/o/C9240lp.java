package o;

import java.util.Map;

/* renamed from: o.lp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9240lp implements Map.Entry<String, String> {
    private final String a;
    private final String d;

    @Override // java.util.Map.Entry
    /* renamed from: a */
    public String getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: e */
    public String getKey() {
        return this.d;
    }

    public C9240lp(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("FeatureFlags cannot have null name");
        }
        this.d = str;
        this.a = str2;
    }

    @Override // java.util.Map.Entry
    /* renamed from: b */
    public String setValue(String str) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return getKey().hashCode() ^ (getValue() == null ? 0 : getValue().hashCode());
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (getKey().equals(entry.getKey())) {
                if (getValue() == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (getValue().equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return "FeatureFlag{name='" + this.d + "', variant='" + this.a + "'}";
    }
}

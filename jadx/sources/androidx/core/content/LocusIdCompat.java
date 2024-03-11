package androidx.core.content;

import android.content.LocusId;

/* loaded from: classes2.dex */
public final class LocusIdCompat {
    private final String mId;
    private final LocusId mWrapped;

    public LocusId toLocusId() {
        return this.mWrapped;
    }

    public int hashCode() {
        String str = this.mId;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocusIdCompat.class == obj.getClass()) {
            LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
            String str = this.mId;
            if (str == null) {
                return locusIdCompat.mId == null;
            }
            return str.equals(locusIdCompat.mId);
        }
        return false;
    }

    public String toString() {
        return "LocusIdCompat[" + getSanitizedId() + "]";
    }

    private String getSanitizedId() {
        int length = this.mId.length();
        return length + "_chars";
    }
}

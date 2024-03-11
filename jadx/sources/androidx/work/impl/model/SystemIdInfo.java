package androidx.work.impl.model;

/* loaded from: classes2.dex */
public class SystemIdInfo {
    public final int systemId;
    public final String workSpecId;

    public SystemIdInfo(String str, int i) {
        this.workSpecId = str;
        this.systemId = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SystemIdInfo) {
            SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
            if (this.systemId != systemIdInfo.systemId) {
                return false;
            }
            return this.workSpecId.equals(systemIdInfo.workSpecId);
        }
        return false;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.systemId;
    }
}

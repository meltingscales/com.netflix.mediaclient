package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Moment;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Moment_MomentOverride  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Moment_MomentOverride extends Moment.MomentOverride {
    private final Moment data;
    private final String preconditionId;

    @Override // com.netflix.model.leafs.originals.interactive.Moment.MomentOverride
    public Moment data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Moment.MomentOverride
    public String preconditionId() {
        return this.preconditionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Moment_MomentOverride(Moment moment, String str) {
        if (moment == null) {
            throw new NullPointerException("Null data");
        }
        this.data = moment;
        this.preconditionId = str;
    }

    public String toString() {
        return "MomentOverride{data=" + this.data + ", preconditionId=" + this.preconditionId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Moment.MomentOverride) {
            Moment.MomentOverride momentOverride = (Moment.MomentOverride) obj;
            if (this.data.equals(momentOverride.data())) {
                String str = this.preconditionId;
                if (str == null) {
                    if (momentOverride.preconditionId() == null) {
                        return true;
                    }
                } else if (str.equals(momentOverride.preconditionId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode();
        String str = this.preconditionId;
        return ((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }
}

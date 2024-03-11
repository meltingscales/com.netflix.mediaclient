package com.netflix.model.leafs.social;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.social.IsRead;

/* renamed from: com.netflix.model.leafs.social.$$AutoValue_IsRead  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_IsRead extends IsRead {
    private final boolean read;

    public int hashCode() {
        return (this.read ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.netflix.model.leafs.social.IsRead
    @SerializedName("isRead")
    public boolean read() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_IsRead(boolean z) {
        this.read = z;
    }

    public String toString() {
        return "IsRead{read=" + this.read + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof IsRead) && this.read == ((IsRead) obj).read();
    }

    @Override // com.netflix.model.leafs.social.IsRead
    public IsRead.Builder toBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.netflix.model.leafs.social.$$AutoValue_IsRead$Builder */
    /* loaded from: classes.dex */
    static final class Builder extends IsRead.Builder {
        private Boolean read;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(IsRead isRead) {
            this.read = Boolean.valueOf(isRead.read());
        }

        @Override // com.netflix.model.leafs.social.IsRead.Builder
        public IsRead.Builder read(boolean z) {
            this.read = Boolean.valueOf(z);
            return this;
        }

        @Override // com.netflix.model.leafs.social.IsRead.Builder
        public IsRead build() {
            String str = "";
            if (this.read == null) {
                str = " read";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_IsRead(this.read.booleanValue());
        }
    }
}

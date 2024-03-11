package androidx.work;

/* loaded from: classes2.dex */
public final class Constraints {
    public static final Constraints NONE = new Builder().build();
    private ContentUriTriggers mContentUriTriggers;
    private NetworkType mRequiredNetworkType;
    private boolean mRequiresBatteryNotLow;
    private boolean mRequiresCharging;
    private boolean mRequiresDeviceIdle;
    private boolean mRequiresStorageNotLow;
    private long mTriggerContentUpdateDelay;
    private long mTriggerMaxContentDelay;

    public ContentUriTriggers getContentUriTriggers() {
        return this.mContentUriTriggers;
    }

    public NetworkType getRequiredNetworkType() {
        return this.mRequiredNetworkType;
    }

    public long getTriggerContentUpdateDelay() {
        return this.mTriggerContentUpdateDelay;
    }

    public long getTriggerMaxContentDelay() {
        return this.mTriggerMaxContentDelay;
    }

    public boolean requiresBatteryNotLow() {
        return this.mRequiresBatteryNotLow;
    }

    public boolean requiresCharging() {
        return this.mRequiresCharging;
    }

    public boolean requiresDeviceIdle() {
        return this.mRequiresDeviceIdle;
    }

    public boolean requiresStorageNotLow() {
        return this.mRequiresStorageNotLow;
    }

    public void setContentUriTriggers(ContentUriTriggers contentUriTriggers) {
        this.mContentUriTriggers = contentUriTriggers;
    }

    public void setRequiredNetworkType(NetworkType networkType) {
        this.mRequiredNetworkType = networkType;
    }

    public void setRequiresBatteryNotLow(boolean z) {
        this.mRequiresBatteryNotLow = z;
    }

    public void setRequiresCharging(boolean z) {
        this.mRequiresCharging = z;
    }

    public void setRequiresDeviceIdle(boolean z) {
        this.mRequiresDeviceIdle = z;
    }

    public void setRequiresStorageNotLow(boolean z) {
        this.mRequiresStorageNotLow = z;
    }

    public void setTriggerContentUpdateDelay(long j) {
        this.mTriggerContentUpdateDelay = j;
    }

    public void setTriggerMaxContentDelay(long j) {
        this.mTriggerMaxContentDelay = j;
    }

    public Constraints() {
        this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new ContentUriTriggers();
    }

    Constraints(Builder builder) {
        this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new ContentUriTriggers();
        this.mRequiresCharging = builder.mRequiresCharging;
        this.mRequiresDeviceIdle = builder.mRequiresDeviceIdle;
        this.mRequiredNetworkType = builder.mRequiredNetworkType;
        this.mRequiresBatteryNotLow = builder.mRequiresBatteryNotLow;
        this.mRequiresStorageNotLow = builder.mRequiresStorageNotLow;
        this.mContentUriTriggers = builder.mContentUriTriggers;
        this.mTriggerContentUpdateDelay = builder.mTriggerContentUpdateDelay;
        this.mTriggerMaxContentDelay = builder.mTriggerContentMaxDelay;
    }

    public Constraints(Constraints constraints) {
        this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new ContentUriTriggers();
        this.mRequiresCharging = constraints.mRequiresCharging;
        this.mRequiresDeviceIdle = constraints.mRequiresDeviceIdle;
        this.mRequiredNetworkType = constraints.mRequiredNetworkType;
        this.mRequiresBatteryNotLow = constraints.mRequiresBatteryNotLow;
        this.mRequiresStorageNotLow = constraints.mRequiresStorageNotLow;
        this.mContentUriTriggers = constraints.mContentUriTriggers;
    }

    public boolean hasContentUriTriggers() {
        return this.mContentUriTriggers.size() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Constraints.class != obj.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.mRequiresCharging == constraints.mRequiresCharging && this.mRequiresDeviceIdle == constraints.mRequiresDeviceIdle && this.mRequiresBatteryNotLow == constraints.mRequiresBatteryNotLow && this.mRequiresStorageNotLow == constraints.mRequiresStorageNotLow && this.mTriggerContentUpdateDelay == constraints.mTriggerContentUpdateDelay && this.mTriggerMaxContentDelay == constraints.mTriggerMaxContentDelay && this.mRequiredNetworkType == constraints.mRequiredNetworkType) {
            return this.mContentUriTriggers.equals(constraints.mContentUriTriggers);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.mRequiredNetworkType.hashCode();
        boolean z = this.mRequiresCharging;
        boolean z2 = this.mRequiresDeviceIdle;
        boolean z3 = this.mRequiresBatteryNotLow;
        boolean z4 = this.mRequiresStorageNotLow;
        long j = this.mTriggerContentUpdateDelay;
        long j2 = this.mTriggerMaxContentDelay;
        ContentUriTriggers contentUriTriggers = this.mContentUriTriggers;
        return (((((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + contentUriTriggers.hashCode();
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        boolean mRequiresCharging = false;
        boolean mRequiresDeviceIdle = false;
        NetworkType mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        boolean mRequiresBatteryNotLow = false;
        boolean mRequiresStorageNotLow = false;
        long mTriggerContentUpdateDelay = -1;
        long mTriggerContentMaxDelay = -1;
        ContentUriTriggers mContentUriTriggers = new ContentUriTriggers();

        public Builder setRequiredNetworkType(NetworkType networkType) {
            this.mRequiredNetworkType = networkType;
            return this;
        }

        public Constraints build() {
            return new Constraints(this);
        }
    }
}

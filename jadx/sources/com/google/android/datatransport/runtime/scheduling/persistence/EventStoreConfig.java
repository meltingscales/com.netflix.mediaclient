package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class EventStoreConfig {
    static final EventStoreConfig DEFAULT = builder().setMaxStorageSizeInBytes(10485760).setLoadBatchSize(200).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(604800000).build();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        abstract EventStoreConfig build();

        abstract Builder setCriticalSectionEnterTimeoutMs(int i);

        abstract Builder setEventCleanUpAge(long j);

        abstract Builder setLoadBatchSize(int i);

        abstract Builder setMaxStorageSizeInBytes(long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getCriticalSectionEnterTimeoutMs();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long getEventCleanUpAge();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getLoadBatchSize();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long getMaxStorageSizeInBytes();

    static Builder builder() {
        return new AutoValue_EventStoreConfig.Builder();
    }
}

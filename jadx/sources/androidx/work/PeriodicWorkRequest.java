package androidx.work;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class PeriodicWorkRequest extends WorkRequest {
    PeriodicWorkRequest(Builder builder) {
        super(builder.mId, builder.mWorkSpec, builder.mTags);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public Builder getThis() {
            return this;
        }

        public Builder(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            this.mWorkSpec.setPeriodic(timeUnit.toMillis(j));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public PeriodicWorkRequest buildInternal() {
            if (this.mBackoffCriteriaSet && this.mWorkSpec.constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new PeriodicWorkRequest(this);
        }
    }
}

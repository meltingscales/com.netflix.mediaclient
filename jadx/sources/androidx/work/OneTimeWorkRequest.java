package androidx.work;

import androidx.work.WorkRequest;

/* loaded from: classes5.dex */
public final class OneTimeWorkRequest extends WorkRequest {
    public static OneTimeWorkRequest from(Class<? extends ListenableWorker> cls) {
        return new Builder(cls).build();
    }

    OneTimeWorkRequest(Builder builder) {
        super(builder.mId, builder.mWorkSpec, builder.mTags);
    }

    /* loaded from: classes5.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public Builder getThis() {
            return this;
        }

        public Builder(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.mWorkSpec.inputMergerClassName = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public OneTimeWorkRequest buildInternal() {
            if (this.mBackoffCriteriaSet && this.mWorkSpec.constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this);
        }
    }
}

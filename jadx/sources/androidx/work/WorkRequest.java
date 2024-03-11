package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class WorkRequest {
    private UUID mId;
    private Set<String> mTags;
    private WorkSpec mWorkSpec;

    public Set<String> getTags() {
        return this.mTags;
    }

    public WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorkRequest(UUID uuid, WorkSpec workSpec, Set<String> set) {
        this.mId = uuid;
        this.mWorkSpec = workSpec;
        this.mTags = set;
    }

    public String getStringId() {
        return this.mId.toString();
    }

    /* loaded from: classes2.dex */
    public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest> {
        WorkSpec mWorkSpec;
        Class<? extends ListenableWorker> mWorkerClass;
        boolean mBackoffCriteriaSet = false;
        Set<String> mTags = new HashSet();
        UUID mId = UUID.randomUUID();

        abstract W buildInternal();

        abstract B getThis();

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(Class<? extends ListenableWorker> cls) {
            this.mWorkerClass = cls;
            this.mWorkSpec = new WorkSpec(this.mId.toString(), cls.getName());
            addTag(cls.getName());
        }

        public final B setConstraints(Constraints constraints) {
            this.mWorkSpec.constraints = constraints;
            return getThis();
        }

        public final B setInputData(Data data) {
            this.mWorkSpec.input = data;
            return getThis();
        }

        public final B addTag(String str) {
            this.mTags.add(str);
            return getThis();
        }

        public final W build() {
            W buildInternal = buildInternal();
            Constraints constraints = this.mWorkSpec.constraints;
            boolean z = constraints.hasContentUriTriggers() || constraints.requiresBatteryNotLow() || constraints.requiresCharging() || constraints.requiresDeviceIdle();
            if (this.mWorkSpec.expedited && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.mId = UUID.randomUUID();
            WorkSpec workSpec = new WorkSpec(this.mWorkSpec);
            this.mWorkSpec = workSpec;
            workSpec.id = this.mId.toString();
            return buildInternal;
        }
    }
}

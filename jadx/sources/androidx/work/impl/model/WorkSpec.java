package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class WorkSpec {
    private static final String TAG = Logger.tagWithPrefix("WorkSpec");
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER = new Function<List<WorkInfoPojo>, List<WorkInfo>>() { // from class: androidx.work.impl.model.WorkSpec.1
        @Override // androidx.arch.core.util.Function
        public List<WorkInfo> apply(List<WorkInfoPojo> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (WorkInfoPojo workInfoPojo : list) {
                arrayList.add(workInfoPojo.toWorkInfo());
            }
            return arrayList;
        }
    };
    public long backoffDelayDuration;
    public BackoffPolicy backoffPolicy;
    public Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    public String id;
    public long initialDelay;
    public Data input;
    public String inputMergerClassName;
    public long intervalDuration;
    public long minimumRetentionDuration;
    public OutOfQuotaPolicy outOfQuotaPolicy;
    public Data output;
    public long periodStartTime;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public WorkInfo.State state;
    public String workerClassName;

    public boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public WorkSpec(String str, String str2) {
        this.state = WorkInfo.State.ENQUEUED;
        Data data = Data.EMPTY;
        this.input = data;
        this.output = data;
        this.constraints = Constraints.NONE;
        this.backoffPolicy = BackoffPolicy.EXPONENTIAL;
        this.backoffDelayDuration = 30000L;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = str;
        this.workerClassName = str2;
    }

    public WorkSpec(WorkSpec workSpec) {
        this.state = WorkInfo.State.ENQUEUED;
        Data data = Data.EMPTY;
        this.input = data;
        this.output = data;
        this.constraints = Constraints.NONE;
        this.backoffPolicy = BackoffPolicy.EXPONENTIAL;
        this.backoffDelayDuration = 30000L;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = workSpec.id;
        this.workerClassName = workSpec.workerClassName;
        this.state = workSpec.state;
        this.inputMergerClassName = workSpec.inputMergerClassName;
        this.input = new Data(workSpec.input);
        this.output = new Data(workSpec.output);
        this.initialDelay = workSpec.initialDelay;
        this.intervalDuration = workSpec.intervalDuration;
        this.flexDuration = workSpec.flexDuration;
        this.constraints = new Constraints(workSpec.constraints);
        this.runAttemptCount = workSpec.runAttemptCount;
        this.backoffPolicy = workSpec.backoffPolicy;
        this.backoffDelayDuration = workSpec.backoffDelayDuration;
        this.periodStartTime = workSpec.periodStartTime;
        this.minimumRetentionDuration = workSpec.minimumRetentionDuration;
        this.scheduleRequestedAt = workSpec.scheduleRequestedAt;
        this.expedited = workSpec.expedited;
        this.outOfQuotaPolicy = workSpec.outOfQuotaPolicy;
    }

    public boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public void setPeriodic(long j) {
        if (j < 900000) {
            Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j = 900000;
        }
        setPeriodic(j, j);
    }

    public void setPeriodic(long j, long j2) {
        if (j < 900000) {
            Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j = 900000;
        }
        if (j2 < 300000) {
            Logger.get().warning(TAG, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            Logger.get().warning(TAG, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j)), new Throwable[0]);
            j2 = j;
        }
        this.intervalDuration = j;
        this.flexDuration = j2;
    }

    public long calculateNextRunTime() {
        if (isBackedOff()) {
            return this.periodStartTime + Math.min(18000000L, this.backoffPolicy == BackoffPolicy.LINEAR ? this.backoffDelayDuration * this.runAttemptCount : Math.scalb((float) this.backoffDelayDuration, this.runAttemptCount - 1));
        }
        if (!isPeriodic()) {
            long j = this.periodStartTime;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            return j + this.initialDelay;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.periodStartTime;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i == 0) {
            j2 = this.initialDelay + currentTimeMillis;
        }
        long j3 = this.flexDuration;
        long j4 = this.intervalDuration;
        if (j3 != j4) {
            return j2 + j4 + (i == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (i != 0 ? j4 : 0L);
    }

    public boolean hasConstraints() {
        return !Constraints.NONE.equals(this.constraints);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkSpec.class != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && this.runAttemptCount == workSpec.runAttemptCount && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.periodStartTime == workSpec.periodStartTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.id.equals(workSpec.id) && this.state == workSpec.state && this.workerClassName.equals(workSpec.workerClassName)) {
            String str = this.inputMergerClassName;
            if (str == null ? workSpec.inputMergerClassName == null : str.equals(workSpec.inputMergerClassName)) {
                return this.input.equals(workSpec.input) && this.output.equals(workSpec.output) && this.constraints.equals(workSpec.constraints) && this.backoffPolicy == workSpec.backoffPolicy && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.state.hashCode();
        int hashCode3 = this.workerClassName.hashCode();
        String str = this.inputMergerClassName;
        int hashCode4 = str != null ? str.hashCode() : 0;
        int hashCode5 = this.input.hashCode();
        int hashCode6 = this.output.hashCode();
        long j = this.initialDelay;
        long j2 = this.intervalDuration;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.flexDuration;
        int hashCode7 = this.constraints.hashCode();
        int i2 = this.runAttemptCount;
        int hashCode8 = this.backoffPolicy.hashCode();
        long j4 = this.backoffDelayDuration;
        int i3 = (int) (j4 ^ (j4 >>> 32));
        long j5 = this.periodStartTime;
        int i4 = (int) (j5 ^ (j5 >>> 32));
        long j6 = this.minimumRetentionDuration;
        int i5 = (int) (j6 ^ (j6 >>> 32));
        long j7 = this.scheduleRequestedAt;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + i) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + hashCode7) * 31) + i2) * 31) + hashCode8) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.expedited ? 1 : 0)) * 31) + this.outOfQuotaPolicy.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.id + "}";
    }

    /* loaded from: classes2.dex */
    public static class IdAndState {
        public String id;
        public WorkInfo.State state;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof IdAndState) {
                IdAndState idAndState = (IdAndState) obj;
                if (this.state != idAndState.state) {
                    return false;
                }
                return this.id.equals(idAndState.id);
            }
            return false;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static class WorkInfoPojo {
        public String id;
        public Data output;
        public List<Data> progress;
        public int runAttemptCount;
        public WorkInfo.State state;
        public List<String> tags;

        public WorkInfo toWorkInfo() {
            Data data;
            List<Data> list = this.progress;
            if (list != null && !list.isEmpty()) {
                data = this.progress.get(0);
            } else {
                data = Data.EMPTY;
            }
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, data, this.runAttemptCount);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof WorkInfoPojo) {
                WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
                if (this.runAttemptCount != workInfoPojo.runAttemptCount) {
                    return false;
                }
                String str = this.id;
                if (str == null ? workInfoPojo.id == null : str.equals(workInfoPojo.id)) {
                    if (this.state != workInfoPojo.state) {
                        return false;
                    }
                    Data data = this.output;
                    if (data == null ? workInfoPojo.output == null : data.equals(workInfoPojo.output)) {
                        List<String> list = this.tags;
                        if (list == null ? workInfoPojo.tags == null : list.equals(workInfoPojo.tags)) {
                            List<Data> list2 = this.progress;
                            List<Data> list3 = workInfoPojo.progress;
                            return list2 != null ? list2.equals(list3) : list3 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = str != null ? str.hashCode() : 0;
            WorkInfo.State state = this.state;
            int hashCode2 = state != null ? state.hashCode() : 0;
            Data data = this.output;
            int hashCode3 = data != null ? data.hashCode() : 0;
            int i = this.runAttemptCount;
            List<String> list = this.tags;
            int hashCode4 = list != null ? list.hashCode() : 0;
            List<Data> list2 = this.progress;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + hashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
        }
    }
}

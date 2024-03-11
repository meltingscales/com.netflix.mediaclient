package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_FtlConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.C$AutoValue_FtlConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.InterfaceC9818xE;

/* loaded from: classes.dex */
public abstract class FtlConfig {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract FtlConfig build();

        public abstract Builder cell(int i);

        public abstract Builder errorsThrottleLimit(int i);

        public abstract Builder hostMap(Map<String, String> map);

        public abstract Builder hosts(List<String> list);

        public abstract Builder maxTries(int i);

        public abstract Builder samuraiWarmAppThreshold(long j);

        public abstract Builder sendFtlStatusOnFallback(boolean z);

        public abstract Builder targetResetDelay(long j);

        public abstract Builder targets(List<FtlTarget> list);
    }

    @SerializedName("cell")
    public abstract int cell();

    @SerializedName("errorsThrottleLimit")
    public abstract int errorsThrottleLimit();

    @SerializedName("hostMap")
    public abstract Map<String, String> hostMap();

    @SerializedName("hosts")
    public abstract List<String> hosts();

    @SerializedName("maxTries")
    public abstract int maxTries();

    @SerializedName("samuraiWarmAppThreshold")
    public abstract long samuraiWarmAppThreshold();

    @SerializedName("sendFtlStatusOnFallback")
    public abstract boolean sendFtlStatusOnFallback();

    @SerializedName("targetResetDelay")
    public abstract long targetResetDelay();

    @SerializedName("targets")
    public abstract List<FtlTarget> targets();

    public abstract Builder toBuilder();

    public static TypeAdapter<FtlConfig> typeAdapter(Gson gson) {
        return new AutoValue_FtlConfig.GsonTypeAdapter(gson).setDefaultHosts(Collections.emptyList()).setDefaultTargets(Collections.emptyList()).setDefaultHostMap(Collections.emptyMap()).setDefaultTargetResetDelay(-1L).setDefaultSamuraiWarmAppThreshold(TimeUnit.MINUTES.toMillis(1L)).setDefaultSendFtlStatusOnFallback(false).setDefaultErrorsThrottleLimit(Integer.MAX_VALUE);
    }

    public static Builder builder() {
        return new C$AutoValue_FtlConfig.Builder();
    }

    public boolean allowTargetReset() {
        return targetResetDelay() >= 0;
    }

    public boolean sendFallbackFtlSessionLog() {
        return sendFtlStatusOnFallback() || targetResetDelay() >= 0;
    }

    public InterfaceC9818xE nextTarget(InterfaceC9818xE interfaceC9818xE) {
        if (interfaceC9818xE == null) {
            return targets().get(0);
        }
        int indexOf = targets().indexOf(interfaceC9818xE);
        if (indexOf < 0) {
            return targets().get(0);
        }
        int i = indexOf + 1;
        if (i < targets().size()) {
            return targets().get(i);
        }
        return targets().get(indexOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isValid() {
        /*
            r7 = this;
            java.util.List r0 = r7.targets()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            java.util.List r0 = r7.targets()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L37
            java.util.List r3 = r7.targets()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r3.next()
            com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget r4 = (com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget) r4
            if (r0 == 0) goto L35
            boolean r0 = r4.isValid()
            if (r0 == 0) goto L35
            r0 = r1
            goto L1f
        L35:
            r0 = r2
            goto L1f
        L37:
            java.util.Map r3 = r7.hostMap()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L43:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            if (r5 == 0) goto L75
            java.lang.Object r5 = r4.getValue()
            if (r5 == 0) goto L75
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = ".netflix.com"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L75
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.endsWith(r6)
            if (r4 != 0) goto L43
        L75:
            r3 = r2
            goto L78
        L77:
            r3 = r1
        L78:
            int r4 = r7.cell()
            if (r4 < 0) goto L99
            int r4 = r7.maxTries()
            if (r4 < 0) goto L99
            java.util.List r4 = r7.hosts()
            if (r4 == 0) goto L99
            java.util.List r4 = r7.hosts()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L99
            if (r0 == 0) goto L99
            if (r3 == 0) goto L99
            goto L9a
        L99:
            r1 = r2
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig.isValid():boolean");
    }

    public boolean isStickyTarget(InterfaceC9818xE interfaceC9818xE) {
        if (allowTargetReset()) {
            if (interfaceC9818xE != targets().get(0)) {
                return false;
            }
        } else if (interfaceC9818xE != targets().get(targets().size() - 1)) {
            return false;
        }
        return true;
    }

    public String[] getTargetNames() {
        String[] strArr = new String[targets().size()];
        int i = 0;
        for (FtlTarget ftlTarget : targets()) {
            strArr[i] = ftlTarget.name();
            i++;
        }
        return strArr;
    }
}

package com.netflix.model.leafs.social.multititle;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.social.multititle.$$AutoValue_NotificationModuleFilters  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_NotificationModuleFilters extends NotificationModuleFilters {
    private final List<String> ratingInputActionFilteredModules;
    private final List<String> thumbsDownActionFilteredModules;
    private final List<String> thumbsUpActionFilteredModules;
    private final List<String> thumbsUpDoubleActionFilteredModules;

    @Override // com.netflix.model.leafs.social.multititle.NotificationModuleFilters
    @SerializedName("ratingInput")
    public List<String> ratingInputActionFilteredModules() {
        return this.ratingInputActionFilteredModules;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationModuleFilters
    @SerializedName("thumbsDown")
    public List<String> thumbsDownActionFilteredModules() {
        return this.thumbsDownActionFilteredModules;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationModuleFilters
    @SerializedName("thumbsUp")
    public List<String> thumbsUpActionFilteredModules() {
        return this.thumbsUpActionFilteredModules;
    }

    @Override // com.netflix.model.leafs.social.multititle.NotificationModuleFilters
    @SerializedName("thumbsUpDouble")
    public List<String> thumbsUpDoubleActionFilteredModules() {
        return this.thumbsUpDoubleActionFilteredModules;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_NotificationModuleFilters(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.thumbsUpActionFilteredModules = list;
        this.thumbsUpDoubleActionFilteredModules = list2;
        this.thumbsDownActionFilteredModules = list3;
        this.ratingInputActionFilteredModules = list4;
    }

    public String toString() {
        return "NotificationModuleFilters{thumbsUpActionFilteredModules=" + this.thumbsUpActionFilteredModules + ", thumbsUpDoubleActionFilteredModules=" + this.thumbsUpDoubleActionFilteredModules + ", thumbsDownActionFilteredModules=" + this.thumbsDownActionFilteredModules + ", ratingInputActionFilteredModules=" + this.ratingInputActionFilteredModules + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationModuleFilters) {
            NotificationModuleFilters notificationModuleFilters = (NotificationModuleFilters) obj;
            List<String> list = this.thumbsUpActionFilteredModules;
            if (list != null ? list.equals(notificationModuleFilters.thumbsUpActionFilteredModules()) : notificationModuleFilters.thumbsUpActionFilteredModules() == null) {
                List<String> list2 = this.thumbsUpDoubleActionFilteredModules;
                if (list2 != null ? list2.equals(notificationModuleFilters.thumbsUpDoubleActionFilteredModules()) : notificationModuleFilters.thumbsUpDoubleActionFilteredModules() == null) {
                    List<String> list3 = this.thumbsDownActionFilteredModules;
                    if (list3 != null ? list3.equals(notificationModuleFilters.thumbsDownActionFilteredModules()) : notificationModuleFilters.thumbsDownActionFilteredModules() == null) {
                        List<String> list4 = this.ratingInputActionFilteredModules;
                        if (list4 == null) {
                            if (notificationModuleFilters.ratingInputActionFilteredModules() == null) {
                                return true;
                            }
                        } else if (list4.equals(notificationModuleFilters.ratingInputActionFilteredModules())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.thumbsUpActionFilteredModules;
        int hashCode = list == null ? 0 : list.hashCode();
        List<String> list2 = this.thumbsUpDoubleActionFilteredModules;
        int hashCode2 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.thumbsDownActionFilteredModules;
        int hashCode3 = list3 == null ? 0 : list3.hashCode();
        List<String> list4 = this.ratingInputActionFilteredModules;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (list4 != null ? list4.hashCode() : 0);
    }
}

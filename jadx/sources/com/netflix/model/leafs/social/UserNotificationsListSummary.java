package com.netflix.model.leafs.social;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.C$$AutoValue_UserNotificationsListSummary;
import com.netflix.model.leafs.social.C$AutoValue_UserNotificationsListSummary;
import java.util.List;
import o.AbstractC0941Im;

/* loaded from: classes.dex */
public abstract class UserNotificationsListSummary extends AbstractC0941Im implements NotificationsListSummary {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract Builder baseTrackId(int i);

        public abstract UserNotificationsListSummary build();

        public abstract Builder mdpTrackId(int i);

        public abstract Builder notifications(List<NotificationSummaryItem> list);

        public abstract Builder playerTrackId(int i);

        public abstract Builder requestId(String str);
    }

    public abstract Builder toBuilder();

    public static TypeAdapter<UserNotificationsListSummary> typeAdapter(Gson gson) {
        return new C$AutoValue_UserNotificationsListSummary.GsonTypeAdapter(gson);
    }

    public static UserNotificationsListSummary create() {
        return new AutoValue_UserNotificationsListSummary(null, -1, -1, -1, null);
    }

    public static Builder builder() {
        return new C$$AutoValue_UserNotificationsListSummary.Builder().baseTrackId(-1).mdpTrackId(-1).playerTrackId(-1);
    }

    @Override // com.netflix.model.leafs.social.NotificationsListSummary
    public NotificationsListSummary makeCopy(List<NotificationSummaryItem> list) {
        return toBuilder().notifications(list).build();
    }
}

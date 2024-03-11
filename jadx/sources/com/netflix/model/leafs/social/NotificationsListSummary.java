package com.netflix.model.leafs.social;

import android.os.Parcelable;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import java.util.List;

/* loaded from: classes.dex */
public interface NotificationsListSummary extends Parcelable {
    int baseTrackId();

    NotificationsListSummary makeCopy(List<NotificationSummaryItem> list);

    int mdpTrackId();

    List<NotificationSummaryItem> notifications();

    int playerTrackId();

    String requestId();
}

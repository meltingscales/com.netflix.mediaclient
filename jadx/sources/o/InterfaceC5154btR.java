package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.NotificationTypes;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.FriendProfile;
import com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;

/* renamed from: o.btR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5154btR {
    String body();

    String eventGuid();

    FriendProfile friendProfile();

    NotificationTypes getNotificationType();

    String header();

    String imageAltText();

    String imageTarget();

    String imageUrl();

    boolean inQueue();

    boolean isValid();

    NotificationLandingPage landingPage();

    NotificationSummaryItem makeCopy(boolean z);

    String messageGuid();

    String messageString();

    @SerializedName("isRead")
    boolean read();

    boolean showTimestamp();

    long timestamp();

    UserNotificationLandingTrackingInfo trackingInfo();

    String tts();

    String urlTarget();

    String videoId();

    String videoTitle();

    VideoType videoType();
}

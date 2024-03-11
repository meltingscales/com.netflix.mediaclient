package com.netflix.model.leafs.social.multititle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;
import com.netflix.model.leafs.social.VideoTypeAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_NotificationHeroTitleAction extends C$AutoValue_NotificationHeroTitleAction {
    public static final Parcelable.Creator<AutoValue_NotificationHeroTitleAction> CREATOR = new Parcelable.Creator<AutoValue_NotificationHeroTitleAction>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationHeroTitleAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationHeroTitleAction createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationHeroTitleAction(parcel.readString(), parcel.readString(), (VideoType) Enum.valueOf(VideoType.class, parcel.readString()), (UserNotificationActionTrackingInfo) parcel.readParcelable(NotificationHeroTitleAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationHeroTitleAction[] newArray(int i) {
            return new AutoValue_NotificationHeroTitleAction[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationHeroTitleAction(String str, String str2, VideoType videoType, UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
        new C$$AutoValue_NotificationHeroTitleAction(str, str2, videoType, userNotificationActionTrackingInfo) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationHeroTitleAction

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationHeroTitleAction$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationHeroTitleAction> {
                private final TypeAdapter<String> actionAdapter;
                private final TypeAdapter<String> actionTypeAdapter;
                private final TypeAdapter<UserNotificationActionTrackingInfo> trackingInfoAdapter;
                private String defaultAction = null;
                private String defaultActionType = null;
                private VideoType defaultVideoType = null;
                private UserNotificationActionTrackingInfo defaultTrackingInfo = null;
                private final TypeAdapter<VideoType> videoTypeAdapter = new VideoTypeAdapter();

                public GsonTypeAdapter setDefaultAction(String str) {
                    this.defaultAction = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultActionType(String str) {
                    this.defaultActionType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackingInfo(UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
                    this.defaultTrackingInfo = userNotificationActionTrackingInfo;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoType(VideoType videoType) {
                    this.defaultVideoType = videoType;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.actionAdapter = gson.getAdapter(String.class);
                    this.actionTypeAdapter = gson.getAdapter(String.class);
                    this.trackingInfoAdapter = gson.getAdapter(UserNotificationActionTrackingInfo.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationHeroTitleAction notificationHeroTitleAction) {
                    if (notificationHeroTitleAction == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, notificationHeroTitleAction.action());
                    jsonWriter.name("actionType");
                    this.actionTypeAdapter.write(jsonWriter, notificationHeroTitleAction.actionType());
                    jsonWriter.name("videoType");
                    this.videoTypeAdapter.write(jsonWriter, notificationHeroTitleAction.videoType());
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, notificationHeroTitleAction.trackingInfo());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationHeroTitleAction read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultAction;
                    String str2 = this.defaultActionType;
                    VideoType videoType = this.defaultVideoType;
                    UserNotificationActionTrackingInfo userNotificationActionTrackingInfo = this.defaultTrackingInfo;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1884240891:
                                    if (nextName.equals("trackingInfo")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1422950858:
                                    if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1332961877:
                                    if (nextName.equals("videoType")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1851881104:
                                    if (nextName.equals("actionType")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                userNotificationActionTrackingInfo = this.trackingInfoAdapter.read(jsonReader);
                            } else if (c == 1) {
                                str = this.actionAdapter.read(jsonReader);
                            } else if (c == 2) {
                                videoType = this.videoTypeAdapter.read(jsonReader);
                            } else if (c == 3) {
                                str2 = this.actionTypeAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationHeroTitleAction(str, str2, videoType, userNotificationActionTrackingInfo);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action());
        parcel.writeString(actionType());
        parcel.writeString(videoType().name());
        parcel.writeParcelable(trackingInfo(), i);
    }
}

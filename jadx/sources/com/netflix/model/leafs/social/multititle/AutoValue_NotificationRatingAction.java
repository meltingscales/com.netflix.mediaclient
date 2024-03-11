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
public final class AutoValue_NotificationRatingAction extends C$AutoValue_NotificationRatingAction {
    public static final Parcelable.Creator<AutoValue_NotificationRatingAction> CREATOR = new Parcelable.Creator<AutoValue_NotificationRatingAction>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationRatingAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationRatingAction createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationRatingAction(parcel.readString(), parcel.readString(), (UserNotificationActionTrackingInfo) parcel.readParcelable(NotificationRatingAction.class.getClassLoader()), (VideoType) Enum.valueOf(VideoType.class, parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationRatingAction[] newArray(int i) {
            return new AutoValue_NotificationRatingAction[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationRatingAction(final String str, final String str2, final UserNotificationActionTrackingInfo userNotificationActionTrackingInfo, final VideoType videoType) {
        new C$$AutoValue_NotificationRatingAction(str, str2, userNotificationActionTrackingInfo, videoType) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationRatingAction

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationRatingAction$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationRatingAction> {
                private final TypeAdapter<String> actionAdapter;
                private final TypeAdapter<String> actionTypeAdapter;
                private final TypeAdapter<UserNotificationActionTrackingInfo> trackingInfoAdapter;
                private String defaultAction = null;
                private String defaultActionType = null;
                private UserNotificationActionTrackingInfo defaultTrackingInfo = null;
                private VideoType defaultVideoType = null;
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
                public void write(JsonWriter jsonWriter, NotificationRatingAction notificationRatingAction) {
                    if (notificationRatingAction == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, notificationRatingAction.action());
                    jsonWriter.name("actionType");
                    this.actionTypeAdapter.write(jsonWriter, notificationRatingAction.actionType());
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, notificationRatingAction.trackingInfo());
                    jsonWriter.name("videoType");
                    this.videoTypeAdapter.write(jsonWriter, notificationRatingAction.videoType());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationRatingAction read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultAction;
                    String str2 = this.defaultActionType;
                    UserNotificationActionTrackingInfo userNotificationActionTrackingInfo = this.defaultTrackingInfo;
                    VideoType videoType = this.defaultVideoType;
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
                    return new AutoValue_NotificationRatingAction(str, str2, userNotificationActionTrackingInfo, videoType);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action());
        parcel.writeString(actionType());
        parcel.writeParcelable(trackingInfo(), i);
        parcel.writeString(videoType().name());
    }
}

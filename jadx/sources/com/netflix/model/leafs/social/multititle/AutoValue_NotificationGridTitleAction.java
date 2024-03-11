package com.netflix.model.leafs.social.multititle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_NotificationGridTitleAction extends C$AutoValue_NotificationGridTitleAction {
    public static final Parcelable.Creator<AutoValue_NotificationGridTitleAction> CREATOR = new Parcelable.Creator<AutoValue_NotificationGridTitleAction>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationGridTitleAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationGridTitleAction createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationGridTitleAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UserNotificationActionTrackingInfo) parcel.readParcelable(NotificationGridTitleAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationGridTitleAction[] newArray(int i) {
            return new AutoValue_NotificationGridTitleAction[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationGridTitleAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
        new C$$AutoValue_NotificationGridTitleAction(str, str2, str3, str4, str5, str6, str7, userNotificationActionTrackingInfo) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationGridTitleAction

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationGridTitleAction$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationGridTitleAction> {
                private final TypeAdapter<String> actionAdapter;
                private final TypeAdapter<String> actionTypeAdapter;
                private final TypeAdapter<String> boxshotAdapter;
                private final TypeAdapter<String> boxshotWebpAdapter;
                private final TypeAdapter<String> sdpAdapter;
                private final TypeAdapter<String> sdpWebpAdapter;
                private final TypeAdapter<String> titleIdAdapter;
                private final TypeAdapter<UserNotificationActionTrackingInfo> trackingInfoAdapter;
                private String defaultAction = null;
                private String defaultBoxshot = null;
                private String defaultBoxshotWebp = null;
                private String defaultActionType = null;
                private String defaultSdp = null;
                private String defaultSdpWebp = null;
                private String defaultTitleId = null;
                private UserNotificationActionTrackingInfo defaultTrackingInfo = null;

                public GsonTypeAdapter setDefaultAction(String str) {
                    this.defaultAction = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultActionType(String str) {
                    this.defaultActionType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultBoxshot(String str) {
                    this.defaultBoxshot = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultBoxshotWebp(String str) {
                    this.defaultBoxshotWebp = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSdp(String str) {
                    this.defaultSdp = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSdpWebp(String str) {
                    this.defaultSdpWebp = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTitleId(String str) {
                    this.defaultTitleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackingInfo(UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
                    this.defaultTrackingInfo = userNotificationActionTrackingInfo;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.actionAdapter = gson.getAdapter(String.class);
                    this.boxshotAdapter = gson.getAdapter(String.class);
                    this.boxshotWebpAdapter = gson.getAdapter(String.class);
                    this.actionTypeAdapter = gson.getAdapter(String.class);
                    this.sdpAdapter = gson.getAdapter(String.class);
                    this.sdpWebpAdapter = gson.getAdapter(String.class);
                    this.titleIdAdapter = gson.getAdapter(String.class);
                    this.trackingInfoAdapter = gson.getAdapter(UserNotificationActionTrackingInfo.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationGridTitleAction notificationGridTitleAction) {
                    if (notificationGridTitleAction == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, notificationGridTitleAction.action());
                    jsonWriter.name("boxshot");
                    this.boxshotAdapter.write(jsonWriter, notificationGridTitleAction.boxshot());
                    jsonWriter.name("boxshotWebp");
                    this.boxshotWebpAdapter.write(jsonWriter, notificationGridTitleAction.boxshotWebp());
                    jsonWriter.name("actionType");
                    this.actionTypeAdapter.write(jsonWriter, notificationGridTitleAction.actionType());
                    jsonWriter.name("sdp");
                    this.sdpAdapter.write(jsonWriter, notificationGridTitleAction.sdp());
                    jsonWriter.name("sdpWebp");
                    this.sdpWebpAdapter.write(jsonWriter, notificationGridTitleAction.sdpWebp());
                    jsonWriter.name("titleId");
                    this.titleIdAdapter.write(jsonWriter, notificationGridTitleAction.titleId());
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, notificationGridTitleAction.trackingInfo());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationGridTitleAction read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultAction;
                    String str2 = this.defaultBoxshot;
                    String str3 = this.defaultBoxshotWebp;
                    String str4 = this.defaultActionType;
                    String str5 = this.defaultSdp;
                    String str6 = this.defaultSdpWebp;
                    String str7 = str;
                    String str8 = str2;
                    String str9 = str3;
                    String str10 = str4;
                    String str11 = str5;
                    String str12 = str6;
                    String str13 = this.defaultTitleId;
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
                                case -1307249261:
                                    if (nextName.equals("titleId")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 113727:
                                    if (nextName.equals("sdp")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 73235269:
                                    if (nextName.equals("boxshot")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1461544065:
                                    if (nextName.equals("boxshotWebp")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1851881104:
                                    if (nextName.equals("actionType")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1952749691:
                                    if (nextName.equals("sdpWebp")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    userNotificationActionTrackingInfo = this.trackingInfoAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    str7 = this.actionAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str13 = this.titleIdAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str11 = this.sdpAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str8 = this.boxshotAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str9 = this.boxshotWebpAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    str10 = this.actionTypeAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    str12 = this.sdpWebpAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationGridTitleAction(str7, str8, str9, str10, str11, str12, str13, userNotificationActionTrackingInfo);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action());
        parcel.writeString(boxshot());
        parcel.writeString(boxshotWebp());
        parcel.writeString(actionType());
        parcel.writeString(sdp());
        parcel.writeString(sdpWebp());
        parcel.writeString(titleId());
        parcel.writeParcelable(trackingInfo(), i);
    }
}

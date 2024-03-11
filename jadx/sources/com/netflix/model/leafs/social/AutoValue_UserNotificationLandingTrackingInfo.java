package com.netflix.model.leafs.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UserNotificationLandingTrackingInfo extends C$AutoValue_UserNotificationLandingTrackingInfo {
    public static final Parcelable.Creator<AutoValue_UserNotificationLandingTrackingInfo> CREATOR = new Parcelable.Creator<AutoValue_UserNotificationLandingTrackingInfo>() { // from class: com.netflix.model.leafs.social.AutoValue_UserNotificationLandingTrackingInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationLandingTrackingInfo createFromParcel(Parcel parcel) {
            return new AutoValue_UserNotificationLandingTrackingInfo(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationLandingTrackingInfo[] newArray(int i) {
            return new AutoValue_UserNotificationLandingTrackingInfo[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UserNotificationLandingTrackingInfo(final String str, final String str2, final String str3, final Integer num, final String str4) {
        new C$$AutoValue_UserNotificationLandingTrackingInfo(str, str2, str3, num, str4) { // from class: com.netflix.model.leafs.social.$AutoValue_UserNotificationLandingTrackingInfo

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_UserNotificationLandingTrackingInfo$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UserNotificationLandingTrackingInfo> {
                private final TypeAdapter<String> actionAdapter;
                private final TypeAdapter<String> messageGuidAdapter;
                private final TypeAdapter<String> notificationItemTypeAdapter;
                private final TypeAdapter<String> titleIdAdapter;
                private final TypeAdapter<Integer> trackIdAdapter;
                private String defaultMessageGuid = null;
                private String defaultTitleId = null;
                private String defaultNotificationItemType = null;
                private Integer defaultTrackId = null;
                private String defaultAction = null;

                public GsonTypeAdapter setDefaultAction(String str) {
                    this.defaultAction = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMessageGuid(String str) {
                    this.defaultMessageGuid = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultNotificationItemType(String str) {
                    this.defaultNotificationItemType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTitleId(String str) {
                    this.defaultTitleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackId(Integer num) {
                    this.defaultTrackId = num;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.messageGuidAdapter = gson.getAdapter(String.class);
                    this.titleIdAdapter = gson.getAdapter(String.class);
                    this.notificationItemTypeAdapter = gson.getAdapter(String.class);
                    this.trackIdAdapter = gson.getAdapter(Integer.class);
                    this.actionAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo) {
                    if (userNotificationLandingTrackingInfo == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(Payload.PARAM_MESSAGE_GUID);
                    this.messageGuidAdapter.write(jsonWriter, userNotificationLandingTrackingInfo.messageGuid());
                    jsonWriter.name("titleId");
                    this.titleIdAdapter.write(jsonWriter, userNotificationLandingTrackingInfo.titleId());
                    jsonWriter.name("notificationItemType");
                    this.notificationItemTypeAdapter.write(jsonWriter, userNotificationLandingTrackingInfo.notificationItemType());
                    jsonWriter.name("trackId");
                    this.trackIdAdapter.write(jsonWriter, userNotificationLandingTrackingInfo.trackId());
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, userNotificationLandingTrackingInfo.action());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UserNotificationLandingTrackingInfo read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultMessageGuid;
                    String str2 = this.defaultTitleId;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = this.defaultNotificationItemType;
                    Integer num = this.defaultTrackId;
                    String str6 = this.defaultAction;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1422950858:
                                    if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1307249261:
                                    if (nextName.equals("titleId")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1067396154:
                                    if (nextName.equals("trackId")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -917598472:
                                    if (nextName.equals("notificationItemType")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -873484496:
                                    if (nextName.equals(Payload.PARAM_MESSAGE_GUID)) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                str6 = this.actionAdapter.read(jsonReader);
                            } else if (c == 1) {
                                str4 = this.titleIdAdapter.read(jsonReader);
                            } else if (c == 2) {
                                num = this.trackIdAdapter.read(jsonReader);
                            } else if (c == 3) {
                                str5 = this.notificationItemTypeAdapter.read(jsonReader);
                            } else if (c == 4) {
                                str3 = this.messageGuidAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UserNotificationLandingTrackingInfo(str3, str4, str5, num, str6);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (messageGuid() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(messageGuid());
        }
        if (titleId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(titleId());
        }
        if (notificationItemType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(notificationItemType());
        }
        if (trackId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(trackId().intValue());
        }
        if (action() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(action());
    }
}

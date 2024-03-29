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
public final class AutoValue_UserNotificationActionTrackingInfo extends C$AutoValue_UserNotificationActionTrackingInfo {
    public static final Parcelable.Creator<AutoValue_UserNotificationActionTrackingInfo> CREATOR = new Parcelable.Creator<AutoValue_UserNotificationActionTrackingInfo>() { // from class: com.netflix.model.leafs.social.AutoValue_UserNotificationActionTrackingInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationActionTrackingInfo createFromParcel(Parcel parcel) {
            return new AutoValue_UserNotificationActionTrackingInfo(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationActionTrackingInfo[] newArray(int i) {
            return new AutoValue_UserNotificationActionTrackingInfo[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UserNotificationActionTrackingInfo(final String str, final String str2, final String str3, final Integer num) {
        new C$$AutoValue_UserNotificationActionTrackingInfo(str, str2, str3, num) { // from class: com.netflix.model.leafs.social.$AutoValue_UserNotificationActionTrackingInfo

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_UserNotificationActionTrackingInfo$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UserNotificationActionTrackingInfo> {
                private final TypeAdapter<String> actionAdapter;
                private final TypeAdapter<String> messageGuidAdapter;
                private final TypeAdapter<String> titleIdAdapter;
                private final TypeAdapter<Integer> trackIdAdapter;
                private String defaultTitleId = null;
                private String defaultAction = null;
                private String defaultMessageGuid = null;
                private Integer defaultTrackId = null;

                public GsonTypeAdapter setDefaultAction(String str) {
                    this.defaultAction = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMessageGuid(String str) {
                    this.defaultMessageGuid = str;
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
                    this.titleIdAdapter = gson.getAdapter(String.class);
                    this.actionAdapter = gson.getAdapter(String.class);
                    this.messageGuidAdapter = gson.getAdapter(String.class);
                    this.trackIdAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UserNotificationActionTrackingInfo userNotificationActionTrackingInfo) {
                    if (userNotificationActionTrackingInfo == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("titleId");
                    this.titleIdAdapter.write(jsonWriter, userNotificationActionTrackingInfo.titleId());
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, userNotificationActionTrackingInfo.action());
                    jsonWriter.name(Payload.PARAM_MESSAGE_GUID);
                    this.messageGuidAdapter.write(jsonWriter, userNotificationActionTrackingInfo.messageGuid());
                    jsonWriter.name("trackId");
                    this.trackIdAdapter.write(jsonWriter, userNotificationActionTrackingInfo.trackId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UserNotificationActionTrackingInfo read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultTitleId;
                    String str2 = this.defaultAction;
                    String str3 = this.defaultMessageGuid;
                    Integer num = this.defaultTrackId;
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
                                case -873484496:
                                    if (nextName.equals(Payload.PARAM_MESSAGE_GUID)) {
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
                                str2 = this.actionAdapter.read(jsonReader);
                            } else if (c == 1) {
                                str = this.titleIdAdapter.read(jsonReader);
                            } else if (c == 2) {
                                num = this.trackIdAdapter.read(jsonReader);
                            } else if (c == 3) {
                                str3 = this.messageGuidAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UserNotificationActionTrackingInfo(str, str2, str3, num);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (titleId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(titleId());
        }
        if (action() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(action());
        }
        if (messageGuid() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(messageGuid());
        }
        if (trackId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(trackId().intValue());
    }
}

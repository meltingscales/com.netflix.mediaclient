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
public final class AutoValue_UserNotificationCtaTrackingInfo extends C$AutoValue_UserNotificationCtaTrackingInfo {
    public static final Parcelable.Creator<AutoValue_UserNotificationCtaTrackingInfo> CREATOR = new Parcelable.Creator<AutoValue_UserNotificationCtaTrackingInfo>() { // from class: com.netflix.model.leafs.social.AutoValue_UserNotificationCtaTrackingInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationCtaTrackingInfo createFromParcel(Parcel parcel) {
            return new AutoValue_UserNotificationCtaTrackingInfo(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationCtaTrackingInfo[] newArray(int i) {
            return new AutoValue_UserNotificationCtaTrackingInfo[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UserNotificationCtaTrackingInfo(final String str, final String str2) {
        new C$$AutoValue_UserNotificationCtaTrackingInfo(str, str2) { // from class: com.netflix.model.leafs.social.$AutoValue_UserNotificationCtaTrackingInfo

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_UserNotificationCtaTrackingInfo$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UserNotificationCtaTrackingInfo> {
                private final TypeAdapter<String> actionAdapter;
                private String defaultAction = null;
                private String defaultMessageGuid = null;
                private final TypeAdapter<String> messageGuidAdapter;

                public GsonTypeAdapter setDefaultAction(String str) {
                    this.defaultAction = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMessageGuid(String str) {
                    this.defaultMessageGuid = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.actionAdapter = gson.getAdapter(String.class);
                    this.messageGuidAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UserNotificationCtaTrackingInfo userNotificationCtaTrackingInfo) {
                    if (userNotificationCtaTrackingInfo == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, userNotificationCtaTrackingInfo.action());
                    jsonWriter.name(Payload.PARAM_MESSAGE_GUID);
                    this.messageGuidAdapter.write(jsonWriter, userNotificationCtaTrackingInfo.messageGuid());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UserNotificationCtaTrackingInfo read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultAction;
                    String str2 = this.defaultMessageGuid;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                                str = this.actionAdapter.read(jsonReader);
                            } else if (nextName.equals(Payload.PARAM_MESSAGE_GUID)) {
                                str2 = this.messageGuidAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UserNotificationCtaTrackingInfo(str, str2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (action() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(action());
        }
        if (messageGuid() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(messageGuid());
    }
}

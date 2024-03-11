package com.netflix.model.leafs.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UserNotificationCtaButtonTrackingInfo extends C$AutoValue_UserNotificationCtaButtonTrackingInfo {
    public static final Parcelable.Creator<AutoValue_UserNotificationCtaButtonTrackingInfo> CREATOR = new Parcelable.Creator<AutoValue_UserNotificationCtaButtonTrackingInfo>() { // from class: com.netflix.model.leafs.social.AutoValue_UserNotificationCtaButtonTrackingInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationCtaButtonTrackingInfo createFromParcel(Parcel parcel) {
            return new AutoValue_UserNotificationCtaButtonTrackingInfo(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (UserNotificationCtaTrackingInfo) parcel.readParcelable(UserNotificationCtaButtonTrackingInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationCtaButtonTrackingInfo[] newArray(int i) {
            return new AutoValue_UserNotificationCtaButtonTrackingInfo[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UserNotificationCtaButtonTrackingInfo(String str, String str2, UserNotificationCtaTrackingInfo userNotificationCtaTrackingInfo) {
        new C$$AutoValue_UserNotificationCtaButtonTrackingInfo(str, str2, userNotificationCtaTrackingInfo) { // from class: com.netflix.model.leafs.social.$AutoValue_UserNotificationCtaButtonTrackingInfo

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_UserNotificationCtaButtonTrackingInfo$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UserNotificationCtaButtonTrackingInfo> {
                private final TypeAdapter<String> actionAdapter;
                private final TypeAdapter<String> buttonTextAdapter;
                private String defaultAction = null;
                private String defaultButtonText = null;
                private UserNotificationCtaTrackingInfo defaultTrackingInfo = null;
                private final TypeAdapter<UserNotificationCtaTrackingInfo> trackingInfoAdapter;

                public GsonTypeAdapter setDefaultAction(String str) {
                    this.defaultAction = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultButtonText(String str) {
                    this.defaultButtonText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackingInfo(UserNotificationCtaTrackingInfo userNotificationCtaTrackingInfo) {
                    this.defaultTrackingInfo = userNotificationCtaTrackingInfo;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.actionAdapter = gson.getAdapter(String.class);
                    this.buttonTextAdapter = gson.getAdapter(String.class);
                    this.trackingInfoAdapter = gson.getAdapter(UserNotificationCtaTrackingInfo.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UserNotificationCtaButtonTrackingInfo userNotificationCtaButtonTrackingInfo) {
                    if (userNotificationCtaButtonTrackingInfo == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, userNotificationCtaButtonTrackingInfo.action());
                    jsonWriter.name("buttonText");
                    this.buttonTextAdapter.write(jsonWriter, userNotificationCtaButtonTrackingInfo.buttonText());
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, userNotificationCtaButtonTrackingInfo.trackingInfo());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo read(com.google.gson.stream.JsonReader r9) {
                    /*
                        r8 = this;
                        com.google.gson.stream.JsonToken r0 = r9.peek()
                        com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                        if (r0 != r1) goto Ld
                        r9.nextNull()
                        r9 = 0
                        return r9
                    Ld:
                        r9.beginObject()
                        java.lang.String r0 = r8.defaultAction
                        java.lang.String r1 = r8.defaultButtonText
                        com.netflix.model.leafs.social.UserNotificationCtaTrackingInfo r2 = r8.defaultTrackingInfo
                    L16:
                        boolean r3 = r9.hasNext()
                        if (r3 == 0) goto L8b
                        java.lang.String r3 = r9.nextName()
                        com.google.gson.stream.JsonToken r4 = r9.peek()
                        com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                        if (r4 != r5) goto L2c
                        r9.nextNull()
                        goto L16
                    L2c:
                        r3.hashCode()
                        int r4 = r3.hashCode()
                        r5 = -1884240891(0xffffffff8fb0c405, float:-1.7430444E-29)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = -1422950858(0xffffffffab2f7e36, float:-6.234764E-13)
                        if (r4 == r5) goto L50
                        r5 = 358545279(0x155ef77f, float:4.5027783E-26)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "buttonText"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "action"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "trackingInfo"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L65
                    L63:
                        r3 = -1
                        goto L66
                    L65:
                        r3 = 0
                    L66:
                        if (r3 == 0) goto L82
                        if (r3 == r7) goto L79
                        if (r3 == r6) goto L70
                        r9.skipValue()
                        goto L16
                    L70:
                        com.google.gson.TypeAdapter<java.lang.String> r1 = r8.buttonTextAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.lang.String r1 = (java.lang.String) r1
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.lang.String> r0 = r8.actionAdapter
                        java.lang.Object r0 = r0.read(r9)
                        java.lang.String r0 = (java.lang.String) r0
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.social.UserNotificationCtaTrackingInfo> r2 = r8.trackingInfoAdapter
                        java.lang.Object r2 = r2.read(r9)
                        com.netflix.model.leafs.social.UserNotificationCtaTrackingInfo r2 = (com.netflix.model.leafs.social.UserNotificationCtaTrackingInfo) r2
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.social.AutoValue_UserNotificationCtaButtonTrackingInfo r9 = new com.netflix.model.leafs.social.AutoValue_UserNotificationCtaButtonTrackingInfo
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.social.C$AutoValue_UserNotificationCtaButtonTrackingInfo.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo");
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
        if (buttonText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(buttonText());
        }
        parcel.writeParcelable(trackingInfo(), i);
    }
}

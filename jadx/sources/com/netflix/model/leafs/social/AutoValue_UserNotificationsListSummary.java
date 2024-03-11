package com.netflix.model.leafs.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UserNotificationsListSummary extends C$AutoValue_UserNotificationsListSummary {
    public static final Parcelable.Creator<AutoValue_UserNotificationsListSummary> CREATOR = new Parcelable.Creator<AutoValue_UserNotificationsListSummary>() { // from class: com.netflix.model.leafs.social.AutoValue_UserNotificationsListSummary.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationsListSummary createFromParcel(Parcel parcel) {
            return new AutoValue_UserNotificationsListSummary(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readArrayList(UserNotificationsListSummary.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationsListSummary[] newArray(int i) {
            return new AutoValue_UserNotificationsListSummary[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UserNotificationsListSummary(final String str, final int i, final int i2, final int i3, final List<NotificationSummaryItem> list) {
        new C$$AutoValue_UserNotificationsListSummary(str, i, i2, i3, list) { // from class: com.netflix.model.leafs.social.$AutoValue_UserNotificationsListSummary

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_UserNotificationsListSummary$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UserNotificationsListSummary> {
                private final TypeAdapter<Integer> baseTrackIdAdapter;
                private final TypeAdapter<Integer> mdpTrackIdAdapter;
                private final TypeAdapter<List<NotificationSummaryItem>> notificationsAdapter;
                private final TypeAdapter<Integer> playerTrackIdAdapter;
                private final TypeAdapter<String> requestIdAdapter;
                private String defaultRequestId = null;
                private int defaultBaseTrackId = 0;
                private int defaultMdpTrackId = 0;
                private int defaultPlayerTrackId = 0;
                private List<NotificationSummaryItem> defaultNotifications = null;

                public GsonTypeAdapter setDefaultBaseTrackId(int i) {
                    this.defaultBaseTrackId = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultMdpTrackId(int i) {
                    this.defaultMdpTrackId = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultNotifications(List<NotificationSummaryItem> list) {
                    this.defaultNotifications = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerTrackId(int i) {
                    this.defaultPlayerTrackId = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultRequestId(String str) {
                    this.defaultRequestId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.requestIdAdapter = gson.getAdapter(String.class);
                    this.baseTrackIdAdapter = gson.getAdapter(Integer.class);
                    this.mdpTrackIdAdapter = gson.getAdapter(Integer.class);
                    this.playerTrackIdAdapter = gson.getAdapter(Integer.class);
                    this.notificationsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, NotificationSummaryItem.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UserNotificationsListSummary userNotificationsListSummary) {
                    if (userNotificationsListSummary == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(Payload.PARAM_RENO_REQUEST_ID);
                    this.requestIdAdapter.write(jsonWriter, userNotificationsListSummary.requestId());
                    jsonWriter.name("baseTrackId");
                    this.baseTrackIdAdapter.write(jsonWriter, Integer.valueOf(userNotificationsListSummary.baseTrackId()));
                    jsonWriter.name("mdpTrackId");
                    this.mdpTrackIdAdapter.write(jsonWriter, Integer.valueOf(userNotificationsListSummary.mdpTrackId()));
                    jsonWriter.name("playerTrackId");
                    this.playerTrackIdAdapter.write(jsonWriter, Integer.valueOf(userNotificationsListSummary.playerTrackId()));
                    jsonWriter.name("notifications");
                    this.notificationsAdapter.write(jsonWriter, userNotificationsListSummary.notifications());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UserNotificationsListSummary read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultRequestId;
                    int i = this.defaultBaseTrackId;
                    String str2 = str;
                    int i2 = i;
                    int i3 = this.defaultMdpTrackId;
                    int i4 = this.defaultPlayerTrackId;
                    List<NotificationSummaryItem> list = this.defaultNotifications;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2078436403:
                                    if (nextName.equals("mdpTrackId")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 693933066:
                                    if (nextName.equals(Payload.PARAM_RENO_REQUEST_ID)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1234061237:
                                    if (nextName.equals("baseTrackId")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1272354024:
                                    if (nextName.equals("notifications")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1585578405:
                                    if (nextName.equals("playerTrackId")) {
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
                                i3 = this.mdpTrackIdAdapter.read(jsonReader).intValue();
                            } else if (c == 1) {
                                str2 = this.requestIdAdapter.read(jsonReader);
                            } else if (c == 2) {
                                i2 = this.baseTrackIdAdapter.read(jsonReader).intValue();
                            } else if (c == 3) {
                                list = this.notificationsAdapter.read(jsonReader);
                            } else if (c == 4) {
                                i4 = this.playerTrackIdAdapter.read(jsonReader).intValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UserNotificationsListSummary(str2, i2, i3, i4, list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (requestId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(requestId());
        }
        parcel.writeInt(baseTrackId());
        parcel.writeInt(mdpTrackId());
        parcel.writeInt(playerTrackId());
        parcel.writeList(notifications());
    }
}

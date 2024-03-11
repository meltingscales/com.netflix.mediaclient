package com.netflix.model.leafs.social.multititle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_NotificationLandingPage extends C$AutoValue_NotificationLandingPage {
    public static final Parcelable.Creator<AutoValue_NotificationLandingPage> CREATOR = new Parcelable.Creator<AutoValue_NotificationLandingPage>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationLandingPage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationLandingPage createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationLandingPage(parcel.readString(), parcel.readString(), parcel.readString(), (NotificationTemplate) parcel.readParcelable(NotificationLandingPage.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationLandingPage[] newArray(int i) {
            return new AutoValue_NotificationLandingPage[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationLandingPage(String str, String str2, String str3, NotificationTemplate notificationTemplate, int i) {
        new C$$AutoValue_NotificationLandingPage(str, str2, str3, notificationTemplate, i) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationLandingPage

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationLandingPage$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationLandingPage> {
                private final TypeAdapter<String> payloadVersionAdapter;
                private final TypeAdapter<NotificationTemplate> templateAdapter;
                private final TypeAdapter<String> templateIdAdapter;
                private final TypeAdapter<String> templateTypeAdapter;
                private final TypeAdapter<Integer> trackIdAdapter;
                private String defaultPayloadVersion = null;
                private String defaultTemplateId = null;
                private String defaultTemplateType = null;
                private NotificationTemplate defaultTemplate = null;
                private int defaultTrackId = 0;

                public GsonTypeAdapter setDefaultPayloadVersion(String str) {
                    this.defaultPayloadVersion = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTemplate(NotificationTemplate notificationTemplate) {
                    this.defaultTemplate = notificationTemplate;
                    return this;
                }

                public GsonTypeAdapter setDefaultTemplateId(String str) {
                    this.defaultTemplateId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTemplateType(String str) {
                    this.defaultTemplateType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackId(int i) {
                    this.defaultTrackId = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.payloadVersionAdapter = gson.getAdapter(String.class);
                    this.templateIdAdapter = gson.getAdapter(String.class);
                    this.templateTypeAdapter = gson.getAdapter(String.class);
                    this.templateAdapter = gson.getAdapter(NotificationTemplate.class);
                    this.trackIdAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationLandingPage notificationLandingPage) {
                    if (notificationLandingPage == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("payloadVersion");
                    this.payloadVersionAdapter.write(jsonWriter, notificationLandingPage.payloadVersion());
                    jsonWriter.name("templateId");
                    this.templateIdAdapter.write(jsonWriter, notificationLandingPage.templateId());
                    jsonWriter.name("templateType");
                    this.templateTypeAdapter.write(jsonWriter, notificationLandingPage.templateType());
                    jsonWriter.name("template");
                    this.templateAdapter.write(jsonWriter, notificationLandingPage.template());
                    jsonWriter.name("trackId");
                    this.trackIdAdapter.write(jsonWriter, Integer.valueOf(notificationLandingPage.trackId()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationLandingPage read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultPayloadVersion;
                    String str2 = this.defaultTemplateId;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = this.defaultTemplateType;
                    NotificationTemplate notificationTemplate = this.defaultTemplate;
                    int i = this.defaultTrackId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1321546630:
                                    if (nextName.equals("template")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1067396154:
                                    if (nextName.equals("trackId")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -975961388:
                                    if (nextName.equals("templateType")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -905341078:
                                    if (nextName.equals("payloadVersion")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1304010549:
                                    if (nextName.equals("templateId")) {
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
                                notificationTemplate = this.templateAdapter.read(jsonReader);
                            } else if (c == 1) {
                                i = this.trackIdAdapter.read(jsonReader).intValue();
                            } else if (c == 2) {
                                str5 = this.templateTypeAdapter.read(jsonReader);
                            } else if (c == 3) {
                                str3 = this.payloadVersionAdapter.read(jsonReader);
                            } else if (c == 4) {
                                str4 = this.templateIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationLandingPage(str3, str4, str5, notificationTemplate, i);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(payloadVersion());
        parcel.writeString(templateId());
        parcel.writeString(templateType());
        parcel.writeParcelable(template(), i);
        parcel.writeInt(trackId());
    }
}

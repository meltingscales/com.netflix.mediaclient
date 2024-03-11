package com.netflix.model.leafs.social.multititle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.VideoTypeAdapter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_NotificationHeroModule extends C$AutoValue_NotificationHeroModule {
    public static final Parcelable.Creator<AutoValue_NotificationHeroModule> CREATOR = new Parcelable.Creator<AutoValue_NotificationHeroModule>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationHeroModule.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationHeroModule createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationHeroModule(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (VideoType) Enum.valueOf(VideoType.class, parcel.readString()), parcel.readArrayList(NotificationHeroModule.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationHeroModule[] newArray(int i) {
            return new AutoValue_NotificationHeroModule[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationHeroModule(final String str, final String str2, final String str3, final String str4, final int i, final VideoType videoType, final List<NotificationHeroTitleAction> list) {
        new C$$AutoValue_NotificationHeroModule(str, str2, str3, str4, i, videoType, list) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationHeroModule

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationHeroModule$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationHeroModule> {
                private final TypeAdapter<List<NotificationHeroTitleAction>> actionsAdapter;
                private final TypeAdapter<String> bodyCopyAdapter;
                private final TypeAdapter<String> heroImageAdapter;
                private final TypeAdapter<String> heroImageWebpAdapter;
                private final TypeAdapter<String> layoutAdapter;
                private final TypeAdapter<Integer> titleIdAdapter;
                private String defaultLayout = null;
                private String defaultBodyCopy = null;
                private String defaultHeroImage = null;
                private String defaultHeroImageWebp = null;
                private int defaultTitleId = 0;
                private VideoType defaultVideoType = null;
                private List<NotificationHeroTitleAction> defaultActions = null;
                private final TypeAdapter<VideoType> videoTypeAdapter = new VideoTypeAdapter();

                public GsonTypeAdapter setDefaultActions(List<NotificationHeroTitleAction> list) {
                    this.defaultActions = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultBodyCopy(String str) {
                    this.defaultBodyCopy = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeroImage(String str) {
                    this.defaultHeroImage = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeroImageWebp(String str) {
                    this.defaultHeroImageWebp = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLayout(String str) {
                    this.defaultLayout = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTitleId(int i) {
                    this.defaultTitleId = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoType(VideoType videoType) {
                    this.defaultVideoType = videoType;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.layoutAdapter = gson.getAdapter(String.class);
                    this.bodyCopyAdapter = gson.getAdapter(String.class);
                    this.heroImageAdapter = gson.getAdapter(String.class);
                    this.heroImageWebpAdapter = gson.getAdapter(String.class);
                    this.titleIdAdapter = gson.getAdapter(Integer.class);
                    this.actionsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, NotificationHeroTitleAction.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationHeroModule notificationHeroModule) {
                    if (notificationHeroModule == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("layout");
                    this.layoutAdapter.write(jsonWriter, notificationHeroModule.layout());
                    jsonWriter.name("bodyCopy");
                    this.bodyCopyAdapter.write(jsonWriter, notificationHeroModule.bodyCopy());
                    jsonWriter.name("heroImage");
                    this.heroImageAdapter.write(jsonWriter, notificationHeroModule.heroImage());
                    jsonWriter.name("heroImageWebp");
                    this.heroImageWebpAdapter.write(jsonWriter, notificationHeroModule.heroImageWebp());
                    jsonWriter.name("titleId");
                    this.titleIdAdapter.write(jsonWriter, Integer.valueOf(notificationHeroModule.titleId()));
                    jsonWriter.name("videoType");
                    this.videoTypeAdapter.write(jsonWriter, notificationHeroModule.videoType());
                    jsonWriter.name("actions");
                    this.actionsAdapter.write(jsonWriter, notificationHeroModule.actions());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationHeroModule read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultLayout;
                    String str2 = this.defaultBodyCopy;
                    String str3 = this.defaultHeroImage;
                    String str4 = this.defaultHeroImageWebp;
                    int i = this.defaultTitleId;
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    String str8 = str4;
                    int i2 = i;
                    VideoType videoType = this.defaultVideoType;
                    List<NotificationHeroTitleAction> list = this.defaultActions;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2016684671:
                                    if (nextName.equals("heroImage")) {
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
                                case -1161803523:
                                    if (nextName.equals("actions")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1109722326:
                                    if (nextName.equals("layout")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1332961877:
                                    if (nextName.equals("videoType")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1702149175:
                                    if (nextName.equals("bodyCopy")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1797013693:
                                    if (nextName.equals("heroImageWebp")) {
                                        c = 6;
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
                                    str7 = this.heroImageAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    i2 = this.titleIdAdapter.read(jsonReader).intValue();
                                    continue;
                                case 2:
                                    list = this.actionsAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str5 = this.layoutAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    videoType = this.videoTypeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str6 = this.bodyCopyAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    str8 = this.heroImageWebpAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationHeroModule(str5, str6, str7, str8, i2, videoType, list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(layout());
        parcel.writeString(bodyCopy());
        parcel.writeString(heroImage());
        parcel.writeString(heroImageWebp());
        parcel.writeInt(titleId());
        parcel.writeString(videoType().name());
        parcel.writeList(actions());
    }
}

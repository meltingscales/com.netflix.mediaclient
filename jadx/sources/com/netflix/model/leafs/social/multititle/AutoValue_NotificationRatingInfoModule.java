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
public final class AutoValue_NotificationRatingInfoModule extends C$AutoValue_NotificationRatingInfoModule {
    public static final Parcelable.Creator<AutoValue_NotificationRatingInfoModule> CREATOR = new Parcelable.Creator<AutoValue_NotificationRatingInfoModule>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationRatingInfoModule.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationRatingInfoModule createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationRatingInfoModule(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(NotificationRatingInfoModule.class.getClassLoader()), parcel.readInt(), (VideoType) Enum.valueOf(VideoType.class, parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationRatingInfoModule[] newArray(int i) {
            return new AutoValue_NotificationRatingInfoModule[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationRatingInfoModule(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final List<NotificationRatingAction> list, final int i, final VideoType videoType) {
        new C$$AutoValue_NotificationRatingInfoModule(str, str2, str3, str4, str5, str6, str7, list, i, videoType) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationRatingInfoModule

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationRatingInfoModule$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationRatingInfoModule> {
                private final TypeAdapter<List<NotificationRatingAction>> actionsAdapter;
                private final TypeAdapter<String> bodyCopyAdapter;
                private final TypeAdapter<String> bodyCopyConfirmationThumbsDownAdapter;
                private final TypeAdapter<String> bodyCopyConfirmationThumbsUpAdapter;
                private final TypeAdapter<String> bodyCopyConfirmationThumbsUpDoubleAdapter;
                private final TypeAdapter<String> boxshotAdapter;
                private final TypeAdapter<String> boxshotWebpAdapter;
                private final TypeAdapter<String> layoutAdapter;
                private final TypeAdapter<Integer> titleIdAdapter;
                private String defaultLayout = null;
                private String defaultBodyCopy = null;
                private String defaultBodyCopyConfirmationThumbsUp = null;
                private String defaultBodyCopyConfirmationThumbsUpDouble = null;
                private String defaultBodyCopyConfirmationThumbsDown = null;
                private String defaultBoxshot = null;
                private String defaultBoxshotWebp = null;
                private List<NotificationRatingAction> defaultActions = null;
                private int defaultTitleId = 0;
                private VideoType defaultVideoType = null;
                private final TypeAdapter<VideoType> videoTypeAdapter = new VideoTypeAdapter();

                public GsonTypeAdapter setDefaultActions(List<NotificationRatingAction> list) {
                    this.defaultActions = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultBodyCopy(String str) {
                    this.defaultBodyCopy = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultBodyCopyConfirmationThumbsDown(String str) {
                    this.defaultBodyCopyConfirmationThumbsDown = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultBodyCopyConfirmationThumbsUp(String str) {
                    this.defaultBodyCopyConfirmationThumbsUp = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultBodyCopyConfirmationThumbsUpDouble(String str) {
                    this.defaultBodyCopyConfirmationThumbsUpDouble = str;
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
                    this.bodyCopyConfirmationThumbsUpAdapter = gson.getAdapter(String.class);
                    this.bodyCopyConfirmationThumbsUpDoubleAdapter = gson.getAdapter(String.class);
                    this.bodyCopyConfirmationThumbsDownAdapter = gson.getAdapter(String.class);
                    this.boxshotAdapter = gson.getAdapter(String.class);
                    this.boxshotWebpAdapter = gson.getAdapter(String.class);
                    this.actionsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, NotificationRatingAction.class));
                    this.titleIdAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationRatingInfoModule notificationRatingInfoModule) {
                    if (notificationRatingInfoModule == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("layout");
                    this.layoutAdapter.write(jsonWriter, notificationRatingInfoModule.layout());
                    jsonWriter.name("bodyCopy");
                    this.bodyCopyAdapter.write(jsonWriter, notificationRatingInfoModule.bodyCopy());
                    jsonWriter.name("bodyCopyConfirmationThumbsUp");
                    this.bodyCopyConfirmationThumbsUpAdapter.write(jsonWriter, notificationRatingInfoModule.bodyCopyConfirmationThumbsUp());
                    jsonWriter.name("bodyCopyConfirmationThumbsUpDouble");
                    this.bodyCopyConfirmationThumbsUpDoubleAdapter.write(jsonWriter, notificationRatingInfoModule.bodyCopyConfirmationThumbsUpDouble());
                    jsonWriter.name("bodyCopyConfirmationThumbsDown");
                    this.bodyCopyConfirmationThumbsDownAdapter.write(jsonWriter, notificationRatingInfoModule.bodyCopyConfirmationThumbsDown());
                    jsonWriter.name("boxshot");
                    this.boxshotAdapter.write(jsonWriter, notificationRatingInfoModule.boxshot());
                    jsonWriter.name("boxshotWebp");
                    this.boxshotWebpAdapter.write(jsonWriter, notificationRatingInfoModule.boxshotWebp());
                    jsonWriter.name("actions");
                    this.actionsAdapter.write(jsonWriter, notificationRatingInfoModule.actions());
                    jsonWriter.name("titleId");
                    this.titleIdAdapter.write(jsonWriter, Integer.valueOf(notificationRatingInfoModule.titleId()));
                    jsonWriter.name("videoType");
                    this.videoTypeAdapter.write(jsonWriter, notificationRatingInfoModule.videoType());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationRatingInfoModule read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultLayout;
                    String str2 = this.defaultBodyCopy;
                    String str3 = this.defaultBodyCopyConfirmationThumbsUp;
                    String str4 = this.defaultBodyCopyConfirmationThumbsUpDouble;
                    String str5 = this.defaultBodyCopyConfirmationThumbsDown;
                    String str6 = this.defaultBoxshot;
                    String str7 = this.defaultBoxshotWebp;
                    List<NotificationRatingAction> list = this.defaultActions;
                    String str8 = str;
                    String str9 = str2;
                    String str10 = str3;
                    String str11 = str4;
                    String str12 = str5;
                    String str13 = str6;
                    String str14 = str7;
                    List<NotificationRatingAction> list2 = list;
                    int i = this.defaultTitleId;
                    VideoType videoType = this.defaultVideoType;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1307249261:
                                    if (nextName.equals("titleId")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1161803523:
                                    if (nextName.equals("actions")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1109722326:
                                    if (nextName.equals("layout")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -919606581:
                                    if (nextName.equals("bodyCopyConfirmationThumbsDown")) {
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
                                case 933120772:
                                    if (nextName.equals("bodyCopyConfirmationThumbsUp")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1248813045:
                                    if (nextName.equals("bodyCopyConfirmationThumbsUpDouble")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1332961877:
                                    if (nextName.equals("videoType")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1461544065:
                                    if (nextName.equals("boxshotWebp")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1702149175:
                                    if (nextName.equals("bodyCopy")) {
                                        c = '\t';
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
                                    i = this.titleIdAdapter.read(jsonReader).intValue();
                                    continue;
                                case 1:
                                    list2 = this.actionsAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str8 = this.layoutAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str12 = this.bodyCopyConfirmationThumbsDownAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str13 = this.boxshotAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str10 = this.bodyCopyConfirmationThumbsUpAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    str11 = this.bodyCopyConfirmationThumbsUpDoubleAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    videoType = this.videoTypeAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    str14 = this.boxshotWebpAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    str9 = this.bodyCopyAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationRatingInfoModule(str8, str9, str10, str11, str12, str13, str14, list2, i, videoType);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(layout());
        parcel.writeString(bodyCopy());
        parcel.writeString(bodyCopyConfirmationThumbsUp());
        if (bodyCopyConfirmationThumbsUpDouble() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(bodyCopyConfirmationThumbsUpDouble());
        }
        parcel.writeString(bodyCopyConfirmationThumbsDown());
        parcel.writeString(boxshot());
        parcel.writeString(boxshotWebp());
        parcel.writeList(actions());
        parcel.writeInt(titleId());
        parcel.writeString(videoType().name());
    }
}

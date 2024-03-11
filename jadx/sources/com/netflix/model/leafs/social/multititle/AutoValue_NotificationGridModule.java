package com.netflix.model.leafs.social.multititle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_NotificationGridModule extends C$AutoValue_NotificationGridModule {
    public static final Parcelable.Creator<AutoValue_NotificationGridModule> CREATOR = new Parcelable.Creator<AutoValue_NotificationGridModule>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationGridModule.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationGridModule createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationGridModule(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readArrayList(NotificationGridModule.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationGridModule[] newArray(int i) {
            return new AutoValue_NotificationGridModule[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationGridModule(final String str, final int i, final String str2, final List<NotificationGridTitleAction> list) {
        new C$$AutoValue_NotificationGridModule(str, i, str2, list) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationGridModule

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationGridModule$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationGridModule> {
                private final TypeAdapter<List<NotificationGridTitleAction>> actionsAdapter;
                private final TypeAdapter<Integer> columnWidthAdapter;
                private final TypeAdapter<String> headlineTextAdapter;
                private final TypeAdapter<String> layoutAdapter;
                private String defaultLayout = null;
                private int defaultColumnWidth = 0;
                private String defaultHeadlineText = null;
                private List<NotificationGridTitleAction> defaultActions = null;

                public GsonTypeAdapter setDefaultActions(List<NotificationGridTitleAction> list) {
                    this.defaultActions = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultColumnWidth(int i) {
                    this.defaultColumnWidth = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeadlineText(String str) {
                    this.defaultHeadlineText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLayout(String str) {
                    this.defaultLayout = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.layoutAdapter = gson.getAdapter(String.class);
                    this.columnWidthAdapter = gson.getAdapter(Integer.class);
                    this.headlineTextAdapter = gson.getAdapter(String.class);
                    this.actionsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, NotificationGridTitleAction.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationGridModule notificationGridModule) {
                    if (notificationGridModule == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("layout");
                    this.layoutAdapter.write(jsonWriter, notificationGridModule.layout());
                    jsonWriter.name("columnWidth");
                    this.columnWidthAdapter.write(jsonWriter, Integer.valueOf(notificationGridModule.columnWidth()));
                    jsonWriter.name("headlineText");
                    this.headlineTextAdapter.write(jsonWriter, notificationGridModule.headlineText());
                    jsonWriter.name("actions");
                    this.actionsAdapter.write(jsonWriter, notificationGridModule.actions());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationGridModule read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultLayout;
                    int i = this.defaultColumnWidth;
                    String str2 = this.defaultHeadlineText;
                    List<NotificationGridTitleAction> list = this.defaultActions;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1613873887:
                                    if (nextName.equals("headlineText")) {
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
                                case -842461168:
                                    if (nextName.equals("columnWidth")) {
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
                                str2 = this.headlineTextAdapter.read(jsonReader);
                            } else if (c == 1) {
                                list = this.actionsAdapter.read(jsonReader);
                            } else if (c == 2) {
                                str = this.layoutAdapter.read(jsonReader);
                            } else if (c == 3) {
                                i = this.columnWidthAdapter.read(jsonReader).intValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationGridModule(str, i, str2, list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(layout());
        parcel.writeInt(columnWidth());
        parcel.writeString(headlineText());
        parcel.writeList(actions());
    }
}

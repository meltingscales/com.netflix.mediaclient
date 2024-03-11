package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Action extends C$AutoValue_Action {
    public static final Parcelable.Creator<AutoValue_Action> CREATOR = new Parcelable.Creator<AutoValue_Action>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Action.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Action createFromParcel(Parcel parcel) {
            return new AutoValue_Action(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Action[] newArray(int i) {
            return new AutoValue_Action[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Action(final String str, final Integer num, final String str2, final Integer num2, final Float f, final String str3) {
        new C$$AutoValue_Action(str, num, str2, num2, f, str3) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Action

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Action$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Action> {
                private final TypeAdapter<Float> bookmarkPositionMsAdapter;
                private final TypeAdapter<String> newSegmentIdAdapter;
                private final TypeAdapter<Integer> newTimeMsAdapter;
                private final TypeAdapter<String> segmentIdAdapter;
                private final TypeAdapter<Integer> startTimeMsAdapter;
                private final TypeAdapter<String> typeAdapter;
                private String defaultType = null;
                private Integer defaultStartTimeMs = null;
                private String defaultSegmentId = null;
                private Integer defaultNewTimeMs = null;
                private Float defaultBookmarkPositionMs = null;
                private String defaultNewSegmentId = null;

                public GsonTypeAdapter setDefaultBookmarkPositionMs(Float f) {
                    this.defaultBookmarkPositionMs = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultNewSegmentId(String str) {
                    this.defaultNewSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultNewTimeMs(Integer num) {
                    this.defaultNewTimeMs = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentId(String str) {
                    this.defaultSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartTimeMs(Integer num) {
                    this.defaultStartTimeMs = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.startTimeMsAdapter = gson.getAdapter(Integer.class);
                    this.segmentIdAdapter = gson.getAdapter(String.class);
                    this.newTimeMsAdapter = gson.getAdapter(Integer.class);
                    this.bookmarkPositionMsAdapter = gson.getAdapter(Float.class);
                    this.newSegmentIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Action action) {
                    if (action == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, action.type());
                    jsonWriter.name("startTimeMs");
                    this.startTimeMsAdapter.write(jsonWriter, action.startTimeMs());
                    jsonWriter.name("segmentId");
                    this.segmentIdAdapter.write(jsonWriter, action.segmentId());
                    jsonWriter.name("newTimeMs");
                    this.newTimeMsAdapter.write(jsonWriter, action.newTimeMs());
                    jsonWriter.name("bookmarkPosition");
                    this.bookmarkPositionMsAdapter.write(jsonWriter, action.bookmarkPositionMs());
                    jsonWriter.name("newSegmentId");
                    this.newSegmentIdAdapter.write(jsonWriter, action.newSegmentId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Action read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultType;
                    Integer num = this.defaultStartTimeMs;
                    String str2 = this.defaultSegmentId;
                    String str3 = str;
                    Integer num2 = num;
                    String str4 = str2;
                    Integer num3 = this.defaultNewTimeMs;
                    Float f = this.defaultBookmarkPositionMs;
                    String str5 = this.defaultNewSegmentId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1847837611:
                                    if (nextName.equals("startTimeMs")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1829827457:
                                    if (nextName.equals("bookmarkPosition")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1627805778:
                                    if (nextName.equals("segmentId")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1323372050:
                                    if (nextName.equals("newSegmentId")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -577389805:
                                    if (nextName.equals("newTimeMs")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                num2 = this.startTimeMsAdapter.read(jsonReader);
                            } else if (c == 1) {
                                f = this.bookmarkPositionMsAdapter.read(jsonReader);
                            } else if (c == 2) {
                                str4 = this.segmentIdAdapter.read(jsonReader);
                            } else if (c == 3) {
                                str5 = this.newSegmentIdAdapter.read(jsonReader);
                            } else if (c == 4) {
                                num3 = this.newTimeMsAdapter.read(jsonReader);
                            } else if (c == 5) {
                                str3 = this.typeAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Action(str3, num2, str4, num3, f, str5);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (type() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(type());
        }
        if (startTimeMs() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(startTimeMs().intValue());
        }
        if (segmentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(segmentId());
        }
        if (newTimeMs() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(newTimeMs().intValue());
        }
        if (bookmarkPositionMs() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(bookmarkPositionMs().floatValue());
        }
        if (newSegmentId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(newSegmentId());
    }
}

package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Image extends C$AutoValue_Image {
    public static final Parcelable.Creator<AutoValue_Image> CREATOR = new Parcelable.Creator<AutoValue_Image>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Image.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Image createFromParcel(Parcel parcel) {
            return new AutoValue_Image(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Float.valueOf(parcel.readFloat()), (SourceRect) parcel.readParcelable(Image.class.getClassLoader()), parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Image[] newArray(int i) {
            return new AutoValue_Image[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Image(String str, String str2, Integer num, Integer num2, Float f, SourceRect sourceRect, boolean z) {
        new C$$AutoValue_Image(str, str2, num, num2, f, sourceRect, z) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Image

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Image$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Image> {
                private final TypeAdapter<Boolean> animatedAdapter;
                private final TypeAdapter<Integer> heightAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<Float> scaleAdapter;
                private final TypeAdapter<SourceRect> sourceRectAdapter;
                private final TypeAdapter<String> urlAdapter;
                private final TypeAdapter<Integer> widthAdapter;
                private String defaultId = null;
                private String defaultUrl = null;
                private Integer defaultWidth = null;
                private Integer defaultHeight = null;
                private Float defaultScale = null;
                private SourceRect defaultSourceRect = null;
                private boolean defaultAnimated = false;

                public GsonTypeAdapter setDefaultAnimated(boolean z) {
                    this.defaultAnimated = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeight(Integer num) {
                    this.defaultHeight = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultScale(Float f) {
                    this.defaultScale = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultSourceRect(SourceRect sourceRect) {
                    this.defaultSourceRect = sourceRect;
                    return this;
                }

                public GsonTypeAdapter setDefaultUrl(String str) {
                    this.defaultUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultWidth(Integer num) {
                    this.defaultWidth = num;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.urlAdapter = gson.getAdapter(String.class);
                    this.widthAdapter = gson.getAdapter(Integer.class);
                    this.heightAdapter = gson.getAdapter(Integer.class);
                    this.scaleAdapter = gson.getAdapter(Float.class);
                    this.sourceRectAdapter = gson.getAdapter(SourceRect.class);
                    this.animatedAdapter = gson.getAdapter(Boolean.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Image image) {
                    if (image == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, image.id());
                    jsonWriter.name(SignupConstants.Field.URL);
                    this.urlAdapter.write(jsonWriter, image.url());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
                    this.widthAdapter.write(jsonWriter, image.width());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
                    this.heightAdapter.write(jsonWriter, image.height());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.SCALE);
                    this.scaleAdapter.write(jsonWriter, image.scale());
                    jsonWriter.name("sourceRect");
                    this.sourceRectAdapter.write(jsonWriter, image.sourceRect());
                    jsonWriter.name("animated");
                    this.animatedAdapter.write(jsonWriter, Boolean.valueOf(image.animated()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Image read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    String str2 = this.defaultUrl;
                    Integer num = this.defaultWidth;
                    Integer num2 = this.defaultHeight;
                    Float f = this.defaultScale;
                    String str3 = str;
                    String str4 = str2;
                    Integer num3 = num;
                    Integer num4 = num2;
                    Float f2 = f;
                    SourceRect sourceRect = this.defaultSourceRect;
                    boolean z = this.defaultAnimated;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1221029593:
                                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1111510881:
                                    if (nextName.equals("sourceRect")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -795203165:
                                    if (nextName.equals("animated")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 116079:
                                    if (nextName.equals(SignupConstants.Field.URL)) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109250890:
                                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.SCALE)) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 113126854:
                                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
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
                                    num4 = this.heightAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    sourceRect = this.sourceRectAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    z = this.animatedAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 3:
                                    str3 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str4 = this.urlAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    f2 = this.scaleAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    num3 = this.widthAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Image(str3, str4, num3, num4, f2, sourceRect, z);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (id() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(id());
        }
        if (url() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(url());
        }
        parcel.writeInt(width().intValue());
        parcel.writeInt(height().intValue());
        parcel.writeFloat(scale().floatValue());
        parcel.writeParcelable(sourceRect(), i);
        parcel.writeInt(animated() ? 1 : 0);
    }
}

package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData_Layout_ChoiceLayout_Background extends C$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background {
    public static final Parcelable.Creator<AutoValue_CommonMetaData_Layout_ChoiceLayout_Background> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData_Layout_ChoiceLayout_Background>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout_ChoiceLayout_Background.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_ChoiceLayout_Background createFromParcel(Parcel parcel) {
            return new AutoValue_CommonMetaData_Layout_ChoiceLayout_Background((SpriteImage) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.Background.class.getClassLoader()), (SpriteImage) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.Background.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_ChoiceLayout_Background[] newArray(int i) {
            return new AutoValue_CommonMetaData_Layout_ChoiceLayout_Background[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData_Layout_ChoiceLayout_Background(SpriteImage spriteImage, SpriteImage spriteImage2) {
        new C$$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background(spriteImage, spriteImage2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData.Layout.ChoiceLayout.Background> {
                private final TypeAdapter<SpriteImage> defaultImgAdapter;
                private final TypeAdapter<SpriteImage> selectedAdapter;
                private SpriteImage defaultDefaultImg = null;
                private SpriteImage defaultSelected = null;

                public GsonTypeAdapter setDefaultDefaultImg(SpriteImage spriteImage) {
                    this.defaultDefaultImg = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultSelected(SpriteImage spriteImage) {
                    this.defaultSelected = spriteImage;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.defaultImgAdapter = gson.getAdapter(SpriteImage.class);
                    this.selectedAdapter = gson.getAdapter(SpriteImage.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData.Layout.ChoiceLayout.Background background) {
                    if (background == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("default");
                    this.defaultImgAdapter.write(jsonWriter, background.defaultImg());
                    jsonWriter.name(VisualStateDefinition.ELEMENT_STATE.SELECTED);
                    this.selectedAdapter.write(jsonWriter, background.selected());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CommonMetaData.Layout.ChoiceLayout.Background read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    SpriteImage spriteImage = this.defaultDefaultImg;
                    SpriteImage spriteImage2 = this.defaultSelected;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                                spriteImage2 = this.selectedAdapter.read(jsonReader);
                            } else if (nextName.equals("default")) {
                                spriteImage = this.defaultImgAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CommonMetaData_Layout_ChoiceLayout_Background(spriteImage, spriteImage2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(defaultImg(), i);
        parcel.writeParcelable(selected(), i);
    }
}

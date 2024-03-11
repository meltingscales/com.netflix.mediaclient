package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice extends C$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice {
    public static final Parcelable.Creator<AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice createFromParcel(Parcel parcel) {
            return new AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice((SourceRect) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.InnerChoice.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice[] newArray(int i) {
            return new AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice(SourceRect sourceRect) {
        new C$$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice(sourceRect) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData.Layout.ChoiceLayout.InnerChoice> {
                private SourceRect defaultRect = null;
                private final TypeAdapter<SourceRect> rectAdapter;

                public GsonTypeAdapter setDefaultRect(SourceRect sourceRect) {
                    this.defaultRect = sourceRect;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.rectAdapter = gson.getAdapter(SourceRect.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData.Layout.ChoiceLayout.InnerChoice innerChoice) {
                    if (innerChoice == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("rect");
                    this.rectAdapter.write(jsonWriter, innerChoice.rect());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CommonMetaData.Layout.ChoiceLayout.InnerChoice read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    SourceRect sourceRect = this.defaultRect;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("rect")) {
                                sourceRect = this.rectAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice(sourceRect);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(rect(), i);
    }
}

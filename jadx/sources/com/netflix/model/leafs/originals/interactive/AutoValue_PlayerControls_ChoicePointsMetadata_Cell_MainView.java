package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView extends C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView((ImageAssetId) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Cell.MainView.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView(ImageAssetId imageAssetId) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView(imageAssetId) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.Cell.MainView> {
                private ImageAssetId defaultImage = null;
                private final TypeAdapter<ImageAssetId> imageAdapter;

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.Cell.MainView mainView) {
                    if (mainView == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, mainView.image());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata.Cell.MainView read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    ImageAssetId imageAssetId = this.defaultImage;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("image")) {
                                imageAssetId = this.imageAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView(imageAssetId);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(image(), i);
    }
}

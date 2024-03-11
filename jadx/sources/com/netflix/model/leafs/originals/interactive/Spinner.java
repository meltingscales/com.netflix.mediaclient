package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Spinner;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Spinner_Definition;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Spinner_Definition_Sequence;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Spinner implements Parcelable {
    public abstract Definition pngJson();

    public abstract Size size();

    /* loaded from: classes.dex */
    public static abstract class Definition implements Parcelable {
        public abstract int fps();

        @SerializedName("image")
        public abstract String imageUrl();

        public abstract List<Sequence> sequence();

        /* loaded from: classes.dex */
        public static abstract class Sequence implements Parcelable {
            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract int h();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract int w();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract int x();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract int y();

            public static TypeAdapter<Sequence> typeAdapter(Gson gson) {
                return new C$AutoValue_Spinner_Definition_Sequence.GsonTypeAdapter(gson).setDefaultH(0).setDefaultW(0).setDefaultX(0).setDefaultY(0);
            }
        }

        public static TypeAdapter<Definition> typeAdapter(Gson gson) {
            return new C$AutoValue_Spinner_Definition.GsonTypeAdapter(gson).setDefaultFps(8);
        }
    }

    public static TypeAdapter<Spinner> typeAdapter(Gson gson) {
        return new C$AutoValue_Spinner.GsonTypeAdapter(gson);
    }
}

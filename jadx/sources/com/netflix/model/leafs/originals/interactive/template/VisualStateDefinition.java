package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_VisualStateDefinition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class VisualStateDefinition implements Parcelable {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ELEMENT_STATE {
        public static final String CORRECT = "correct";
        public static final String DEFAULT = "default";
        public static final String DISABLED = "disabled";
        public static final String FOCUSED = "focused";
        public static final String LAST_10_SECS = "last10Secs";
        public static final String RESULT = "result";
        public static final String SELECTED = "selected";
        public static final String UPDATE = "update";
        public static final String WRONG = "wrong";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ImageAssetId image();

    public abstract String styleId();

    public String assetId() {
        ImageAssetId image = image();
        if (image == null) {
            return null;
        }
        return image.assetId();
    }

    public static TypeAdapter<VisualStateDefinition> typeAdapter(Gson gson) {
        return new C$AutoValue_VisualStateDefinition.GsonTypeAdapter(gson);
    }
}

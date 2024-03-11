package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Layout;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Layout_ChoiceLayout;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Layout_InteractiveNotification;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Layout_Timer;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_CommonMetaData_Settings;
import com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public abstract class CommonMetaData implements Parcelable {
    @Deprecated
    public abstract Map<String, Layout> layouts();

    public abstract Settings settings();

    /* loaded from: classes.dex */
    public static abstract class Layout implements BaseLayout {
        @Override // com.netflix.model.leafs.originals.interactive.BaseLayout
        public abstract AssetManifest assetManifest();

        public abstract Size canvasSize();

        public abstract List<ChoiceLayout> choices();

        public abstract Button endButton();

        public abstract Double subTitleY();

        public abstract Timer timer();

        /* loaded from: classes.dex */
        public static abstract class Timer implements Parcelable {

            @Retention(RetentionPolicy.SOURCE)
            /* loaded from: classes.dex */
            public @interface TimerType {
                public static final int CLOCK = 1;
                public static final int HORIZONTAL = 0;
                public static final int HORIZONTAL_SKINNED = 2;
                public static final int SIMPLE = 4;
                public static final int SPRITESHEET_SKINNED = 3;
            }

            public abstract ChoicePointAnimations animation();

            public abstract SpriteImage background();

            public abstract SpriteImage bar();

            public abstract Color color();

            public abstract SpriteImage foreground();

            public abstract SpriteImage pug();

            public abstract ScreenPosition timerPosition();

            public abstract int type();

            public static TypeAdapter<Timer> typeAdapter(Gson gson) {
                C$AutoValue_CommonMetaData_Layout_Timer.GsonTypeAdapter defaultType = new C$AutoValue_CommonMetaData_Layout_Timer.GsonTypeAdapter(gson).setDefaultType(-1);
                Float valueOf = Float.valueOf(0.0f);
                return defaultType.setDefaultTimerPosition(new AutoValue_ScreenPosition(valueOf, valueOf));
            }
        }

        /* loaded from: classes.dex */
        public static abstract class ChoiceLayout implements Parcelable {
            public abstract ChoicePointAnimations animation();

            public abstract Background background();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract InnerChoice choice();

            public abstract SpriteImage foreground();

            public abstract SourceRect icon();

            public abstract Label label();

            public abstract String name();

            public abstract SpriteImage selected();

            public abstract String text();

            public abstract boolean visible();

            public SourceRect choiceRect() {
                InnerChoice choice = choice();
                if (choice != null) {
                    return choice.rect();
                }
                return null;
            }

            /* loaded from: classes.dex */
            public static abstract class InnerChoice implements Parcelable {
                public abstract SourceRect rect();

                public static TypeAdapter<InnerChoice> typeAdapter(Gson gson) {
                    return new C$AutoValue_CommonMetaData_Layout_ChoiceLayout_InnerChoice.GsonTypeAdapter(gson);
                }
            }

            /* loaded from: classes.dex */
            public static abstract class Background implements Parcelable {
                @SerializedName("default")
                public abstract SpriteImage defaultImg();

                public abstract SpriteImage selected();

                public static TypeAdapter<Background> typeAdapter(Gson gson) {
                    return new C$AutoValue_CommonMetaData_Layout_ChoiceLayout_Background.GsonTypeAdapter(gson);
                }
            }

            public static TypeAdapter<ChoiceLayout> typeAdapter(Gson gson) {
                return new C$AutoValue_CommonMetaData_Layout_ChoiceLayout.GsonTypeAdapter(gson).setDefaultVisible(true);
            }
        }

        public static TypeAdapter<Layout> typeAdapter(Gson gson) {
            C$AutoValue_CommonMetaData_Layout.GsonTypeAdapter defaultChoices = new C$AutoValue_CommonMetaData_Layout.GsonTypeAdapter(gson).setDefaultChoices(Collections.emptyList());
            Double valueOf = Double.valueOf(0.0d);
            return defaultChoices.setDefaultSubTitleY(valueOf).setDefaultSubTitleY(valueOf).setDefaultCanvasSize(new AutoValue_Size(0, 0));
        }

        /* loaded from: classes.dex */
        public static abstract class InteractiveNotification implements Parcelable {
            public abstract ChoicePointAnimations animation();

            public abstract SpriteImage background();

            public abstract Label label();

            public static TypeAdapter<InteractiveNotification> typeAdapter(Gson gson) {
                return new C$AutoValue_CommonMetaData_Layout_InteractiveNotification.GsonTypeAdapter(gson);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Settings implements Parcelable {
        public abstract boolean disableToggleDefault();

        public abstract boolean randomizeDefault();

        public static TypeAdapter<Settings> typeAdapter(Gson gson) {
            return new C$AutoValue_CommonMetaData_Settings.GsonTypeAdapter(gson).setDefaultDisableToggleDefault(false).setDefaultRandomizeDefault(false);
        }
    }

    public static TypeAdapter<CommonMetaData> typeAdapter(Gson gson) {
        return new C$AutoValue_CommonMetaData.GsonTypeAdapter(gson);
    }
}

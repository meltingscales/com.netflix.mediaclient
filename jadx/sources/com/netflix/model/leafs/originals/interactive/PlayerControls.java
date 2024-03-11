package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_Choice;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_Container;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_Config;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_Config_ImagesConfig;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_StoryLines;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_StoryLines_StoryLine;
import java.util.List;
import java.util.Map;
import o.C8168dfL;

/* loaded from: classes.dex */
public abstract class PlayerControls implements Parcelable {
    public abstract ChoicePointsMetadata choicePointsMetadata();

    public abstract Config config();

    public abstract String headerText();

    public abstract StoryLines storylines();

    /* loaded from: classes.dex */
    public static abstract class Config implements Parcelable {
        public abstract ImagesConfig images();

        public abstract String lockStrategy();

        public abstract int maxSnapshotsToDisplay();

        public abstract int maxSnapshotsToPersist();

        public abstract boolean playerControlsSnapshots();

        public abstract boolean playerControlsTenSecondsControls();

        public abstract String selectionType();

        /* JADX INFO: Access modifiers changed from: package-private */
        @SerializedName("textDirection")
        public abstract String textDirectionString();

        public int getTextDirection() {
            return "rtl".equalsIgnoreCase(textDirectionString()) ? 2 : 3;
        }

        public static TypeAdapter<Config> typeAdapter(Gson gson) {
            return new C$AutoValue_PlayerControls_Config.GsonTypeAdapter(gson);
        }

        /* loaded from: classes.dex */
        public static abstract class ImagesConfig implements Parcelable {
            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract Size size();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract Map<String, String> tokens();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract String url();

            public Image getImageForSegmentId(String str) {
                String url = url();
                Size size = size();
                if (C8168dfL.g(url) || size == null) {
                    return null;
                }
                Map<String, String> map = tokens();
                if (map != null) {
                    String str2 = map.get("segmentId");
                    if (str != null && str2 != null) {
                        url = url.replace(str2, str);
                    }
                }
                return new AutoValue_Image(str, url, size.width(), size.height(), Float.valueOf(1.0f), null, false);
            }

            public static TypeAdapter<ImagesConfig> typeAdapter(Gson gson) {
                return new C$AutoValue_PlayerControls_Config_ImagesConfig.GsonTypeAdapter(gson).setDefaultSize(new AutoValue_Size(0, 0));
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class StoryLines implements Parcelable {
        public abstract List<StoryLine> list();

        /* loaded from: classes.dex */
        public static abstract class StoryLine implements Parcelable {
            public abstract List<String> choicePoints();

            public abstract String id();

            public static TypeAdapter<StoryLine> typeAdapter(Gson gson) {
                return new C$AutoValue_PlayerControls_StoryLines_StoryLine.GsonTypeAdapter(gson);
            }
        }

        public static TypeAdapter<StoryLines> typeAdapter(Gson gson) {
            return new C$AutoValue_PlayerControls_StoryLines.GsonTypeAdapter(gson);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ChoicePointsMetadata implements Parcelable {
        public abstract AssetManifest assetManifest();

        public abstract Cell cell();

        public abstract Map<String, ChoicePoint> choicePoints();

        public abstract Map<String, Choice> choices();

        public abstract Container container();

        /* loaded from: classes.dex */
        public static abstract class Container implements Parcelable {
            @SerializedName("default")
            public abstract ContainerData defaultData();

            public abstract ContainerData zoomed();

            /* loaded from: classes.dex */
            public static abstract class ContainerData implements Parcelable {
                public abstract int itemSpacing();

                public abstract double renderHeight();

                public static TypeAdapter<ContainerData> typeAdapter(Gson gson) {
                    return new C$AutoValue_PlayerControls_ChoicePointsMetadata_Container_ContainerData.GsonTypeAdapter(gson);
                }
            }

            public static TypeAdapter<Container> typeAdapter(Gson gson) {
                return new C$AutoValue_PlayerControls_ChoicePointsMetadata_Container.GsonTypeAdapter(gson);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class Cell implements Parcelable {
            public abstract List<SourceRect> buttons();

            public abstract List<SourceRect> choicePosition();

            public abstract Focus focus();

            public abstract MainView mainView();

            public abstract SourceRect rect();

            /* loaded from: classes.dex */
            public static abstract class MainView implements Parcelable {
                /* JADX INFO: Access modifiers changed from: package-private */
                public abstract ImageAssetId image();

                public String assetId() {
                    ImageAssetId image = image();
                    if (image == null) {
                        return null;
                    }
                    return image.assetId();
                }

                public static TypeAdapter<MainView> typeAdapter(Gson gson) {
                    return new C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_MainView.GsonTypeAdapter(gson);
                }
            }

            /* loaded from: classes.dex */
            public static abstract class Focus implements Parcelable {
                /* JADX INFO: Access modifiers changed from: package-private */
                public abstract ImageAssetId image();

                public abstract SourceRect rect();

                public String assetId() {
                    ImageAssetId image = image();
                    if (image == null) {
                        return null;
                    }
                    return image.assetId();
                }

                public static TypeAdapter<Focus> typeAdapter(Gson gson) {
                    return new C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell_Focus.GsonTypeAdapter(gson);
                }
            }

            public static TypeAdapter<Cell> typeAdapter(Gson gson) {
                return new C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell.GsonTypeAdapter(gson);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class ChoicePoint implements Parcelable {
            public abstract List<String> choices();

            public abstract String description();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract ImageAssetId image();

            public abstract Long startTimeMs();

            public String assetId() {
                ImageAssetId image = image();
                if (image == null) {
                    return null;
                }
                return image.assetId();
            }

            public static TypeAdapter<ChoicePoint> typeAdapter(Gson gson) {
                return new C$AutoValue_PlayerControls_ChoicePointsMetadata_ChoicePoint.GsonTypeAdapter(gson);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class Choice implements Parcelable {
            public abstract String choicePoint();

            public abstract String description();

            /* JADX INFO: Access modifiers changed from: package-private */
            public abstract ImageAssetId image();

            public abstract String segmentId();

            public abstract String startTimeMs();

            public String assetId() {
                ImageAssetId image = image();
                if (image == null) {
                    return null;
                }
                return image.assetId();
            }

            public static TypeAdapter<Choice> typeAdapter(Gson gson) {
                return new C$AutoValue_PlayerControls_ChoicePointsMetadata_Choice.GsonTypeAdapter(gson);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class TimeStamp implements Parcelable {
            public abstract String description();

            public abstract String segmentId();

            public abstract Integer startTimeMs();

            public static TypeAdapter<TimeStamp> typeAdapter(Gson gson) {
                return new C$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp.GsonTypeAdapter(gson).setDefaultStartTimeMs(0);
            }
        }

        public static TypeAdapter<ChoicePointsMetadata> typeAdapter(Gson gson) {
            return new C$AutoValue_PlayerControls_ChoicePointsMetadata.GsonTypeAdapter(gson);
        }
    }

    public static TypeAdapter<PlayerControls> typeAdapter(Gson gson) {
        return new C$AutoValue_PlayerControls.GsonTypeAdapter(gson);
    }
}

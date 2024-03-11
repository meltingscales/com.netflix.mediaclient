package com.netflix.model.leafs.social.multititle;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.social.VideoTypeAdapter;
import com.netflix.model.leafs.social.multititle.NotificationGridModule;
import com.netflix.model.leafs.social.multititle.NotificationHeroModule;
import com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule;
import java.util.ArrayList;
import o.C1332Xp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes.dex */
public final class NotificationModuleListTypeAdapter extends TypeAdapter<NotificationModuleList> {
    private static final String ACTIONS = "actions";
    private static final String BODY_COPY = "bodyCopy";
    private static final String BODY_COPY_CONFIRMATION_THUMBSDOWN = "bodyCopyConfirmationThumbsDown";
    private static final String BODY_COPY_CONFIRMATION_THUMBSUP = "bodyCopyConfirmationThumbsUp";
    private static final String BODY_COPY_CONFIRMATION_THUMBSUP_DOUBLE = "bodyCopyConfirmationThumbsUpDouble";
    private static final String BOXSHOT = "boxshot";
    private static final String BOXSHOT_WEBP = "boxshotWebp";
    private static final String COLUMN_WIDTH = "columnWidth";
    public static final Companion Companion = new Companion(null);
    private static final String HEADLINE_TEXT = "headlineText";
    private static final String HERO_IMAGE = "heroImage";
    private static final String HERO_IMAGE_WEBP = "heroImageWebp";
    private static final String LAYOUT = "layout";
    public static final String LAYOUT_NAME_CTA_BUTTON = "cta_button";
    private static final String LAYOUT_NAME_GRID = "column_title_grid";
    private static final String LAYOUT_NAME_HERO = "hero_with_action_buttons";
    private static final String LAYOUT_NAME_RATING = "rating";
    private static final String TITLES = "titles";
    private static final String TITLE_ID = "titleId";
    private static final String VIDEO_TYPE = "videoType";
    private final VideoTypeAdapter videoTypeAdapter = new VideoTypeAdapter();

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, NotificationModuleList notificationModuleList) {
        C8632dsu.c((Object) jsonWriter, "");
        C8632dsu.c((Object) notificationModuleList, "");
        jsonWriter.beginArray();
        for (NotificationModule notificationModule : notificationModuleList.modules()) {
            C8632dsu.d(notificationModule);
            writeModule(jsonWriter, notificationModule);
        }
        jsonWriter.endArray();
    }

    private final void writeModule(JsonWriter jsonWriter, NotificationModule notificationModule) {
        jsonWriter.beginObject();
        if (notificationModule instanceof NotificationHeroModule) {
            writeHeroModule(jsonWriter, (NotificationHeroModule) notificationModule);
        } else if (notificationModule instanceof NotificationGridModule) {
            writeGridModule(jsonWriter, (NotificationGridModule) notificationModule);
        } else if (notificationModule instanceof NotificationRatingInfoModule) {
            writeRatingInfoModule(jsonWriter, (NotificationRatingInfoModule) notificationModule);
        }
        jsonWriter.endObject();
    }

    private final void writeHeroModule(JsonWriter jsonWriter, NotificationHeroModule notificationHeroModule) {
        jsonWriter.name(LAYOUT).value(notificationHeroModule.layout());
        jsonWriter.name(BODY_COPY).value(notificationHeroModule.bodyCopy());
        jsonWriter.name(HERO_IMAGE).value(notificationHeroModule.heroImage());
        jsonWriter.name(HERO_IMAGE_WEBP).value(notificationHeroModule.heroImageWebp());
        jsonWriter.name(TITLE_ID).value(Integer.valueOf(notificationHeroModule.titleId()));
        jsonWriter.name(VIDEO_TYPE).value(notificationHeroModule.videoType().getValue());
        jsonWriter.name(ACTIONS);
        jsonWriter.beginArray();
        for (NotificationHeroTitleAction notificationHeroTitleAction : notificationHeroModule.actions()) {
            C1332Xp c1332Xp = C1332Xp.b;
            NotificationHeroTitleAction.typeAdapter((Gson) C1332Xp.b(Gson.class)).write(jsonWriter, notificationHeroTitleAction);
        }
        jsonWriter.endArray();
    }

    private final void writeGridModule(JsonWriter jsonWriter, NotificationGridModule notificationGridModule) {
        jsonWriter.name(LAYOUT).value(notificationGridModule.layout());
        jsonWriter.name(COLUMN_WIDTH).value(Integer.valueOf(notificationGridModule.columnWidth()));
        jsonWriter.name(HEADLINE_TEXT).value(notificationGridModule.headlineText());
        jsonWriter.name(TITLES);
        jsonWriter.beginArray();
        for (NotificationGridTitleAction notificationGridTitleAction : notificationGridModule.actions()) {
            C1332Xp c1332Xp = C1332Xp.b;
            NotificationGridTitleAction.typeAdapter((Gson) C1332Xp.b(Gson.class)).write(jsonWriter, notificationGridTitleAction);
        }
        jsonWriter.endArray();
    }

    private final void writeRatingInfoModule(JsonWriter jsonWriter, NotificationRatingInfoModule notificationRatingInfoModule) {
        jsonWriter.name(LAYOUT).value(notificationRatingInfoModule.layout());
        jsonWriter.name(BODY_COPY).value(notificationRatingInfoModule.bodyCopy());
        jsonWriter.name(BODY_COPY_CONFIRMATION_THUMBSUP).value(notificationRatingInfoModule.bodyCopyConfirmationThumbsUp());
        jsonWriter.name(BODY_COPY_CONFIRMATION_THUMBSUP_DOUBLE).value(notificationRatingInfoModule.bodyCopyConfirmationThumbsUpDouble());
        jsonWriter.name(BODY_COPY_CONFIRMATION_THUMBSDOWN).value(notificationRatingInfoModule.bodyCopyConfirmationThumbsDown());
        jsonWriter.name(BOXSHOT).value(notificationRatingInfoModule.boxshot());
        jsonWriter.name(BOXSHOT_WEBP).value(notificationRatingInfoModule.boxshotWebp());
        jsonWriter.name(ACTIONS);
        jsonWriter.beginArray();
        for (NotificationRatingAction notificationRatingAction : notificationRatingInfoModule.actions()) {
            C1332Xp c1332Xp = C1332Xp.b;
            NotificationRatingAction.typeAdapter((Gson) C1332Xp.b(Gson.class)).write(jsonWriter, notificationRatingAction);
        }
        jsonWriter.endArray();
        jsonWriter.name(TITLE_ID).value(Integer.valueOf(notificationRatingInfoModule.titleId()));
        jsonWriter.name(VIDEO_TYPE).value(notificationRatingInfoModule.videoType().getValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public NotificationModuleList read(JsonReader jsonReader) {
        boolean a;
        boolean a2;
        boolean a3;
        C8632dsu.c((Object) jsonReader, "");
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            if (C8632dsu.c((Object) jsonReader.nextName(), (Object) LAYOUT)) {
                String nextString = jsonReader.nextString();
                a = C8691duz.a(nextString, LAYOUT_NAME_HERO, true);
                if (a) {
                    arrayList.add(parseHeroModule(jsonReader));
                } else {
                    a2 = C8691duz.a(nextString, LAYOUT_NAME_GRID, true);
                    if (a2) {
                        arrayList.add(parseGridModule(jsonReader));
                    } else {
                        a3 = C8691duz.a(nextString, LAYOUT_NAME_RATING, true);
                        if (a3) {
                            arrayList.add(parseRatingInfoModule(jsonReader));
                        }
                    }
                }
            }
            jsonReader.endObject();
        }
        jsonReader.endArray();
        return NotificationModuleList.builder().modules(arrayList).build();
    }

    private final NotificationHeroModule parseHeroModule(JsonReader jsonReader) {
        NotificationHeroModule.Builder layout = NotificationHeroModule.builder().layout(LAYOUT_NAME_HERO);
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                switch (nextName.hashCode()) {
                    case -2016684671:
                        if (nextName.equals(HERO_IMAGE)) {
                            layout.heroImage(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                    case -1307249261:
                        if (nextName.equals(TITLE_ID)) {
                            layout.titleId(jsonReader.nextInt());
                            break;
                        } else {
                            continue;
                        }
                    case -1161803523:
                        if (nextName.equals(ACTIONS)) {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                C1332Xp c1332Xp = C1332Xp.b;
                                NotificationHeroTitleAction read = NotificationHeroTitleAction.typeAdapter((Gson) C1332Xp.b(Gson.class)).read(jsonReader);
                                C8632dsu.a(read, "");
                                arrayList.add(read);
                            }
                            jsonReader.endArray();
                            layout.actions(arrayList);
                            break;
                        } else {
                            continue;
                        }
                    case 1332961877:
                        if (nextName.equals(VIDEO_TYPE)) {
                            layout.videoType(this.videoTypeAdapter.read(jsonReader));
                            break;
                        } else {
                            continue;
                        }
                    case 1702149175:
                        if (nextName.equals(BODY_COPY)) {
                            layout.bodyCopy(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                    case 1797013693:
                        if (nextName.equals(HERO_IMAGE_WEBP)) {
                            layout.heroImageWebp(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
        NotificationHeroModule build = layout.build();
        C8632dsu.a(build, "");
        return build;
    }

    private final NotificationGridModule parseGridModule(JsonReader jsonReader) {
        NotificationGridModule.Builder layout = NotificationGridModule.builder().layout(LAYOUT_NAME_GRID);
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1613873887) {
                    if (hashCode != -873453285) {
                        if (hashCode == -842461168 && nextName.equals(COLUMN_WIDTH)) {
                            layout.columnWidth(jsonReader.nextInt());
                        }
                    } else if (nextName.equals(TITLES)) {
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            C1332Xp c1332Xp = C1332Xp.b;
                            NotificationGridTitleAction read = NotificationGridTitleAction.typeAdapter((Gson) C1332Xp.b(Gson.class)).read(jsonReader);
                            C8632dsu.a(read, "");
                            arrayList.add(read);
                        }
                        jsonReader.endArray();
                        layout.actions(arrayList);
                    }
                } else if (nextName.equals(HEADLINE_TEXT)) {
                    layout.headlineText(jsonReader.nextString());
                }
            }
        }
        NotificationGridModule build = layout.build();
        C8632dsu.a(build, "");
        return build;
    }

    private final NotificationRatingInfoModule parseRatingInfoModule(JsonReader jsonReader) {
        NotificationRatingInfoModule.Builder layout = NotificationRatingInfoModule.builder().layout(LAYOUT_NAME_RATING);
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                switch (nextName.hashCode()) {
                    case -1307249261:
                        if (nextName.equals(TITLE_ID)) {
                            layout.titleId(jsonReader.nextInt());
                            break;
                        } else {
                            continue;
                        }
                    case -1161803523:
                        if (nextName.equals(ACTIONS)) {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                C1332Xp c1332Xp = C1332Xp.b;
                                NotificationRatingAction read = NotificationRatingAction.typeAdapter((Gson) C1332Xp.b(Gson.class)).read(jsonReader);
                                C8632dsu.a(read, "");
                                arrayList.add(read);
                            }
                            jsonReader.endArray();
                            layout.actions(arrayList);
                            break;
                        } else {
                            continue;
                        }
                    case -919606581:
                        if (nextName.equals(BODY_COPY_CONFIRMATION_THUMBSDOWN)) {
                            layout.bodyCopyConfirmationThumbsDown(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                    case 73235269:
                        if (nextName.equals(BOXSHOT)) {
                            layout.boxshot(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                    case 933120772:
                        if (nextName.equals(BODY_COPY_CONFIRMATION_THUMBSUP)) {
                            layout.bodyCopyConfirmationThumbsUp(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                    case 1248813045:
                        if (nextName.equals(BODY_COPY_CONFIRMATION_THUMBSUP_DOUBLE)) {
                            layout.bodyCopyConfirmationThumbsUpDouble(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                    case 1332961877:
                        if (nextName.equals(VIDEO_TYPE)) {
                            layout.videoType(this.videoTypeAdapter.read(jsonReader));
                            break;
                        } else {
                            continue;
                        }
                    case 1461544065:
                        if (nextName.equals(BOXSHOT_WEBP)) {
                            layout.boxshotWebp(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                    case 1702149175:
                        if (nextName.equals(BODY_COPY)) {
                            layout.bodyCopy(jsonReader.nextString());
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
        NotificationRatingInfoModule build = layout.build();
        C8632dsu.a(build, "");
        return build;
    }
}

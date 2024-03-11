package com.netflix.model.leafs.social.multititle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_NotificationTemplate extends C$AutoValue_NotificationTemplate {
    public static final Parcelable.Creator<AutoValue_NotificationTemplate> CREATOR = new Parcelable.Creator<AutoValue_NotificationTemplate>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationTemplate.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationTemplate createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationTemplate(parcel.readString(), parcel.readString(), (NotificationCtaButton) parcel.readParcelable(NotificationTemplate.class.getClassLoader()), (NotificationModuleList) parcel.readParcelable(NotificationTemplate.class.getClassLoader()), (NotificationModuleFilters) parcel.readParcelable(NotificationTemplate.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationTemplate[] newArray(int i) {
            return new AutoValue_NotificationTemplate[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationTemplate(String str, String str2, NotificationCtaButton notificationCtaButton, NotificationModuleList notificationModuleList, NotificationModuleFilters notificationModuleFilters) {
        new C$$AutoValue_NotificationTemplate(str, str2, notificationCtaButton, notificationModuleList, notificationModuleFilters) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationTemplate

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationTemplate$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationTemplate> {
                private final TypeAdapter<String> bodyTextAdapter;
                private final TypeAdapter<NotificationCtaButton> ctaButtonAdapter;
                private final TypeAdapter<String> headlineTextAdapter;
                private final TypeAdapter<NotificationModuleFilters> moduleFiltersForActionsAdapter;
                private String defaultHeadlineText = null;
                private String defaultBodyText = null;
                private NotificationCtaButton defaultCtaButton = null;
                private NotificationModuleList defaultModulesList = null;
                private NotificationModuleFilters defaultModuleFiltersForActions = null;
                private final TypeAdapter<NotificationModuleList> modulesListAdapter = new NotificationModuleListTypeAdapter();

                public GsonTypeAdapter setDefaultBodyText(String str) {
                    this.defaultBodyText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultCtaButton(NotificationCtaButton notificationCtaButton) {
                    this.defaultCtaButton = notificationCtaButton;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeadlineText(String str) {
                    this.defaultHeadlineText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultModuleFiltersForActions(NotificationModuleFilters notificationModuleFilters) {
                    this.defaultModuleFiltersForActions = notificationModuleFilters;
                    return this;
                }

                public GsonTypeAdapter setDefaultModulesList(NotificationModuleList notificationModuleList) {
                    this.defaultModulesList = notificationModuleList;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.headlineTextAdapter = gson.getAdapter(String.class);
                    this.bodyTextAdapter = gson.getAdapter(String.class);
                    this.ctaButtonAdapter = gson.getAdapter(NotificationCtaButton.class);
                    this.moduleFiltersForActionsAdapter = gson.getAdapter(NotificationModuleFilters.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationTemplate notificationTemplate) {
                    if (notificationTemplate == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("headlineText");
                    this.headlineTextAdapter.write(jsonWriter, notificationTemplate.headlineText());
                    jsonWriter.name("bodyText");
                    this.bodyTextAdapter.write(jsonWriter, notificationTemplate.bodyText());
                    jsonWriter.name(SignupConstants.Message.CTA_BUTTON);
                    this.ctaButtonAdapter.write(jsonWriter, notificationTemplate.ctaButton());
                    jsonWriter.name("modules");
                    this.modulesListAdapter.write(jsonWriter, notificationTemplate.modulesList());
                    jsonWriter.name("showModulesOnAction");
                    this.moduleFiltersForActionsAdapter.write(jsonWriter, notificationTemplate.moduleFiltersForActions());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationTemplate read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultHeadlineText;
                    String str2 = this.defaultBodyText;
                    String str3 = str;
                    String str4 = str2;
                    NotificationCtaButton notificationCtaButton = this.defaultCtaButton;
                    NotificationModuleList notificationModuleList = this.defaultModulesList;
                    NotificationModuleFilters notificationModuleFilters = this.defaultModuleFiltersForActions;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1613873887:
                                    if (nextName.equals("headlineText")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1023587105:
                                    if (nextName.equals("showModulesOnAction")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -352138910:
                                    if (nextName.equals(SignupConstants.Message.CTA_BUTTON)) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1227433863:
                                    if (nextName.equals("modules")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1702646255:
                                    if (nextName.equals("bodyText")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                str3 = this.headlineTextAdapter.read(jsonReader);
                            } else if (c == 1) {
                                notificationModuleFilters = this.moduleFiltersForActionsAdapter.read(jsonReader);
                            } else if (c == 2) {
                                notificationCtaButton = this.ctaButtonAdapter.read(jsonReader);
                            } else if (c == 3) {
                                notificationModuleList = this.modulesListAdapter.read(jsonReader);
                            } else if (c == 4) {
                                str4 = this.bodyTextAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationTemplate(str3, str4, notificationCtaButton, notificationModuleList, notificationModuleFilters);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(headlineText());
        parcel.writeString(bodyText());
        parcel.writeParcelable(ctaButton(), i);
        parcel.writeParcelable(modulesList(), i);
        parcel.writeParcelable(moduleFiltersForActions(), i);
    }
}

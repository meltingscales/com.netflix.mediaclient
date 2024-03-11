package com.netflix.model.leafs.originals.interactive;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.Notification;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Notification_NotificationOverride extends C$AutoValue_Notification_NotificationOverride {
    AutoValue_Notification_NotificationOverride(final Notification notification, final String str) {
        new Notification.NotificationOverride(notification, str) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Notification_NotificationOverride
            private final Notification data;
            private final String preconditionId;

            @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationOverride
            public Notification data() {
                return this.data;
            }

            @Override // com.netflix.model.leafs.originals.interactive.Notification.NotificationOverride
            public String preconditionId() {
                return this.preconditionId;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                if (notification == null) {
                    throw new NullPointerException("Null data");
                }
                this.data = notification;
                this.preconditionId = str;
            }

            public String toString() {
                return "NotificationOverride{data=" + this.data + ", preconditionId=" + this.preconditionId + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Notification.NotificationOverride) {
                    Notification.NotificationOverride notificationOverride = (Notification.NotificationOverride) obj;
                    if (this.data.equals(notificationOverride.data())) {
                        String str2 = this.preconditionId;
                        if (str2 == null) {
                            if (notificationOverride.preconditionId() == null) {
                                return true;
                            }
                        } else if (str2.equals(notificationOverride.preconditionId())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.data.hashCode();
                String str2 = this.preconditionId;
                return ((hashCode ^ 1000003) * 1000003) ^ (str2 == null ? 0 : str2.hashCode());
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Notification.NotificationOverride> {
        private final TypeAdapter<Notification> dataAdapter;
        private Notification defaultData = null;
        private String defaultPreconditionId = null;
        private final TypeAdapter<String> preconditionIdAdapter;

        public GsonTypeAdapter setDefaultData(Notification notification) {
            this.defaultData = notification;
            return this;
        }

        public GsonTypeAdapter setDefaultPreconditionId(String str) {
            this.defaultPreconditionId = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.dataAdapter = gson.getAdapter(Notification.class);
            this.preconditionIdAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Notification.NotificationOverride notificationOverride) {
            if (notificationOverride == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(NotificationFactory.DATA);
            this.dataAdapter.write(jsonWriter, notificationOverride.data());
            jsonWriter.name("preconditionId");
            this.preconditionIdAdapter.write(jsonWriter, notificationOverride.preconditionId());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Notification.NotificationOverride read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Notification notification = this.defaultData;
            String str = this.defaultPreconditionId;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals(NotificationFactory.DATA)) {
                        notification = this.dataAdapter.read(jsonReader);
                    } else if (nextName.equals("preconditionId")) {
                        str = this.preconditionIdAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_Notification_NotificationOverride(notification, str);
        }
    }
}

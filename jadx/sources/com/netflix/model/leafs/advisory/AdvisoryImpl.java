package com.netflix.model.leafs.advisory;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.ArrayList;
import java.util.Map;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public abstract class AdvisoryImpl implements InterfaceC0952Ix, Advisory {
    private static final String TAG = "Advisory";
    public float displayDelay;
    public float displayDuration;
    public Advisory.DisplayLocation timeLocation = Advisory.DisplayLocation.START;
    @SerializedName("type")
    protected Advisory.Type type;

    @Override // com.netflix.model.leafs.advisory.Advisory
    public float getDelay() {
        return this.displayDelay;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public float getDuration() {
        return this.displayDuration;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public Advisory.Type getType() {
        return this.type;
    }

    public static AdvisoryImpl make(Advisory.Type type, JsonObject jsonObject) {
        AdvisoryImpl concreteInstance = getConcreteInstance(type);
        concreteInstance.populate(jsonObject);
        return concreteInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.model.leafs.advisory.AdvisoryImpl$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$netflix$model$leafs$advisory$Advisory$Type;

        static {
            int[] iArr = new int[Advisory.Type.values().length];
            $SwitchMap$com$netflix$model$leafs$advisory$Advisory$Type = iArr;
            try {
                iArr[Advisory.Type.PRODUCT_PLACEMENT_ADVISORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$netflix$model$leafs$advisory$Advisory$Type[Advisory.Type.CONTENT_ADVISORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$netflix$model$leafs$advisory$Advisory$Type[Advisory.Type.EXPIRY_NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static AdvisoryImpl getConcreteInstance(Advisory.Type type) {
        int i = AnonymousClass1.$SwitchMap$com$netflix$model$leafs$advisory$Advisory$Type[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new ExpiringContentAdvisory();
                }
                return new GenericAdvisory();
            }
            return new ContentAdvisoryImpl();
        }
        return new ProductPlacementAdvisory();
    }

    public static ArrayList<Advisory> asList(JsonArray jsonArray) {
        ArrayList<Advisory> arrayList = new ArrayList<>();
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
                AdvisoryImpl make = make(Advisory.Type.fromString(asJsonObject.get("type").getAsString()), asJsonObject);
                if (make != null) {
                    arrayList.add(make);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1416457340:
                    if (key.equals("displayTimeLocation")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    if (key.equals(NotificationFactory.DATA)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 310064551:
                    if (key.equals("displayTimeGap")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1107814518:
                    if (key.equals("displayDuration")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.timeLocation = Advisory.DisplayLocation.fromString(value.getAsString());
            } else if (c == 1) {
                getData(value);
            } else if (c == 2) {
                this.displayDelay = value.getAsFloat();
            } else if (c == 3) {
                this.displayDuration = value.getAsFloat();
            }
        }
    }
}

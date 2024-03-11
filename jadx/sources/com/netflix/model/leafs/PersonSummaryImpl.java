package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import java.util.Map;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class PersonSummaryImpl implements InterfaceC0952Ix, PersonSummary {
    public static final Companion Companion = new Companion(null);
    private int personId;
    private String personName = "";
    private String unifiedEntityId = "";

    @Override // com.netflix.model.leafs.PersonSummary
    public int getPersonId() {
        return this.personId;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public String getPersonName() {
        return this.personName;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public String getUnifiedEntityId() {
        return this.unifiedEntityId;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public void setPersonId(int i) {
        this.personId = i;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public void setPersonName(String str) {
        C8632dsu.c((Object) str, "");
        this.personName = str;
    }

    public void setUnifiedEntityId(String str) {
        C8632dsu.c((Object) str, "");
        this.unifiedEntityId = str;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("PersonSummary");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                int hashCode = key.hashCode();
                if (hashCode != -416615408) {
                    if (hashCode != 3373707) {
                        if (hashCode == 443163472 && key.equals("personId")) {
                            setPersonId(value.getAsInt());
                        }
                    } else if (key.equals("name")) {
                        String asString = value.getAsString();
                        C8632dsu.a(asString, "");
                        setPersonName(asString);
                    }
                } else if (key.equals("unifiedEntityId")) {
                    String asString2 = value.getAsString();
                    C8632dsu.a(asString2, "");
                    setUnifiedEntityId(asString2);
                }
            }
        }
    }
}

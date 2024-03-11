package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import java.util.ArrayList;
import java.util.Iterator;
import o.C1596aHd;
import o.InterfaceC0951Iw;
import o.InterfaceC0952Ix;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;

/* loaded from: classes5.dex */
public class ListOfListOfGenres extends ArrayList<GenreItem> implements InterfaceC0952Ix, InterfaceC0951Iw {
    private long timestamp = System.currentTimeMillis();

    @Override // o.InterfaceC8323diH
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // o.InterfaceC8323diH
    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        clear();
        if (jsonElement.isJsonArray()) {
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                GenreItemImpl genreItemImpl = new GenreItemImpl();
                genreItemImpl.populate(it.next());
                add(genreItemImpl);
            }
        } else if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.has("_sentinel") && asJsonObject.has("value")) {
                populate(asJsonObject.get("value"));
                return;
            }
            InterfaceC1593aHa.b("jsonElem: " + jsonElement);
            InterfaceC1598aHf.a(new C1596aHd("ListOfListOfGenres: passed argument is not a sentinel.").b(ErrorType.m));
        } else {
            InterfaceC1593aHa.b("jsonElem: " + jsonElement);
            InterfaceC1598aHf.a(new C1596aHd("ListOfListOfGenres: passed argument is not an array nor sentinel.").b(ErrorType.m));
        }
    }
}

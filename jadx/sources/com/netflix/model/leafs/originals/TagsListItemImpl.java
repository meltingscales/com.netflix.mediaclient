package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.GenreItemImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C1596aHd;
import o.C8168dfL;
import o.InterfaceC1598aHf;

/* loaded from: classes5.dex */
public class TagsListItemImpl extends GenreItemImpl implements TagSummary {
    private static final String TAG = "ListOfTagSummary";
    private int position;
    private int rank;

    @Override // com.netflix.model.leafs.originals.TagSummary
    public int getPosition() {
        return this.position;
    }

    @Override // com.netflix.model.leafs.originals.TagSummary
    public int getRank() {
        return this.rank;
    }

    @Override // com.netflix.model.leafs.originals.TagSummary
    public void setRank(int i) {
        this.rank = i;
    }

    @Override // com.netflix.model.leafs.GenreItemImpl, o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        super.populate(jsonElement);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.genreType = GenreItem.GenreType.GALLERY.name();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            int hashCode = key.hashCode();
            if (hashCode == 3355) {
                if (key.equals(SignupConstants.Field.LANG_ID)) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 3373707) {
                if (hashCode == 1714148973 && key.equals("displayName")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (key.equals("name")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                this.genreId = entry.getValue().getAsString();
            } else if (c == 1 || c == 2) {
                this.genreName = C8168dfL.b(entry.getValue().getAsString());
            }
        }
    }

    public static List<TagSummary> getListOfTags(JsonElement jsonElement) {
        ArrayList arrayList = new ArrayList();
        if (jsonElement != null && jsonElement.isJsonArray()) {
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            int i = 0;
            while (it.hasNext()) {
                JsonObject asJsonObject = it.next().getAsJsonObject();
                TagsListItemImpl tagsListItemImpl = new TagsListItemImpl();
                tagsListItemImpl.populate(asJsonObject);
                if (tagsListItemImpl.genreName != null && tagsListItemImpl.genreId != null) {
                    tagsListItemImpl.position = i;
                    arrayList.add(tagsListItemImpl);
                } else {
                    InterfaceC1598aHf.a(new C1596aHd(String.format(Locale.US, "%s - name or id is equal to null", TAG)).b(ErrorType.m).b(false));
                }
                i++;
            }
        }
        return arrayList;
    }

    public static String getTagsAsString(List<TagSummary> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TagSummary tagSummary : list) {
            if (C8168dfL.h(tagSummary.getTitle())) {
                arrayList.add(tagSummary.getTitle());
            }
        }
        return C8168dfL.c((String[]) arrayList.toArray(new String[0]));
    }
}

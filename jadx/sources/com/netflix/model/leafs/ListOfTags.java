package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.TagsListItemImpl;
import java.util.ArrayList;
import java.util.Iterator;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC0951Iw;
import o.InterfaceC0952Ix;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes5.dex */
public final class ListOfTags extends ArrayList<TagSummary> implements InterfaceC0952Ix, InterfaceC0951Iw {
    private long timestamp = System.currentTimeMillis();

    @Override // o.InterfaceC8323diH
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // o.InterfaceC8323diH
    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public /* bridge */ boolean contains(TagSummary tagSummary) {
        return super.contains((Object) tagSummary);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TagSummary) {
            return contains((TagSummary) obj);
        }
        return false;
    }

    public int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(TagSummary tagSummary) {
        return super.indexOf((Object) tagSummary);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof TagSummary) {
            return indexOf((TagSummary) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(TagSummary tagSummary) {
        return super.lastIndexOf((Object) tagSummary);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof TagSummary) {
            return lastIndexOf((TagSummary) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final TagSummary remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(TagSummary tagSummary) {
        return super.remove((Object) tagSummary);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof TagSummary) {
            return remove((TagSummary) obj);
        }
        return false;
    }

    public TagSummary removeAt(int i) {
        return (TagSummary) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        Throwable th;
        C8632dsu.c((Object) jsonElement, "");
        clear();
        if (jsonElement.isJsonArray()) {
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                TagsListItemImpl tagsListItemImpl = new TagsListItemImpl();
                tagsListItemImpl.populate(it.next());
                add(tagsListItemImpl);
            }
            return;
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("jsonElem: " + jsonElement);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd b = new C1596aHd("ListOfListOfTags: passed argument is not an array", null, null, false, null, false, false, 126, null).b(ErrorType.m);
        ErrorType errorType = b.a;
        if (errorType != null) {
            b.e.put("errorType", errorType.c());
            String b2 = b.b();
            if (b2 != null) {
                String c = errorType.c();
                b.a(c + " " + b2);
            }
        }
        if (b.b() != null && b.i != null) {
            th = new Throwable(b.b(), b.i);
        } else if (b.b() != null) {
            th = new Throwable(b.b());
        } else {
            th = b.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(b, th);
        } else {
            dVar.e().b(b, th);
        }
    }
}

package com.netflix.mediaclient.ui.details;

import android.content.Intent;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class CharacterHelper$retainedFragments$1 extends LinkedHashMap<Intent, KidsCharacterFrag> {
    public KidsCharacterFrag a(Intent intent) {
        return (KidsCharacterFrag) super.get(intent);
    }

    public boolean a(KidsCharacterFrag kidsCharacterFrag) {
        return super.containsValue(kidsCharacterFrag);
    }

    public Collection<KidsCharacterFrag> b() {
        return super.values();
    }

    public boolean b(Intent intent, KidsCharacterFrag kidsCharacterFrag) {
        return super.remove(intent, kidsCharacterFrag);
    }

    public KidsCharacterFrag c(Intent intent) {
        return (KidsCharacterFrag) super.remove(intent);
    }

    public Set<Intent> c() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof Intent)) {
            return d((Intent) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof KidsCharacterFrag)) {
            return a((KidsCharacterFrag) obj);
        }
        return false;
    }

    public Set<Map.Entry<Intent, KidsCharacterFrag>> d() {
        return super.entrySet();
    }

    public boolean d(Intent intent) {
        return super.containsKey(intent);
    }

    public int e() {
        return super.size();
    }

    public KidsCharacterFrag e(Intent intent, KidsCharacterFrag kidsCharacterFrag) {
        return (KidsCharacterFrag) super.getOrDefault(intent, kidsCharacterFrag);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<Intent, KidsCharacterFrag>> entrySet() {
        return d();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null || (obj instanceof Intent)) {
            return a((Intent) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return (obj == null || (obj instanceof Intent)) ? e((Intent) obj, (KidsCharacterFrag) obj2) : obj2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Intent> keySet() {
        return c();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (obj == null || (obj instanceof Intent)) {
            return c((Intent) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if (obj == null || (obj instanceof Intent)) {
            if (obj2 == null || (obj2 instanceof KidsCharacterFrag)) {
                return b((Intent) obj, (KidsCharacterFrag) obj2);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return e();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<KidsCharacterFrag> values() {
        return b();
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<Intent, KidsCharacterFrag> entry) {
        return size() > 1;
    }
}

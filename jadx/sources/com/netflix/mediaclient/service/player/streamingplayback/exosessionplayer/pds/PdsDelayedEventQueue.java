package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8569dql;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public final class PdsDelayedEventQueue {
    private final Map<Object, List<d>> d = new LinkedHashMap();

    public final void d(Object obj, d dVar) {
        C8632dsu.c((Object) dVar, "");
        List<d> list = this.d.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.d.put(obj, list);
        }
        list.add(dVar);
    }

    public final List<d> c(Object obj) {
        List<d> i;
        List<d> remove = this.d.remove(obj);
        if (remove == null) {
            i = C8569dql.i();
            return i;
        }
        return remove;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class EventType {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ EventType[] c;
        public static final EventType b = new EventType("DOWNSTREAM_FORMAT_CHANGED", 0);
        public static final EventType d = new EventType("TRACKS_CHANGED", 1);

        private static final /* synthetic */ EventType[] c() {
            return new EventType[]{b, d};
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) c.clone();
        }

        private EventType(String str, int i) {
        }

        static {
            EventType[] c2 = c();
            c = c2;
            a = C8600drp.e(c2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final EventType a;
        private final Object c;

        public final EventType b() {
            return this.a;
        }

        public final Object d() {
            return this.c;
        }

        public d(EventType eventType, Object obj) {
            C8632dsu.c((Object) eventType, "");
            C8632dsu.c(obj, "");
            this.a = eventType;
            this.c = obj;
        }
    }
}

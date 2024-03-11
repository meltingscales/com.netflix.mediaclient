package com.netflix.mediaclient.latencytracker.impl;

import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C8632dsu;
import o.InterfaceC1270Vf;
import org.json.JSONObject;

@Singleton
/* loaded from: classes3.dex */
public final class UiLatencyMarkerImpl implements UiLatencyMarker {
    private final InterfaceC1270Vf a;
    private final ConcurrentHashMap<UiLatencyMarker.Mark, Long> c;
    private final ConcurrentHashMap<UiLatencyMarker.Condition, Boolean> e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface UiLatencyMarkerModule {
        @Binds
        UiLatencyMarker a(UiLatencyMarkerImpl uiLatencyMarkerImpl);
    }

    @Inject
    public UiLatencyMarkerImpl(InterfaceC1270Vf interfaceC1270Vf) {
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.a = interfaceC1270Vf;
        this.c = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
    }

    @Override // com.netflix.mediaclient.latencytracker.api.UiLatencyMarker
    public void b(UiLatencyMarker.Mark mark) {
        C8632dsu.c((Object) mark, "");
        e(mark, this.a.c());
    }

    @Override // com.netflix.mediaclient.latencytracker.api.UiLatencyMarker
    public void e(UiLatencyMarker.Mark mark, long j) {
        C8632dsu.c((Object) mark, "");
        this.c.put(mark, Long.valueOf(j));
    }

    @Override // com.netflix.mediaclient.latencytracker.api.UiLatencyMarker
    public void b(UiLatencyMarker.Condition condition, boolean z) {
        C8632dsu.c((Object) condition, "");
        this.e.put(condition, Boolean.valueOf(z));
    }

    @Override // com.netflix.mediaclient.latencytracker.api.UiLatencyMarker
    public Long c(UiLatencyMarker.Mark mark) {
        C8632dsu.c((Object) mark, "");
        return this.c.get(mark);
    }

    @Override // com.netflix.mediaclient.latencytracker.api.UiLatencyMarker
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<UiLatencyMarker.Mark, Long> entry : this.c.entrySet()) {
            jSONObject.put(entry.getKey().name(), entry.getValue().longValue());
        }
        for (Map.Entry<UiLatencyMarker.Condition, Boolean> entry2 : this.e.entrySet()) {
            jSONObject.put(entry2.getKey().name(), entry2.getValue().booleanValue());
        }
        this.c.clear();
        this.e.clear();
        return jSONObject;
    }
}

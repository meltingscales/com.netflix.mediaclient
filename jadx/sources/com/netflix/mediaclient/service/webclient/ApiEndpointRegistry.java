package com.netflix.mediaclient.service.webclient;

import java.util.Map;
import o.InterfaceC5081bry;

/* loaded from: classes.dex */
public interface ApiEndpointRegistry extends InterfaceC5081bry {
    Map<String, String> a();

    Map<String, String> a(ResponsePathFormat responsePathFormat);

    String b();

    String b(String str);

    Map<String, String> c();

    String d(String str);

    boolean d();

    String g();

    /* loaded from: classes4.dex */
    public enum ResponsePathFormat {
        GRAPH("graph"),
        HIERARCHICAL("hierarchical");
        
        public final String e;

        ResponsePathFormat(String str) {
            this.e = str;
        }
    }
}

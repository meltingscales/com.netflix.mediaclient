package com.bugsnag.android;

import java.util.Date;
import java.util.Map;
import o.C9189kr;
import o.C9246lv;
import o.C9302my;
import o.InterfaceC9200lB;

/* loaded from: classes2.dex */
public class Breadcrumb implements C9246lv.a {
    public final C9189kr impl;
    private final InterfaceC9200lB logger;

    public Breadcrumb(C9189kr c9189kr, InterfaceC9200lB interfaceC9200lB) {
        this.impl = c9189kr;
        this.logger = interfaceC9200lB;
    }

    public Breadcrumb(String str, InterfaceC9200lB interfaceC9200lB) {
        this.impl = new C9189kr(str);
        this.logger = interfaceC9200lB;
    }

    public Breadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date, InterfaceC9200lB interfaceC9200lB) {
        this.impl = new C9189kr(str, breadcrumbType, map, date);
        this.logger = interfaceC9200lB;
    }

    private void logNull(String str) {
        InterfaceC9200lB interfaceC9200lB = this.logger;
        interfaceC9200lB.c("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    public void setMessage(String str) {
        if (str != null) {
            this.impl.e = str;
        } else {
            logNull("message");
        }
    }

    public String getMessage() {
        return this.impl.e;
    }

    public void setType(BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.d = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    public BreadcrumbType getType() {
        return this.impl.d;
    }

    public void setMetadata(Map<String, Object> map) {
        this.impl.a = map;
    }

    public Map<String, Object> getMetadata() {
        return this.impl.a;
    }

    public Date getTimestamp() {
        return this.impl.c;
    }

    String getStringTimestamp() {
        return C9302my.a(this.impl.c);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        this.impl.toStream(c9246lv);
    }
}

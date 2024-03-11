package com.bugsnag.android;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC9286mi;
import o.C8563dqf;
import o.C8564dqg;
import o.C8569dql;
import o.C8632dsu;
import o.C9185kn;
import o.C9189kr;
import o.C9190ks;
import o.C9246lv;
import o.InterfaceC9200lB;
import o.InterfaceC9263mL;

/* loaded from: classes2.dex */
public final class BreadcrumbState extends C9185kn implements C9246lv.a {
    private final C9190ks callbackState;
    private final InterfaceC9200lB logger;
    private final int maxBreadcrumbs;
    private final Breadcrumb[] store;
    private final int validIndexMask = Integer.MAX_VALUE;
    private final AtomicInteger index = new AtomicInteger(0);

    public BreadcrumbState(int i, C9190ks c9190ks, InterfaceC9200lB interfaceC9200lB) {
        this.maxBreadcrumbs = i;
        this.callbackState = c9190ks;
        this.logger = interfaceC9200lB;
        this.store = new Breadcrumb[i];
    }

    public final void add(Breadcrumb breadcrumb) {
        if (this.maxBreadcrumbs == 0 || !this.callbackState.d(breadcrumb, this.logger)) {
            return;
        }
        this.store[getBreadcrumbIndex()] = breadcrumb;
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        C9189kr c9189kr = breadcrumb.impl;
        String str = c9189kr.e;
        BreadcrumbType breadcrumbType = c9189kr.d;
        String d = C8632dsu.d("t", Long.valueOf(c9189kr.c.getTime()));
        Map map = breadcrumb.impl.a;
        if (map == null) {
            map = new LinkedHashMap();
        }
        AbstractC9286mi.a aVar = new AbstractC9286mi.a(str, breadcrumbType, d, map);
        for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
            interfaceC9263mL.onStateChange(aVar);
        }
    }

    private final int getBreadcrumbIndex() {
        int i;
        do {
            i = this.index.get() & this.validIndexMask;
        } while (!this.index.compareAndSet(i, (i + 1) % this.maxBreadcrumbs));
        return i;
    }

    public final List<Breadcrumb> copy() {
        List<Breadcrumb> u;
        List<Breadcrumb> i;
        if (this.maxBreadcrumbs == 0) {
            i = C8569dql.i();
            return i;
        }
        int i2 = -1;
        while (i2 == -1) {
            i2 = this.index.getAndSet(-1);
        }
        try {
            int i3 = this.maxBreadcrumbs;
            Breadcrumb[] breadcrumbArr = new Breadcrumb[i3];
            C8564dqg.d(this.store, breadcrumbArr, 0, i2, i3);
            C8564dqg.d(this.store, breadcrumbArr, this.maxBreadcrumbs - i2, 0, i2);
            u = C8563dqf.u(breadcrumbArr);
            return u;
        } finally {
            this.index.set(i2);
        }
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        List<Breadcrumb> copy = copy();
        c9246lv.c();
        for (Breadcrumb breadcrumb : copy) {
            breadcrumb.toStream(c9246lv);
        }
        c9246lv.b();
    }
}

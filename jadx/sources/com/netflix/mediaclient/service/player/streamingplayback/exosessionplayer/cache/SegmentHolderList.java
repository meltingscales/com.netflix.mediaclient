package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.cache;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C4637biK;
import o.C5209buT;

/* loaded from: classes3.dex */
public class SegmentHolderList extends CopyOnWriteArrayList<C4637biK> {
    private long b = -9223372036854775807L;

    public long e() {
        return this.b;
    }

    public C4637biK e(C5209buT c5209buT) {
        Iterator<C4637biK> it = iterator();
        while (it.hasNext()) {
            C4637biK next = it.next();
            if (next.m == c5209buT) {
                return next;
            }
        }
        return null;
    }

    public C4637biK d() {
        long i;
        int i2;
        Iterator<C4637biK> it = iterator();
        C4637biK c4637biK = null;
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            C4637biK next = it.next();
            if (next.o() != 0 && ((next.i()) < j || (i2 == 0 && next.o() > c4637biK.o()))) {
                if (!next.a.isEmpty()) {
                    next = next.a.d();
                }
                if (next != null && !next.r()) {
                    c4637biK = next;
                    j = i;
                }
            }
        }
        return c4637biK;
    }

    public long b() {
        Iterator<C4637biK> it = iterator();
        long j = 0;
        while (it.hasNext()) {
            C4637biK next = it.next();
            j += next.d() + next.a.b();
        }
        return j;
    }

    public long c() {
        Iterator<C4637biK> it = iterator();
        long j = 0;
        while (it.hasNext()) {
            C4637biK next = it.next();
            j += next.b() + next.a.c();
        }
        return j;
    }

    public void a() {
        Iterator<C4637biK> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            C4637biK next = it.next();
            next.a.a();
            i += next.i;
        }
        Iterator<C4637biK> it2 = iterator();
        while (it2.hasNext()) {
            C4637biK next2 = it2.next();
            next2.a(i == 0 ? 0 : (next2.i * 100) / i);
        }
    }

    public void g() {
        Iterator<C4637biK> it = iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    private void c(C4637biK c4637biK) {
        if (c4637biK != null) {
            if (c4637biK.g() >= 0) {
                long j = this.b;
                if (j < 0) {
                    this.b = c4637biK.g();
                    return;
                } else {
                    this.b = Math.min(j, c4637biK.g());
                    return;
                }
            }
            return;
        }
        this.b = Long.MAX_VALUE;
        Iterator<C4637biK> it = iterator();
        while (it.hasNext()) {
            C4637biK next = it.next();
            if (next.g() >= 0) {
                this.b = Math.min(this.b, next.g());
            }
        }
        if (this.b == Long.MAX_VALUE) {
            this.b = -9223372036854775807L;
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    /* renamed from: b */
    public boolean add(C4637biK c4637biK) {
        boolean add = super.add(c4637biK);
        a();
        c(c4637biK);
        c4637biK.l.b(c4637biK);
        return add;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        a();
        c(null);
        if (obj instanceof C4637biK) {
            C4637biK c4637biK = (C4637biK) obj;
            c4637biK.l.e(c4637biK);
            c4637biK.a.clear();
        }
        return remove;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = super.removeAll(collection);
        a();
        c(null);
        for (Object obj : collection) {
            if (obj instanceof C4637biK) {
                C4637biK c4637biK = (C4637biK) obj;
                c4637biK.l.e(c4637biK);
                c4637biK.a.clear();
            }
        }
        return removeAll;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public void clear() {
        Iterator<C4637biK> it = iterator();
        while (it.hasNext()) {
            C4637biK next = it.next();
            next.l.e(next);
            next.a.clear();
        }
        super.clear();
        a();
        c(null);
    }
}

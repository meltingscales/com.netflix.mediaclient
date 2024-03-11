package com.netflix.mediaclient.ui.mylist.impl.sort;

import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortEpoxyController;
import o.AbstractC7036coc;
import o.C7038coe;
import o.C8569dql;
import o.C8632dsu;
import o.C9935zP;

/* loaded from: classes4.dex */
public final class MyListSortEpoxyController extends TypedEpoxyController<d> {
    public static final int $stable = 8;
    private final C9935zP eventBusFactory;

    public MyListSortEpoxyController(C9935zP c9935zP) {
        C8632dsu.c((Object) c9935zP, "");
        this.eventBusFactory = c9935zP;
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private final MyListSortOrder a;
        private final int c;

        public final MyListSortOrder c() {
            return this.a;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.a, dVar.a) && this.c == dVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            MyListSortOrder myListSortOrder = this.a;
            int i = this.c;
            return "Data(sortOrder=" + myListSortOrder + ", selectedSortOrder=" + i + ")";
        }

        public d(MyListSortOrder myListSortOrder, int i) {
            C8632dsu.c((Object) myListSortOrder, "");
            this.a = myListSortOrder;
            this.c = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(d dVar) {
        if (dVar != null) {
            int i = 0;
            for (Object obj : dVar.c().b()) {
                if (i < 0) {
                    C8569dql.h();
                }
                addMyListSortOptionModel((MyListSortOrderOption) obj, i, dVar.e() == i);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMyListSortOptionModel$lambda$3$lambda$2(MyListSortEpoxyController myListSortEpoxyController, int i, View view) {
        C8632dsu.c((Object) myListSortEpoxyController, "");
        myListSortEpoxyController.emit(new AbstractC7036coc.c(i));
    }

    private final void emit(AbstractC7036coc abstractC7036coc) {
        this.eventBusFactory.b(AbstractC7036coc.class, abstractC7036coc);
    }

    private final void addMyListSortOptionModel(MyListSortOrderOption myListSortOrderOption, final int i, boolean z) {
        C7038coe c7038coe = new C7038coe();
        c7038coe.d((CharSequence) ("MyListSortOptionModel:" + i));
        c7038coe.b(Integer.valueOf(myListSortOrderOption.d()));
        c7038coe.c(z);
        c7038coe.c(Integer.valueOf(myListSortOrderOption.b()));
        c7038coe.c(new View.OnClickListener() { // from class: o.cob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListSortEpoxyController.addMyListSortOptionModel$lambda$3$lambda$2(MyListSortEpoxyController.this, i, view);
            }
        });
        add(c7038coe);
    }
}

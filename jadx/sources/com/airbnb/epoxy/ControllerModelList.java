package com.airbnb.epoxy;

import com.airbnb.epoxy.ModelList;

/* loaded from: classes2.dex */
public class ControllerModelList extends ModelList {
    private static final ModelList.e e = new ModelList.e() { // from class: com.airbnb.epoxy.ControllerModelList.4
        @Override // com.airbnb.epoxy.ModelList.e
        public void b(int i, int i2) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        @Override // com.airbnb.epoxy.ModelList.e
        public void d(int i, int i2) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    };

    public ControllerModelList(int i) {
        super(i);
        a();
    }

    public void e() {
        c(e);
        c();
    }
}

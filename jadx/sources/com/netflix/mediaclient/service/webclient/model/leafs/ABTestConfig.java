package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes4.dex */
public class ABTestConfig {
    private Cell cellEnum;
    @SerializedName("cell")
    private int cellInt = 1;
    @SerializedName("isExplicit")
    private boolean isExplicit;
    @SerializedName("isFallback")
    private boolean isFallback;

    public boolean isExplicit() {
        return this.isExplicit;
    }

    public boolean isFallback() {
        return this.isFallback;
    }

    public ABTestConfig changeTo(int i, boolean z) {
        ABTestConfig aBTestConfig = new ABTestConfig();
        aBTestConfig.isExplicit = z;
        aBTestConfig.cellInt = i;
        aBTestConfig.isFallback = this.isFallback;
        return aBTestConfig;
    }

    public static ABTestConfig newInstance(int i, boolean z, boolean z2) {
        ABTestConfig aBTestConfig = new ABTestConfig();
        aBTestConfig.isExplicit = z;
        aBTestConfig.cellInt = i;
        aBTestConfig.isFallback = z2;
        return aBTestConfig;
    }

    public String toString() {
        return "ABTestConfig{cellInt=" + this.cellInt + ", isExplicit=" + this.isExplicit + ", isFallback=" + this.isFallback + ", cellEnum=" + this.cellEnum + '}';
    }

    /* loaded from: classes4.dex */
    public enum Cell {
        CELL_1(1),
        CELL_2(2),
        CELL_3(3),
        CELL_4(4),
        CELL_5(5),
        CELL_6(6),
        CELL_7(7),
        CELL_8(8),
        CELL_9(9),
        CELL_10(10),
        CELL_11(11),
        CELL_12(12),
        CELL_13(13),
        CELL_14(14),
        CELL_15(15);
        
        private final int cellId;

        public int getCellId() {
            return this.cellId;
        }

        Cell(int i) {
            this.cellId = i;
        }

        public static Cell fromInt(int i) {
            Cell[] values;
            for (Cell cell : values()) {
                if (cell.cellId == i) {
                    return cell;
                }
            }
            return null;
        }
    }

    public Cell getCell() {
        if (this.cellEnum == null) {
            this.cellEnum = Cell.fromInt(this.cellInt);
        }
        return this.cellEnum;
    }
}

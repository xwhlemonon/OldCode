package OODay05_vis;

public enum Seasons {
    SPRING('春', "温暖"),
    SUMMER('夏', "炎热"),
    AUTUMN('秋', "凉爽"),
    WINTER('冬', "寒冷");
    private char seasonName;
    private String seasonDesc;

    Seasons(char seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public char getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(char seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }
}

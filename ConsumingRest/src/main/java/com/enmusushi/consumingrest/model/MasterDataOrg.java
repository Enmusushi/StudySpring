package com.enmusushi.consumingrest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MasterDataOrg {

    @SerializedName("ESB")
    private ESBDTO esb;

    public ESBDTO getEsb() {
        return esb;
    }

    public void setEsb(ESBDTO esb) {
        this.esb = esb;
    }

    public static class ESBDTO {
        @SerializedName("DATA")
        private DATADTO data;

        public DATADTO getData() {
            return data;
        }

        public void setData(DATADTO data) {
            this.data = data;
        }

        public static class DATADTO {
            @SerializedName("DATAINFOS")
            private DATAINFOSDTO datainfos;

            public DATAINFOSDTO getDatainfos() {
                return datainfos;
            }

            public void setDatainfos(DATAINFOSDTO datainfos) {
                this.datainfos = datainfos;
            }

            public static class DATAINFOSDTO {
                @SerializedName("DATAINFO")
                private List<DATAINFODTO> datainfo;
                @SerializedName("PUUID")
                private String puuid;
                @SerializedName("SYNCODE")
                private String syncode;

                public List<DATAINFODTO> getDatainfo() {
                    return datainfo;
                }

                public void setDatainfo(List<DATAINFODTO> datainfo) {
                    this.datainfo = datainfo;
                }

                public String getPuuid() {
                    return puuid;
                }

                public void setPuuid(String puuid) {
                    this.puuid = puuid;
                }

                public String getSyncode() {
                    return syncode;
                }

                public void setSyncode(String syncode) {
                    this.syncode = syncode;
                }

                public static class DATAINFODTO {
                    @SerializedName("CODE")
                    private String code;
                    @SerializedName("DESC1")
                    private String desc1;
                    @SerializedName("DESC10")
                    private String desc10;
                    @SerializedName("DESC11")
                    private String desc11;
                    @SerializedName("DESC12")
                    private String desc12;
                    @SerializedName("DESC13")
                    private String desc13;
                    @SerializedName("DESC14")
                    private String desc14;
                    @SerializedName("DESC15")
                    private String desc15;
                    @SerializedName("DESC16")
                    private String desc16;
                    @SerializedName("DESC17")
                    private String desc17;
                    @SerializedName("DESC18")
                    private String desc18;
                    @SerializedName("DESC19")
                    private String desc19;
                    @SerializedName("DESC2")
                    private String desc2;
                    @SerializedName("DESC20")
                    private String desc20;
                    @SerializedName("DESC21")
                    private String desc21;
                    @SerializedName("DESC22")
                    private String desc22;
                    @SerializedName("DESC23")
                    private String desc23;
                    @SerializedName("DESC24")
                    private String desc24;
                    @SerializedName("DESC25")
                    private String desc25;
                    @SerializedName("DESC26")
                    private String desc26;
                    @SerializedName("DESC27")
                    private String desc27;
                    @SerializedName("DESC28")
                    private String desc28;
                    @SerializedName("DESC3")
                    private String desc3;
                    @SerializedName("DESC5")
                    private String desc5;
                    @SerializedName("DESC6")
                    private String desc6;
                    @SerializedName("DESC7")
                    private String desc7;
                    @SerializedName("DESC8")
                    private String desc8;
                    @SerializedName("DESC9")
                    private String desc9;
                    @SerializedName("UUID")
                    private String uuid;


                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getDesc1() {
                        return desc1;
                    }

                    public void setDesc1(String desc1) {
                        this.desc1 = desc1;
                    }

                    public String getDesc10() {
                        return desc10;
                    }

                    public void setDesc10(String desc10) {
                        this.desc10 = desc10;
                    }

                    public String getDesc11() {
                        return desc11;
                    }

                    public void setDesc11(String desc11) {
                        this.desc11 = desc11;
                    }

                    public String getDesc12() {
                        return desc12;
                    }

                    public void setDesc12(String desc12) {
                        this.desc12 = desc12;
                    }

                    public String getDesc13() {
                        return desc13;
                    }

                    public void setDesc13(String desc13) {
                        this.desc13 = desc13;
                    }

                    public String getDesc14() {
                        return desc14;
                    }

                    public void setDesc14(String desc14) {
                        this.desc14 = desc14;
                    }

                    public String getDesc15() {
                        return desc15;
                    }

                    public void setDesc15(String desc15) {
                        this.desc15 = desc15;
                    }

                    public String getDesc16() {
                        return desc16;
                    }

                    public void setDesc16(String desc16) {
                        this.desc16 = desc16;
                    }

                    public String getDesc17() {
                        return desc17;
                    }

                    public void setDesc17(String desc17) {
                        this.desc17 = desc17;
                    }

                    public String getDesc18() {
                        return desc18;
                    }

                    public void setDesc18(String desc18) {
                        this.desc18 = desc18;
                    }

                    public String getDesc19() {
                        return desc19;
                    }

                    public void setDesc19(String desc19) {
                        this.desc19 = desc19;
                    }

                    public String getDesc2() {
                        return desc2;
                    }

                    public void setDesc2(String desc2) {
                        this.desc2 = desc2;
                    }

                    public String getDesc20() {
                        return desc20;
                    }

                    public void setDesc20(String desc20) {
                        this.desc20 = desc20;
                    }

                    public String getDesc21() {
                        return desc21;
                    }

                    public void setDesc21(String desc21) {
                        this.desc21 = desc21;
                    }

                    public String getDesc22() {
                        return desc22;
                    }

                    public void setDesc22(String desc22) {
                        this.desc22 = desc22;
                    }

                    public String getDesc23() {
                        return desc23;
                    }

                    public void setDesc23(String desc23) {
                        this.desc23 = desc23;
                    }

                    public String getDesc24() {
                        return desc24;
                    }

                    public void setDesc24(String desc24) {
                        this.desc24 = desc24;
                    }

                    public String getDesc25() {
                        return desc25;
                    }

                    public void setDesc25(String desc25) {
                        this.desc25 = desc25;
                    }

                    public String getDesc26() {
                        return desc26;
                    }

                    public void setDesc26(String desc26) {
                        this.desc26 = desc26;
                    }

                    public String getDesc27() {
                        return desc27;
                    }

                    public void setDesc27(String desc27) {
                        this.desc27 = desc27;
                    }

                    public String getDesc28() {
                        return desc28;
                    }

                    public void setDesc28(String desc28) {
                        this.desc28 = desc28;
                    }

                    public String getDesc3() {
                        return desc7;
                    }

                    public void setDesc3(String desc3) {
                        this.desc3 = desc3;
                    }

                    public String getDesc5() {
                        return desc5;
                    }

                    public void setDesc5(String desc5) {
                        this.desc5 = desc5;
                    }
                    public String getDesc6() {
                        return desc6;
                    }

                    public void setDesc6(String desc6) {
                        this.desc6 = desc6;
                    }

                    public String getDesc7() {
                        return desc7;
                    }

                    public void setDesc7(String desc7) {
                        this.desc7 = desc7;
                    }

                    public String getDesc8() {
                        return desc8;
                    }

                    public void setDesc8(String desc8) {
                        this.desc8 = desc8;
                    }

                    public String getDesc9() {
                        return desc9;
                    }

                    public void setDesc9(String desc9) {
                        this.desc9 = desc9;
                    }

                    public String getUuid() {
                        return uuid;
                    }

                    public void setUuid(String uuid) {
                        this.uuid = uuid;
                    }
                }
            }
        }
    }
}

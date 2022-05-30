package com.enmusushi.consumingrest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MasterDataUser {

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
                    @SerializedName("DESC2")
                    private String desc2;
                    @SerializedName("DESC3")
                    private String desc3;
                    @SerializedName("DESC4")
                    private String desc4;
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
                    @SerializedName("DESC29")
                    private String desc29;
                    @SerializedName("DESC30")
                    private String desc30;
                    @SerializedName("DESC31")
                    private String desc31;
                    @SerializedName("DESC32")
                    private String desc32;
                    @SerializedName("DESC33")
                    private String desc33;
                    @SerializedName("DESC34")
                    private String desc34;
                    @SerializedName("DESC35")
                    private String desc35;
                    @SerializedName("DESC36")
                    private String desc36;
                    @SerializedName("DESC37")
                    private String desc37;
                    @SerializedName("DESC38")
                    private String desc38;
                    @SerializedName("DESC39")
                    private String desc39;
                    @SerializedName("DESC40")
                    private String desc40;
                    @SerializedName("DESC41")
                    private String desc41;
                    @SerializedName("DESC42")
                    private String desc42;
                    @SerializedName("DESC43")
                    private String desc43;
                    @SerializedName("DESC44")
                    private String desc44;
                    @SerializedName("DESC45")
                    private String desc45;
                    @SerializedName("DESC46")
                    private String desc46;
                    @SerializedName("DESC47")
                    private String desc47;
                    @SerializedName("DESC48")
                    private String desc48;
                    @SerializedName("DESC49")
                    private String desc49;
                    @SerializedName("DESC50")
                    private String desc50;
                    @SerializedName("DESC51")
                    private String desc51;
                    @SerializedName("DESC52")
                    private String desc52;
                    @SerializedName("DESC53")
                    private String desc53;
                    @SerializedName("DESC54")
                    private String desc54;
                    @SerializedName("DESC55")
                    private String desc55;
                    @SerializedName("DESC56")
                    private String desc56;
                    @SerializedName("DESC57")
                    private String desc57;
                    @SerializedName("DESC58")
                    private String desc58;
                    @SerializedName("DESC59")
                    private String desc59;
                    @SerializedName("DESC60")
                    private String desc60;
                    @SerializedName("DESC61")
                    private String desc61;
                    @SerializedName("DESC62")
                    private String desc62;
                    @SerializedName("DESC63")
                    private String desc63;
                    @SerializedName("DESC64")
                    private String desc64;
                    @SerializedName("LOCALE")
                    private String locale;
                    @SerializedName("MULTICODE")
                    private MULTICODEDTO multicode;
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

                    public String getDesc2() {
                        return desc2;
                    }

                    public void setDesc2(String desc2) {
                        this.desc2 = desc2;
                    }

                    public String getDesc3() {
                        return desc3;
                    }

                    public void setDesc3(String desc3) {
                        this.desc3 = desc3;
                    }

                    public String getDesc4() {
                        return desc4;
                    }

                    public void setDesc4(String desc4) {
                        this.desc4 = desc4;
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

                    public String getDesc29() {
                        return desc29;
                    }

                    public void setDesc29(String desc29) {
                        this.desc29 = desc29;
                    }

                    public String getDesc30() {
                        return desc30;
                    }

                    public void setDesc30(String desc30) {
                        this.desc30 = desc30;
                    }

                    public String getDesc31() {
                        return desc31;
                    }

                    public void setDesc31(String desc31) {
                        this.desc31 = desc31;
                    }

                    public String getDesc32() {
                        return desc32;
                    }

                    public void setDesc32(String desc32) {
                        this.desc32 = desc32;
                    }

                    public String getDesc33() {
                        return desc33;
                    }

                    public void setDesc33(String desc33) {
                        this.desc33 = desc33;
                    }

                    public String getDesc34() {
                        return desc34;
                    }

                    public void setDesc34(String desc34) {
                        this.desc34 = desc34;
                    }

                    public String getDesc35() {
                        return desc35;
                    }

                    public void setDesc35(String desc35) {
                        this.desc35 = desc35;
                    }

                    public String getDesc36() {
                        return desc36;
                    }

                    public void setDesc36(String desc36) {
                        this.desc36 = desc36;
                    }

                    public String getDesc37() {
                        return desc37;
                    }

                    public void setDesc37(String desc37) {
                        this.desc37 = desc37;
                    }

                    public String getDesc38() {
                        return desc38;
                    }

                    public void setDesc38(String desc38) {
                        this.desc38 = desc38;
                    }

                    public String getDesc39() {
                        return desc39;
                    }

                    public void setDesc39(String desc39) {
                        this.desc39 = desc39;
                    }

                    public String getDesc40() {
                        return desc40;
                    }

                    public void setDesc40(String desc40) {
                        this.desc40 = desc40;
                    }

                    public String getDesc41() {
                        return desc41;
                    }

                    public void setDesc41(String desc41) {
                        this.desc41 = desc41;
                    }

                    public String getDesc42() {
                        return desc42;
                    }

                    public void setDesc42(String desc42) {
                        this.desc42 = desc42;
                    }

                    public String getDesc43() {
                        return desc43;
                    }

                    public void setDesc43(String desc43) {
                        this.desc43 = desc43;
                    }

                    public String getDesc44() {
                        return desc44;
                    }

                    public void setDesc44(String desc44) {
                        this.desc44 = desc44;
                    }

                    public String getDesc45() {
                        return desc45;
                    }

                    public void setDesc45(String desc45) {
                        this.desc45 = desc45;
                    }

                    public String getDesc46() {
                        return desc46;
                    }

                    public void setDesc46(String desc46) {
                        this.desc46 = desc46;
                    }

                    public String getDesc47() {
                        return desc47;
                    }

                    public void setDesc47(String desc47) {
                        this.desc47 = desc47;
                    }

                    public String getDesc48() {
                        return desc48;
                    }

                    public void setDesc48(String desc48) {
                        this.desc48 = desc48;
                    }

                    public String getDesc49() {
                        return desc49;
                    }

                    public void setDesc49(String desc49) {
                        this.desc49 = desc49;
                    }

                    public String getDesc50() {
                        return desc50;
                    }

                    public void setDesc50(String desc50) {
                        this.desc50 = desc50;
                    }

                    public String getDesc51() {
                        return desc51;
                    }

                    public void setDesc51(String desc51) {
                        this.desc51 = desc51;
                    }

                    public String getDesc52() {
                        return desc52;
                    }

                    public void setDesc52(String desc52) {
                        this.desc52 = desc52;
                    }

                    public String getDesc53() {
                        return desc53;
                    }

                    public void setDesc53(String desc53) {
                        this.desc53 = desc53;
                    }

                    public String getDesc54() {
                        return desc54;
                    }

                    public void setDesc54(String desc54) {
                        this.desc54 = desc54;
                    }

                    public String getDesc55() {
                        return desc55;
                    }

                    public void setDesc55(String desc55) {
                        this.desc55 = desc55;
                    }

                    public String getDesc56() {
                        return desc56;
                    }

                    public void setDesc56(String desc56) {
                        this.desc56 = desc56;
                    }

                    public String getDesc57() {
                        return desc57;
                    }

                    public void setDesc57(String desc57) {
                        this.desc57 = desc57;
                    }

                    public String getDesc58() {
                        return desc58;
                    }

                    public void setDesc58(String desc58) {
                        this.desc58 = desc58;
                    }

                    public String getDesc59() {
                        return desc59;
                    }

                    public void setDesc59(String desc59) {
                        this.desc59 = desc59;
                    }

                    public String getDesc60() {
                        return desc60;
                    }

                    public void setDesc60(String desc60) {
                        this.desc60 = desc60;
                    }

                    public String getDesc61() {
                        return desc61;
                    }

                    public void setDesc61(String desc61) {
                        this.desc61 = desc61;
                    }

                    public String getDesc62() {
                        return desc62;
                    }

                    public void setDesc62(String desc62) {
                        this.desc62 = desc62;
                    }

                    public String getDesc63() {
                        return desc63;
                    }

                    public void setDesc63(String desc63) {
                        this.desc63 = desc63;
                    }

                    public String getDesc64() {
                        return desc64;
                    }

                    public void setDesc64(String desc64) {
                        this.desc64 = desc64;
                    }

                    public String getLocale() {
                        return locale;
                    }

                    public void setLocale(String locale) {
                        this.locale = locale;
                    }

                    public MULTICODEDTO getMulticode() {
                        return multicode;
                    }

                    public void setMulticode(MULTICODEDTO multicode) {
                        this.multicode = multicode;
                    }

                    public String getUuid() {
                        return uuid;
                    }

                    public void setUuid(String uuid) {
                        this.uuid = uuid;
                    }

                    public static class MULTICODEDTO {
                        @SerializedName("VALUELIST")
                        private List<VALUELISTDTO> valuelist;

                        public List<VALUELISTDTO> getValuelist() {
                            return valuelist;
                        }

                        public void setValuelist(List<VALUELISTDTO> valuelist) {
                            this.valuelist = valuelist;
                        }

                        public static class VALUELISTDTO {
                            @SerializedName("DESC1")
                            private String desc1;
                            @SerializedName("DESC2")
                            private String desc2;
                            @SerializedName("DESC3")
                            private String desc3;
                            @SerializedName("DESC4")
                            private String desc4;
                            @SerializedName("DESC5")
                            private String desc5;
                            @SerializedName("DESC6")
                            private String desc6;
                            @SerializedName("DESC7")
                            private String desc7;
                            @SerializedName("LISTCODE")
                            private String listcode;
                            @SerializedName("SPECIALITYCODE")
                            private String specialitycode;

                            public String getDesc1() {
                                return desc1;
                            }

                            public void setDesc1(String desc1) {
                                this.desc1 = desc1;
                            }

                            public String getDesc2() {
                                return desc2;
                            }

                            public void setDesc2(String desc2) {
                                this.desc2 = desc2;
                            }

                            public String getDesc3() {
                                return desc3;
                            }

                            public void setDesc3(String desc3) {
                                this.desc3 = desc3;
                            }

                            public String getDesc4() {
                                return desc4;
                            }

                            public void setDesc4(String desc4) {
                                this.desc4 = desc4;
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

                            public String getListcode() {
                                return listcode;
                            }

                            public void setListcode(String listcode) {
                                this.listcode = listcode;
                            }

                            public String getSpecialitycode() {
                                return specialitycode;
                            }

                            public void setSpecialitycode(String specialitycode) {
                                this.specialitycode = specialitycode;
                            }
                        }
                    }
                }
            }
        }
    }
}

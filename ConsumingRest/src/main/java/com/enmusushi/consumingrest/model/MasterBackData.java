package com.enmusushi.consumingrest.model;

import com.google.gson.annotations.SerializedName;

import java.util.LinkedList;
import java.util.List;

public class MasterBackData {

    @SerializedName("ESB")
    private ESBDTO esb;

    public MasterBackData() {
        this.esb = new ESBDTO();
    }

    public ESBDTO getEsb() {
        return esb;
    }

    public void setEsb(ESBDTO esb) {
        this.esb = esb;
    }

    public static class ESBDTO {
        @SerializedName("RESULT")
        private String result;
        @SerializedName("DESC")
        private String desc;
        @SerializedName("DATA")
        private DATADTO data;

        public ESBDTO() {
            this.data = new DATADTO();
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public DATADTO getData() {
            return data;
        }

        public void setData(DATADTO data) {
            this.data = data;
        }

        public static class DATADTO {
            @SerializedName("DATAINFOS")
            private DATAINFOSDTO datainfos;

            public DATADTO() {
                this.datainfos = new DATAINFOSDTO();
            }

            public DATAINFOSDTO getDatainfos() {
                return datainfos;
            }

            public void setDatainfos(DATAINFOSDTO datainfos) {
                this.datainfos = datainfos;
            }

            public static class DATAINFOSDTO {
                @SerializedName("PUUID")
                private String puuid;
                @SerializedName("DATAINFO")
                private List<DATAINFODTO> datainfo;

                private DATAINFOSDTO() {
                    this.datainfo = new LinkedList<>();
                }

                public String getPuuid() {
                    return puuid;
                }

                public void setPuuid(String puuid) {
                    this.puuid = puuid;
                }

                public List<DATAINFODTO> getDatainfo() {
                    return datainfo;
                }

                public void setDatainfo(List<DATAINFODTO> datainfo) {
                    this.datainfo = datainfo;
                }

                public static class DATAINFODTO {
                    @SerializedName("CODE")
                    private String code;
                    @SerializedName("UUID")
                    private String uuid;
                    @SerializedName("SYNSTATUS")
                    private String synstatus;
                    @SerializedName("SYNRESULT")
                    private String synresult;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getUuid() {
                        return uuid;
                    }

                    public void setUuid(String uuid) {
                        this.uuid = uuid;
                    }

                    public String getSynstatus() {
                        return synstatus;
                    }

                    public void setSynstatus(String synstatus) {
                        this.synstatus = synstatus;
                    }

                    public String getSynresult() {
                        return synresult;
                    }

                    public void setSynresult(String synresult) {
                        this.synresult = synresult;
                    }
                }
            }
        }
    }
}

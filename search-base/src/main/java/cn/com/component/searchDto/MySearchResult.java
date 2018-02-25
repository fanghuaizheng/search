package cn.com.component.searchDto;

/**
 * Created by hzfang on 2018/1/30.
 */
public enum  MySearchResult {

    SUCCESS(200,"成功"),
    CREATE(201,"创建成功"),
    UPDATE(202,"更新成功"),
    BATCH_OP(203,"批操作成功"),
    BATCH_OP_0(204,"操作成功，共更新0条数据"),
    PARAM_IS_NULL(400,"传入的参数为空，请检查，field、value、type"),

    ERROR(500,"发生错误");

    private Integer code;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    MySearchResult() {
    }
    MySearchResult(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}

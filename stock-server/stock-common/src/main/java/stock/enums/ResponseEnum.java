package stock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseEnum {

    /**响应成功**/
    SUCCESS(0, "操作成功"),

    /**操作失败*/
    FAIL(-1,"操作失败");

    /**响应码**/
    private final Integer code;

    /** 结果 **/
    private  final String  resultMessage;


    public static ResponseEnum getResultCode(Integer code){
        for (ResponseEnum value : ResponseEnum.values()) {
            if (code.equals(value.getCode())){
                return value;
            }
        }
        return ResponseEnum.FAIL;
    }
    /*
    简单测试一下
     */
    public static void main(String[] args) {
        ResponseEnum resultCode = ResponseEnum.getResultCode(100);
        System.out.println(resultCode);
    }
}

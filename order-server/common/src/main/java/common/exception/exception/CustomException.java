package common.exception.exception;

import common.enums.ResponseEnum;
import lombok.Data;

@Data
public class CustomException extends RuntimeException{

    private final Integer code;

    /**
     * 通过状态码和异常信息创建异常对象
     * @param code
     * @param message
     */
    public CustomException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * 接受枚举类型对象
     * @param
     */
    public CustomException(ResponseEnum responseEnum){
        super(responseEnum.getResultMessage());
        this.code = responseEnum.getCode();
    }

}

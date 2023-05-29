package users.exception;

import lombok.Data;
import users.response.enums.ResponseEnum;

@Data
public class MyException extends RuntimeException{

    private final Integer code;

    /**
     * 通过状态码和异常信息创建异常对象
     * @param code
     * @param message
     */
    public MyException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    /**
     * 接受枚举类型对象
     * @param
     */
    public MyException(ResponseEnum responseEnum){
        super(responseEnum.getResultMessage());
        this.code = responseEnum.getCode();
    }

}

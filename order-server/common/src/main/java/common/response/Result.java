package common.response;


import common.enums.ResponseEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 56665257248936049L;
    /**响应码**/
    private Integer code;

    /**返回消息**/
    private String message;

    /**返回数据**/
    private T data;

    private Result(){}
    /**
     * 操作成功ok方法
     */
    public static <T> Result<T> ok(T data) {
        Result<T> response = new Result<>();
        response.setCode(ResponseEnum.SUCCESS.getCode());   response.setMessage(ResponseEnum.SUCCESS.getResultMessage());
        response.setData(data);
        return response;
    }

    /**
     * 编译失败方法
     */
    public static <T> Result<T> buildFailure(Integer errCode, String errMessage){
        Result<T> response = new Result<>();
        response.setCode(errCode);
        response.setMessage(errMessage);
        return response;
    }


    public static <T> Result<T> fail(Integer errCode, String errMessage){
        Result<T> response = new Result<>();
        response.setCode(errCode);
        response.setMessage(errMessage);
        return response;
    }
}

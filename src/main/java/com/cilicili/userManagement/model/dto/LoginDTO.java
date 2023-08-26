package com.cilicili.userManagement.model.dto;


import com.unitl.constants.CommonMsg;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


/**
 * @Author SlyAimer
 * @Date 2023/8/26 20:41
 * @Version 1.0
 */
@Data
@Schema(name = "LoginDTO", description = "登录信息")
public class LoginDTO {

    @NotBlank(message = CommonMsg.LOGIN_NAME_COULD_NOT_BE_NULL)
    @Schema(name = "loginName", description = "登录名称")
    private String loginName;

    @NotBlank(message = CommonMsg.LOGIN_PASSWORD_COULD_NOT_BE_NULL)
    @Schema(name = "loginPassword", description = "登录密码")
    private String loginPassword;

    @NotBlank(message = CommonMsg.VERIFICATION_CODE_COULD_NOT_BE_NULL)
    @Schema(name = "verificationCode", description = "验证码")
    private String verificationCode;

}

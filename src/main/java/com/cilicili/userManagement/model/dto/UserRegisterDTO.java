package com.cilicili.userManagement.model.dto;


import com.unitl.constants.CommonMsg;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;



/**
 * @Author SlyAimer
 * @Date 2023/8/26 20:41
 * @Version 1.0
 */
@Data
@Schema(name = "UserRegisterDTO", description = "用户注册信息")
public class UserRegisterDTO {

    @Size(min = 6, max = 15, message = CommonMsg.LOGNName_FORMAT_ERROR_FOUR_TO_TEN_DIGIT)
    @NotBlank(message = CommonMsg.LOGIN_NAME_COULD_NOT_BE_NULL)
    @Schema(name = "loginName",description = "登录名称")
    private String loginName;

    @Size(min = 6, max = 15, message = CommonMsg.PASSWORD_FORMAT_ERROR_SIX_TO_FIFTEEN_DIGIT)
    @NotBlank(message = CommonMsg.LOGIN_PASSWORD_COULD_NOT_BE_NULL)
    @Schema(name = "loginPassword",description = "登陆密码")
    private String loginPassword;

    @NotBlank(message = CommonMsg.VERIFICATION_CODE_COULD_NOT_BE_NULL)
    @Schema(name = "verificationCode", description = "验证码")
    private String verificationCode;

    @Schema(name = "inviterCode", description = "邀请人邀请码")
    private String inviterCode;

    @Schema(name = "isForceValidateCode", description = "是否强制校验邀请码")
    private Boolean isForceValidateCode;

}

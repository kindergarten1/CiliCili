package com.cilicili.userManagement.model.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author SlyAimer
 * @Date 2023/8/26 20:41
 * @Version 1.0
 */
@Schema(name ="RoleDTO" ,description = "角色VO类")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleVO {

    @Schema(description = "角色名称")
    private String name;

    @Schema(description = "角色ID")
    private String id;

    @Schema(description = "角色备注")
    private String description;
}

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "PermissionVO",description = "菜单VO类")
public class PermissionVO {

    @Schema(name = "",description = "页面路径")
    private String path;

    @Schema(name = "title",description = "菜单标题")
    private String title;
}

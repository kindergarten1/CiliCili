package com.cilicili.userManagement.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.cilicili.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.List;


/**
 * @Author SlyAimer
 * @Date 2023/8/26 20:41
 * @Version 1.0
 */
@Data
@Entity
@Table(name = "role")
@EqualsAndHashCode(callSuper = true)
@Schema(description = "角色")
public class Role extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "name",description  = "角色名称")
    private String name;
    
    @Schema(name = "defaultRole",description  = "是否默认")
    private Boolean defaultRole;

    @Schema(name = "description",description  = "角色备注")
    private String description;

    @Transient
    @TableField(exist=false)
    @Schema(name = "permissions",description = "角色拥有菜单列表")
    private List<RolePermission> permissions;
}
